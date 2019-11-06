/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A metric SLI query. Required if type is \&quot;metric\&quot;.
 */
@ApiModel(description = "A metric SLI query. Required if type is \"metric\".")
@JsonPropertyOrder({
  ServiceLevelObjectiveQuery.JSON_PROPERTY_DENOMINATOR,
  ServiceLevelObjectiveQuery.JSON_PROPERTY_NUMERATOR
})

public class ServiceLevelObjectiveQuery {
  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private String denominator;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private String numerator;


  public ServiceLevelObjectiveQuery denominator(String denominator) {
    
    this.denominator = denominator;
    return this;
  }

   /**
   * A Datadog metric query for total (valid) events.
   * @return denominator
  **/
  @ApiModelProperty(required = true, value = "A Datadog metric query for total (valid) events.")
  @JsonProperty(JSON_PROPERTY_DENOMINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDenominator() {
    return denominator;
  }


  public void setDenominator(String denominator) {
    this.denominator = denominator;
  }


  public ServiceLevelObjectiveQuery numerator(String numerator) {
    
    this.numerator = numerator;
    return this;
  }

   /**
   * A Datadog metric query for good events.
   * @return numerator
  **/
  @ApiModelProperty(required = true, value = "A Datadog metric query for good events.")
  @JsonProperty(JSON_PROPERTY_NUMERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNumerator() {
    return numerator;
  }


  public void setNumerator(String numerator) {
    this.numerator = numerator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectiveQuery serviceLevelObjectiveQuery = (ServiceLevelObjectiveQuery) o;
    return Objects.equals(this.denominator, serviceLevelObjectiveQuery.denominator) &&
        Objects.equals(this.numerator, serviceLevelObjectiveQuery.numerator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominator, numerator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectiveQuery {\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
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

