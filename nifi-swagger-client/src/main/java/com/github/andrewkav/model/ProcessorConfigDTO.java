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
import com.github.andrewkav.model.PropertyDescriptorDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProcessorConfigDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ProcessorConfigDTO {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_DESCRIPTORS = "descriptors";
  @SerializedName(SERIALIZED_NAME_DESCRIPTORS)
  private Map<String, PropertyDescriptorDTO> descriptors = new HashMap<String, PropertyDescriptorDTO>();

  public static final String SERIALIZED_NAME_SCHEDULING_PERIOD = "schedulingPeriod";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_PERIOD)
  private String schedulingPeriod;

  public static final String SERIALIZED_NAME_SCHEDULING_STRATEGY = "schedulingStrategy";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_STRATEGY)
  private String schedulingStrategy;

  public static final String SERIALIZED_NAME_EXECUTION_NODE = "executionNode";
  @SerializedName(SERIALIZED_NAME_EXECUTION_NODE)
  private String executionNode;

  public static final String SERIALIZED_NAME_PENALTY_DURATION = "penaltyDuration";
  @SerializedName(SERIALIZED_NAME_PENALTY_DURATION)
  private String penaltyDuration;

  public static final String SERIALIZED_NAME_YIELD_DURATION = "yieldDuration";
  @SerializedName(SERIALIZED_NAME_YIELD_DURATION)
  private String yieldDuration;

  public static final String SERIALIZED_NAME_BULLETIN_LEVEL = "bulletinLevel";
  @SerializedName(SERIALIZED_NAME_BULLETIN_LEVEL)
  private String bulletinLevel;

  public static final String SERIALIZED_NAME_RUN_DURATION_MILLIS = "runDurationMillis";
  @SerializedName(SERIALIZED_NAME_RUN_DURATION_MILLIS)
  private Long runDurationMillis;

  public static final String SERIALIZED_NAME_CONCURRENTLY_SCHEDULABLE_TASK_COUNT = "concurrentlySchedulableTaskCount";
  @SerializedName(SERIALIZED_NAME_CONCURRENTLY_SCHEDULABLE_TASK_COUNT)
  private Integer concurrentlySchedulableTaskCount;

  public static final String SERIALIZED_NAME_AUTO_TERMINATED_RELATIONSHIPS = "autoTerminatedRelationships";
  @SerializedName(SERIALIZED_NAME_AUTO_TERMINATED_RELATIONSHIPS)
  private List<String> autoTerminatedRelationships = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_CUSTOM_UI_URL = "customUiUrl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_UI_URL)
  private String customUiUrl;

  public static final String SERIALIZED_NAME_LOSS_TOLERANT = "lossTolerant";
  @SerializedName(SERIALIZED_NAME_LOSS_TOLERANT)
  private Boolean lossTolerant;

  public static final String SERIALIZED_NAME_ANNOTATION_DATA = "annotationData";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_DATA)
  private String annotationData;

  public static final String SERIALIZED_NAME_DEFAULT_CONCURRENT_TASKS = "defaultConcurrentTasks";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CONCURRENT_TASKS)
  private Map<String, String> defaultConcurrentTasks = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_DEFAULT_SCHEDULING_PERIOD = "defaultSchedulingPeriod";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SCHEDULING_PERIOD)
  private Map<String, String> defaultSchedulingPeriod = new HashMap<String, String>();

  public ProcessorConfigDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ProcessorConfigDTO putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties for the processor. Properties whose value is not set will only contain the property name.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties for the processor. Properties whose value is not set will only contain the property name.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ProcessorConfigDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public ProcessorConfigDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    if (this.descriptors == null) {
      this.descriptors = new HashMap<String, PropertyDescriptorDTO>();
    }
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * Descriptors for the processor&#39;s properties.
   * @return descriptors
  **/
  @ApiModelProperty(value = "Descriptors for the processor's properties.")
  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }

  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }

  public ProcessorConfigDTO schedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
    return this;
  }

   /**
   * The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy.
   * @return schedulingPeriod
  **/
  @ApiModelProperty(value = "The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy.")
  public String getSchedulingPeriod() {
    return schedulingPeriod;
  }

  public void setSchedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
  }

  public ProcessorConfigDTO schedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
    return this;
  }

   /**
   * Indcates whether the prcessor should be scheduled to run in event or timer driven mode.
   * @return schedulingStrategy
  **/
  @ApiModelProperty(value = "Indcates whether the prcessor should be scheduled to run in event or timer driven mode.")
  public String getSchedulingStrategy() {
    return schedulingStrategy;
  }

  public void setSchedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
  }

  public ProcessorConfigDTO executionNode(String executionNode) {
    this.executionNode = executionNode;
    return this;
  }

   /**
   * Indicates the node where the process will execute.
   * @return executionNode
  **/
  @ApiModelProperty(value = "Indicates the node where the process will execute.")
  public String getExecutionNode() {
    return executionNode;
  }

  public void setExecutionNode(String executionNode) {
    this.executionNode = executionNode;
  }

  public ProcessorConfigDTO penaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
    return this;
  }

   /**
   * The amount of time that is used when the process penalizes a flowfile.
   * @return penaltyDuration
  **/
  @ApiModelProperty(value = "The amount of time that is used when the process penalizes a flowfile.")
  public String getPenaltyDuration() {
    return penaltyDuration;
  }

  public void setPenaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
  }

  public ProcessorConfigDTO yieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
    return this;
  }

   /**
   * The amount of time that must elapse before this processor is scheduled again after yielding.
   * @return yieldDuration
  **/
  @ApiModelProperty(value = "The amount of time that must elapse before this processor is scheduled again after yielding.")
  public String getYieldDuration() {
    return yieldDuration;
  }

  public void setYieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
  }

  public ProcessorConfigDTO bulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
    return this;
  }

   /**
   * The level at which the processor will report bulletins.
   * @return bulletinLevel
  **/
  @ApiModelProperty(value = "The level at which the processor will report bulletins.")
  public String getBulletinLevel() {
    return bulletinLevel;
  }

  public void setBulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
  }

  public ProcessorConfigDTO runDurationMillis(Long runDurationMillis) {
    this.runDurationMillis = runDurationMillis;
    return this;
  }

   /**
   * The run duration for the processor in milliseconds.
   * @return runDurationMillis
  **/
  @ApiModelProperty(value = "The run duration for the processor in milliseconds.")
  public Long getRunDurationMillis() {
    return runDurationMillis;
  }

  public void setRunDurationMillis(Long runDurationMillis) {
    this.runDurationMillis = runDurationMillis;
  }

  public ProcessorConfigDTO concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#39;t allow parallol processing then any positive input will be ignored.
   * @return concurrentlySchedulableTaskCount
  **/
  @ApiModelProperty(value = "The number of tasks that should be concurrently schedule for the processor. If the processor doesn't allow parallol processing then any positive input will be ignored.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public ProcessorConfigDTO autoTerminatedRelationships(List<String> autoTerminatedRelationships) {
    this.autoTerminatedRelationships = autoTerminatedRelationships;
    return this;
  }

  public ProcessorConfigDTO addAutoTerminatedRelationshipsItem(String autoTerminatedRelationshipsItem) {
    if (this.autoTerminatedRelationships == null) {
      this.autoTerminatedRelationships = new ArrayList<String>();
    }
    this.autoTerminatedRelationships.add(autoTerminatedRelationshipsItem);
    return this;
  }

   /**
   * The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#39;isAutoTerminate&#39; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated.
   * @return autoTerminatedRelationships
  **/
  @ApiModelProperty(value = "The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the 'isAutoTerminate' property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated.")
  public List<String> getAutoTerminatedRelationships() {
    return autoTerminatedRelationships;
  }

  public void setAutoTerminatedRelationships(List<String> autoTerminatedRelationships) {
    this.autoTerminatedRelationships = autoTerminatedRelationships;
  }

  public ProcessorConfigDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments for the processor.
   * @return comments
  **/
  @ApiModelProperty(value = "The comments for the processor.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public ProcessorConfigDTO customUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
    return this;
  }

   /**
   * The URL for the processor&#39;s custom configuration UI if applicable.
   * @return customUiUrl
  **/
  @ApiModelProperty(value = "The URL for the processor's custom configuration UI if applicable.")
  public String getCustomUiUrl() {
    return customUiUrl;
  }

  public void setCustomUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
  }

  public ProcessorConfigDTO lossTolerant(Boolean lossTolerant) {
    this.lossTolerant = lossTolerant;
    return this;
  }

   /**
   * Whether the processor is loss tolerant.
   * @return lossTolerant
  **/
  @ApiModelProperty(value = "Whether the processor is loss tolerant.")
  public Boolean getLossTolerant() {
    return lossTolerant;
  }

  public void setLossTolerant(Boolean lossTolerant) {
    this.lossTolerant = lossTolerant;
  }

  public ProcessorConfigDTO annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation data for the processor used to relay configuration between a custom UI and the procesosr.
   * @return annotationData
  **/
  @ApiModelProperty(value = "The annotation data for the processor used to relay configuration between a custom UI and the procesosr.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public ProcessorConfigDTO defaultConcurrentTasks(Map<String, String> defaultConcurrentTasks) {
    this.defaultConcurrentTasks = defaultConcurrentTasks;
    return this;
  }

  public ProcessorConfigDTO putDefaultConcurrentTasksItem(String key, String defaultConcurrentTasksItem) {
    if (this.defaultConcurrentTasks == null) {
      this.defaultConcurrentTasks = new HashMap<String, String>();
    }
    this.defaultConcurrentTasks.put(key, defaultConcurrentTasksItem);
    return this;
  }

   /**
   * Maps default values for concurrent tasks for each applicable scheduling strategy.
   * @return defaultConcurrentTasks
  **/
  @ApiModelProperty(value = "Maps default values for concurrent tasks for each applicable scheduling strategy.")
  public Map<String, String> getDefaultConcurrentTasks() {
    return defaultConcurrentTasks;
  }

  public void setDefaultConcurrentTasks(Map<String, String> defaultConcurrentTasks) {
    this.defaultConcurrentTasks = defaultConcurrentTasks;
  }

  public ProcessorConfigDTO defaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
    this.defaultSchedulingPeriod = defaultSchedulingPeriod;
    return this;
  }

  public ProcessorConfigDTO putDefaultSchedulingPeriodItem(String key, String defaultSchedulingPeriodItem) {
    if (this.defaultSchedulingPeriod == null) {
      this.defaultSchedulingPeriod = new HashMap<String, String>();
    }
    this.defaultSchedulingPeriod.put(key, defaultSchedulingPeriodItem);
    return this;
  }

   /**
   * Maps default values for scheduling period for each applicable scheduling strategy.
   * @return defaultSchedulingPeriod
  **/
  @ApiModelProperty(value = "Maps default values for scheduling period for each applicable scheduling strategy.")
  public Map<String, String> getDefaultSchedulingPeriod() {
    return defaultSchedulingPeriod;
  }

  public void setDefaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
    this.defaultSchedulingPeriod = defaultSchedulingPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorConfigDTO processorConfigDTO = (ProcessorConfigDTO) o;
    return Objects.equals(this.properties, processorConfigDTO.properties) &&
        Objects.equals(this.descriptors, processorConfigDTO.descriptors) &&
        Objects.equals(this.schedulingPeriod, processorConfigDTO.schedulingPeriod) &&
        Objects.equals(this.schedulingStrategy, processorConfigDTO.schedulingStrategy) &&
        Objects.equals(this.executionNode, processorConfigDTO.executionNode) &&
        Objects.equals(this.penaltyDuration, processorConfigDTO.penaltyDuration) &&
        Objects.equals(this.yieldDuration, processorConfigDTO.yieldDuration) &&
        Objects.equals(this.bulletinLevel, processorConfigDTO.bulletinLevel) &&
        Objects.equals(this.runDurationMillis, processorConfigDTO.runDurationMillis) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, processorConfigDTO.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.autoTerminatedRelationships, processorConfigDTO.autoTerminatedRelationships) &&
        Objects.equals(this.comments, processorConfigDTO.comments) &&
        Objects.equals(this.customUiUrl, processorConfigDTO.customUiUrl) &&
        Objects.equals(this.lossTolerant, processorConfigDTO.lossTolerant) &&
        Objects.equals(this.annotationData, processorConfigDTO.annotationData) &&
        Objects.equals(this.defaultConcurrentTasks, processorConfigDTO.defaultConcurrentTasks) &&
        Objects.equals(this.defaultSchedulingPeriod, processorConfigDTO.defaultSchedulingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, descriptors, schedulingPeriod, schedulingStrategy, executionNode, penaltyDuration, yieldDuration, bulletinLevel, runDurationMillis, concurrentlySchedulableTaskCount, autoTerminatedRelationships, comments, customUiUrl, lossTolerant, annotationData, defaultConcurrentTasks, defaultSchedulingPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorConfigDTO {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    schedulingPeriod: ").append(toIndentedString(schedulingPeriod)).append("\n");
    sb.append("    schedulingStrategy: ").append(toIndentedString(schedulingStrategy)).append("\n");
    sb.append("    executionNode: ").append(toIndentedString(executionNode)).append("\n");
    sb.append("    penaltyDuration: ").append(toIndentedString(penaltyDuration)).append("\n");
    sb.append("    yieldDuration: ").append(toIndentedString(yieldDuration)).append("\n");
    sb.append("    bulletinLevel: ").append(toIndentedString(bulletinLevel)).append("\n");
    sb.append("    runDurationMillis: ").append(toIndentedString(runDurationMillis)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
    sb.append("    autoTerminatedRelationships: ").append(toIndentedString(autoTerminatedRelationships)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    customUiUrl: ").append(toIndentedString(customUiUrl)).append("\n");
    sb.append("    lossTolerant: ").append(toIndentedString(lossTolerant)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    defaultConcurrentTasks: ").append(toIndentedString(defaultConcurrentTasks)).append("\n");
    sb.append("    defaultSchedulingPeriod: ").append(toIndentedString(defaultSchedulingPeriod)).append("\n");
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

