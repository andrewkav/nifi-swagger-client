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
 * StorageUsageDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class StorageUsageDTO {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_FREE_SPACE = "freeSpace";
  @SerializedName(SERIALIZED_NAME_FREE_SPACE)
  private String freeSpace;

  public static final String SERIALIZED_NAME_TOTAL_SPACE = "totalSpace";
  @SerializedName(SERIALIZED_NAME_TOTAL_SPACE)
  private String totalSpace;

  public static final String SERIALIZED_NAME_USED_SPACE = "usedSpace";
  @SerializedName(SERIALIZED_NAME_USED_SPACE)
  private String usedSpace;

  public static final String SERIALIZED_NAME_FREE_SPACE_BYTES = "freeSpaceBytes";
  @SerializedName(SERIALIZED_NAME_FREE_SPACE_BYTES)
  private Long freeSpaceBytes;

  public static final String SERIALIZED_NAME_TOTAL_SPACE_BYTES = "totalSpaceBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_SPACE_BYTES)
  private Long totalSpaceBytes;

  public static final String SERIALIZED_NAME_USED_SPACE_BYTES = "usedSpaceBytes";
  @SerializedName(SERIALIZED_NAME_USED_SPACE_BYTES)
  private Long usedSpaceBytes;

  public static final String SERIALIZED_NAME_UTILIZATION = "utilization";
  @SerializedName(SERIALIZED_NAME_UTILIZATION)
  private String utilization;

  public StorageUsageDTO identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of this storage location. The identifier will correspond to the identifier keyed in the storage configuration.
   * @return identifier
  **/
  @ApiModelProperty(value = "The identifier of this storage location. The identifier will correspond to the identifier keyed in the storage configuration.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public StorageUsageDTO freeSpace(String freeSpace) {
    this.freeSpace = freeSpace;
    return this;
  }

   /**
   * Amount of free space.
   * @return freeSpace
  **/
  @ApiModelProperty(value = "Amount of free space.")
  public String getFreeSpace() {
    return freeSpace;
  }

  public void setFreeSpace(String freeSpace) {
    this.freeSpace = freeSpace;
  }

  public StorageUsageDTO totalSpace(String totalSpace) {
    this.totalSpace = totalSpace;
    return this;
  }

   /**
   * Amount of total space.
   * @return totalSpace
  **/
  @ApiModelProperty(value = "Amount of total space.")
  public String getTotalSpace() {
    return totalSpace;
  }

  public void setTotalSpace(String totalSpace) {
    this.totalSpace = totalSpace;
  }

  public StorageUsageDTO usedSpace(String usedSpace) {
    this.usedSpace = usedSpace;
    return this;
  }

   /**
   * Amount of used space.
   * @return usedSpace
  **/
  @ApiModelProperty(value = "Amount of used space.")
  public String getUsedSpace() {
    return usedSpace;
  }

  public void setUsedSpace(String usedSpace) {
    this.usedSpace = usedSpace;
  }

  public StorageUsageDTO freeSpaceBytes(Long freeSpaceBytes) {
    this.freeSpaceBytes = freeSpaceBytes;
    return this;
  }

   /**
   * The number of bytes of free space.
   * @return freeSpaceBytes
  **/
  @ApiModelProperty(value = "The number of bytes of free space.")
  public Long getFreeSpaceBytes() {
    return freeSpaceBytes;
  }

  public void setFreeSpaceBytes(Long freeSpaceBytes) {
    this.freeSpaceBytes = freeSpaceBytes;
  }

  public StorageUsageDTO totalSpaceBytes(Long totalSpaceBytes) {
    this.totalSpaceBytes = totalSpaceBytes;
    return this;
  }

   /**
   * The number of bytes of total space.
   * @return totalSpaceBytes
  **/
  @ApiModelProperty(value = "The number of bytes of total space.")
  public Long getTotalSpaceBytes() {
    return totalSpaceBytes;
  }

  public void setTotalSpaceBytes(Long totalSpaceBytes) {
    this.totalSpaceBytes = totalSpaceBytes;
  }

  public StorageUsageDTO usedSpaceBytes(Long usedSpaceBytes) {
    this.usedSpaceBytes = usedSpaceBytes;
    return this;
  }

   /**
   * The number of bytes of used space.
   * @return usedSpaceBytes
  **/
  @ApiModelProperty(value = "The number of bytes of used space.")
  public Long getUsedSpaceBytes() {
    return usedSpaceBytes;
  }

  public void setUsedSpaceBytes(Long usedSpaceBytes) {
    this.usedSpaceBytes = usedSpaceBytes;
  }

  public StorageUsageDTO utilization(String utilization) {
    this.utilization = utilization;
    return this;
  }

   /**
   * Utilization of this storage location.
   * @return utilization
  **/
  @ApiModelProperty(value = "Utilization of this storage location.")
  public String getUtilization() {
    return utilization;
  }

  public void setUtilization(String utilization) {
    this.utilization = utilization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageUsageDTO storageUsageDTO = (StorageUsageDTO) o;
    return Objects.equals(this.identifier, storageUsageDTO.identifier) &&
        Objects.equals(this.freeSpace, storageUsageDTO.freeSpace) &&
        Objects.equals(this.totalSpace, storageUsageDTO.totalSpace) &&
        Objects.equals(this.usedSpace, storageUsageDTO.usedSpace) &&
        Objects.equals(this.freeSpaceBytes, storageUsageDTO.freeSpaceBytes) &&
        Objects.equals(this.totalSpaceBytes, storageUsageDTO.totalSpaceBytes) &&
        Objects.equals(this.usedSpaceBytes, storageUsageDTO.usedSpaceBytes) &&
        Objects.equals(this.utilization, storageUsageDTO.utilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, freeSpace, totalSpace, usedSpace, freeSpaceBytes, totalSpaceBytes, usedSpaceBytes, utilization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageUsageDTO {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    freeSpace: ").append(toIndentedString(freeSpace)).append("\n");
    sb.append("    totalSpace: ").append(toIndentedString(totalSpace)).append("\n");
    sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
    sb.append("    freeSpaceBytes: ").append(toIndentedString(freeSpaceBytes)).append("\n");
    sb.append("    totalSpaceBytes: ").append(toIndentedString(totalSpaceBytes)).append("\n");
    sb.append("    usedSpaceBytes: ").append(toIndentedString(usedSpaceBytes)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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

