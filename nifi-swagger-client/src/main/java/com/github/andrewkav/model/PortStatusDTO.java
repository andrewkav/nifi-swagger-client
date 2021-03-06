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
import com.github.andrewkav.model.NodePortStatusSnapshotDTO;
import com.github.andrewkav.model.PortStatusSnapshotDTO;
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
 * PortStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class PortStatusDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRANSMITTING = "transmitting";
  @SerializedName(SERIALIZED_NAME_TRANSMITTING)
  private Boolean transmitting;

  /**
   * The run status of the port.
   */
  @JsonAdapter(RunStatusEnum.Adapter.class)
  public enum RunStatusEnum {
    RUNNING("Running"),
    
    STOPPED("Stopped"),
    
    VALIDATING("Validating"),
    
    DISABLED("Disabled"),
    
    INVALID("Invalid");

    private String value;

    RunStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunStatusEnum fromValue(String value) {
      for (RunStatusEnum b : RunStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RunStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RunStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RUN_STATUS = "runStatus";
  @SerializedName(SERIALIZED_NAME_RUN_STATUS)
  private RunStatusEnum runStatus;

  public static final String SERIALIZED_NAME_STATS_LAST_REFRESHED = "statsLastRefreshed";
  @SerializedName(SERIALIZED_NAME_STATS_LAST_REFRESHED)
  private String statsLastRefreshed;

  public static final String SERIALIZED_NAME_AGGREGATE_SNAPSHOT = "aggregateSnapshot";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_SNAPSHOT)
  private PortStatusSnapshotDTO aggregateSnapshot = null;

  public static final String SERIALIZED_NAME_NODE_SNAPSHOTS = "nodeSnapshots";
  @SerializedName(SERIALIZED_NAME_NODE_SNAPSHOTS)
  private List<NodePortStatusSnapshotDTO> nodeSnapshots = new ArrayList<NodePortStatusSnapshotDTO>();

  public PortStatusDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the port.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the port.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PortStatusDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the parent process group of the port.
   * @return groupId
  **/
  @ApiModelProperty(value = "The id of the parent process group of the port.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public PortStatusDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the port.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the port.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PortStatusDTO transmitting(Boolean transmitting) {
    this.transmitting = transmitting;
    return this;
  }

   /**
   * Whether the port has incoming or outgoing connections to a remote NiFi.
   * @return transmitting
  **/
  @ApiModelProperty(value = "Whether the port has incoming or outgoing connections to a remote NiFi.")
  public Boolean getTransmitting() {
    return transmitting;
  }

  public void setTransmitting(Boolean transmitting) {
    this.transmitting = transmitting;
  }

  public PortStatusDTO runStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
    return this;
  }

   /**
   * The run status of the port.
   * @return runStatus
  **/
  @ApiModelProperty(value = "The run status of the port.")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }

  public void setRunStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
  }

  public PortStatusDTO statsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * The time the status for the process group was last refreshed.
   * @return statsLastRefreshed
  **/
  @ApiModelProperty(value = "The time the status for the process group was last refreshed.")
  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }

  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }

  public PortStatusDTO aggregateSnapshot(PortStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * Get aggregateSnapshot
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(value = "")
  public PortStatusSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(PortStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public PortStatusDTO nodeSnapshots(List<NodePortStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public PortStatusDTO addNodeSnapshotsItem(NodePortStatusSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodePortStatusSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(value = "A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")
  public List<NodePortStatusSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodePortStatusSnapshotDTO> nodeSnapshots) {
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
    PortStatusDTO portStatusDTO = (PortStatusDTO) o;
    return Objects.equals(this.id, portStatusDTO.id) &&
        Objects.equals(this.groupId, portStatusDTO.groupId) &&
        Objects.equals(this.name, portStatusDTO.name) &&
        Objects.equals(this.transmitting, portStatusDTO.transmitting) &&
        Objects.equals(this.runStatus, portStatusDTO.runStatus) &&
        Objects.equals(this.statsLastRefreshed, portStatusDTO.statsLastRefreshed) &&
        Objects.equals(this.aggregateSnapshot, portStatusDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, portStatusDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, transmitting, runStatus, statsLastRefreshed, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortStatusDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transmitting: ").append(toIndentedString(transmitting)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
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

