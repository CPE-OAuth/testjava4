package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ProjectIdAppsGroupsGroupIdModelsModelIdContractsContracts;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:49:04.527Z[UTC]")

public class InlineObject5   {
  @JsonProperty("contracts")
  @Valid
  private List<ProjectIdAppsGroupsGroupIdModelsModelIdContractsContracts> contracts = null;

  public InlineObject5 contracts(List<ProjectIdAppsGroupsGroupIdModelsModelIdContractsContracts> contracts) {
    this.contracts = contracts;
    return this;
  }

  public InlineObject5 addContractsItem(ProjectIdAppsGroupsGroupIdModelsModelIdContractsContracts contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

  /**
   * Get contracts
   * @return contracts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProjectIdAppsGroupsGroupIdModelsModelIdContractsContracts> getContracts() {
    return contracts;
  }

  public void setContracts(List<ProjectIdAppsGroupsGroupIdModelsModelIdContractsContracts> contracts) {
    this.contracts = contracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(this.contracts, inlineObject5.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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

