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
import com.github.andrewkav.model.BulletinEntity;
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
 * ControllerBulletinsEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ControllerBulletinsEntity {
  public static final String SERIALIZED_NAME_BULLETINS = "bulletins";
  @SerializedName(SERIALIZED_NAME_BULLETINS)
  private List<BulletinEntity> bulletins = new ArrayList<BulletinEntity>();

  public static final String SERIALIZED_NAME_CONTROLLER_SERVICE_BULLETINS = "controllerServiceBulletins";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_SERVICE_BULLETINS)
  private List<BulletinEntity> controllerServiceBulletins = new ArrayList<BulletinEntity>();

  public static final String SERIALIZED_NAME_REPORTING_TASK_BULLETINS = "reportingTaskBulletins";
  @SerializedName(SERIALIZED_NAME_REPORTING_TASK_BULLETINS)
  private List<BulletinEntity> reportingTaskBulletins = new ArrayList<BulletinEntity>();

  public ControllerBulletinsEntity bulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
    return this;
  }

  public ControllerBulletinsEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    if (this.bulletins == null) {
      this.bulletins = new ArrayList<BulletinEntity>();
    }
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * System level bulletins to be reported to the user.
   * @return bulletins
  **/
  @ApiModelProperty(value = "System level bulletins to be reported to the user.")
  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }

  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }

  public ControllerBulletinsEntity controllerServiceBulletins(List<BulletinEntity> controllerServiceBulletins) {
    this.controllerServiceBulletins = controllerServiceBulletins;
    return this;
  }

  public ControllerBulletinsEntity addControllerServiceBulletinsItem(BulletinEntity controllerServiceBulletinsItem) {
    if (this.controllerServiceBulletins == null) {
      this.controllerServiceBulletins = new ArrayList<BulletinEntity>();
    }
    this.controllerServiceBulletins.add(controllerServiceBulletinsItem);
    return this;
  }

   /**
   * Controller service bulletins to be reported to the user.
   * @return controllerServiceBulletins
  **/
  @ApiModelProperty(value = "Controller service bulletins to be reported to the user.")
  public List<BulletinEntity> getControllerServiceBulletins() {
    return controllerServiceBulletins;
  }

  public void setControllerServiceBulletins(List<BulletinEntity> controllerServiceBulletins) {
    this.controllerServiceBulletins = controllerServiceBulletins;
  }

  public ControllerBulletinsEntity reportingTaskBulletins(List<BulletinEntity> reportingTaskBulletins) {
    this.reportingTaskBulletins = reportingTaskBulletins;
    return this;
  }

  public ControllerBulletinsEntity addReportingTaskBulletinsItem(BulletinEntity reportingTaskBulletinsItem) {
    if (this.reportingTaskBulletins == null) {
      this.reportingTaskBulletins = new ArrayList<BulletinEntity>();
    }
    this.reportingTaskBulletins.add(reportingTaskBulletinsItem);
    return this;
  }

   /**
   * Reporting task bulletins to be reported to the user.
   * @return reportingTaskBulletins
  **/
  @ApiModelProperty(value = "Reporting task bulletins to be reported to the user.")
  public List<BulletinEntity> getReportingTaskBulletins() {
    return reportingTaskBulletins;
  }

  public void setReportingTaskBulletins(List<BulletinEntity> reportingTaskBulletins) {
    this.reportingTaskBulletins = reportingTaskBulletins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerBulletinsEntity controllerBulletinsEntity = (ControllerBulletinsEntity) o;
    return Objects.equals(this.bulletins, controllerBulletinsEntity.bulletins) &&
        Objects.equals(this.controllerServiceBulletins, controllerBulletinsEntity.controllerServiceBulletins) &&
        Objects.equals(this.reportingTaskBulletins, controllerBulletinsEntity.reportingTaskBulletins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulletins, controllerServiceBulletins, reportingTaskBulletins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerBulletinsEntity {\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    controllerServiceBulletins: ").append(toIndentedString(controllerServiceBulletins)).append("\n");
    sb.append("    reportingTaskBulletins: ").append(toIndentedString(reportingTaskBulletins)).append("\n");
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

