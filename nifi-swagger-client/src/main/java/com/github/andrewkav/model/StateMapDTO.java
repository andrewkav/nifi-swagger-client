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
import com.github.andrewkav.model.StateEntryDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StateMapDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class StateMapDTO {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_TOTAL_ENTRY_COUNT = "totalEntryCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRY_COUNT)
  private Integer totalEntryCount;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private List<StateEntryDTO> state = new ArrayList<StateEntryDTO>();

  public StateMapDTO scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of this StateMap.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of this StateMap.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public StateMapDTO totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

   /**
   * The total number of state entries. When the state map is lengthy, only of portion of the entries are returned.
   * @return totalEntryCount
  **/
  @ApiModelProperty(value = "The total number of state entries. When the state map is lengthy, only of portion of the entries are returned.")
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }

  public StateMapDTO state(List<StateEntryDTO> state) {
    this.state = state;
    return this;
  }

  public StateMapDTO addStateItem(StateEntryDTO stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<StateEntryDTO>();
    }
    this.state.add(stateItem);
    return this;
  }

   /**
   * The state.
   * @return state
  **/
  @ApiModelProperty(value = "The state.")
  public List<StateEntryDTO> getState() {
    return state;
  }

  public void setState(List<StateEntryDTO> state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateMapDTO stateMapDTO = (StateMapDTO) o;
    return Objects.equals(this.scope, stateMapDTO.scope) &&
        Objects.equals(this.totalEntryCount, stateMapDTO.totalEntryCount) &&
        Objects.equals(this.state, stateMapDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, totalEntryCount, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateMapDTO {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

