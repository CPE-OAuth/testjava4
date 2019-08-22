package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppRequestRequestObjectInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:56:29.222Z[UTC]")

public class AppRequestRequestObjectInfo   {
  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("model_version")
  private String modelVersion;

  @JsonProperty("model_group_id")
  private String modelGroupId;

  @JsonProperty("model_group_name")
  private String modelGroupName;

  @JsonProperty("enterprise_project_id")
  private String enterpriseProjectId;

  public AppRequestRequestObjectInfo modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Get modelName
   * @return modelName
  */
  @ApiModelProperty(value = "")


  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public AppRequestRequestObjectInfo modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * Get modelVersion
   * @return modelVersion
  */
  @ApiModelProperty(value = "")


  public String getModelVersion() {
    return modelVersion;
  }

  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }

  public AppRequestRequestObjectInfo modelGroupId(String modelGroupId) {
    this.modelGroupId = modelGroupId;
    return this;
  }

  /**
   * Get modelGroupId
   * @return modelGroupId
  */
  @ApiModelProperty(value = "")


  public String getModelGroupId() {
    return modelGroupId;
  }

  public void setModelGroupId(String modelGroupId) {
    this.modelGroupId = modelGroupId;
  }

  public AppRequestRequestObjectInfo modelGroupName(String modelGroupName) {
    this.modelGroupName = modelGroupName;
    return this;
  }

  /**
   * Get modelGroupName
   * @return modelGroupName
  */
  @ApiModelProperty(value = "")


  public String getModelGroupName() {
    return modelGroupName;
  }

  public void setModelGroupName(String modelGroupName) {
    this.modelGroupName = modelGroupName;
  }

  public AppRequestRequestObjectInfo enterpriseProjectId(String enterpriseProjectId) {
    this.enterpriseProjectId = enterpriseProjectId;
    return this;
  }

  /**
   * Get enterpriseProjectId
   * @return enterpriseProjectId
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseProjectId() {
    return enterpriseProjectId;
  }

  public void setEnterpriseProjectId(String enterpriseProjectId) {
    this.enterpriseProjectId = enterpriseProjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppRequestRequestObjectInfo appRequestRequestObjectInfo = (AppRequestRequestObjectInfo) o;
    return Objects.equals(this.modelName, appRequestRequestObjectInfo.modelName) &&
        Objects.equals(this.modelVersion, appRequestRequestObjectInfo.modelVersion) &&
        Objects.equals(this.modelGroupId, appRequestRequestObjectInfo.modelGroupId) &&
        Objects.equals(this.modelGroupName, appRequestRequestObjectInfo.modelGroupName) &&
        Objects.equals(this.enterpriseProjectId, appRequestRequestObjectInfo.enterpriseProjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, modelGroupId, modelGroupName, enterpriseProjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppRequestRequestObjectInfo {\n");
    
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    modelGroupId: ").append(toIndentedString(modelGroupId)).append("\n");
    sb.append("    modelGroupName: ").append(toIndentedString(modelGroupName)).append("\n");
    sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

