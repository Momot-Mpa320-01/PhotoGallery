package com.example.photogallery.model;

import androidx.room.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "owner",
        "secret",
        "server",
        "farm",
        "title",
        "ispublic",
        "isfriend",
        "isfamily",
        "url_s",
        "height_s",
        "width_s"
})
@Entity

public class Photo {

    @JsonProperty("id")
    private String id;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("server")
    private String server;
    @JsonProperty("farm")
    private Integer farm;
    @JsonProperty("title")
    private String title;
    @JsonProperty("ispublic")
    private Integer ispublic;
    @JsonProperty("isfriend")
    private Integer isfriend;
    @JsonProperty("isfamily")
    private Integer isfamily;
    @JsonProperty("url_s")
    private String urlS;
    @JsonProperty("height_s")
    private Integer heightS;
    @JsonProperty("width_s")
    private Integer widthS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
    }

    @JsonProperty("farm")
    public Integer getFarm() {
        return farm;
    }

    @JsonProperty("farm")
    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("ispublic")
    public Integer getIspublic() {
        return ispublic;
    }

    @JsonProperty("ispublic")
    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    @JsonProperty("isfriend")
    public Integer getIsfriend() {
        return isfriend;
    }

    @JsonProperty("isfriend")
    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    @JsonProperty("isfamily")
    public Integer getIsfamily() {
        return isfamily;
    }

    @JsonProperty("isfamily")
    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    @JsonProperty("url_s")
    public String getUrlS() {
        return urlS;
    }

    @JsonProperty("url_s")
    public void setUrlS(String urlS) {
        this.urlS = urlS;
    }

    @JsonProperty("height_s")
    public Integer getHeightS() {
        return heightS;
    }

    @JsonProperty("height_s")
    public void setHeightS(Integer heightS) {
        this.heightS = heightS;
    }

    @JsonProperty("width_s")
    public Integer getWidthS() {
        return widthS;
    }

    @JsonProperty("width_s")
    public void setWidthS(Integer widthS) {
        this.widthS = widthS;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}