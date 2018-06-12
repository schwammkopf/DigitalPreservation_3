package com.dto.dspace;

import java.util.List;
import java.util.Map;

public class Item {

    private Map<String, Object> additionalProperties;
    private String archived;
    private Bitstream bitstreams;
    private List<String> expand = null;
    private String handle;
    private String id;
    private String lastModified;
    private String link;
    private List<Metadata> metadata;
    private String name;
    private Object parentCollection;
    private Object parentCollectionList;
    private Object parentCommunityList;
    private String type;
    private String withdrawn;


    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public Bitstream getBitstreams() {
        return bitstreams;
    }

    public void setBitstreams(Bitstream bitstreams) {
        this.bitstreams = bitstreams;
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

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getParentCollection() {
        return parentCollection;
    }

    public void setParentCollection(Object parentCollection) {
        this.parentCollection = parentCollection;
    }

    public Object getParentCollectionList() {
        return parentCollectionList;
    }

    public void setParentCollectionList(Object parentCollectionList) {
        this.parentCollectionList = parentCollectionList;
    }

    public Object getParentCommunityList() {
        return parentCommunityList;
    }

    public void setParentCommunityList(Object parentCommunityList) {
        this.parentCommunityList = parentCommunityList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(String withdrawn) {
        this.withdrawn = withdrawn;
    }

    @Override
    public String toString() {
        return "Item{" +
                "additionalProperties=" + additionalProperties +
                ", archived='" + archived + '\'' +
                ", bitstreams=" + bitstreams +
                ", expand=" + expand +
                ", handle='" + handle + '\'' +
                ", id='" + id + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", link='" + link + '\'' +
                ", metadata=" + metadata +
                ", name='" + name + '\'' +
                ", parentCollection=" + parentCollection +
                ", parentCollectionList=" + parentCollectionList +
                ", parentCommunityList=" + parentCommunityList +
                ", type='" + type + '\'' +
                ", withdrawn='" + withdrawn + '\'' +
                '}';
    }
}
