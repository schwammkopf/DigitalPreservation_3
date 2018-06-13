package com.dto.ckan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Organization {
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("approval_status")
    private String approvalStatus;
    private String created;
    private String description;
    private String id;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("is_organization")
    private Boolean isOrganization;
    private String name;
    @JsonProperty("revision_id")
    private String revisionId;
    private String state;
    private String title;
    private String type;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getOrganization() {
        return isOrganization;
    }

    public void setOrganization(Boolean organization) {
        isOrganization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "additionalProperties=" + additionalProperties +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", created='" + created + '\'' +
                ", description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", isOrganization=" + isOrganization +
                ", name='" + name + '\'' +
                ", revisionId='" + revisionId + '\'' +
                ", state='" + state + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
