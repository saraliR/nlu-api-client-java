package com.ambiverse.api.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.api.client.util.Key;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kgId",
    "url",
    "score"
})
public class EntityReference {

	@Key
    @JsonProperty("id")
    private String id;

	@Key
    @JsonProperty("url")
    private String url;

	@Key
    @JsonProperty("confidence")
    private double confidence;


    public String getId() {
		return id;
	}

	public void setKgId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getConfidence() {
		return confidence;
	}

	public void setConfidence(double score) {
		this.confidence = score;
	}

	 @Override
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
