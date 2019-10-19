package com.techshops.GraphQLJava.DTOs;

import java.util.List;

public class Document {
    private String id;
    private String dtCode;
    private Boolean loaded;
    private Integer yearId;
    private String title;
    private String mangleTitle;
    private String shortTitle;
    private String number;
    private Integer euSubtype;

    private List<Legislation> legislations;

    public Document() {}

    public Document(String id, String dtCode, Boolean loaded, Integer yearId, String title, String mangleTitle, String shortTitle, String number, Integer euSubtype) {
        this.id = id;
        this.dtCode = dtCode;
        this.loaded = loaded;
        this.yearId = yearId;
        this.title = title;
        this.mangleTitle = mangleTitle;
        this.shortTitle = shortTitle;
        this.number = number;
        this.euSubtype = euSubtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDtCode() {
        return dtCode;
    }

    public void setDtCode(String dtCode) {
        this.dtCode = dtCode;
    }

    public Boolean getLoaded() {
        return loaded;
    }

    public void setLoaded(Boolean loaded) {
        this.loaded = loaded;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMangleTitle() {
        return mangleTitle;
    }

    public void setMangleTitle(String mangleTitle) {
        this.mangleTitle = mangleTitle;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getEuSubtype() {
        return euSubtype;
    }

    public void setEuSubtype(Integer euSubtype) {
        this.euSubtype = euSubtype;
    }

    public List<Legislation> getLegislations() {
        return legislations;
    }

    public void setLegislations(List<Legislation> legislations) {
        this.legislations = legislations;
    }


}
