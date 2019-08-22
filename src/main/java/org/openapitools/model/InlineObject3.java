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
 * InlineObject3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-22T02:49:04.527Z[UTC]")

public class InlineObject3   {
  @JsonProperty("producer_model_id")
  private String producerModelId;

  @JsonProperty("consumer_model_id")
  private String consumerModelId;

  public InlineObject3 producerModelId(String producerModelId) {
    this.producerModelId = producerModelId;
    return this;
  }

  /**
   * Get producerModelId
   * @return producerModelId
  */
  @ApiModelProperty(value = "")


  public String getProducerModelId() {
    return producerModelId;
  }

  public void setProducerModelId(String producerModelId) {
    this.producerModelId = producerModelId;
  }

  public InlineObject3 consumerModelId(String consumerModelId) {
    this.consumerModelId = consumerModelId;
    return this;
  }

  /**
   * Get consumerModelId
   * @return consumerModelId
  */
  @ApiModelProperty(value = "")


  public String getConsumerModelId() {
    return consumerModelId;
  }

  public void setConsumerModelId(String consumerModelId) {
    this.consumerModelId = consumerModelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.producerModelId, inlineObject3.producerModelId) &&
        Objects.equals(this.consumerModelId, inlineObject3.consumerModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producerModelId, consumerModelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    
    sb.append("    producerModelId: ").append(toIndentedString(producerModelId)).append("\n");
    sb.append("    consumerModelId: ").append(toIndentedString(consumerModelId)).append("\n");
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

