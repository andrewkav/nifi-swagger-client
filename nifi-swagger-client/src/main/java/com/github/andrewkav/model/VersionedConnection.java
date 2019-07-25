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
import com.github.andrewkav.model.ConnectableComponent;
import com.github.andrewkav.model.Position;
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
 * VersionedConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class VersionedConnection {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Position position = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ConnectableComponent source = null;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private ConnectableComponent destination = null;

  public static final String SERIALIZED_NAME_LABEL_INDEX = "labelIndex";
  @SerializedName(SERIALIZED_NAME_LABEL_INDEX)
  private Integer labelIndex;

  public static final String SERIALIZED_NAME_Z_INDEX = "zIndex";
  @SerializedName(SERIALIZED_NAME_Z_INDEX)
  private Long zIndex;

  public static final String SERIALIZED_NAME_SELECTED_RELATIONSHIPS = "selectedRelationships";
  @SerializedName(SERIALIZED_NAME_SELECTED_RELATIONSHIPS)
  private List<String> selectedRelationships = new ArrayList<String>();

  public static final String SERIALIZED_NAME_BACK_PRESSURE_OBJECT_THRESHOLD = "backPressureObjectThreshold";
  @SerializedName(SERIALIZED_NAME_BACK_PRESSURE_OBJECT_THRESHOLD)
  private Long backPressureObjectThreshold;

  public static final String SERIALIZED_NAME_BACK_PRESSURE_DATA_SIZE_THRESHOLD = "backPressureDataSizeThreshold";
  @SerializedName(SERIALIZED_NAME_BACK_PRESSURE_DATA_SIZE_THRESHOLD)
  private String backPressureDataSizeThreshold;

  public static final String SERIALIZED_NAME_FLOW_FILE_EXPIRATION = "flowFileExpiration";
  @SerializedName(SERIALIZED_NAME_FLOW_FILE_EXPIRATION)
  private String flowFileExpiration;

  public static final String SERIALIZED_NAME_PRIORITIZERS = "prioritizers";
  @SerializedName(SERIALIZED_NAME_PRIORITIZERS)
  private List<String> prioritizers = new ArrayList<String>();

  public static final String SERIALIZED_NAME_BENDS = "bends";
  @SerializedName(SERIALIZED_NAME_BENDS)
  private List<Position> bends = new ArrayList<Position>();

  /**
   * The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified.
   */
  @JsonAdapter(LoadBalanceStrategyEnum.Adapter.class)
  public enum LoadBalanceStrategyEnum {
    DO_NOT_LOAD_BALANCE("DO_NOT_LOAD_BALANCE"),
    
    PARTITION_BY_ATTRIBUTE("PARTITION_BY_ATTRIBUTE"),
    
    ROUND_ROBIN("ROUND_ROBIN"),
    
    SINGLE_NODE("SINGLE_NODE");

    private String value;

    LoadBalanceStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LoadBalanceStrategyEnum fromValue(String value) {
      for (LoadBalanceStrategyEnum b : LoadBalanceStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LoadBalanceStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LoadBalanceStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LoadBalanceStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LoadBalanceStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOAD_BALANCE_STRATEGY = "loadBalanceStrategy";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCE_STRATEGY)
  private LoadBalanceStrategyEnum loadBalanceStrategy;

  public static final String SERIALIZED_NAME_PARTITIONING_ATTRIBUTE = "partitioningAttribute";
  @SerializedName(SERIALIZED_NAME_PARTITIONING_ATTRIBUTE)
  private String partitioningAttribute;

  /**
   * Whether or not compression should be used when transferring FlowFiles between nodes
   */
  @JsonAdapter(LoadBalanceCompressionEnum.Adapter.class)
  public enum LoadBalanceCompressionEnum {
    DO_NOT_COMPRESS("DO_NOT_COMPRESS"),
    
    COMPRESS_ATTRIBUTES_ONLY("COMPRESS_ATTRIBUTES_ONLY"),
    
    COMPRESS_ATTRIBUTES_AND_CONTENT("COMPRESS_ATTRIBUTES_AND_CONTENT");

    private String value;

    LoadBalanceCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LoadBalanceCompressionEnum fromValue(String value) {
      for (LoadBalanceCompressionEnum b : LoadBalanceCompressionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LoadBalanceCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LoadBalanceCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LoadBalanceCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LoadBalanceCompressionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOAD_BALANCE_COMPRESSION = "loadBalanceCompression";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCE_COMPRESSION)
  private LoadBalanceCompressionEnum loadBalanceCompression;

  /**
   * Gets or Sets componentType
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    CONNECTION("CONNECTION"),
    
    PROCESSOR("PROCESSOR"),
    
    PROCESS_GROUP("PROCESS_GROUP"),
    
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT"),
    
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    FUNNEL("FUNNEL"),
    
    LABEL("LABEL"),
    
    CONTROLLER_SERVICE("CONTROLLER_SERVICE");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComponentTypeEnum fromValue(String value) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComponentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "componentType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private ComponentTypeEnum componentType;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIER = "groupIdentifier";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIER)
  private String groupIdentifier;

  public VersionedConnection identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component&#39;s unique identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedConnection comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @ApiModelProperty(value = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedConnection position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public VersionedConnection source(ConnectableComponent source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public ConnectableComponent getSource() {
    return source;
  }

  public void setSource(ConnectableComponent source) {
    this.source = source;
  }

  public VersionedConnection destination(ConnectableComponent destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public ConnectableComponent getDestination() {
    return destination;
  }

  public void setDestination(ConnectableComponent destination) {
    this.destination = destination;
  }

  public VersionedConnection labelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
    return this;
  }

   /**
   * The index of the bend point where to place the connection label.
   * @return labelIndex
  **/
  @ApiModelProperty(value = "The index of the bend point where to place the connection label.")
  public Integer getLabelIndex() {
    return labelIndex;
  }

  public void setLabelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
  }

  public VersionedConnection zIndex(Long zIndex) {
    this.zIndex = zIndex;
    return this;
  }

   /**
   * The z index of the connection.
   * @return zIndex
  **/
  @ApiModelProperty(value = "The z index of the connection.")
  public Long getzIndex() {
    return zIndex;
  }

  public void setzIndex(Long zIndex) {
    this.zIndex = zIndex;
  }

  public VersionedConnection selectedRelationships(List<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
    return this;
  }

  public VersionedConnection addSelectedRelationshipsItem(String selectedRelationshipsItem) {
    if (this.selectedRelationships == null) {
      this.selectedRelationships = new ArrayList<String>();
    }
    this.selectedRelationships.add(selectedRelationshipsItem);
    return this;
  }

   /**
   * The selected relationship that comprise the connection.
   * @return selectedRelationships
  **/
  @ApiModelProperty(value = "The selected relationship that comprise the connection.")
  public List<String> getSelectedRelationships() {
    return selectedRelationships;
  }

  public void setSelectedRelationships(List<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
  }

  public VersionedConnection backPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
    return this;
  }

   /**
   * The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureObjectThreshold
  **/
  @ApiModelProperty(value = "The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")
  public Long getBackPressureObjectThreshold() {
    return backPressureObjectThreshold;
  }

  public void setBackPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
  }

  public VersionedConnection backPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
    return this;
  }

   /**
   * The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureDataSizeThreshold
  **/
  @ApiModelProperty(value = "The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")
  public String getBackPressureDataSizeThreshold() {
    return backPressureDataSizeThreshold;
  }

  public void setBackPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
  }

  public VersionedConnection flowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
    return this;
  }

   /**
   * The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.
   * @return flowFileExpiration
  **/
  @ApiModelProperty(value = "The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.")
  public String getFlowFileExpiration() {
    return flowFileExpiration;
  }

  public void setFlowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
  }

  public VersionedConnection prioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
    return this;
  }

  public VersionedConnection addPrioritizersItem(String prioritizersItem) {
    if (this.prioritizers == null) {
      this.prioritizers = new ArrayList<String>();
    }
    this.prioritizers.add(prioritizersItem);
    return this;
  }

   /**
   * The comparators used to prioritize the queue.
   * @return prioritizers
  **/
  @ApiModelProperty(value = "The comparators used to prioritize the queue.")
  public List<String> getPrioritizers() {
    return prioritizers;
  }

  public void setPrioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
  }

  public VersionedConnection bends(List<Position> bends) {
    this.bends = bends;
    return this;
  }

  public VersionedConnection addBendsItem(Position bendsItem) {
    if (this.bends == null) {
      this.bends = new ArrayList<Position>();
    }
    this.bends.add(bendsItem);
    return this;
  }

   /**
   * The bend points on the connection.
   * @return bends
  **/
  @ApiModelProperty(value = "The bend points on the connection.")
  public List<Position> getBends() {
    return bends;
  }

  public void setBends(List<Position> bends) {
    this.bends = bends;
  }

  public VersionedConnection loadBalanceStrategy(LoadBalanceStrategyEnum loadBalanceStrategy) {
    this.loadBalanceStrategy = loadBalanceStrategy;
    return this;
  }

   /**
   * The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified.
   * @return loadBalanceStrategy
  **/
  @ApiModelProperty(value = "The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified.")
  public LoadBalanceStrategyEnum getLoadBalanceStrategy() {
    return loadBalanceStrategy;
  }

  public void setLoadBalanceStrategy(LoadBalanceStrategyEnum loadBalanceStrategy) {
    this.loadBalanceStrategy = loadBalanceStrategy;
  }

  public VersionedConnection partitioningAttribute(String partitioningAttribute) {
    this.partitioningAttribute = partitioningAttribute;
    return this;
  }

   /**
   * The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect.
   * @return partitioningAttribute
  **/
  @ApiModelProperty(value = "The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect.")
  public String getPartitioningAttribute() {
    return partitioningAttribute;
  }

  public void setPartitioningAttribute(String partitioningAttribute) {
    this.partitioningAttribute = partitioningAttribute;
  }

  public VersionedConnection loadBalanceCompression(LoadBalanceCompressionEnum loadBalanceCompression) {
    this.loadBalanceCompression = loadBalanceCompression;
    return this;
  }

   /**
   * Whether or not compression should be used when transferring FlowFiles between nodes
   * @return loadBalanceCompression
  **/
  @ApiModelProperty(value = "Whether or not compression should be used when transferring FlowFiles between nodes")
  public LoadBalanceCompressionEnum getLoadBalanceCompression() {
    return loadBalanceCompression;
  }

  public void setLoadBalanceCompression(LoadBalanceCompressionEnum loadBalanceCompression) {
    this.loadBalanceCompression = loadBalanceCompression;
  }

  public VersionedConnection componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @ApiModelProperty(value = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedConnection groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @ApiModelProperty(value = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedConnection versionedConnection = (VersionedConnection) o;
    return Objects.equals(this.identifier, versionedConnection.identifier) &&
        Objects.equals(this.name, versionedConnection.name) &&
        Objects.equals(this.comments, versionedConnection.comments) &&
        Objects.equals(this.position, versionedConnection.position) &&
        Objects.equals(this.source, versionedConnection.source) &&
        Objects.equals(this.destination, versionedConnection.destination) &&
        Objects.equals(this.labelIndex, versionedConnection.labelIndex) &&
        Objects.equals(this.zIndex, versionedConnection.zIndex) &&
        Objects.equals(this.selectedRelationships, versionedConnection.selectedRelationships) &&
        Objects.equals(this.backPressureObjectThreshold, versionedConnection.backPressureObjectThreshold) &&
        Objects.equals(this.backPressureDataSizeThreshold, versionedConnection.backPressureDataSizeThreshold) &&
        Objects.equals(this.flowFileExpiration, versionedConnection.flowFileExpiration) &&
        Objects.equals(this.prioritizers, versionedConnection.prioritizers) &&
        Objects.equals(this.bends, versionedConnection.bends) &&
        Objects.equals(this.loadBalanceStrategy, versionedConnection.loadBalanceStrategy) &&
        Objects.equals(this.partitioningAttribute, versionedConnection.partitioningAttribute) &&
        Objects.equals(this.loadBalanceCompression, versionedConnection.loadBalanceCompression) &&
        Objects.equals(this.componentType, versionedConnection.componentType) &&
        Objects.equals(this.groupIdentifier, versionedConnection.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, source, destination, labelIndex, zIndex, selectedRelationships, backPressureObjectThreshold, backPressureDataSizeThreshold, flowFileExpiration, prioritizers, bends, loadBalanceStrategy, partitioningAttribute, loadBalanceCompression, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedConnection {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    labelIndex: ").append(toIndentedString(labelIndex)).append("\n");
    sb.append("    zIndex: ").append(toIndentedString(zIndex)).append("\n");
    sb.append("    selectedRelationships: ").append(toIndentedString(selectedRelationships)).append("\n");
    sb.append("    backPressureObjectThreshold: ").append(toIndentedString(backPressureObjectThreshold)).append("\n");
    sb.append("    backPressureDataSizeThreshold: ").append(toIndentedString(backPressureDataSizeThreshold)).append("\n");
    sb.append("    flowFileExpiration: ").append(toIndentedString(flowFileExpiration)).append("\n");
    sb.append("    prioritizers: ").append(toIndentedString(prioritizers)).append("\n");
    sb.append("    bends: ").append(toIndentedString(bends)).append("\n");
    sb.append("    loadBalanceStrategy: ").append(toIndentedString(loadBalanceStrategy)).append("\n");
    sb.append("    partitioningAttribute: ").append(toIndentedString(partitioningAttribute)).append("\n");
    sb.append("    loadBalanceCompression: ").append(toIndentedString(loadBalanceCompression)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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

