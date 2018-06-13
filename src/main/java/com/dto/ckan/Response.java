package com.dto.ckan;

import java.util.HashMap;
import java.util.Map;

public class Response {
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private String help;
    private Result result;
    private Boolean success;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Response{" +
                "additionalProperties=" + additionalProperties +
                ", help='" + help + '\'' +
                ", result=" + result +
                ", success=" + success +
                '}';
    }
}
