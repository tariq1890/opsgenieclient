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
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * AddSavedSearchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class AddSavedSearchRequest {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("query")
    private String query = null;

    @JsonProperty("owner")
    private UserRecipient owner = null;

    @JsonProperty("teams")
    private List<TeamRecipient> teams = new ArrayList<TeamRecipient>();

    public AddSavedSearchRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @NotNull
    @Size(max = 100)
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddSavedSearchRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Size(max = 15000)
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddSavedSearchRequest query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     *
     * @return query
     **/
    @NotNull
    @Size(max = 1000)
    @ApiModelProperty(required = true, value = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public AddSavedSearchRequest owner(UserRecipient owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public UserRecipient getOwner() {
        return owner;
    }

    public void setOwner(UserRecipient owner) {
        this.owner = owner;
    }

    public AddSavedSearchRequest teams(List<TeamRecipient> teams) {
        this.teams = teams;
        return this;
    }

    public AddSavedSearchRequest addTeamsItem(TeamRecipient teamsItem) {
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * Teams that the alert will be routed to send notifications
     *
     * @return teams
     **/
    @Size(max = 20)
    @ApiModelProperty(value = "Teams that the alert will be routed to send notifications")
    public List<TeamRecipient> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamRecipient> teams) {
        this.teams = teams;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddSavedSearchRequest addSavedSearchRequest = (AddSavedSearchRequest) o;
        return ObjectUtils.equals(this.name, addSavedSearchRequest.name) &&
                ObjectUtils.equals(this.description, addSavedSearchRequest.description) &&
                ObjectUtils.equals(this.query, addSavedSearchRequest.query) &&
                ObjectUtils.equals(this.owner, addSavedSearchRequest.owner) &&
                ObjectUtils.equals(this.teams, addSavedSearchRequest.teams);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(name, description, query, owner, teams);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSavedSearchRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

