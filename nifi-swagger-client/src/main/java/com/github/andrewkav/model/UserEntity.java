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
import com.github.andrewkav.model.PermissionsDTO;
import com.github.andrewkav.model.PositionDTO;
import com.github.andrewkav.model.RevisionDTO;
import com.github.andrewkav.model.UserDTO;
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
 * UserEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class UserEntity {
  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private RevisionDTO revision = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private PositionDTO position = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PermissionsDTO permissions = null;

  public static final String SERIALIZED_NAME_BULLETINS = "bulletins";
  @SerializedName(SERIALIZED_NAME_BULLETINS)
  private List<BulletinEntity> bulletins = new ArrayList<BulletinEntity>();

  public static final String SERIALIZED_NAME_DISCONNECTED_NODE_ACKNOWLEDGED = "disconnectedNodeAcknowledged";
  @SerializedName(SERIALIZED_NAME_DISCONNECTED_NODE_ACKNOWLEDGED)
  private Boolean disconnectedNodeAcknowledged;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private UserDTO component = null;

  public UserEntity revision(RevisionDTO revision) {
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

  public UserEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserEntity uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for futures requests to the component.
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for futures requests to the component.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public UserEntity position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public UserEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public UserEntity bulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
    return this;
  }

  public UserEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    if (this.bulletins == null) {
      this.bulletins = new ArrayList<BulletinEntity>();
    }
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins for this component.
   * @return bulletins
  **/
  @ApiModelProperty(value = "The bulletins for this component.")
  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }

  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }

  public UserEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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

  public UserEntity component(UserDTO component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(value = "")
  public UserDTO getComponent() {
    return component;
  }

  public void setComponent(UserDTO component) {
    this.component = component;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEntity userEntity = (UserEntity) o;
    return Objects.equals(this.revision, userEntity.revision) &&
        Objects.equals(this.id, userEntity.id) &&
        Objects.equals(this.uri, userEntity.uri) &&
        Objects.equals(this.position, userEntity.position) &&
        Objects.equals(this.permissions, userEntity.permissions) &&
        Objects.equals(this.bulletins, userEntity.bulletins) &&
        Objects.equals(this.disconnectedNodeAcknowledged, userEntity.disconnectedNodeAcknowledged) &&
        Objects.equals(this.component, userEntity.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, component);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEntity {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
