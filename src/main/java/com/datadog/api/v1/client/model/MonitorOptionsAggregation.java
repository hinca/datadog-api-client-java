/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

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
 * MonitorOptionsAggregation
 */
@JsonPropertyOrder({
  MonitorOptionsAggregation.JSON_PROPERTY_GROUP_BY,
  MonitorOptionsAggregation.JSON_PROPERTY_METRIC,
  MonitorOptionsAggregation.JSON_PROPERTY_TYPE
})

public class MonitorOptionsAggregation {
  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private String groupBy;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public MonitorOptionsAggregation groupBy(String groupBy) {
    
    this.groupBy = groupBy;
    return this;
  }

   /**
   * Get groupBy
   * @return groupBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "host", value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(String groupBy) {
    this.groupBy = groupBy;
  }


  public MonitorOptionsAggregation metric(String metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "count", value = "")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetric() {
    return metric;
  }


  public void setMetric(String metric) {
    this.metric = metric;
  }


  public MonitorOptionsAggregation type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "count", value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
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
    MonitorOptionsAggregation monitorOptionsAggregation = (MonitorOptionsAggregation) o;
    return Objects.equals(this.groupBy, monitorOptionsAggregation.groupBy) &&
        Objects.equals(this.metric, monitorOptionsAggregation.metric) &&
        Objects.equals(this.type, monitorOptionsAggregation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, metric, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptionsAggregation {\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
