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
import com.github.andrewkav.model.NodeProcessorStatusSnapshotDTO;
import com.github.andrewkav.model.ProcessorStatusSnapshotDTO;
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
 * ProcessorStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ProcessorStatusDTO {
  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * The run status of the Processor
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
  private ProcessorStatusSnapshotDTO aggregateSnapshot = null;

  public static final String SERIALIZED_NAME_NODE_SNAPSHOTS = "nodeSnapshots";
  @SerializedName(SERIALIZED_NAME_NODE_SNAPSHOTS)
  private List<NodeProcessorStatusSnapshotDTO> nodeSnapshots = new ArrayList<NodeProcessorStatusSnapshotDTO>();

  public ProcessorStatusDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The unique ID of the process group that the Processor belongs to
   * @return groupId
  **/
  @ApiModelProperty(value = "The unique ID of the process group that the Processor belongs to")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ProcessorStatusDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the Processor
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID of the Processor")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessorStatusDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Processor
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Processor")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessorStatusDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the Processor
   * @return type
  **/
  @ApiModelProperty(value = "The type of the Processor")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProcessorStatusDTO runStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
    return this;
  }

   /**
   * The run status of the Processor
   * @return runStatus
  **/
  @ApiModelProperty(value = "The run status of the Processor")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }

  public void setRunStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
  }

  public ProcessorStatusDTO statsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * The timestamp of when the stats were last refreshed
   * @return statsLastRefreshed
  **/
  @ApiModelProperty(value = "The timestamp of when the stats were last refreshed")
  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }

  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }

  public ProcessorStatusDTO aggregateSnapshot(ProcessorStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * Get aggregateSnapshot
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(value = "")
  public ProcessorStatusSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(ProcessorStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public ProcessorStatusDTO nodeSnapshots(List<NodeProcessorStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public ProcessorStatusDTO addNodeSnapshotsItem(NodeProcessorStatusSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeProcessorStatusSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(value = "A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")
  public List<NodeProcessorStatusSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeProcessorStatusSnapshotDTO> nodeSnapshots) {
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
    ProcessorStatusDTO processorStatusDTO = (ProcessorStatusDTO) o;
    return Objects.equals(this.groupId, processorStatusDTO.groupId) &&
        Objects.equals(this.id, processorStatusDTO.id) &&
        Objects.equals(this.name, processorStatusDTO.name) &&
        Objects.equals(this.type, processorStatusDTO.type) &&
        Objects.equals(this.runStatus, processorStatusDTO.runStatus) &&
        Objects.equals(this.statsLastRefreshed, processorStatusDTO.statsLastRefreshed) &&
        Objects.equals(this.aggregateSnapshot, processorStatusDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, processorStatusDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, id, name, type, runStatus, statsLastRefreshed, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorStatusDTO {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

