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
import com.github.andrewkav.model.RequiredPermissionDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExplicitRestrictionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ExplicitRestrictionDTO {
  public static final String SERIALIZED_NAME_REQUIRED_PERMISSION = "requiredPermission";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PERMISSION)
  private RequiredPermissionDTO requiredPermission = null;

  public static final String SERIALIZED_NAME_EXPLANATION = "explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

  public ExplicitRestrictionDTO requiredPermission(RequiredPermissionDTO requiredPermission) {
    this.requiredPermission = requiredPermission;
    return this;
  }

   /**
   * Get requiredPermission
   * @return requiredPermission
  **/
  @ApiModelProperty(value = "")
  public RequiredPermissionDTO getRequiredPermission() {
    return requiredPermission;
  }

  public void setRequiredPermission(RequiredPermissionDTO requiredPermission) {
    this.requiredPermission = requiredPermission;
  }

  public ExplicitRestrictionDTO explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * The description of why the usage of this component is restricted for this required permission.
   * @return explanation
  **/
  @ApiModelProperty(value = "The description of why the usage of this component is restricted for this required permission.")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplicitRestrictionDTO explicitRestrictionDTO = (ExplicitRestrictionDTO) o;
    return Objects.equals(this.requiredPermission, explicitRestrictionDTO.requiredPermission) &&
        Objects.equals(this.explanation, explicitRestrictionDTO.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredPermission, explanation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplicitRestrictionDTO {\n");
    sb.append("    requiredPermission: ").append(toIndentedString(requiredPermission)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

