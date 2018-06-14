package com.dto.ckan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Dataset {
    @JsonProperty("_private")
    private Boolean _private;
    private Map<String, Object> additionalProperties;
    private String author;
    @JsonProperty("author_email")
    private String authorEmail;
    @JsonProperty("creator_user_id")
    private String creatorUserId;
    private List<Object> extras = null;
    private List<Group> groups = null;
    private String id;
    private Boolean isopen;
    @JsonProperty("license_id")
    private String licenseId;
    @JsonProperty("license_title")
    private String licenseTitle;
    @JsonProperty("license_url")
    private String licenseUrl;
    private String maintainer;
    @JsonProperty("maintainer_email")
    private String maintainerEmail;
    @JsonProperty("metadata_created")
    private String metadataCreated;
    @JsonProperty("metadata_modified")
    private String metadataModified;
    private String name;
    private String notes;
    @JsonProperty("num_resources")
    private Integer numResources;
    @JsonProperty("num_tags")
    private Integer numTags;
    private Organization organization;
    @JsonProperty("owner_org")
    private String ownerOrg;
    @JsonProperty("relationships_as_object")
    private List<Object> relationshipsAsObject = null;
    @JsonProperty("relationships_as_subject")
    private List<Object> relationshipsAsSubject = null;
    private List<Resource> resources = null;
    @JsonProperty("revision_id")
    private String revisionId;
    private String state;
    private List<Tag> tags = null;
    private String title;
    private String type;
    private String url;
    private String version;

    @JsonProperty("private")
    private String privatE;

    public Boolean get_private() {
        return _private;
    }

    public void set_private(Boolean _private) {
        this._private = _private;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public List<Object> getExtras() {
        return extras;
    }

    public void setExtras(List<Object> extras) {
        this.extras = extras;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsopen() {
        return isopen;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseTitle() {
        return licenseTitle;
    }

    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    public String getMetadataCreated() {
        return metadataCreated;
    }

    public void setMetadataCreated(String metadataCreated) {
        this.metadataCreated = metadataCreated;
    }

    public String getMetadataModified() {
        return metadataModified;
    }

    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getNumResources() {
        return numResources;
    }

    public void setNumResources(Integer numResources) {
        this.numResources = numResources;
    }

    public Integer getNumTags() {
        return numTags;
    }

    public void setNumTags(Integer numTags) {
        this.numTags = numTags;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    public List<Object> getRelationshipsAsObject() {
        return relationshipsAsObject;
    }

    public void setRelationshipsAsObject(List<Object> relationshipsAsObject) {
        this.relationshipsAsObject = relationshipsAsObject;
    }

    public List<Object> getRelationshipsAsSubject() {
        return relationshipsAsSubject;
    }

    public void setRelationshipsAsSubject(List<Object> relationshipsAsSubject) {
        this.relationshipsAsSubject = relationshipsAsSubject;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPrivatE() {
        return privatE;
    }

    public void setPrivatE(String privatE) {
        this.privatE = privatE;
    }

    @Override
    public String toString() {
        return "Dataset{" +
                "_private=" + _private +
                ", additionalProperties=" + additionalProperties +
                ", author='" + author + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                ", creatorUserId='" + creatorUserId + '\'' +
                ", extras=" + extras +
                ", groups=" + groups +
                ", id='" + id + '\'' +
                ", isopen=" + isopen +
                ", licenseId='" + licenseId + '\'' +
                ", licenseTitle='" + licenseTitle + '\'' +
                ", licenseUrl='" + licenseUrl + '\'' +
                ", maintainer='" + maintainer + '\'' +
                ", maintainerEmail='" + maintainerEmail + '\'' +
                ", metadataCreated='" + metadataCreated + '\'' +
                ", metadataModified='" + metadataModified + '\'' +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", numResources=" + numResources +
                ", numTags=" + numTags +
                ", organization=" + organization +
                ", ownerOrg='" + ownerOrg + '\'' +
                ", relationshipsAsObject=" + relationshipsAsObject +
                ", relationshipsAsSubject=" + relationshipsAsSubject +
                ", resources=" + resources +
                ", revisionId='" + revisionId + '\'' +
                ", state='" + state + '\'' +
                ", tags=" + tags +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", version='" + version + '\'' +
                "}\n";
    }
}
