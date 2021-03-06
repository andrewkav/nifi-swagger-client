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
import com.github.andrewkav.model.VersionControlInformationDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VersionedFlowUpdateRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class VersionedFlowUpdateRequestDTO {
  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_PROCESS_GROUP_ID = "processGroupId";
  @SerializedName(SERIALIZED_NAME_PROCESS_GROUP_ID)
  private String processGroupId;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_COMPLETE = "complete";
  @SerializedName(SERIALIZED_NAME_COMPLETE)
  private Boolean complete;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_PERCENT_COMPLETED = "percentCompleted";
  @SerializedName(SERIALIZED_NAME_PERCENT_COMPLETED)
  private Integer percentCompleted;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_VERSION_CONTROL_INFORMATION = "versionControlInformation";
  @SerializedName(SERIALIZED_NAME_VERSION_CONTROL_INFORMATION)
  private VersionControlInformationDTO versionControlInformation = null;

   /**
   * The unique ID of this request.
   * @return requestId
  **/
  @ApiModelProperty(value = "The unique ID of this request.")
  public String getRequestId() {
    return requestId;
  }

  public VersionedFlowUpdateRequestDTO processGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
    return this;
  }

   /**
   * The unique ID of the Process Group that the variable registry belongs to
   * @return processGroupId
  **/
  @ApiModelProperty(value = "The unique ID of the Process Group that the variable registry belongs to")
  public String getProcessGroupId() {
    return processGroupId;
  }

  public void setProcessGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
  }

   /**
   * The URI for future requests to this drop request.
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for future requests to this drop request.")
  public String getUri() {
    return uri;
  }

   /**
   * The last time this request was updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The last time this request was updated.")
  public String getLastUpdated() {
    return lastUpdated;
  }

   /**
   * Whether or not this request has completed
   * @return complete
  **/
  @ApiModelProperty(value = "Whether or not this request has completed")
  public Boolean getComplete() {
    return complete;
  }

   /**
   * An explanation of why this request failed, or null if this request has not failed
   * @return failureReason
  **/
  @ApiModelProperty(value = "An explanation of why this request failed, or null if this request has not failed")
  public String getFailureReason() {
    return failureReason;
  }

   /**
   * The percentage complete for the request, between 0 and 100
   * @return percentCompleted
  **/
  @ApiModelProperty(value = "The percentage complete for the request, between 0 and 100")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

   /**
   * The state of the request
   * @return state
  **/
  @ApiModelProperty(value = "The state of the request")
  public String getState() {
    return state;
  }

  public VersionedFlowUpdateRequestDTO versionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
    return this;
  }

   /**
   * Get versionControlInformation
   * @return versionControlInformation
  **/
  @ApiModelProperty(value = "")
  public VersionControlInformationDTO getVersionControlInformation() {
    return versionControlInformation;
  }

  public void setVersionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowUpdateRequestDTO versionedFlowUpdateRequestDTO = (VersionedFlowUpdateRequestDTO) o;
    return Objects.equals(this.requestId, versionedFlowUpdateRequestDTO.requestId) &&
        Objects.equals(this.processGroupId, versionedFlowUpdateRequestDTO.processGroupId) &&
        Objects.equals(this.uri, versionedFlowUpdateRequestDTO.uri) &&
        Objects.equals(this.lastUpdated, versionedFlowUpdateRequestDTO.lastUpdated) &&
        Objects.equals(this.complete, versionedFlowUpdateRequestDTO.complete) &&
        Objects.equals(this.failureReason, versionedFlowUpdateRequestDTO.failureReason) &&
        Objects.equals(this.percentCompleted, versionedFlowUpdateRequestDTO.percentCompleted) &&
        Objects.equals(this.state, versionedFlowUpdateRequestDTO.state) &&
        Objects.equals(this.versionControlInformation, versionedFlowUpdateRequestDTO.versionControlInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, processGroupId, uri, lastUpdated, complete, failureReason, percentCompleted, state, versionControlInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowUpdateRequestDTO {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    versionControlInformation: ").append(toIndentedString(versionControlInformation)).append("\n");
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

