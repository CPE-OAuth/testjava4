package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Model;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:56:29.222Z[UTC]")

public class InlineResponse200   {
  @JsonProperty("app_models")
  @Valid
  private List<Model> appModels = null;

  public InlineResponse200 appModels(List<Model> appModels) {
    this.appModels = appModels;
    return this;
  }

  public InlineResponse200 addAppModelsItem(Model appModelsItem) {
    if (this.appModels == null) {
      this.appModels = new ArrayList<>();
    }
    this.appModels.add(appModelsItem);
    return this;
  }

  /**
   * Get appModels
   * @return appModels
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Model> getAppModels() {
    return appModels;
  }

  public void setAppModels(List<Model> appModels) {
    this.appModels = appModels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.appModels, inlineResponse200.appModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    appModels: ").append(toIndentedString(appModels)).append("\n");
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

