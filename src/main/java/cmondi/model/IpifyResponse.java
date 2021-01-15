package cmondi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IpifyResponse {
    @JsonProperty("ip")
    private String ip;

    @JsonProperty("lang")
    private String lang;

    public void setLang(String lang) {
        this.lang = lang;
    }
}
