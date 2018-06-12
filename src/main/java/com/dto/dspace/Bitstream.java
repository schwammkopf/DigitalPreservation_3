package com.dto.dspace;

import java.util.List;
import java.util.Map;

public class Bitstream {

    private Map<String, Object> additionalProperties;
    private String bundleName;
    private CheckSum checkSum;
    private String description;
    private List<String> expand = null;
    private String format;
    private Object handle;
    private Integer id;
    private String link;
    private String mimeType;
    private String name;
    private Object parentObject;
    private Object policies;
    private String retrieveLink;
    private Integer sequenceId;
    private Integer sizeBytes;
    private String type;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    public CheckSum getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(CheckSum checkSum) {
        this.checkSum = checkSum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(List<String> expand) {
        this.expand = expand;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getHandle() {
        return handle;
    }

    public void setHandle(Object handle) {
        this.handle = handle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getParentObject() {
        return parentObject;
    }

    public void setParentObject(Object parentObject) {
        this.parentObject = parentObject;
    }

    public Object getPolicies() {
        return policies;
    }

    public void setPolicies(Object policies) {
        this.policies = policies;
    }

    public String getRetrieveLink() {
        return retrieveLink;
    }

    public void setRetrieveLink(String retrieveLink) {
        this.retrieveLink = retrieveLink;
    }

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Integer getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bitstream{" +
                "additionalProperties=" + additionalProperties +
                ", bundleName='" + bundleName + '\'' +
                ", checkSum=" + checkSum +
                ", description='" + description + '\'' +
                ", expand=" + expand +
                ", format='" + format + '\'' +
                ", handle=" + handle +
                ", id=" + id +
                ", link='" + link + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", name='" + name + '\'' +
                ", parentObject=" + parentObject +
                ", policies=" + policies +
                ", retrieveLink='" + retrieveLink + '\'' +
                ", sequenceId=" + sequenceId +
                ", sizeBytes=" + sizeBytes +
                ", type='" + type + '\'' +
                '}';
    }
}
