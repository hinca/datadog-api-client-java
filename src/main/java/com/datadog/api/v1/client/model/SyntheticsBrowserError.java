/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.SyntheticsBrowserErrorType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Error response object for a browser test.
 */
@ApiModel(description = "Error response object for a browser test.")
@JsonPropertyOrder({
  SyntheticsBrowserError.JSON_PROPERTY_DESCRIPTION,
  SyntheticsBrowserError.JSON_PROPERTY_NAME,
  SyntheticsBrowserError.JSON_PROPERTY_STATUS_CODE,
  SyntheticsBrowserError.JSON_PROPERTY_TYPE
})

public class SyntheticsBrowserError {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Long statusCode;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBrowserErrorType type;


  public SyntheticsBrowserError description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the error.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the error.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SyntheticsBrowserError name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the error.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the error.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SyntheticsBrowserError statusCode(Long statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Status Code of the error.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status Code of the error.")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }


  public SyntheticsBrowserError type(SyntheticsBrowserErrorType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SyntheticsBrowserErrorType getType() {
    return type;
  }


  public void setType(SyntheticsBrowserErrorType type) {
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
    SyntheticsBrowserError syntheticsBrowserError = (SyntheticsBrowserError) o;
    return Objects.equals(this.description, syntheticsBrowserError.description) &&
        Objects.equals(this.name, syntheticsBrowserError.name) &&
        Objects.equals(this.statusCode, syntheticsBrowserError.statusCode) &&
        Objects.equals(this.type, syntheticsBrowserError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, statusCode, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

