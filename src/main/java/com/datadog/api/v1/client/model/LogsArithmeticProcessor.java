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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.datadog.api.v1.client.model.LogsProcessor;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Use the Arithmetic Processor to add a new attribute (without spaces or special characters in the new attribute name) to a log with the result of the provided formula. This enables you to remap different time attributes with different units into a single attribute, or to compute operations on attributes within the same log.  The formula can use parentheses and the basic arithmetic operators &#x60;-&#x60;, &#x60;+&#x60;, &#x60;*&#x60;, &#x60;/&#x60;.  By default, the calculation is skipped if an attribute is missing. Select “Replace missing attribute by 0” to automatically populate missing attribute values with 0 to ensure that the calculation is done. An attribute is missing if it is not found in the log attributes, or if it cannot be converted to a number.  *Notes*:  - The operator &#x60;-&#x60; needs to be space split in the formula as it can also be contained in attribute names. - If the target attribute already exists, it is overwritten by the result of the formula. - Results are rounded up to the 9th decimal. For example, if the result of the formula is &#x60;0.1234567891&#x60;,   the actual value stored for the attribute is &#x60;0.123456789&#x60;. - If you need to scale a unit of measure,   see [Scale Filter](https://docs.datadoghq.com/logs/processing/parsing/?tab&#x3D;filter#matcher-and-filter).
 */
@ApiModel(description = "Use the Arithmetic Processor to add a new attribute (without spaces or special characters in the new attribute name) to a log with the result of the provided formula. This enables you to remap different time attributes with different units into a single attribute, or to compute operations on attributes within the same log.  The formula can use parentheses and the basic arithmetic operators `-`, `+`, `*`, `/`.  By default, the calculation is skipped if an attribute is missing. Select “Replace missing attribute by 0” to automatically populate missing attribute values with 0 to ensure that the calculation is done. An attribute is missing if it is not found in the log attributes, or if it cannot be converted to a number.  *Notes*:  - The operator `-` needs to be space split in the formula as it can also be contained in attribute names. - If the target attribute already exists, it is overwritten by the result of the formula. - Results are rounded up to the 9th decimal. For example, if the result of the formula is `0.1234567891`,   the actual value stored for the attribute is `0.123456789`. - If you need to scale a unit of measure,   see [Scale Filter](https://docs.datadoghq.com/logs/processing/parsing/?tab=filter#matcher-and-filter).")
@JsonPropertyOrder({
  LogsArithmeticProcessor.JSON_PROPERTY_EXPRESSION,
  LogsArithmeticProcessor.JSON_PROPERTY_IS_REPLACE_MISSING,
  LogsArithmeticProcessor.JSON_PROPERTY_TARGET,
  LogsArithmeticProcessor.JSON_PROPERTY_TYPE,
  LogsArithmeticProcessor.JSON_PROPERTY_IS_ENABLED,
  LogsArithmeticProcessor.JSON_PROPERTY_NAME
})

public class LogsArithmeticProcessor implements LogsProcessor {
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_IS_REPLACE_MISSING = "is_replace_missing";
  private Boolean isReplaceMissing = false;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "arithmetic-processor";

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public LogsArithmeticProcessor expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * Arithmetic operation between one or more log attributes.
   * @return expression
  **/
  @ApiModelProperty(required = true, value = "Arithmetic operation between one or more log attributes.")
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public LogsArithmeticProcessor isReplaceMissing(Boolean isReplaceMissing) {
    
    this.isReplaceMissing = isReplaceMissing;
    return this;
  }

   /**
   * If &#x60;true&#x60;, it replaces all missing attributes of expression by &#x60;0&#x60;, &#x60;false&#x60; skip the operation if an attribute is missing.
   * @return isReplaceMissing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, it replaces all missing attributes of expression by `0`, `false` skip the operation if an attribute is missing.")
  @JsonProperty(JSON_PROPERTY_IS_REPLACE_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReplaceMissing() {
    return isReplaceMissing;
  }


  public void setIsReplaceMissing(Boolean isReplaceMissing) {
    this.isReplaceMissing = isReplaceMissing;
  }


  public LogsArithmeticProcessor target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Name of the attribute that contains the result of the arithmetic operation.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "Name of the attribute that contains the result of the arithmetic operation.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


   /**
   * Type of processor
   * @return type
  **/
  @ApiModelProperty(example = "arithmetic-processor", required = true, value = "Type of processor")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  public LogsArithmeticProcessor isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the processor is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the processor is enabled.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public LogsArithmeticProcessor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the processor.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the processor.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArithmeticProcessor logsArithmeticProcessor = (LogsArithmeticProcessor) o;
    return Objects.equals(this.expression, logsArithmeticProcessor.expression) &&
        Objects.equals(this.isReplaceMissing, logsArithmeticProcessor.isReplaceMissing) &&
        Objects.equals(this.target, logsArithmeticProcessor.target) &&
        Objects.equals(this.type, logsArithmeticProcessor.type) &&
        Objects.equals(this.isEnabled, logsArithmeticProcessor.isEnabled) &&
        Objects.equals(this.name, logsArithmeticProcessor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, isReplaceMissing, target, type, isEnabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArithmeticProcessor {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    isReplaceMissing: ").append(toIndentedString(isReplaceMissing)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

