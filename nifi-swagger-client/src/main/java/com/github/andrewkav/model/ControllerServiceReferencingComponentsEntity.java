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
 * ControllerServiceReferencingComponentsEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ControllerServiceReferencingComponentsEntity {
  public static final String SERIALIZED_NAME_CONTROLLER_SERVICE_REFERENCING_COMPONENTS = "controllerServiceReferencingComponents";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_SERVICE_REFERENCING_COMPONENTS)
  private List<ControllerServiceReferencingComponentEntity> controllerServiceReferencingComponents = new ArrayList<ControllerServiceReferencingComponentEntity>();

  public ControllerServiceReferencingComponentsEntity controllerServiceReferencingComponents(List<ControllerServiceReferencingComponentEntity> controllerServiceReferencingComponents) {
    this.controllerServiceReferencingComponents = controllerServiceReferencingComponents;
    return this;
  }

  public ControllerServiceReferencingComponentsEntity addControllerServiceReferencingComponentsItem(ControllerServiceReferencingComponentEntity controllerServiceReferencingComponentsItem) {
    if (this.controllerServiceReferencingComponents == null) {
      this.controllerServiceReferencingComponents = new ArrayList<ControllerServiceReferencingComponentEntity>();
    }
    this.controllerServiceReferencingComponents.add(controllerServiceReferencingComponentsItem);
    return this;
  }

   /**
   * Get controllerServiceReferencingComponents
   * @return controllerServiceReferencingComponents
  **/
  @ApiModelProperty(value = "")
  public List<ControllerServiceReferencingComponentEntity> getControllerServiceReferencingComponents() {
    return controllerServiceReferencingComponents;
  }

  public void setControllerServiceReferencingComponents(List<ControllerServiceReferencingComponentEntity> controllerServiceReferencingComponents) {
    this.controllerServiceReferencingComponents = controllerServiceReferencingComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceReferencingComponentsEntity controllerServiceReferencingComponentsEntity = (ControllerServiceReferencingComponentsEntity) o;
    return Objects.equals(this.controllerServiceReferencingComponents, controllerServiceReferencingComponentsEntity.controllerServiceReferencingComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerServiceReferencingComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceReferencingComponentsEntity {\n");
    sb.append("    controllerServiceReferencingComponents: ").append(toIndentedString(controllerServiceReferencingComponents)).append("\n");
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
