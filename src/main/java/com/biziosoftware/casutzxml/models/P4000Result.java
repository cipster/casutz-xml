package com.biziosoftware.casutzxml.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JacksonXmlRootElement(localName = "P4000")
public class P4000Result {
    @JacksonXmlProperty(isAttribute = true)
    private String luna_r;

    @JacksonXmlProperty(isAttribute = true)
    private String adrEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String prenume_declar;

    @JacksonXmlProperty(isAttribute = true)
    private String functie_declar;

    @JacksonXmlProperty(isAttribute = true)
    private String catEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String an_r;

    @JacksonXmlProperty(isAttribute = true)
    private String cifEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String numeEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String entNeid;

    @JacksonXmlProperty(isAttribute = true)
    private String judEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String denOrd;

    @JacksonXmlProperty(isAttribute = true)
    private String totalPlata_A;

    @JacksonXmlProperty(isAttribute = true)
    private String cif_declar;

    @JacksonXmlProperty(isAttribute = true)
    private String nume_declar;

    @JacksonXmlProperty(localName = "Imobile")
    @JacksonXmlCData
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Imobile> Imobile;

    @JacksonXmlProperty(isAttribute = true)
    private String tipEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String calAdmin;

    @JacksonXmlProperty(isAttribute = true)
    private String locEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String codPostlEnt;
}
