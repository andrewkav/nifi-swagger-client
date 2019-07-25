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
import com.github.andrewkav.model.StatusSnapshotDTO;
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
 * NodeStatusSnapshotsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class NodeStatusSnapshotsDTO {
  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_API_PORT = "apiPort";
  @SerializedName(SERIALIZED_NAME_API_PORT)
  private Integer apiPort;

  public static final String SERIALIZED_NAME_STATUS_SNAPSHOTS = "statusSnapshots";
  @SerializedName(SERIALIZED_NAME_STATUS_SNAPSHOTS)
  private List<StatusSnapshotDTO> statusSnapshots = new ArrayList<StatusSnapshotDTO>();

  public NodeStatusSnapshotsDTO nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The id of the node.
   * @return nodeId
  **/
  @ApiModelProperty(value = "The id of the node.")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeStatusSnapshotsDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The node&#39;s host/ip address.
   * @return address
  **/
  @ApiModelProperty(value = "The node's host/ip address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NodeStatusSnapshotsDTO apiPort(Integer apiPort) {
    this.apiPort = apiPort;
    return this;
  }

   /**
   * The port the node is listening for API requests.
   * @return apiPort
  **/
  @ApiModelProperty(value = "The port the node is listening for API requests.")
  public Integer getApiPort() {
    return apiPort;
  }

  public void setApiPort(Integer apiPort) {
    this.apiPort = apiPort;
  }

  public NodeStatusSnapshotsDTO statusSnapshots(List<StatusSnapshotDTO> statusSnapshots) {
    this.statusSnapshots = statusSnapshots;
    return this;
  }

  public NodeStatusSnapshotsDTO addStatusSnapshotsItem(StatusSnapshotDTO statusSnapshotsItem) {
    if (this.statusSnapshots == null) {
      this.statusSnapshots = new ArrayList<StatusSnapshotDTO>();
    }
    this.statusSnapshots.add(statusSnapshotsItem);
    return this;
  }

   /**
   * A list of StatusSnapshotDTO objects that provide the actual metric values for the component for this node.
   * @return statusSnapshots
  **/
  @ApiModelProperty(value = "A list of StatusSnapshotDTO objects that provide the actual metric values for the component for this node.")
  public List<StatusSnapshotDTO> getStatusSnapshots() {
    return statusSnapshots;
  }

  public void setStatusSnapshots(List<StatusSnapshotDTO> statusSnapshots) {
    this.statusSnapshots = statusSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusSnapshotsDTO nodeStatusSnapshotsDTO = (NodeStatusSnapshotsDTO) o;
    return Objects.equals(this.nodeId, nodeStatusSnapshotsDTO.nodeId) &&
        Objects.equals(this.address, nodeStatusSnapshotsDTO.address) &&
        Objects.equals(this.apiPort, nodeStatusSnapshotsDTO.apiPort) &&
        Objects.equals(this.statusSnapshots, nodeStatusSnapshotsDTO.statusSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, statusSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusSnapshotsDTO {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    statusSnapshots: ").append(toIndentedString(statusSnapshots)).append("\n");
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
