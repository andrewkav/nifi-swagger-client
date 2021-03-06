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
import com.github.andrewkav.model.NodeEventDTO;
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
 * NodeDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class NodeDTO {
  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_API_PORT = "apiPort";
  @SerializedName(SERIALIZED_NAME_API_PORT)
  private Integer apiPort;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_HEARTBEAT = "heartbeat";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT)
  private String heartbeat;

  public static final String SERIALIZED_NAME_CONNECTION_REQUESTED = "connectionRequested";
  @SerializedName(SERIALIZED_NAME_CONNECTION_REQUESTED)
  private String connectionRequested;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ACTIVE_THREAD_COUNT = "activeThreadCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THREAD_COUNT)
  private Integer activeThreadCount;

  public static final String SERIALIZED_NAME_QUEUED = "queued";
  @SerializedName(SERIALIZED_NAME_QUEUED)
  private String queued;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<NodeEventDTO> events = new ArrayList<NodeEventDTO>();

  public static final String SERIALIZED_NAME_NODE_START_TIME = "nodeStartTime";
  @SerializedName(SERIALIZED_NAME_NODE_START_TIME)
  private String nodeStartTime;

   /**
   * The id of the node.
   * @return nodeId
  **/
  @ApiModelProperty(value = "The id of the node.")
  public String getNodeId() {
    return nodeId;
  }

   /**
   * The node&#39;s host/ip address.
   * @return address
  **/
  @ApiModelProperty(value = "The node's host/ip address.")
  public String getAddress() {
    return address;
  }

   /**
   * The port the node is listening for API requests.
   * @return apiPort
  **/
  @ApiModelProperty(value = "The port the node is listening for API requests.")
  public Integer getApiPort() {
    return apiPort;
  }

  public NodeDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The node&#39;s status.
   * @return status
  **/
  @ApiModelProperty(value = "The node's status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * the time of the nodes&#39;s last heartbeat.
   * @return heartbeat
  **/
  @ApiModelProperty(value = "the time of the nodes's last heartbeat.")
  public String getHeartbeat() {
    return heartbeat;
  }

   /**
   * The time of the node&#39;s last connection request.
   * @return connectionRequested
  **/
  @ApiModelProperty(value = "The time of the node's last connection request.")
  public String getConnectionRequested() {
    return connectionRequested;
  }

   /**
   * The roles of this node.
   * @return roles
  **/
  @ApiModelProperty(value = "The roles of this node.")
  public List<String> getRoles() {
    return roles;
  }

   /**
   * The active threads for the NiFi on the node.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The active threads for the NiFi on the node.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

   /**
   * The queue the NiFi on the node.
   * @return queued
  **/
  @ApiModelProperty(value = "The queue the NiFi on the node.")
  public String getQueued() {
    return queued;
  }

   /**
   * The node&#39;s events.
   * @return events
  **/
  @ApiModelProperty(value = "The node's events.")
  public List<NodeEventDTO> getEvents() {
    return events;
  }

   /**
   * The time at which this Node was last refreshed.
   * @return nodeStartTime
  **/
  @ApiModelProperty(value = "The time at which this Node was last refreshed.")
  public String getNodeStartTime() {
    return nodeStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDTO nodeDTO = (NodeDTO) o;
    return Objects.equals(this.nodeId, nodeDTO.nodeId) &&
        Objects.equals(this.address, nodeDTO.address) &&
        Objects.equals(this.apiPort, nodeDTO.apiPort) &&
        Objects.equals(this.status, nodeDTO.status) &&
        Objects.equals(this.heartbeat, nodeDTO.heartbeat) &&
        Objects.equals(this.connectionRequested, nodeDTO.connectionRequested) &&
        Objects.equals(this.roles, nodeDTO.roles) &&
        Objects.equals(this.activeThreadCount, nodeDTO.activeThreadCount) &&
        Objects.equals(this.queued, nodeDTO.queued) &&
        Objects.equals(this.events, nodeDTO.events) &&
        Objects.equals(this.nodeStartTime, nodeDTO.nodeStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, status, heartbeat, connectionRequested, roles, activeThreadCount, queued, events, nodeStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDTO {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
    sb.append("    connectionRequested: ").append(toIndentedString(connectionRequested)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    nodeStartTime: ").append(toIndentedString(nodeStartTime)).append("\n");
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

