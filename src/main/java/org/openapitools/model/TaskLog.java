package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:56:29.222Z[UTC]")

public class TaskLog   {
  @JsonProperty("job_id")
  private String jobId;

  @JsonProperty("job_name")
  private String jobName;

  @JsonProperty("job_type")
  private String jobType;

  @JsonProperty("service_instance_id")
  private String serviceInstanceId;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("order_id")
  private String orderId;

  @JsonProperty("job_desc")
  private String jobDesc;

  @JsonProperty("execution_status")
  private String executionStatus;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("task_id")
  private String taskId;

  @JsonProperty("task_type")
  private String taskType;

  @JsonProperty("task_index")
  private String taskIndex;

  @JsonProperty("task_name")
  private String taskName;

  @JsonProperty("task_status")
  private String taskStatus;

  @JsonProperty("last_health_check")
  private OffsetDateTime lastHealthCheck;

  @JsonProperty("owner_id")
  private String ownerId;

  public TaskLog jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  @ApiModelProperty(value = "")


  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public TaskLog jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * Get jobName
   * @return jobName
  */
  @ApiModelProperty(value = "")


  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public TaskLog jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * Get jobType
   * @return jobType
  */
  @ApiModelProperty(value = "")


  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public TaskLog serviceInstanceId(String serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
    return this;
  }

  /**
   * Get serviceInstanceId
   * @return serviceInstanceId
  */
  @ApiModelProperty(value = "")


  public String getServiceInstanceId() {
    return serviceInstanceId;
  }

  public void setServiceInstanceId(String serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
  }

  public TaskLog projectId(String projectId) {
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

  public TaskLog orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @ApiModelProperty(value = "")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TaskLog jobDesc(String jobDesc) {
    this.jobDesc = jobDesc;
    return this;
  }

  /**
   * Get jobDesc
   * @return jobDesc
  */
  @ApiModelProperty(value = "")


  public String getJobDesc() {
    return jobDesc;
  }

  public void setJobDesc(String jobDesc) {
    this.jobDesc = jobDesc;
  }

  public TaskLog executionStatus(String executionStatus) {
    this.executionStatus = executionStatus;
    return this;
  }

  /**
   * Get executionStatus
   * @return executionStatus
  */
  @ApiModelProperty(value = "")


  public String getExecutionStatus() {
    return executionStatus;
  }

  public void setExecutionStatus(String executionStatus) {
    this.executionStatus = executionStatus;
  }

  public TaskLog createdAt(OffsetDateTime createdAt) {
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

  public TaskLog createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public TaskLog taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  */
  @ApiModelProperty(value = "")


  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public TaskLog taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

  /**
   * Get taskType
   * @return taskType
  */
  @ApiModelProperty(value = "")


  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public TaskLog taskIndex(String taskIndex) {
    this.taskIndex = taskIndex;
    return this;
  }

  /**
   * Get taskIndex
   * @return taskIndex
  */
  @ApiModelProperty(value = "")


  public String getTaskIndex() {
    return taskIndex;
  }

  public void setTaskIndex(String taskIndex) {
    this.taskIndex = taskIndex;
  }

  public TaskLog taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Get taskName
   * @return taskName
  */
  @ApiModelProperty(value = "")


  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public TaskLog taskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  /**
   * Get taskStatus
   * @return taskStatus
  */
  @ApiModelProperty(value = "")


  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }

  public TaskLog lastHealthCheck(OffsetDateTime lastHealthCheck) {
    this.lastHealthCheck = lastHealthCheck;
    return this;
  }

  /**
   * Get lastHealthCheck
   * @return lastHealthCheck
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastHealthCheck() {
    return lastHealthCheck;
  }

  public void setLastHealthCheck(OffsetDateTime lastHealthCheck) {
    this.lastHealthCheck = lastHealthCheck;
  }

  public TaskLog ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @ApiModelProperty(value = "")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskLog taskLog = (TaskLog) o;
    return Objects.equals(this.jobId, taskLog.jobId) &&
        Objects.equals(this.jobName, taskLog.jobName) &&
        Objects.equals(this.jobType, taskLog.jobType) &&
        Objects.equals(this.serviceInstanceId, taskLog.serviceInstanceId) &&
        Objects.equals(this.projectId, taskLog.projectId) &&
        Objects.equals(this.orderId, taskLog.orderId) &&
        Objects.equals(this.jobDesc, taskLog.jobDesc) &&
        Objects.equals(this.executionStatus, taskLog.executionStatus) &&
        Objects.equals(this.createdAt, taskLog.createdAt) &&
        Objects.equals(this.createdBy, taskLog.createdBy) &&
        Objects.equals(this.taskId, taskLog.taskId) &&
        Objects.equals(this.taskType, taskLog.taskType) &&
        Objects.equals(this.taskIndex, taskLog.taskIndex) &&
        Objects.equals(this.taskName, taskLog.taskName) &&
        Objects.equals(this.taskStatus, taskLog.taskStatus) &&
        Objects.equals(this.lastHealthCheck, taskLog.lastHealthCheck) &&
        Objects.equals(this.ownerId, taskLog.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobName, jobType, serviceInstanceId, projectId, orderId, jobDesc, executionStatus, createdAt, createdBy, taskId, taskType, taskIndex, taskName, taskStatus, lastHealthCheck, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLog {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    jobDesc: ").append(toIndentedString(jobDesc)).append("\n");
    sb.append("    executionStatus: ").append(toIndentedString(executionStatus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    taskIndex: ").append(toIndentedString(taskIndex)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    lastHealthCheck: ").append(toIndentedString(lastHealthCheck)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

