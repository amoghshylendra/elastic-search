package com.amogh.elasticsearch.model;

public class SearchResult {

    private String matchedAttribute;
    private String additionalData;

    public SearchResult(String matchedAttribute, String additionalData) {
        this.matchedAttribute = matchedAttribute;
        this.additionalData = additionalData;
    }

    public String getMatchedAttribute() {
        return matchedAttribute;
    }

    public void setMatchedAttribute(String matchedAttribute) {
        this.matchedAttribute = matchedAttribute;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }
}
