package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Contract;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:56:29.222Z[UTC]")

public class InlineResponse2003   {
  @JsonProperty("app_contracts")
  @Valid
  private List<Contract> appContracts = null;

  public InlineResponse2003 appContracts(List<Contract> appContracts) {
    this.appContracts = appContracts;
    return this;
  }

  public InlineResponse2003 addAppContractsItem(Contract appContractsItem) {
    if (this.appContracts == null) {
      this.appContracts = new ArrayList<>();
    }
    this.appContracts.add(appContractsItem);
    return this;
  }

  /**
   * Get appContracts
   * @return appContracts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Contract> getAppContracts() {
    return appContracts;
  }

  public void setAppContracts(List<Contract> appContracts) {
    this.appContracts = appContracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.appContracts, inlineResponse2003.appContracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appContracts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    appContracts: ").append(toIndentedString(appContracts)).append("\n");
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

