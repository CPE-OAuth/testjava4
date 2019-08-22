package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateAppContractResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:49:04.527Z[UTC]")

public class CreateAppContractResponse   {
  @JsonProperty("contract_ids")
  @Valid
  private List<String> contractIds = null;

  public CreateAppContractResponse contractIds(List<String> contractIds) {
    this.contractIds = contractIds;
    return this;
  }

  public CreateAppContractResponse addContractIdsItem(String contractIdsItem) {
    if (this.contractIds == null) {
      this.contractIds = new ArrayList<>();
    }
    this.contractIds.add(contractIdsItem);
    return this;
  }

  /**
   * Get contractIds
   * @return contractIds
  */
  @ApiModelProperty(value = "")


  public List<String> getContractIds() {
    return contractIds;
  }

  public void setContractIds(List<String> contractIds) {
    this.contractIds = contractIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppContractResponse createAppContractResponse = (CreateAppContractResponse) o;
    return Objects.equals(this.contractIds, createAppContractResponse.contractIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppContractResponse {\n");
    
    sb.append("    contractIds: ").append(toIndentedString(contractIds)).append("\n");
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

