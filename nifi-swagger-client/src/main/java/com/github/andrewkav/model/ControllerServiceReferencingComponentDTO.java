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
import com.github.andrewkav.model.ControllerServiceReferencingComponentEntity;
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
 * ControllerServiceReferencingComponentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ControllerServiceReferencingComponentDTO {
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

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_DESCRIPTORS = "descriptors";
  @SerializedName(SERIALIZED_NAME_DESCRIPTORS)
  private Map<String, PropertyDescriptorDTO> descriptors = new HashMap<String, PropertyDescriptorDTO>();

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<String> validationErrors = new ArrayList<String>();

  /**
   * The type of reference this is.
   */
  @JsonAdapter(ReferenceTypeEnum.Adapter.class)
  public enum ReferenceTypeEnum {
    PROCESSOR("Processor"),
    
    CONTROLLERSERVICE("ControllerService"),
    
    OR_REPORTINGTASK("or ReportingTask");

    private String value;

    ReferenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceTypeEnum fromValue(String value) {
      for (ReferenceTypeEnum b : ReferenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReferenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReferenceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "referenceType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private ReferenceTypeEnum referenceType;

  public static final String SERIALIZED_NAME_ACTIVE_THREAD_COUNT = "activeThreadCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THREAD_COUNT)
  private Integer activeThreadCount;

  public static final String SERIALIZED_NAME_REFERENCE_CYCLE = "referenceCycle";
  @SerializedName(SERIALIZED_NAME_REFERENCE_CYCLE)
  private Boolean referenceCycle;

  public static final String SERIALIZED_NAME_REFERENCING_COMPONENTS = "referencingComponents";
  @SerializedName(SERIALIZED_NAME_REFERENCING_COMPONENTS)
  private List<ControllerServiceReferencingComponentEntity> referencingComponents = new ArrayList<ControllerServiceReferencingComponentEntity>();

  public ControllerServiceReferencingComponentDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id for the component referencing a controller service. If this component is another controller service or a reporting task, this field is blank.
   * @return groupId
  **/
  @ApiModelProperty(value = "The group id for the component referencing a controller service. If this component is another controller service or a reporting task, this field is blank.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ControllerServiceReferencingComponentDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component referencing a controller service.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component referencing a controller service.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ControllerServiceReferencingComponentDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the component referencing a controller service.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the component referencing a controller service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ControllerServiceReferencingComponentDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the component referencing a controller service in simple Java class name format without package name.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the component referencing a controller service in simple Java class name format without package name.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ControllerServiceReferencingComponentDTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The scheduled state of a processor or reporting task referencing a controller service. If this component is another controller service, this field represents the controller service state.
   * @return state
  **/
  @ApiModelProperty(value = "The scheduled state of a processor or reporting task referencing a controller service. If this component is another controller service, this field represents the controller service state.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ControllerServiceReferencingComponentDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ControllerServiceReferencingComponentDTO putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties for the component.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties for the component.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ControllerServiceReferencingComponentDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public ControllerServiceReferencingComponentDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    if (this.descriptors == null) {
      this.descriptors = new HashMap<String, PropertyDescriptorDTO>();
    }
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * The descriptors for the component properties.
   * @return descriptors
  **/
  @ApiModelProperty(value = "The descriptors for the component properties.")
  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }

  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }

  public ControllerServiceReferencingComponentDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ControllerServiceReferencingComponentDTO addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors for the component.
   * @return validationErrors
  **/
  @ApiModelProperty(value = "The validation errors for the component.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public ControllerServiceReferencingComponentDTO referenceType(ReferenceTypeEnum referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * The type of reference this is.
   * @return referenceType
  **/
  @ApiModelProperty(value = "The type of reference this is.")
  public ReferenceTypeEnum getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(ReferenceTypeEnum referenceType) {
    this.referenceType = referenceType;
  }

  public ControllerServiceReferencingComponentDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the referencing component.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The number of active threads for the referencing component.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }

  public ControllerServiceReferencingComponentDTO referenceCycle(Boolean referenceCycle) {
    this.referenceCycle = referenceCycle;
    return this;
  }

   /**
   * If the referencing component represents a controller service, this indicates whether it has already been represented in this hierarchy.
   * @return referenceCycle
  **/
  @ApiModelProperty(value = "If the referencing component represents a controller service, this indicates whether it has already been represented in this hierarchy.")
  public Boolean getReferenceCycle() {
    return referenceCycle;
  }

  public void setReferenceCycle(Boolean referenceCycle) {
    this.referenceCycle = referenceCycle;
  }

  public ControllerServiceReferencingComponentDTO referencingComponents(List<ControllerServiceReferencingComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
    return this;
  }

  public ControllerServiceReferencingComponentDTO addReferencingComponentsItem(ControllerServiceReferencingComponentEntity referencingComponentsItem) {
    if (this.referencingComponents == null) {
      this.referencingComponents = new ArrayList<ControllerServiceReferencingComponentEntity>();
    }
    this.referencingComponents.add(referencingComponentsItem);
    return this;
  }

   /**
   * If the referencing component represents a controller service, these are the components that reference it.
   * @return referencingComponents
  **/
  @ApiModelProperty(value = "If the referencing component represents a controller service, these are the components that reference it.")
  public List<ControllerServiceReferencingComponentEntity> getReferencingComponents() {
    return referencingComponents;
  }

  public void setReferencingComponents(List<ControllerServiceReferencingComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceReferencingComponentDTO controllerServiceReferencingComponentDTO = (ControllerServiceReferencingComponentDTO) o;
    return Objects.equals(this.groupId, controllerServiceReferencingComponentDTO.groupId) &&
        Objects.equals(this.id, controllerServiceReferencingComponentDTO.id) &&
        Objects.equals(this.name, controllerServiceReferencingComponentDTO.name) &&
        Objects.equals(this.type, controllerServiceReferencingComponentDTO.type) &&
        Objects.equals(this.state, controllerServiceReferencingComponentDTO.state) &&
        Objects.equals(this.properties, controllerServiceReferencingComponentDTO.properties) &&
        Objects.equals(this.descriptors, controllerServiceReferencingComponentDTO.descriptors) &&
        Objects.equals(this.validationErrors, controllerServiceReferencingComponentDTO.validationErrors) &&
        Objects.equals(this.referenceType, controllerServiceReferencingComponentDTO.referenceType) &&
        Objects.equals(this.activeThreadCount, controllerServiceReferencingComponentDTO.activeThreadCount) &&
        Objects.equals(this.referenceCycle, controllerServiceReferencingComponentDTO.referenceCycle) &&
        Objects.equals(this.referencingComponents, controllerServiceReferencingComponentDTO.referencingComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, id, name, type, state, properties, descriptors, validationErrors, referenceType, activeThreadCount, referenceCycle, referencingComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceReferencingComponentDTO {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    referenceCycle: ").append(toIndentedString(referenceCycle)).append("\n");
    sb.append("    referencingComponents: ").append(toIndentedString(referencingComponents)).append("\n");
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
