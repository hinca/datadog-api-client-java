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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ServiceLevelObjectivesBulkDeletedData
 */
@JsonPropertyOrder({
  ServiceLevelObjectivesBulkDeletedData.JSON_PROPERTY_DELETED,
  ServiceLevelObjectivesBulkDeletedData.JSON_PROPERTY_UPDATED
})

public class ServiceLevelObjectivesBulkDeletedData {
  public static final String JSON_PROPERTY_DELETED = "deleted";
  private List<String> deleted = null;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private List<String> updated = null;


  public ServiceLevelObjectivesBulkDeletedData deleted(List<String> deleted) {
    
    this.deleted = deleted;
    return this;
  }

  public ServiceLevelObjectivesBulkDeletedData addDeletedItem(String deletedItem) {
    if (this.deleted == null) {
      this.deleted = new ArrayList<String>();
    }
    this.deleted.add(deletedItem);
    return this;
  }

   /**
   * An array of service level objective object IDs that indicates which objects that were completely deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of service level objective object IDs that indicates which objects that were completely deleted.")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDeleted() {
    return deleted;
  }



  public void setDeleted(List<String> deleted) {
    this.deleted = deleted;
  }


  public ServiceLevelObjectivesBulkDeletedData updated(List<String> updated) {
    
    this.updated = updated;
    return this;
  }

  public ServiceLevelObjectivesBulkDeletedData addUpdatedItem(String updatedItem) {
    if (this.updated == null) {
      this.updated = new ArrayList<String>();
    }
    this.updated.add(updatedItem);
    return this;
  }

   /**
   * An array of service level objective object IDs that indicates which objects that were modified (objects for which at least one threshold was deleted, but that were not completely deleted).
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of service level objective object IDs that indicates which objects that were modified (objects for which at least one threshold was deleted, but that were not completely deleted).")
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUpdated() {
    return updated;
  }



  public void setUpdated(List<String> updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectivesBulkDeletedData serviceLevelObjectivesBulkDeletedData = (ServiceLevelObjectivesBulkDeletedData) o;
    return Objects.equals(this.deleted, serviceLevelObjectivesBulkDeletedData.deleted) &&
        Objects.equals(this.updated, serviceLevelObjectivesBulkDeletedData.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectivesBulkDeletedData {\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

