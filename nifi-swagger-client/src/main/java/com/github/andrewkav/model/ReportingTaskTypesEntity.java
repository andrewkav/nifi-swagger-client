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
import com.github.andrewkav.model.DocumentedTypeDTO;
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
 * ReportingTaskTypesEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ReportingTaskTypesEntity {
  public static final String SERIALIZED_NAME_REPORTING_TASK_TYPES = "reportingTaskTypes";
  @SerializedName(SERIALIZED_NAME_REPORTING_TASK_TYPES)
  private List<DocumentedTypeDTO> reportingTaskTypes = new ArrayList<DocumentedTypeDTO>();

  public ReportingTaskTypesEntity reportingTaskTypes(List<DocumentedTypeDTO> reportingTaskTypes) {
    this.reportingTaskTypes = reportingTaskTypes;
    return this;
  }

  public ReportingTaskTypesEntity addReportingTaskTypesItem(DocumentedTypeDTO reportingTaskTypesItem) {
    if (this.reportingTaskTypes == null) {
      this.reportingTaskTypes = new ArrayList<DocumentedTypeDTO>();
    }
    this.reportingTaskTypes.add(reportingTaskTypesItem);
    return this;
  }

   /**
   * Get reportingTaskTypes
   * @return reportingTaskTypes
  **/
  @ApiModelProperty(value = "")
  public List<DocumentedTypeDTO> getReportingTaskTypes() {
    return reportingTaskTypes;
  }

  public void setReportingTaskTypes(List<DocumentedTypeDTO> reportingTaskTypes) {
    this.reportingTaskTypes = reportingTaskTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTaskTypesEntity reportingTaskTypesEntity = (ReportingTaskTypesEntity) o;
    return Objects.equals(this.reportingTaskTypes, reportingTaskTypesEntity.reportingTaskTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingTaskTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTaskTypesEntity {\n");
    sb.append("    reportingTaskTypes: ").append(toIndentedString(reportingTaskTypes)).append("\n");
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
