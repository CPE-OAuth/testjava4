package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AppRequestObjectType;
import org.openapitools.model.AppRequestRequestObjectInfo;
import org.openapitools.model.AppRequestStatus;
import org.openapitools.model.AppRequestType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:49:04.527Z[UTC]")

public class AppRequest   {
  @JsonProperty("approver")
  private String approver;

  @JsonProperty("requester")
  private String requester;

  @JsonProperty("updated_at")
  private String updatedAt;

  @JsonProperty("request_type")
  private AppRequestType requestType;

  @JsonProperty("request_object_id")
  private String requestObjectId;

  @JsonProperty("request_object_type")
  private AppRequestObjectType requestObjectType;

  @JsonProperty("request_object_info")
  private AppRequestRequestObjectInfo requestObjectInfo = null;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("created_at")
  private String createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("status")
  private AppRequestStatus status;

  public AppRequest approver(String approver) {
    this.approver = approver;
    return this;
  }

  /**
   * Get approver
   * @return approver
  */
  @ApiModelProperty(value = "")


  public String getApprover() {
    return approver;
  }

  public void setApprover(String approver) {
    this.approver = approver;
  }

  public AppRequest requester(String requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Get requester
   * @return requester
  */
  @ApiModelProperty(value = "")


  public String getRequester() {
    return requester;
  }

  public void setRequester(String requester) {
    this.requester = requester;
  }

  public AppRequest updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @ApiModelProperty(value = "")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AppRequest requestType(AppRequestType requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * Get requestType
   * @return requestType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(AppRequestType requestType) {
    this.requestType = requestType;
  }

  public AppRequest requestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  /**
   * Get requestObjectId
   * @return requestObjectId
  */
  @ApiModelProperty(value = "")


  public String getRequestObjectId() {
    return requestObjectId;
  }

  public void setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
  }

  public AppRequest requestObjectType(AppRequestObjectType requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  /**
   * Get requestObjectType
   * @return requestObjectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppRequestObjectType getRequestObjectType() {
    return requestObjectType;
  }

  public void setRequestObjectType(AppRequestObjectType requestObjectType) {
    this.requestObjectType = requestObjectType;
  }

  public AppRequest requestObjectInfo(AppRequestRequestObjectInfo requestObjectInfo) {
    this.requestObjectInfo = requestObjectInfo;
    return this;
  }

  /**
   * Get requestObjectInfo
   * @return requestObjectInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppRequestRequestObjectInfo getRequestObjectInfo() {
    return requestObjectInfo;
  }

  public void setRequestObjectInfo(AppRequestRequestObjectInfo requestObjectInfo) {
    this.requestObjectInfo = requestObjectInfo;
  }

  public AppRequest projectId(String projectId) {
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

  public AppRequest createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AppRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppRequest status(AppRequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppRequestStatus getStatus() {
    return status;
  }

  public void setStatus(AppRequestStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppRequest appRequest = (AppRequest) o;
    return Objects.equals(this.approver, appRequest.approver) &&
        Objects.equals(this.requester, appRequest.requester) &&
        Objects.equals(this.updatedAt, appRequest.updatedAt) &&
        Objects.equals(this.requestType, appRequest.requestType) &&
        Objects.equals(this.requestObjectId, appRequest.requestObjectId) &&
        Objects.equals(this.requestObjectType, appRequest.requestObjectType) &&
        Objects.equals(this.requestObjectInfo, appRequest.requestObjectInfo) &&
        Objects.equals(this.projectId, appRequest.projectId) &&
        Objects.equals(this.createdAt, appRequest.createdAt) &&
        Objects.equals(this.description, appRequest.description) &&
        Objects.equals(this.status, appRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approver, requester, updatedAt, requestType, requestObjectId, requestObjectType, requestObjectInfo, projectId, createdAt, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppRequest {\n");
    
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    requestObjectId: ").append(toIndentedString(requestObjectId)).append("\n");
    sb.append("    requestObjectType: ").append(toIndentedString(requestObjectType)).append("\n");
    sb.append("    requestObjectInfo: ").append(toIndentedString(requestObjectInfo)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

