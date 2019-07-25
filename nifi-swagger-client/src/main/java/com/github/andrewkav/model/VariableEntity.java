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
import com.github.andrewkav.model.VariableDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VariableEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class VariableEntity {
  public static final String SERIALIZED_NAME_VARIABLE = "variable";
  @SerializedName(SERIALIZED_NAME_VARIABLE)
  private VariableDTO variable = null;

  public static final String SERIALIZED_NAME_CAN_WRITE = "canWrite";
  @SerializedName(SERIALIZED_NAME_CAN_WRITE)
  private Boolean canWrite;

  public VariableEntity variable(VariableDTO variable) {
    this.variable = variable;
    return this;
  }

   /**
   * Get variable
   * @return variable
  **/
  @ApiModelProperty(value = "")
  public VariableDTO getVariable() {
    return variable;
  }

  public void setVariable(VariableDTO variable) {
    this.variable = variable;
  }

   /**
   * Indicates whether the user can write a given resource.
   * @return canWrite
  **/
  @ApiModelProperty(value = "Indicates whether the user can write a given resource.")
  public Boolean getCanWrite() {
    return canWrite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableEntity variableEntity = (VariableEntity) o;
    return Objects.equals(this.variable, variableEntity.variable) &&
        Objects.equals(this.canWrite, variableEntity.canWrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variable, canWrite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableEntity {\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
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

