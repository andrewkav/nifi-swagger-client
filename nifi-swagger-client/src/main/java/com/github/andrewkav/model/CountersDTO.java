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
import com.github.andrewkav.model.CountersSnapshotDTO;
import com.github.andrewkav.model.NodeCountersSnapshotDTO;
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
 * CountersDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class CountersDTO {
  public static final String SERIALIZED_NAME_AGGREGATE_SNAPSHOT = "aggregateSnapshot";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_SNAPSHOT)
  private CountersSnapshotDTO aggregateSnapshot = null;

  public static final String SERIALIZED_NAME_NODE_SNAPSHOTS = "nodeSnapshots";
  @SerializedName(SERIALIZED_NAME_NODE_SNAPSHOTS)
  private List<NodeCountersSnapshotDTO> nodeSnapshots = new ArrayList<NodeCountersSnapshotDTO>();

  public CountersDTO aggregateSnapshot(CountersSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * Get aggregateSnapshot
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(value = "")
  public CountersSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(CountersSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public CountersDTO nodeSnapshots(List<NodeCountersSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public CountersDTO addNodeSnapshotsItem(NodeCountersSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeCountersSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A Counters snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(value = "A Counters snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")
  public List<NodeCountersSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeCountersSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountersDTO countersDTO = (CountersDTO) o;
    return Objects.equals(this.aggregateSnapshot, countersDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, countersDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountersDTO {\n");
    sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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

