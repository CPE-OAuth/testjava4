package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets appRequestType
 */
public enum AppRequestType {
  
  PUBLISH_APPROVAL("PUBLISH_APPROVAL"),
  
  DEPRECATE_APPROVAL("DEPRECATE_APPROVAL"),
  
  DELETE_APPROVAL("DELETE_APPROVAL");

  private String value;

  AppRequestType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppRequestType fromValue(String value) {
    for (AppRequestType b : AppRequestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

