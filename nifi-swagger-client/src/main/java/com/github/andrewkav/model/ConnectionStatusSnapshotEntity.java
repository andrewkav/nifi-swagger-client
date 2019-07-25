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
import com.github.andrewkav.model.ConnectionStatusSnapshotDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConnectionStatusSnapshotEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ConnectionStatusSnapshotEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS_SNAPSHOT = "connectionStatusSnapshot";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS_SNAPSHOT)
  private ConnectionStatusSnapshotDTO connectionStatusSnapshot = null;

  public static final String SERIALIZED_NAME_CAN_READ = "canRead";
  @SerializedName(SERIALIZED_NAME_CAN_READ)
  private Boolean canRead;

  public ConnectionStatusSnapshotEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the connection.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the connection.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectionStatusSnapshotEntity connectionStatusSnapshot(ConnectionStatusSnapshotDTO connectionStatusSnapshot) {
    this.connectionStatusSnapshot = connectionStatusSnapshot;
    return this;
  }

   /**
   * Get connectionStatusSnapshot
   * @return connectionStatusSnapshot
  **/
  @ApiModelProperty(value = "")
  public ConnectionStatusSnapshotDTO getConnectionStatusSnapshot() {
    return connectionStatusSnapshot;
  }

  public void setConnectionStatusSnapshot(ConnectionStatusSnapshotDTO connectionStatusSnapshot) {
    this.connectionStatusSnapshot = connectionStatusSnapshot;
  }

   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @ApiModelProperty(value = "Indicates whether the user can read a given resource.")
  public Boolean getCanRead() {
    return canRead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionStatusSnapshotEntity connectionStatusSnapshotEntity = (ConnectionStatusSnapshotEntity) o;
    return Objects.equals(this.id, connectionStatusSnapshotEntity.id) &&
        Objects.equals(this.connectionStatusSnapshot, connectionStatusSnapshotEntity.connectionStatusSnapshot) &&
        Objects.equals(this.canRead, connectionStatusSnapshotEntity.canRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectionStatusSnapshot, canRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionStatusSnapshotEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectionStatusSnapshot: ").append(toIndentedString(connectionStatusSnapshot)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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
