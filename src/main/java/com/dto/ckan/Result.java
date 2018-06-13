package com.dto.ckan;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private Integer count;
    private Object facets; //Todo
    private List<Dataset> results = null;
    @JsonProperty("search_facets")
    private Object searchFacets; //Todo
    private String sort;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getFacets() {
        return facets;
    }

    public void setFacets(Object facets) {
        this.facets = facets;
    }

    public List<Dataset> getResults() {
        return results;
    }

    public void setResults(List<Dataset> results) {
        this.results = results;
    }

    public Object getSearchFacets() {
        return searchFacets;
    }

    public void setSearchFacets(Object searchFacets) {
        this.searchFacets = searchFacets;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Result{" +
                "additionalProperties=" + additionalProperties +
                ", count=" + count +
                ", facets=" + facets +
                ", results=" + results +
                ", searchFacets=" + searchFacets +
                ", sort='" + sort + '\'' +
                '}';
    }
}
