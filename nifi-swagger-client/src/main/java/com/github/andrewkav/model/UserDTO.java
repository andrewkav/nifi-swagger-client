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
import com.github.andrewkav.model.AccessPolicySummaryEntity;
import com.github.andrewkav.model.PositionDTO;
import com.github.andrewkav.model.TenantEntity;
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
 * UserDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class UserDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VERSIONED_COMPONENT_ID = "versionedComponentId";
  @SerializedName(SERIALIZED_NAME_VERSIONED_COMPONENT_ID)
  private String versionedComponentId;

  public static final String SERIALIZED_NAME_PARENT_GROUP_ID = "parentGroupId";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUP_ID)
  private String parentGroupId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private PositionDTO position = null;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_CONFIGURABLE = "configurable";
  @SerializedName(SERIALIZED_NAME_CONFIGURABLE)
  private Boolean configurable;

  public static final String SERIALIZED_NAME_USER_GROUPS = "userGroups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  private List<TenantEntity> userGroups = new ArrayList<TenantEntity>();

  public static final String SERIALIZED_NAME_ACCESS_POLICIES = "accessPolicies";
  @SerializedName(SERIALIZED_NAME_ACCESS_POLICIES)
  private List<AccessPolicySummaryEntity> accessPolicies = new ArrayList<AccessPolicySummaryEntity>();

  public UserDTO id(String id) {
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

  public UserDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @ApiModelProperty(value = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public UserDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public UserDTO position(PositionDTO position) {
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

  public UserDTO identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * The identity of the tenant.
   * @return identity
  **/
  @ApiModelProperty(value = "The identity of the tenant.")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public UserDTO configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

   /**
   * Whether this tenant is configurable.
   * @return configurable
  **/
  @ApiModelProperty(value = "Whether this tenant is configurable.")
  public Boolean getConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

   /**
   * The groups to which the user belongs. This field is read only and it provided for convenience.
   * @return userGroups
  **/
  @ApiModelProperty(value = "The groups to which the user belongs. This field is read only and it provided for convenience.")
  public List<TenantEntity> getUserGroups() {
    return userGroups;
  }

   /**
   * The access policies this user belongs to.
   * @return accessPolicies
  **/
  @ApiModelProperty(value = "The access policies this user belongs to.")
  public List<AccessPolicySummaryEntity> getAccessPolicies() {
    return accessPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.id, userDTO.id) &&
        Objects.equals(this.versionedComponentId, userDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, userDTO.parentGroupId) &&
        Objects.equals(this.position, userDTO.position) &&
        Objects.equals(this.identity, userDTO.identity) &&
        Objects.equals(this.configurable, userDTO.configurable) &&
        Objects.equals(this.userGroups, userDTO.userGroups) &&
        Objects.equals(this.accessPolicies, userDTO.accessPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, identity, configurable, userGroups, accessPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
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

