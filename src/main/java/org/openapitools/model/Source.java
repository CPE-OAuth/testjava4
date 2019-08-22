package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:56:29.222Z[UTC]")

public class Source   {
  @JsonProperty("repo_auth")
  private String repoAuth;

  @JsonProperty("repo_url")
  private String repoUrl;

  @JsonProperty("repo_ref")
  private String repoRef = "master";

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    GITHUB("GitHub"),
    
    GITLAB("Gitlab"),
    
    GITEE("Gitee"),
    
    DEVCLOUD("DevCloud"),
    
    BITBUCKET("BitBucket");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public Source repoAuth(String repoAuth) {
    this.repoAuth = repoAuth;
    return this;
  }

  /**
   * auth name of repository
   * @return repoAuth
  */
  @ApiModelProperty(required = true, value = "auth name of repository")
  @NotNull


  public String getRepoAuth() {
    return repoAuth;
  }

  public void setRepoAuth(String repoAuth) {
    this.repoAuth = repoAuth;
  }

  public Source repoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
    return this;
  }

  /**
   * Get repoUrl
   * @return repoUrl
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRepoUrl() {
    return repoUrl;
  }

  public void setRepoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
  }

  public Source repoRef(String repoRef) {
    this.repoRef = repoRef;
    return this;
  }

  /**
   * branch or tag or commit sha
   * @return repoRef
  */
  @ApiModelProperty(required = true, value = "branch or tag or commit sha")
  @NotNull


  public String getRepoRef() {
    return repoRef;
  }

  public void setRepoRef(String repoRef) {
    this.repoRef = repoRef;
  }

  public Source type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.repoAuth, source.repoAuth) &&
        Objects.equals(this.repoUrl, source.repoUrl) &&
        Objects.equals(this.repoRef, source.repoRef) &&
        Objects.equals(this.type, source.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoAuth, repoUrl, repoRef, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    repoAuth: ").append(toIndentedString(repoAuth)).append("\n");
    sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
    sb.append("    repoRef: ").append(toIndentedString(repoRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

