package com.biziosoftware.casutzxml;

import com.biziosoftware.casutzxml.models.Imobile;
import com.biziosoftware.casutzxml.models.P4000;
import com.biziosoftware.casutzxml.models.P4000Result;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Log4j2
@RequiredArgsConstructor
@Service
public class ReadFilesService implements CommandLineRunner {

    private final XmlMapper xmlMapper;

    @SneakyThrows
    public List<P4000> readXml() {
        List<String> resourceFiles = getResourceFiles("");
        List<P4000> p4000s = new ArrayList<>(resourceFiles.size());
        for (String filePath : resourceFiles) {
            ClassPathResource resource = new ClassPathResource(filePath);
            InputStream inputStream = resource.getInputStream();
            P4000 p4000 = xmlMapper.readValue(inputStream, P4000.class);
            p4000s.add(p4000);
        }

        return p4000s;
    }

    @SneakyThrows
    @Override
    public void run(String... args) {
        List<P4000> p4000s = this.readXml();
        List<Imobile> imobile = new ArrayList<>();
        P4000 header = null;
        for (P4000 p4000 : p4000s) {
            header = p4000;
            imobile.add(p4000.getImobile());
        }
        imobile.sort(Comparator.comparing(Imobile::getNrCrtImob));
        Objects.requireNonNull(header).setImobile(null);
        P4000Result result = new P4000Result();
        BeanUtils.copyProperties(header, result);
        result.setImobile(imobile);
        Path path = Paths.get("./output/P4000.xml");
        Files.deleteIfExists(path);
        String xmlStringValue = "<?xml version=\"1.0\"?>\n" + xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
        log.info("gata: {}", xmlStringValue);
        Files.writeString(path, xmlStringValue);
    }

    private List<String> getResourceFiles(String path) throws IOException {
        List<String> filenames = new ArrayList<>();

        try (InputStream in = getResourceAsStream(path); BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String resource;
            while ((resource = br.readLine()) != null) {
                if (resource.endsWith(".xml")) {
                    filenames.add(resource);
                }
            }
        }

        return filenames;
    }

    private InputStream getResourceAsStream(String resource) throws IOException {
        try (InputStream in = getContextClassLoader().getResourceAsStream(resource)) {
            return in == null ? getClass().getResourceAsStream(resource) : in;
        }
    }

    private ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
