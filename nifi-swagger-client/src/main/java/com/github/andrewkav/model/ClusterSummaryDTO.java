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
 * ClusterSummaryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ClusterSummaryDTO {
  public static final String SERIALIZED_NAME_CONNECTED_NODES = "connectedNodes";
  @SerializedName(SERIALIZED_NAME_CONNECTED_NODES)
  private String connectedNodes;

  public static final String SERIALIZED_NAME_CONNECTED_NODE_COUNT = "connectedNodeCount";
  @SerializedName(SERIALIZED_NAME_CONNECTED_NODE_COUNT)
  private Integer connectedNodeCount;

  public static final String SERIALIZED_NAME_TOTAL_NODE_COUNT = "totalNodeCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_NODE_COUNT)
  private Integer totalNodeCount;

  public static final String SERIALIZED_NAME_CONNECTED_TO_CLUSTER = "connectedToCluster";
  @SerializedName(SERIALIZED_NAME_CONNECTED_TO_CLUSTER)
  private Boolean connectedToCluster;

  public static final String SERIALIZED_NAME_CLUSTERED = "clustered";
  @SerializedName(SERIALIZED_NAME_CLUSTERED)
  private Boolean clustered;

  public ClusterSummaryDTO connectedNodes(String connectedNodes) {
    this.connectedNodes = connectedNodes;
    return this;
  }

   /**
   * When clustered, reports the number of nodes connected vs the number of nodes in the cluster.
   * @return connectedNodes
  **/
  @ApiModelProperty(value = "When clustered, reports the number of nodes connected vs the number of nodes in the cluster.")
  public String getConnectedNodes() {
    return connectedNodes;
  }

  public void setConnectedNodes(String connectedNodes) {
    this.connectedNodes = connectedNodes;
  }

  public ClusterSummaryDTO connectedNodeCount(Integer connectedNodeCount) {
    this.connectedNodeCount = connectedNodeCount;
    return this;
  }

   /**
   * The number of nodes that are currently connected to the cluster
   * @return connectedNodeCount
  **/
  @ApiModelProperty(value = "The number of nodes that are currently connected to the cluster")
  public Integer getConnectedNodeCount() {
    return connectedNodeCount;
  }

  public void setConnectedNodeCount(Integer connectedNodeCount) {
    this.connectedNodeCount = connectedNodeCount;
  }

  public ClusterSummaryDTO totalNodeCount(Integer totalNodeCount) {
    this.totalNodeCount = totalNodeCount;
    return this;
  }

   /**
   * The number of nodes in the cluster, regardless of whether or not they are connected
   * @return totalNodeCount
  **/
  @ApiModelProperty(value = "The number of nodes in the cluster, regardless of whether or not they are connected")
  public Integer getTotalNodeCount() {
    return totalNodeCount;
  }

  public void setTotalNodeCount(Integer totalNodeCount) {
    this.totalNodeCount = totalNodeCount;
  }

  public ClusterSummaryDTO connectedToCluster(Boolean connectedToCluster) {
    this.connectedToCluster = connectedToCluster;
    return this;
  }

   /**
   * Whether this NiFi instance is connected to a cluster.
   * @return connectedToCluster
  **/
  @ApiModelProperty(value = "Whether this NiFi instance is connected to a cluster.")
  public Boolean getConnectedToCluster() {
    return connectedToCluster;
  }

  public void setConnectedToCluster(Boolean connectedToCluster) {
    this.connectedToCluster = connectedToCluster;
  }

  public ClusterSummaryDTO clustered(Boolean clustered) {
    this.clustered = clustered;
    return this;
  }

   /**
   * Whether this NiFi instance is clustered.
   * @return clustered
  **/
  @ApiModelProperty(value = "Whether this NiFi instance is clustered.")
  public Boolean getClustered() {
    return clustered;
  }

  public void setClustered(Boolean clustered) {
    this.clustered = clustered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSummaryDTO clusterSummaryDTO = (ClusterSummaryDTO) o;
    return Objects.equals(this.connectedNodes, clusterSummaryDTO.connectedNodes) &&
        Objects.equals(this.connectedNodeCount, clusterSummaryDTO.connectedNodeCount) &&
        Objects.equals(this.totalNodeCount, clusterSummaryDTO.totalNodeCount) &&
        Objects.equals(this.connectedToCluster, clusterSummaryDTO.connectedToCluster) &&
        Objects.equals(this.clustered, clusterSummaryDTO.clustered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedNodes, connectedNodeCount, totalNodeCount, connectedToCluster, clustered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSummaryDTO {\n");
    sb.append("    connectedNodes: ").append(toIndentedString(connectedNodes)).append("\n");
    sb.append("    connectedNodeCount: ").append(toIndentedString(connectedNodeCount)).append("\n");
    sb.append("    totalNodeCount: ").append(toIndentedString(totalNodeCount)).append("\n");
    sb.append("    connectedToCluster: ").append(toIndentedString(connectedToCluster)).append("\n");
    sb.append("    clustered: ").append(toIndentedString(clustered)).append("\n");
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
