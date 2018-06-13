package com.dto.ckan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Resource {
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("cache_last_updated")
    private Object cacheLastUpdated;
    @JsonProperty("cache_url")
    private Object cacheUrl;
    private String created;
    private String description;
    private String format;
    private String hash;
    private String id;
    @JsonProperty("last_modified")
    private Object lastModified;
    private Object mimetype;
    @JsonProperty("mimetype_inner")
    private Object mimetypeInner;
    private String name;
    @JsonProperty("package_id")
    private String packageId;
    private Integer position;
    @JsonProperty("resource_type")
    private Object resourceType;
    @JsonProperty("revision_id")
    private String revisionId;
    private Object size;
    private String state;
    private String url;
    @JsonProperty("url_type")
    private Object urlType;
    @JsonProperty("webstore_last_updated")
    private Object webstoreLastUpdated;
    @JsonProperty("websrtore_url")
    private Object webstoreUrl;
    @JsonProperty("datastore_active")
    private Object datastoreActive;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Object getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    public void setCacheLastUpdated(Object cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    public Object getCacheUrl() {
        return cacheUrl;
    }

    public void setCacheUrl(Object cacheUrl) {
        this.cacheUrl = cacheUrl;
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getLastModified() {
        return lastModified;
    }

    public void setLastModified(Object lastModified) {
        this.lastModified = lastModified;
    }

    public Object getMimetype() {
        return mimetype;
    }

    public void setMimetype(Object mimetype) {
        this.mimetype = mimetype;
    }

    public Object getMimetypeInner() {
        return mimetypeInner;
    }

    public void setMimetypeInner(Object mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Object getResourceType() {
        return resourceType;
    }

    public void setResourceType(Object resourceType) {
        this.resourceType = resourceType;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getUrlType() {
        return urlType;
    }

    public void setUrlType(Object urlType) {
        this.urlType = urlType;
    }

    public Object getWebstoreLastUpdated() {
        return webstoreLastUpdated;
    }

    public void setWebstoreLastUpdated(Object webstoreLastUpdated) {
        this.webstoreLastUpdated = webstoreLastUpdated;
    }

    public Object getWebstoreUrl() {
        return webstoreUrl;
    }

    public void setWebstoreUrl(Object webstoreUrl) {
        this.webstoreUrl = webstoreUrl;
    }

    public Object getDatastoreActive() {
        return datastoreActive;
    }

    public void setDatastoreActive(Object datastoreActive) {
        this.datastoreActive = datastoreActive;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "additionalProperties=" + additionalProperties +
                ", cacheLastUpdated=" + cacheLastUpdated +
                ", cacheUrl=" + cacheUrl +
                ", created='" + created + '\'' +
                ", description='" + description + '\'' +
                ", format='" + format + '\'' +
                ", hash='" + hash + '\'' +
                ", id='" + id + '\'' +
                ", lastModified=" + lastModified +
                ", mimetype=" + mimetype +
                ", mimetypeInner=" + mimetypeInner +
                ", name='" + name + '\'' +
                ", packageId='" + packageId + '\'' +
                ", position=" + position +
                ", resourceType=" + resourceType +
                ", revisionId='" + revisionId + '\'' +
                ", size=" + size +
                ", state='" + state + '\'' +
                ", url='" + url + '\'' +
                ", urlType=" + urlType +
                ", webstoreLastUpdated=" + webstoreLastUpdated +
                ", webstoreUrl=" + webstoreUrl +
                '}';
    }
}
