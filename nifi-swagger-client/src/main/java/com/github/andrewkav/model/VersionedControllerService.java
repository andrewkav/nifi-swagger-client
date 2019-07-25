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
import com.github.andrewkav.model.Bundle;
import com.github.andrewkav.model.ControllerServiceAPI;
import com.github.andrewkav.model.Position;
import com.github.andrewkav.model.VersionedPropertyDescriptor;
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
 * VersionedControllerService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class VersionedControllerService {
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

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BUNDLE = "bundle";
  @SerializedName(SERIALIZED_NAME_BUNDLE)
  private Bundle bundle = null;

  public static final String SERIALIZED_NAME_CONTROLLER_SERVICE_APIS = "controllerServiceApis";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_SERVICE_APIS)
  private List<ControllerServiceAPI> controllerServiceApis = new ArrayList<ControllerServiceAPI>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_PROPERTY_DESCRIPTORS = "propertyDescriptors";
  @SerializedName(SERIALIZED_NAME_PROPERTY_DESCRIPTORS)
  private Map<String, VersionedPropertyDescriptor> propertyDescriptors = new HashMap<String, VersionedPropertyDescriptor>();

  public static final String SERIALIZED_NAME_ANNOTATION_DATA = "annotationData";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_DATA)
  private String annotationData;

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

  public VersionedControllerService identifier(String identifier) {
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

  public VersionedControllerService name(String name) {
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

  public VersionedControllerService comments(String comments) {
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

  public VersionedControllerService position(Position position) {
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

  public VersionedControllerService type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the controller service.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the controller service.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VersionedControllerService bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @ApiModelProperty(value = "")
  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public VersionedControllerService controllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
    return this;
  }

  public VersionedControllerService addControllerServiceApisItem(ControllerServiceAPI controllerServiceApisItem) {
    if (this.controllerServiceApis == null) {
      this.controllerServiceApis = new ArrayList<ControllerServiceAPI>();
    }
    this.controllerServiceApis.add(controllerServiceApisItem);
    return this;
  }

   /**
   * Lists the APIs this Controller Service implements.
   * @return controllerServiceApis
  **/
  @ApiModelProperty(value = "Lists the APIs this Controller Service implements.")
  public List<ControllerServiceAPI> getControllerServiceApis() {
    return controllerServiceApis;
  }

  public void setControllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
  }

  public VersionedControllerService properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public VersionedControllerService putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the controller service.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties of the controller service.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public VersionedControllerService propertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
    return this;
  }

  public VersionedControllerService putPropertyDescriptorsItem(String key, VersionedPropertyDescriptor propertyDescriptorsItem) {
    if (this.propertyDescriptors == null) {
      this.propertyDescriptors = new HashMap<String, VersionedPropertyDescriptor>();
    }
    this.propertyDescriptors.put(key, propertyDescriptorsItem);
    return this;
  }

   /**
   * The property descriptors for the processor.
   * @return propertyDescriptors
  **/
  @ApiModelProperty(value = "The property descriptors for the processor.")
  public Map<String, VersionedPropertyDescriptor> getPropertyDescriptors() {
    return propertyDescriptors;
  }

  public void setPropertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
  }

  public VersionedControllerService annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation for the controller service. This is how the custom UI relays configuration to the controller service.
   * @return annotationData
  **/
  @ApiModelProperty(value = "The annotation for the controller service. This is how the custom UI relays configuration to the controller service.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public VersionedControllerService componentType(ComponentTypeEnum componentType) {
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

  public VersionedControllerService groupIdentifier(String groupIdentifier) {
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
    VersionedControllerService versionedControllerService = (VersionedControllerService) o;
    return Objects.equals(this.identifier, versionedControllerService.identifier) &&
        Objects.equals(this.name, versionedControllerService.name) &&
        Objects.equals(this.comments, versionedControllerService.comments) &&
        Objects.equals(this.position, versionedControllerService.position) &&
        Objects.equals(this.type, versionedControllerService.type) &&
        Objects.equals(this.bundle, versionedControllerService.bundle) &&
        Objects.equals(this.controllerServiceApis, versionedControllerService.controllerServiceApis) &&
        Objects.equals(this.properties, versionedControllerService.properties) &&
        Objects.equals(this.propertyDescriptors, versionedControllerService.propertyDescriptors) &&
        Objects.equals(this.annotationData, versionedControllerService.annotationData) &&
        Objects.equals(this.componentType, versionedControllerService.componentType) &&
        Objects.equals(this.groupIdentifier, versionedControllerService.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, type, bundle, controllerServiceApis, properties, propertyDescriptors, annotationData, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedControllerService {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
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
