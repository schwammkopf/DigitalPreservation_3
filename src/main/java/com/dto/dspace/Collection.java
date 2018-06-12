package com.dto.dspace;

import java.util.List;
import java.util.Map;

public class Collection {
    private Map<String, Object> additionalProperties;
    private String copyrightText;
    private List<String> expand = null;
    private String handle;
    private String id;
    private String introductoryText;
    private List<Item> items = null;
    private Object license;
    private String link;
    private Object logo;
    private String name;
    private Integer numberItems;
    private Object parentCommunity;
    private List<Community> parentCommunityList = null;
    private String shortDescription;
    private String sidebarText;
    private String type;


    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(List<String> expand) {
        this.expand = expand;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntroductoryText() {
        return introductoryText;
    }

    public void setIntroductoryText(String introductoryText) {
        this.introductoryText = introductoryText;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberItems() {
        return numberItems;
    }

    public void setNumberItems(Integer numberItems) {
        this.numberItems = numberItems;
    }

    public Object getParentCommunity() {
        return parentCommunity;
    }

    public void setParentCommunity(Object parentCommunity) {
        this.parentCommunity = parentCommunity;
    }

    public List<Community> getParentCommunityList() {
        return parentCommunityList;
    }

    public void setParentCommunityList(List<Community> parentCommunityList) {
        this.parentCommunityList = parentCommunityList;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "additionalProperties=" + additionalProperties +
                ", copyrightText='" + copyrightText + '\'' +
                ", expand=" + expand +
                ", handle='" + handle + '\'' +
                ", id='" + id + '\'' +
                ", introductoryText='" + introductoryText + '\'' +
                ", items=" + items +
                ", license=" + license +
                ", link='" + link + '\'' +
                ", logo=" + logo +
                ", name='" + name + '\'' +
                ", numberItems=" + numberItems +
                ", parentCommunity=" + parentCommunity +
                ", parentCommunityList=" + parentCommunityList +
                ", shortDescription='" + shortDescription + '\'' +
                ", sidebarText='" + sidebarText + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
