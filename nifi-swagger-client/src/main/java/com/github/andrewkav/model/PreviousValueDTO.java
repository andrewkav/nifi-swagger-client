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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PreviousValueDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class PreviousValueDTO {
  public static final String SERIALIZED_NAME_PREVIOUS_VALUE = "previousValue";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_VALUE)
  private String previousValue;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_USER_IDENTITY = "userIdentity";
  @SerializedName(SERIALIZED_NAME_USER_IDENTITY)
  private String userIdentity;

  public PreviousValueDTO previousValue(String previousValue) {
    this.previousValue = previousValue;
    return this;
  }

   /**
   * The previous value.
   * @return previousValue
  **/
  @ApiModelProperty(value = "The previous value.")
  public String getPreviousValue() {
    return previousValue;
  }

  public void setPreviousValue(String previousValue) {
    this.previousValue = previousValue;
  }

  public PreviousValueDTO timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp when the value was modified.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The timestamp when the value was modified.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public PreviousValueDTO userIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
    return this;
  }

   /**
   * The user who changed the previous value.
   * @return userIdentity
  **/
  @ApiModelProperty(value = "The user who changed the previous value.")
  public String getUserIdentity() {
    return userIdentity;
  }

  public void setUserIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousValueDTO previousValueDTO = (PreviousValueDTO) o;
    return Objects.equals(this.previousValue, previousValueDTO.previousValue) &&
        Objects.equals(this.timestamp, previousValueDTO.timestamp) &&
        Objects.equals(this.userIdentity, previousValueDTO.userIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousValue, timestamp, userIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousValueDTO {\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userIdentity: ").append(toIndentedString(userIdentity)).append("\n");
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
