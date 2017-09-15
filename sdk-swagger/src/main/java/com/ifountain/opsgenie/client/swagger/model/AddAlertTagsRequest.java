/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * AddAlertTagsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class AddAlertTagsRequest {
    @JsonProperty("user")
    private String user = null;

    @JsonProperty("note")
    private String note = null;

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    public AddAlertTagsRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Display name of the request owner
     *
     * @return user
     **/
    @ApiModelProperty(value = "Display name of the request owner")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public AddAlertTagsRequest note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Additional note that will be added while creating the alert
     *
     * @return note
     **/
    @ApiModelProperty(value = "Additional note that will be added while creating the alert")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public AddAlertTagsRequest source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Source field of the alert. Default value is IP address of the incoming request
     *
     * @return source
     **/
    @ApiModelProperty(value = "Source field of the alert. Default value is IP address of the incoming request")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public AddAlertTagsRequest tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public AddAlertTagsRequest addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddAlertTagsRequest addAlertTagsRequest = (AddAlertTagsRequest) o;
        return ObjectUtils.equals(this.user, addAlertTagsRequest.user) &&
                ObjectUtils.equals(this.note, addAlertTagsRequest.note) &&
                ObjectUtils.equals(this.source, addAlertTagsRequest.source) &&
                ObjectUtils.equals(this.tags, addAlertTagsRequest.tags);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(user, note, source, tags);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAlertTagsRequest {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

