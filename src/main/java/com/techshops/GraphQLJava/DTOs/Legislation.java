package com.techshops.GraphQLJava.DTOs;

public class Legislation {
    private String id;
    private Document document;
    private String sgmlHref;
    private Integer orderSeqNo;
    private String sgmlNodeText;
    private Integer chunkId;
    private Boolean chunk;
    private Boolean loaded;

    public Legislation() {}

    public Legislation(String id, Document document, String sgmlHref, Integer orderSeqNo, String sgmlNodeText, Integer chunkId, Boolean chunk, Boolean loaded) {
        this.id = id;
        this.document = document;
        this.sgmlHref = sgmlHref;
        this.orderSeqNo = orderSeqNo;
        this.sgmlNodeText = sgmlNodeText;
        this.chunkId = chunkId;
        this.chunk = chunk;
        this.loaded = loaded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getSgmlHref() {
        return sgmlHref;
    }

    public void setSgmlHref(String sgmlHref) {
        this.sgmlHref = sgmlHref;
    }

    public Integer getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(Integer orderSeqNo) {
        this.orderSeqNo = orderSeqNo;
    }

    public String getSgmlNodeText() {
        return sgmlNodeText;
    }

    public void setSgmlNodeText(String sgmlNodeText) {
        this.sgmlNodeText = sgmlNodeText;
    }

    public Integer getChunkId() {
        return chunkId;
    }

    public void setChunkId(Integer chunkId) {
        this.chunkId = chunkId;
    }

    public Boolean getChunk() {
        return chunk;
    }

    public void setChunk(Boolean chunk) {
        this.chunk = chunk;
    }

    public Boolean getLoaded() {
        return loaded;
    }

    public void setLoaded(Boolean loaded) {
        this.loaded = loaded;
    }
}
