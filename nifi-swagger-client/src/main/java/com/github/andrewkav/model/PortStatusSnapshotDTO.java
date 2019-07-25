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
 * PortStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class PortStatusSnapshotDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTIVE_THREAD_COUNT = "activeThreadCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THREAD_COUNT)
  private Integer activeThreadCount;

  public static final String SERIALIZED_NAME_FLOW_FILES_IN = "flowFilesIn";
  @SerializedName(SERIALIZED_NAME_FLOW_FILES_IN)
  private Integer flowFilesIn;

  public static final String SERIALIZED_NAME_BYTES_IN = "bytesIn";
  @SerializedName(SERIALIZED_NAME_BYTES_IN)
  private Long bytesIn;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_FLOW_FILES_OUT = "flowFilesOut";
  @SerializedName(SERIALIZED_NAME_FLOW_FILES_OUT)
  private Integer flowFilesOut;

  public static final String SERIALIZED_NAME_BYTES_OUT = "bytesOut";
  @SerializedName(SERIALIZED_NAME_BYTES_OUT)
  private Long bytesOut;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

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

  public PortStatusSnapshotDTO id(String id) {
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

  public PortStatusSnapshotDTO groupId(String groupId) {
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

  public PortStatusSnapshotDTO name(String name) {
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

  public PortStatusSnapshotDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The active thread count for the port.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The active thread count for the port.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }

  public PortStatusSnapshotDTO flowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
    return this;
  }

   /**
   * The number of FlowFiles that have been accepted in the last 5 minutes.
   * @return flowFilesIn
  **/
  @ApiModelProperty(value = "The number of FlowFiles that have been accepted in the last 5 minutes.")
  public Integer getFlowFilesIn() {
    return flowFilesIn;
  }

  public void setFlowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
  }

  public PortStatusSnapshotDTO bytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * The size of hte FlowFiles that have been accepted in the last 5 minutes.
   * @return bytesIn
  **/
  @ApiModelProperty(value = "The size of hte FlowFiles that have been accepted in the last 5 minutes.")
  public Long getBytesIn() {
    return bytesIn;
  }

  public void setBytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
  }

  public PortStatusSnapshotDTO input(String input) {
    this.input = input;
    return this;
  }

   /**
   * The count/size of flowfiles that have been accepted in the last 5 minutes.
   * @return input
  **/
  @ApiModelProperty(value = "The count/size of flowfiles that have been accepted in the last 5 minutes.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public PortStatusSnapshotDTO flowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
    return this;
  }

   /**
   * The number of FlowFiles that have been processed in the last 5 minutes.
   * @return flowFilesOut
  **/
  @ApiModelProperty(value = "The number of FlowFiles that have been processed in the last 5 minutes.")
  public Integer getFlowFilesOut() {
    return flowFilesOut;
  }

  public void setFlowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
  }

  public PortStatusSnapshotDTO bytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * The number of bytes that have been processed in the last 5 minutes.
   * @return bytesOut
  **/
  @ApiModelProperty(value = "The number of bytes that have been processed in the last 5 minutes.")
  public Long getBytesOut() {
    return bytesOut;
  }

  public void setBytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
  }

  public PortStatusSnapshotDTO output(String output) {
    this.output = output;
    return this;
  }

   /**
   * The count/size of flowfiles that have been processed in the last 5 minutes.
   * @return output
  **/
  @ApiModelProperty(value = "The count/size of flowfiles that have been processed in the last 5 minutes.")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public PortStatusSnapshotDTO transmitting(Boolean transmitting) {
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

  public PortStatusSnapshotDTO runStatus(RunStatusEnum runStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortStatusSnapshotDTO portStatusSnapshotDTO = (PortStatusSnapshotDTO) o;
    return Objects.equals(this.id, portStatusSnapshotDTO.id) &&
        Objects.equals(this.groupId, portStatusSnapshotDTO.groupId) &&
        Objects.equals(this.name, portStatusSnapshotDTO.name) &&
        Objects.equals(this.activeThreadCount, portStatusSnapshotDTO.activeThreadCount) &&
        Objects.equals(this.flowFilesIn, portStatusSnapshotDTO.flowFilesIn) &&
        Objects.equals(this.bytesIn, portStatusSnapshotDTO.bytesIn) &&
        Objects.equals(this.input, portStatusSnapshotDTO.input) &&
        Objects.equals(this.flowFilesOut, portStatusSnapshotDTO.flowFilesOut) &&
        Objects.equals(this.bytesOut, portStatusSnapshotDTO.bytesOut) &&
        Objects.equals(this.output, portStatusSnapshotDTO.output) &&
        Objects.equals(this.transmitting, portStatusSnapshotDTO.transmitting) &&
        Objects.equals(this.runStatus, portStatusSnapshotDTO.runStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, activeThreadCount, flowFilesIn, bytesIn, input, flowFilesOut, bytesOut, output, transmitting, runStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortStatusSnapshotDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    flowFilesIn: ").append(toIndentedString(flowFilesIn)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    flowFilesOut: ").append(toIndentedString(flowFilesOut)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    transmitting: ").append(toIndentedString(transmitting)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
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

