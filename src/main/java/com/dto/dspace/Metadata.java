package com.dto.dspace;

import java.util.Map;

public class Metadata {
    private Map<String, Object> additionalProperties;
    private String element;
    private String key;
    private String language;
    private Object qualifier;
    private String schema;
    private String value;


    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getQualifier() {
        return qualifier;
    }

    public void setQualifier(Object qualifier) {
        this.qualifier = qualifier;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "additionalProperties=" + additionalProperties +
                ", element='" + element + '\'' +
                ", key='" + key + '\'' +
                ", language='" + language + '\'' +
                ", qualifier=" + qualifier +
                ", schema='" + schema + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
