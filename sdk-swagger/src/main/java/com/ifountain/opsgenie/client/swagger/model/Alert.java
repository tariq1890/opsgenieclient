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
import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Alert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class Alert {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("tinyId")
    private String tinyId = null;

    @JsonProperty("alias")
    private String alias = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("acknowledged")
    private Boolean acknowledged = null;

    @JsonProperty("isSeen")
    private Boolean isSeen = null;

    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("snoozed")
    private Boolean snoozed = null;

    @JsonProperty("snoozedUntil")
    private DateTime snoozedUntil = null;

    @JsonProperty("count")
    private Integer count = null;

    @JsonProperty("lastOccurredAt")
    private DateTime lastOccurredAt = null;

    @JsonProperty("createdAt")
    private DateTime createdAt = null;

    @JsonProperty("updatedAt")
    private DateTime updatedAt = null;

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("owner")
    private String owner = null;

    @JsonProperty("priority")
    private String priority = null;

    @JsonProperty("teams")
    private List<TeamMeta> teams = new ArrayList<TeamMeta>();

    @JsonProperty("integration")
    private AlertIntegration integration = null;

    @JsonProperty("report")
    private AlertReport report = null;

    @JsonProperty("actions")
    private List<String> actions = new ArrayList<String>();

    @JsonProperty("entity")
    private String entity = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("details")
    private Map<String, String> details = new HashMap<String, String>();

    public Alert id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alert tinyId(String tinyId) {
        this.tinyId = tinyId;
        return this;
    }

    /**
     * Get tinyId
     *
     * @return tinyId
     **/
    @ApiModelProperty(value = "")
    public String getTinyId() {
        return tinyId;
    }

    public void setTinyId(String tinyId) {
        this.tinyId = tinyId;
    }

    public Alert alias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get alias
     *
     * @return alias
     **/
    @ApiModelProperty(value = "")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Alert message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Alert status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Alert acknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
        return this;
    }

    /**
     * Get acknowledged
     *
     * @return acknowledged
     **/
    @ApiModelProperty(value = "")
    public Boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public Alert isSeen(Boolean isSeen) {
        this.isSeen = isSeen;
        return this;
    }

    /**
     * Get isSeen
     *
     * @return isSeen
     **/
    @ApiModelProperty(value = "")
    public Boolean getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(Boolean isSeen) {
        this.isSeen = isSeen;
    }

    public Alert tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Alert addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     **/
    @ApiModelProperty(value = "")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Alert snoozed(Boolean snoozed) {
        this.snoozed = snoozed;
        return this;
    }

    /**
     * Get snoozed
     * @return snoozed
     **/
    @ApiModelProperty(value = "")
    public Boolean getSnoozed() {
        return snoozed;
    }

    public void setSnoozed(Boolean snoozed) {
        this.snoozed = snoozed;
    }

    public Alert snoozedUntil(DateTime snoozedUntil) {
        this.snoozedUntil = snoozedUntil;
        return this;
    }

    /**
     * Get snoozedUntil
     *
     * @return snoozedUntil
     **/
    @ApiModelProperty(value = "")
    public DateTime getSnoozedUntil() {
        return snoozedUntil;
    }

    public void setSnoozedUntil(DateTime snoozedUntil) {
        this.snoozedUntil = snoozedUntil;
    }

    public Alert count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     **/
    @ApiModelProperty(value = "")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Alert lastOccurredAt(DateTime lastOccurredAt) {
        this.lastOccurredAt = lastOccurredAt;
        return this;
    }

    /**
     * Get lastOccurredAt
     * @return lastOccurredAt
     **/
    @ApiModelProperty(value = "")
    public DateTime getLastOccurredAt() {
        return lastOccurredAt;
    }

    public void setLastOccurredAt(DateTime lastOccurredAt) {
        this.lastOccurredAt = lastOccurredAt;
    }

    public Alert createdAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @ApiModelProperty(value = "")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Alert updatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     **/
    @ApiModelProperty(value = "")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Alert source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     **/
    @ApiModelProperty(value = "")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Alert owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     **/
    @ApiModelProperty(value = "")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Alert priority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get priority
     * @return priority
     **/
    @ApiModelProperty(value = "")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Alert teams(List<TeamMeta> teams) {
        this.teams = teams;
        return this;
    }

    public Alert addTeamsItem(TeamMeta teamsItem) {
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * Get teams
     * @return teams
     **/
    @ApiModelProperty(value = "")
    public List<TeamMeta> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamMeta> teams) {
        this.teams = teams;
    }

    public Alert integration(AlertIntegration integration) {
        this.integration = integration;
        return this;
    }

    /**
     * Get integration
     * @return integration
     **/
    @ApiModelProperty(value = "")
    public AlertIntegration getIntegration() {
        return integration;
    }

    public void setIntegration(AlertIntegration integration) {
        this.integration = integration;
    }

    public Alert report(AlertReport report) {
        this.report = report;
        return this;
    }

    /**
     * Get report
     * @return report
     **/
    @ApiModelProperty(value = "")
    public AlertReport getReport() {
        return report;
    }

    public void setReport(AlertReport report) {
        this.report = report;
    }

    public Alert actions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public Alert addActionsItem(String actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Get actions
     * @return actions
     **/
    @ApiModelProperty(value = "")
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public Alert entity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get entity
     * @return entity
     **/
    @ApiModelProperty(value = "")
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Alert description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Alert details(Map<String, String> details) {
        this.details = details;
        return this;
    }

    public Alert putDetailsItem(String key, String detailsItem) {
        this.details.put(key, detailsItem);
        return this;
    }

    /**
     * Get details
     * @return details
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Alert alert = (Alert) o;
        return ObjectUtils.equals(this.id, alert.id) &&
                ObjectUtils.equals(this.tinyId, alert.tinyId) &&
                ObjectUtils.equals(this.alias, alert.alias) &&
                ObjectUtils.equals(this.message, alert.message) &&
                ObjectUtils.equals(this.status, alert.status) &&
                ObjectUtils.equals(this.acknowledged, alert.acknowledged) &&
                ObjectUtils.equals(this.isSeen, alert.isSeen) &&
                ObjectUtils.equals(this.tags, alert.tags) &&
                ObjectUtils.equals(this.snoozed, alert.snoozed) &&
                ObjectUtils.equals(this.snoozedUntil, alert.snoozedUntil) &&
                ObjectUtils.equals(this.count, alert.count) &&
                ObjectUtils.equals(this.lastOccurredAt, alert.lastOccurredAt) &&
                ObjectUtils.equals(this.createdAt, alert.createdAt) &&
                ObjectUtils.equals(this.updatedAt, alert.updatedAt) &&
                ObjectUtils.equals(this.source, alert.source) &&
                ObjectUtils.equals(this.owner, alert.owner) &&
                ObjectUtils.equals(this.priority, alert.priority) &&
                ObjectUtils.equals(this.teams, alert.teams) &&
                ObjectUtils.equals(this.integration, alert.integration) &&
                ObjectUtils.equals(this.report, alert.report) &&
                ObjectUtils.equals(this.actions, alert.actions) &&
                ObjectUtils.equals(this.entity, alert.entity) &&
                ObjectUtils.equals(this.description, alert.description) &&
                ObjectUtils.equals(this.details, alert.details);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(id, tinyId, alias, message, status, acknowledged, isSeen, tags, snoozed, snoozedUntil, count, lastOccurredAt, createdAt, updatedAt, source, owner, priority, teams, integration, report, actions, entity, description, details);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Alert {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tinyId: ").append(toIndentedString(tinyId)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
        sb.append("    isSeen: ").append(toIndentedString(isSeen)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    snoozed: ").append(toIndentedString(snoozed)).append("\n");
        sb.append("    snoozedUntil: ").append(toIndentedString(snoozedUntil)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    lastOccurredAt: ").append(toIndentedString(lastOccurredAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
        sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

