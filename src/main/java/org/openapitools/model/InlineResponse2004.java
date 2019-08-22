package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AppRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:49:04.527Z[UTC]")

public class InlineResponse2004   {
  @JsonProperty("app_requests")
  @Valid
  private List<AppRequest> appRequests = null;

  public InlineResponse2004 appRequests(List<AppRequest> appRequests) {
    this.appRequests = appRequests;
    return this;
  }

  public InlineResponse2004 addAppRequestsItem(AppRequest appRequestsItem) {
    if (this.appRequests == null) {
      this.appRequests = new ArrayList<>();
    }
    this.appRequests.add(appRequestsItem);
    return this;
  }

  /**
   * Get appRequests
   * @return appRequests
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AppRequest> getAppRequests() {
    return appRequests;
  }

  public void setAppRequests(List<AppRequest> appRequests) {
    this.appRequests = appRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.appRequests, inlineResponse2004.appRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    appRequests: ").append(toIndentedString(appRequests)).append("\n");
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

