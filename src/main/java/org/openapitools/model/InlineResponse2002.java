package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ModelRelation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:49:04.527Z[UTC]")

public class InlineResponse2002   {
  @JsonProperty("app_model_relations")
  @Valid
  private List<ModelRelation> appModelRelations = null;

  public InlineResponse2002 appModelRelations(List<ModelRelation> appModelRelations) {
    this.appModelRelations = appModelRelations;
    return this;
  }

  public InlineResponse2002 addAppModelRelationsItem(ModelRelation appModelRelationsItem) {
    if (this.appModelRelations == null) {
      this.appModelRelations = new ArrayList<>();
    }
    this.appModelRelations.add(appModelRelationsItem);
    return this;
  }

  /**
   * Get appModelRelations
   * @return appModelRelations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ModelRelation> getAppModelRelations() {
    return appModelRelations;
  }

  public void setAppModelRelations(List<ModelRelation> appModelRelations) {
    this.appModelRelations = appModelRelations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.appModelRelations, inlineResponse2002.appModelRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appModelRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    appModelRelations: ").append(toIndentedString(appModelRelations)).append("\n");
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

