package com.biziosoftware.casutzxml.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cons {
    @JacksonXmlProperty(isAttribute = true)
    private String nrActAtribCons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprCoteCons;

    @JacksonXmlProperty(isAttribute = true)
    private String tipActPropCons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprConsFolstUtilzInsPub;

    @JacksonXmlProperty(isAttribute = true)
    private String suprConsFolsUtilzAltaEnt;

    @JacksonXmlProperty(isAttribute = true)
    private String suprConsFolsNeUtilz;

    @JacksonXmlProperty(isAttribute = true)
    private String suprDesfCons;

    @JacksonXmlProperty(isAttribute = true)
    private String dataInrActAtribCons;

    @JacksonXmlProperty(isAttribute = true)
    private String nrCrtCons;

    @JacksonXmlProperty(isAttribute = true)
    private String dataInrActPropCons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprUtilaCons;

    @JacksonXmlProperty(isAttribute = true)
    private String ncCons;

    @JacksonXmlProperty(isAttribute = true)
    private String denDreptRealCons;

    @JacksonXmlProperty(isAttribute = true)
    private String valContCons;

    @JacksonXmlProperty(isAttribute = true)
    private String nivCons;

    @JacksonXmlProperty(isAttribute = true)
    private String nuDC;

    @JacksonXmlProperty(isAttribute = true)
    private String grpDestCons;

    @JacksonXmlProperty(isAttribute = true)
    private String tipActAtribCons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprSolCons;

    @JacksonXmlProperty(isAttribute = true)
    private String nrActPropCons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprExclCons;

    @JacksonXmlProperty(isAttribute = true)
    private String stareCons;

    @JacksonXmlProperty(isAttribute = true)
    private String suprConsFolsUtilzEnt;
}
