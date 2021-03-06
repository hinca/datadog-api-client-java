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
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Information about widget.  Note: The &#x60;layout&#x60; property is required for widgets in dashboards with &#x60;free&#x60; &#x60;layout_type&#x60; only.
 */
@ApiModel(description = "Information about widget.  Note: The `layout` property is required for widgets in dashboards with `free` `layout_type` only.")
@JsonPropertyOrder({
  Widget.JSON_PROPERTY_DEFINITION,
  Widget.JSON_PROPERTY_ID,
  Widget.JSON_PROPERTY_LAYOUT
})

public class Widget {
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private WidgetDefinition definition;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private WidgetLayout layout;


  public Widget definition(WidgetDefinition definition) {
    
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WidgetDefinition getDefinition() {
    return definition;
  }


  public void setDefinition(WidgetDefinition definition) {
    this.definition = definition;
  }


  public Widget id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the widget.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the widget.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Widget layout(WidgetLayout layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetLayout getLayout() {
    return layout;
  }


  public void setLayout(WidgetLayout layout) {
    this.layout = layout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Widget widget = (Widget) o;
    return Objects.equals(this.definition, widget.definition) &&
        Objects.equals(this.id, widget.id) &&
        Objects.equals(this.layout, widget.layout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, id, layout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Widget {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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

