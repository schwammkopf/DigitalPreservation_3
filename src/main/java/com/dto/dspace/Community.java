package com.dto.dspace;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Community implements Serializable {
    private Map<String, Object> additionalProperties;
    private List<Collection> collections = null;
    private String copyrightText;
    private Integer countItems;
    private List<String> expand = null;
    private String handle;
    private String id;
    private String introductoryText;
    private String link;
    private Object logo;
    private String name;
    private Object parentCommunity;
    private String shortDescription;
    private String sidebarText;
    private List<Object> subcommunities = null;
    private String type;

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

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(List<String> expand) {
        this.expand = expand;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public Object getParentCommunity() {
        return parentCommunity;
    }

    public void setParentCommunity(Object parentCommunity) {
        this.parentCommunity = parentCommunity;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    public String getIntroductoryText() {
        return introductoryText;
    }

    public void setIntroductoryText(String introductoryText) {
        this.introductoryText = introductoryText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSidebarText() {
        return sidebarText;
    }

    public void setSidebarText(String sidebarText) {
        this.sidebarText = sidebarText;
    }

    public Integer getCountItems() {
        return countItems;
    }

    public void setCountItems(Integer countItems) {
        this.countItems = countItems;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Object> getSubcommunities() {
        return subcommunities;
    }

    public void setSubcommunities(List<Object> subcommunities) {
        this.subcommunities = subcommunities;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "Community{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", handle='" + handle + '\'' +
                ", type='" + type + '\'' +
                ", expand=" + expand +
                ", logo=" + logo +
                ", parentCommunity=" + parentCommunity +
                ", copyrightText='" + copyrightText + '\'' +
                ", introductoryText='" + introductoryText + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", sidebarText='" + sidebarText + '\'' +
                ", countItems=" + countItems +
                ", collections=" + collections +
                ", link='" + link + '\'' +
                ", subcommunities=" + subcommunities +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
