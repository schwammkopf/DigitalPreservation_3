package com.dto.ckan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Tag {
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("display_name")
    private String displayName;
    private String id;
    private String name;
    private String state;
    @JsonProperty("vocabulary_id")
    private Object vocabularyId;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(Object vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "additionalProperties=" + additionalProperties +
                ", displayName='" + displayName + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", vocabularyId=" + vocabularyId +
                '}';
    }
}
