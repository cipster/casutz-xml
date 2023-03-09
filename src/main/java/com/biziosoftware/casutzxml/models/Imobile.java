package com.biziosoftware.casutzxml.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Imobile {
    @JacksonXmlProperty(isAttribute = true)
    private String valContExtrav;

    @JacksonXmlProperty(isAttribute = true)
    private String suprCote;

    @JacksonXmlProperty(isAttribute = true)
    private String valCont;

    @JacksonXmlProperty(isAttribute = true)
    private String suprExcl;

    @JacksonXmlProperty(isAttribute = true)
    private String denBun;

    @JacksonXmlProperty(isAttribute = true)
    private String suprConsUtiliz;

    @JacksonXmlProperty(isAttribute = true)
    private String judImob;

    @JacksonXmlProperty(isAttribute = true)
    private String nInv;

    @JacksonXmlProperty(isAttribute = true)
    private String valContIntrav;

    @JacksonXmlProperty(isAttribute = true)
    private String nci;

    @JacksonXmlProperty(isAttribute = true)
    private String dataInrActAtrib;

    @JacksonXmlProperty(isAttribute = true)
    private String identif;

    @JacksonXmlProperty(isAttribute = true)
    private String tipActPropImob;

    @JacksonXmlProperty(isAttribute = true)
    private String nrActAtribImob;

    @JacksonXmlProperty(isAttribute = true)
    private String nuC;

    @JacksonXmlProperty(isAttribute = true)
    private String tipDate;

    @JacksonXmlProperty(isAttribute = true)
    private String nrCrtImob;

    @JacksonXmlProperty(isAttribute = true)
    private String suprTot;

    @JacksonXmlProperty(isAttribute = true)
    private String suprTerenUtiliz;

    @JacksonXmlProperty(isAttribute = true)
    private String dataInrActPropr;

    @JacksonXmlProperty(localName = "Cons")
    @JacksonXmlCData
    private Cons Cons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprExtrav;

    @JacksonXmlProperty(isAttribute = true)
    private String taraImob;

    @JacksonXmlProperty(isAttribute = true)
    private String tipActAtribImob;

    @JacksonXmlProperty(isAttribute = true)
    private String nrActPropImob;

    @JacksonXmlProperty(isAttribute = true)
    private String daT;

    @JacksonXmlProperty(isAttribute = true)
    private String locImob;

    @JacksonXmlProperty(isAttribute = true)
    private String suprIntrav;

    @JacksonXmlProperty(isAttribute = true)
    private String nuVenit;

    @JacksonXmlProperty(isAttribute = true)
    private String denDreptImob;
}
