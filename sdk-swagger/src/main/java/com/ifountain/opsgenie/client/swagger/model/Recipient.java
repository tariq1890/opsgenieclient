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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;

/**
 * Recipient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = GroupRecipient.class, name = "group"),
        @JsonSubTypes.Type(value = EscalationRecipient.class, name = "escalation"),
        @JsonSubTypes.Type(value = TeamRecipient.class, name = "team"),
        @JsonSubTypes.Type(value = NoRecipient.class, name = "none"),
        @JsonSubTypes.Type(value = ScheduleRecipient.class, name = "schedule"),
        @JsonSubTypes.Type(value = AllRecipient.class, name = "all"),
        @JsonSubTypes.Type(value = UserRecipient.class, name = "user"),
})

public class Recipient {
    @JsonProperty("type")
    private TypeEnum type = null;
    @JsonProperty("id")
    private String id = null;

    public Recipient type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Recipient id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipient recipient = (Recipient) o;
        return ObjectUtils.equals(this.type, recipient.type) &&
                ObjectUtils.equals(this.id, recipient.id);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(type, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Recipient {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
     * Gets or Sets type
     */
    public enum TypeEnum {
        ALL("all"),

        NONE("none"),

        USER("user"),

        ESCALATION("escalation"),

        SCHEDULE("schedule"),

        TEAM("team"),

        GROUP("group");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
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

