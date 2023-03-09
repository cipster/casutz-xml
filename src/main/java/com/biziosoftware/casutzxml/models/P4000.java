package com.biziosoftware.casutzxml.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class P4000 {
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

    @JacksonXmlProperty()
    private Imobile Imobile;

    @JacksonXmlProperty(isAttribute = true)
    private String tipEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String calAdmin;

    @JacksonXmlProperty(isAttribute = true)
    private String locEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String codPostlEnt;
}
