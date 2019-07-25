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
import com.github.andrewkav.model.RevisionDTO;
import com.github.andrewkav.model.VersionedFlowDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StartVersionControlRequestEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class StartVersionControlRequestEntity {
  public static final String SERIALIZED_NAME_VERSIONED_FLOW = "versionedFlow";
  @SerializedName(SERIALIZED_NAME_VERSIONED_FLOW)
  private VersionedFlowDTO versionedFlow = null;

  public static final String SERIALIZED_NAME_PROCESS_GROUP_REVISION = "processGroupRevision";
  @SerializedName(SERIALIZED_NAME_PROCESS_GROUP_REVISION)
  private RevisionDTO processGroupRevision = null;

  public static final String SERIALIZED_NAME_DISCONNECTED_NODE_ACKNOWLEDGED = "disconnectedNodeAcknowledged";
  @SerializedName(SERIALIZED_NAME_DISCONNECTED_NODE_ACKNOWLEDGED)
  private Boolean disconnectedNodeAcknowledged;

  public StartVersionControlRequestEntity versionedFlow(VersionedFlowDTO versionedFlow) {
    this.versionedFlow = versionedFlow;
    return this;
  }

   /**
   * Get versionedFlow
   * @return versionedFlow
  **/
  @ApiModelProperty(value = "")
  public VersionedFlowDTO getVersionedFlow() {
    return versionedFlow;
  }

  public void setVersionedFlow(VersionedFlowDTO versionedFlow) {
    this.versionedFlow = versionedFlow;
  }

  public StartVersionControlRequestEntity processGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * Get processGroupRevision
   * @return processGroupRevision
  **/
  @ApiModelProperty(value = "")
  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }

  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }

  public StartVersionControlRequestEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean getDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartVersionControlRequestEntity startVersionControlRequestEntity = (StartVersionControlRequestEntity) o;
    return Objects.equals(this.versionedFlow, startVersionControlRequestEntity.versionedFlow) &&
        Objects.equals(this.processGroupRevision, startVersionControlRequestEntity.processGroupRevision) &&
        Objects.equals(this.disconnectedNodeAcknowledged, startVersionControlRequestEntity.disconnectedNodeAcknowledged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedFlow, processGroupRevision, disconnectedNodeAcknowledged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartVersionControlRequestEntity {\n");
    sb.append("    versionedFlow: ").append(toIndentedString(versionedFlow)).append("\n");
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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

