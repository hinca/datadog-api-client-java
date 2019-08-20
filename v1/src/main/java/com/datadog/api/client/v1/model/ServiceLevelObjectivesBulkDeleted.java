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
import com.datadog.api.client.v1.model.ServiceLevelObjectivesBulkDeletedData;
import com.datadog.api.client.v1.model.ServiceLevelObjectivesBulkDeletedErrors;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The bulk partial delete service level objective object endpoint response. This endpoint operates on multiple service level objective objects, so it may be partially successful. In such cases, the \&quot;data\&quot; and \&quot;error\&quot; fields in this response indicate which deletions succeeded and failed.
 */
@ApiModel(description = "The bulk partial delete service level objective object endpoint response. This endpoint operates on multiple service level objective objects, so it may be partially successful. In such cases, the \"data\" and \"error\" fields in this response indicate which deletions succeeded and failed.")

public class ServiceLevelObjectivesBulkDeleted {
  public static final String JSON_PROPERTY_DATA = "data";
  private ServiceLevelObjectivesBulkDeletedData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ServiceLevelObjectivesBulkDeletedErrors> errors = new ArrayList<ServiceLevelObjectivesBulkDeletedErrors>();


  public ServiceLevelObjectivesBulkDeleted data(ServiceLevelObjectivesBulkDeletedData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ServiceLevelObjectivesBulkDeletedData getData() {
    return data;
  }



  public void setData(ServiceLevelObjectivesBulkDeletedData data) {
    this.data = data;
  }


  public ServiceLevelObjectivesBulkDeleted errors(List<ServiceLevelObjectivesBulkDeletedErrors> errors) {
    
    this.errors = errors;
    return this;
  }

  public ServiceLevelObjectivesBulkDeleted addErrorsItem(ServiceLevelObjectivesBulkDeletedErrors errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ServiceLevelObjectivesBulkDeletedErrors> getErrors() {
    return errors;
  }



  public void setErrors(List<ServiceLevelObjectivesBulkDeletedErrors> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectivesBulkDeleted serviceLevelObjectivesBulkDeleted = (ServiceLevelObjectivesBulkDeleted) o;
    return Objects.equals(this.data, serviceLevelObjectivesBulkDeleted.data) &&
        Objects.equals(this.errors, serviceLevelObjectivesBulkDeleted.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectivesBulkDeleted {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

