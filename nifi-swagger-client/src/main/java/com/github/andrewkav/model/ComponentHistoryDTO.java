/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * The version of the OpenAPI document: 1.9.2
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.andrewkav.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.andrewkav.model.PropertyHistoryDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ComponentHistoryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ComponentHistoryDTO {
  public static final String SERIALIZED_NAME_COMPONENT_ID = "componentId";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private String componentId;

  public static final String SERIALIZED_NAME_PROPERTY_HISTORY = "propertyHistory";
  @SerializedName(SERIALIZED_NAME_PROPERTY_HISTORY)
  private Map<String, PropertyHistoryDTO> propertyHistory = new HashMap<String, PropertyHistoryDTO>();

  public ComponentHistoryDTO componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * The component id.
   * @return componentId
  **/
  @ApiModelProperty(value = "The component id.")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public ComponentHistoryDTO propertyHistory(Map<String, PropertyHistoryDTO> propertyHistory) {
    this.propertyHistory = propertyHistory;
    return this;
  }

  public ComponentHistoryDTO putPropertyHistoryItem(String key, PropertyHistoryDTO propertyHistoryItem) {
    if (this.propertyHistory == null) {
      this.propertyHistory = new HashMap<String, PropertyHistoryDTO>();
    }
    this.propertyHistory.put(key, propertyHistoryItem);
    return this;
  }

   /**
   * The history for the properties of the component.
   * @return propertyHistory
  **/
  @ApiModelProperty(value = "The history for the properties of the component.")
  public Map<String, PropertyHistoryDTO> getPropertyHistory() {
    return propertyHistory;
  }

  public void setPropertyHistory(Map<String, PropertyHistoryDTO> propertyHistory) {
    this.propertyHistory = propertyHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentHistoryDTO componentHistoryDTO = (ComponentHistoryDTO) o;
    return Objects.equals(this.componentId, componentHistoryDTO.componentId) &&
        Objects.equals(this.propertyHistory, componentHistoryDTO.propertyHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, propertyHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentHistoryDTO {\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    propertyHistory: ").append(toIndentedString(propertyHistory)).append("\n");
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

