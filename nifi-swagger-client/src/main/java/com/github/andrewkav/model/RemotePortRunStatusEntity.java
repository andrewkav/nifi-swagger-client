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
import com.github.andrewkav.model.RevisionDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RemotePortRunStatusEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class RemotePortRunStatusEntity {
  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private RevisionDTO revision = null;

  /**
   * The run status of the RemotePort.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    TRANSMITTING("TRANSMITTING"),
    
    STOPPED("STOPPED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_DISCONNECTED_NODE_ACKNOWLEDGED = "disconnectedNodeAcknowledged";
  @SerializedName(SERIALIZED_NAME_DISCONNECTED_NODE_ACKNOWLEDGED)
  private Boolean disconnectedNodeAcknowledged;

  public RemotePortRunStatusEntity revision(RevisionDTO revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public RevisionDTO getRevision() {
    return revision;
  }

  public void setRevision(RevisionDTO revision) {
    this.revision = revision;
  }

  public RemotePortRunStatusEntity state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The run status of the RemotePort.
   * @return state
  **/
  @ApiModelProperty(value = "The run status of the RemotePort.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public RemotePortRunStatusEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean getDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemotePortRunStatusEntity remotePortRunStatusEntity = (RemotePortRunStatusEntity) o;
    return Objects.equals(this.revision, remotePortRunStatusEntity.revision) &&
        Objects.equals(this.state, remotePortRunStatusEntity.state) &&
        Objects.equals(this.disconnectedNodeAcknowledged, remotePortRunStatusEntity.disconnectedNodeAcknowledged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, state, disconnectedNodeAcknowledged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemotePortRunStatusEntity {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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

