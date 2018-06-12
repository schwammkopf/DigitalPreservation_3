package com.dto.dspace;

import java.util.HashMap;
import java.util.Map;

public class CheckSum {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private String checkSumAlgorithm;
    private String value;

    public Map<String, Object> getAdditionalProperties() {

        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getCheckSumAlgorithm() {
        return checkSumAlgorithm;
    }

    public void setCheckSumAlgorithm(String checkSumAlgorithm) {
        this.checkSumAlgorithm = checkSumAlgorithm;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CheckSum{" +
                "additionalProperties=" + additionalProperties +
                ", checkSumAlgorithm='" + checkSumAlgorithm + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
