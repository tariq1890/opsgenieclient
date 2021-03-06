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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Delete tags of the alert
 */
@ApiModel(description = "Delete tags of the alert")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class DeleteAlertTagsRequest {
    @JsonProperty("identifier")
    private String identifier = null;

    @JsonProperty("note")
    private String note = null;
    @JsonProperty("identifierType")
    private IdentifierTypeEnum identifierType = IdentifierTypeEnum.ID;
    @JsonProperty("source")
    private String source = null;
    @JsonProperty("user")
    private String user = null;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    public DeleteAlertTagsRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Identifier of alert which could be alert id, tiny id or alert alias
     *
     * @return identifier
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Identifier of alert which could be alert id, tiny id or alert alias")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public DeleteAlertTagsRequest note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Additional alert note to add
     *
     * @return note
     **/
    @ApiModelProperty(value = "Additional alert note to add")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public DeleteAlertTagsRequest identifierType(IdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    /**
     * Type of the identifier that is provided as an in-line parameter. Possible values are 'id', 'alias' or 'tiny'
     *
     * @return identifierType
     **/
    @ApiModelProperty(value = "Type of the identifier that is provided as an in-line parameter. Possible values are 'id', 'alias' or 'tiny'")
    public IdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(IdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
    }

    public DeleteAlertTagsRequest source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Display name of the request source
     *
     * @return source
     **/
    @ApiModelProperty(value = "Display name of the request source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public DeleteAlertTagsRequest user(String user) {
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

    public DeleteAlertTagsRequest tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public DeleteAlertTagsRequest addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Tags field of the given alert as comma seperated values (e.g. 'tag1,tag2')
     *
     * @return tags
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Tags field of the given alert as comma seperated values (e.g. 'tag1,tag2')")
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
        DeleteAlertTagsRequest deleteAlertTagsRequest = (DeleteAlertTagsRequest) o;
        return ObjectUtils.equals(this.identifier, deleteAlertTagsRequest.identifier) &&
                ObjectUtils.equals(this.note, deleteAlertTagsRequest.note) &&
                ObjectUtils.equals(this.identifierType, deleteAlertTagsRequest.identifierType) &&
                ObjectUtils.equals(this.source, deleteAlertTagsRequest.source) &&
                ObjectUtils.equals(this.user, deleteAlertTagsRequest.user) &&
                ObjectUtils.equals(this.tags, deleteAlertTagsRequest.tags);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(identifier, note, identifierType, source, user, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlertTagsRequest {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

    /**
     * Type of the identifier that is provided as an in-line parameter. Possible values are 'id', 'alias' or 'tiny'
     */
    public enum IdentifierTypeEnum {
        ID("id"),

        ALIAS("alias"),

        TINY("tiny");

        private String value;

        IdentifierTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static IdentifierTypeEnum fromValue(String text) {
            for (IdentifierTypeEnum b : IdentifierTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
    }

    public String getValue() {
      return this.value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }
  
}

