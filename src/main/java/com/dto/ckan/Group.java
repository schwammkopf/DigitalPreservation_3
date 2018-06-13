package com.dto.ckan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Group {
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private String description;
    @JsonProperty("display_name")
    private String displayName;
    private String id;
    @JsonProperty("image_display_url")
    private String imageDisplayUrl;
    private String name;
    private String title;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getImageDisplayUrl() {
        return imageDisplayUrl;
    }

    public void setImageDisplayUrl(String imageDisplayUrl) {
        this.imageDisplayUrl = imageDisplayUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Group{" +
                "additionalProperties=" + additionalProperties +
                ", description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", id='" + id + '\'' +
                ", imageDisplayUrl='" + imageDisplayUrl + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
