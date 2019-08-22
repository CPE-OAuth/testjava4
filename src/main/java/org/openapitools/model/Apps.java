package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Apps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:56:29.222Z[UTC]")

public class Apps   {
  @JsonProperty("instance_id")
  private String instanceId;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private String version;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("app_type")
  private String appType;

  @JsonProperty("platform_type")
  private String platformType;

  @JsonProperty("url")
  private String url;

  @JsonProperty("replica")
  private Integer replica;

  /**
   * Current Application Status
   */
  public enum StatusEnum {
    INITIALIZING("INITIALIZING"),
    
    FAILED("FAILED"),
    
    RUNNING("RUNNING"),
    
    DOWN("DOWN"),
    
    DELETING("DELETING"),
    
    DELETED("DELETED"),
    
    STAGING("STAGING"),
    
    STARTING("STARTING"),
    
    STOPPING("STOPPING"),
    
    STOPPED("STOPPED"),
    
    RESTARTING("RESTARTING"),
    
    PENDING("PENDING"),
    
    PARTIALLY_FAILED("PARTIALLY_FAILED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("last_update_at")
  private OffsetDateTime lastUpdateAt;

  @JsonProperty("assembling_job_id")
  private String assemblingJobId;

  public Apps instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId
   * @return instanceId
  */
  @ApiModelProperty(value = "")


  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public Apps projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  @ApiModelProperty(value = "")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public Apps name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Apps version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Apps displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  @ApiModelProperty(value = "")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Apps appType(String appType) {
    this.appType = appType;
    return this;
  }

  /**
   * Get appType
   * @return appType
  */
  @ApiModelProperty(value = "")


  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public Apps platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * Get platformType
   * @return platformType
  */
  @ApiModelProperty(value = "")


  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public Apps url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Apps replica(Integer replica) {
    this.replica = replica;
    return this;
  }

  /**
   * Get replica
   * @return replica
  */
  @ApiModelProperty(value = "")


  public Integer getReplica() {
    return replica;
  }

  public void setReplica(Integer replica) {
    this.replica = replica;
  }

  public Apps status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current Application Status
   * @return status
  */
  @ApiModelProperty(value = "Current Application Status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Apps reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason for application partially failed
   * @return reason
  */
  @ApiModelProperty(value = "reason for application partially failed")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Apps createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Apps lastUpdateAt(OffsetDateTime lastUpdateAt) {
    this.lastUpdateAt = lastUpdateAt;
    return this;
  }

  /**
   * Get lastUpdateAt
   * @return lastUpdateAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdateAt() {
    return lastUpdateAt;
  }

  public void setLastUpdateAt(OffsetDateTime lastUpdateAt) {
    this.lastUpdateAt = lastUpdateAt;
  }

  public Apps assemblingJobId(String assemblingJobId) {
    this.assemblingJobId = assemblingJobId;
    return this;
  }

  /**
   * Get assemblingJobId
   * @return assemblingJobId
  */
  @ApiModelProperty(value = "")


  public String getAssemblingJobId() {
    return assemblingJobId;
  }

  public void setAssemblingJobId(String assemblingJobId) {
    this.assemblingJobId = assemblingJobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apps apps = (Apps) o;
    return Objects.equals(this.instanceId, apps.instanceId) &&
        Objects.equals(this.projectId, apps.projectId) &&
        Objects.equals(this.name, apps.name) &&
        Objects.equals(this.version, apps.version) &&
        Objects.equals(this.displayName, apps.displayName) &&
        Objects.equals(this.appType, apps.appType) &&
        Objects.equals(this.platformType, apps.platformType) &&
        Objects.equals(this.url, apps.url) &&
        Objects.equals(this.replica, apps.replica) &&
        Objects.equals(this.status, apps.status) &&
        Objects.equals(this.reason, apps.reason) &&
        Objects.equals(this.createdAt, apps.createdAt) &&
        Objects.equals(this.lastUpdateAt, apps.lastUpdateAt) &&
        Objects.equals(this.assemblingJobId, apps.assemblingJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, projectId, name, version, displayName, appType, platformType, url, replica, status, reason, createdAt, lastUpdateAt, assemblingJobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apps {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdateAt: ").append(toIndentedString(lastUpdateAt)).append("\n");
    sb.append("    assemblingJobId: ").append(toIndentedString(assemblingJobId)).append("\n");
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

