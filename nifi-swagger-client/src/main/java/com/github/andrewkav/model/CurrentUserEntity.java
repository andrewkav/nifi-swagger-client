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
import com.github.andrewkav.model.ComponentRestrictionPermissionDTO;
import com.github.andrewkav.model.PermissionsDTO;
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
 * CurrentUserEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class CurrentUserEntity {
  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_ANONYMOUS = "anonymous";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS)
  private Boolean anonymous;

  public static final String SERIALIZED_NAME_PROVENANCE_PERMISSIONS = "provenancePermissions";
  @SerializedName(SERIALIZED_NAME_PROVENANCE_PERMISSIONS)
  private PermissionsDTO provenancePermissions = null;

  public static final String SERIALIZED_NAME_COUNTERS_PERMISSIONS = "countersPermissions";
  @SerializedName(SERIALIZED_NAME_COUNTERS_PERMISSIONS)
  private PermissionsDTO countersPermissions = null;

  public static final String SERIALIZED_NAME_TENANTS_PERMISSIONS = "tenantsPermissions";
  @SerializedName(SERIALIZED_NAME_TENANTS_PERMISSIONS)
  private PermissionsDTO tenantsPermissions = null;

  public static final String SERIALIZED_NAME_CONTROLLER_PERMISSIONS = "controllerPermissions";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_PERMISSIONS)
  private PermissionsDTO controllerPermissions = null;

  public static final String SERIALIZED_NAME_POLICIES_PERMISSIONS = "policiesPermissions";
  @SerializedName(SERIALIZED_NAME_POLICIES_PERMISSIONS)
  private PermissionsDTO policiesPermissions = null;

  public static final String SERIALIZED_NAME_SYSTEM_PERMISSIONS = "systemPermissions";
  @SerializedName(SERIALIZED_NAME_SYSTEM_PERMISSIONS)
  private PermissionsDTO systemPermissions = null;

  public static final String SERIALIZED_NAME_RESTRICTED_COMPONENTS_PERMISSIONS = "restrictedComponentsPermissions";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_COMPONENTS_PERMISSIONS)
  private PermissionsDTO restrictedComponentsPermissions = null;

  public static final String SERIALIZED_NAME_COMPONENT_RESTRICTION_PERMISSIONS = "componentRestrictionPermissions";
  @SerializedName(SERIALIZED_NAME_COMPONENT_RESTRICTION_PERMISSIONS)
  private List<ComponentRestrictionPermissionDTO> componentRestrictionPermissions = new ArrayList<ComponentRestrictionPermissionDTO>();

  public static final String SERIALIZED_NAME_CAN_VERSION_FLOWS = "canVersionFlows";
  @SerializedName(SERIALIZED_NAME_CAN_VERSION_FLOWS)
  private Boolean canVersionFlows;

  public CurrentUserEntity identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * The user identity being serialized.
   * @return identity
  **/
  @ApiModelProperty(value = "The user identity being serialized.")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public CurrentUserEntity anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Whether the current user is anonymous.
   * @return anonymous
  **/
  @ApiModelProperty(value = "Whether the current user is anonymous.")
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public CurrentUserEntity provenancePermissions(PermissionsDTO provenancePermissions) {
    this.provenancePermissions = provenancePermissions;
    return this;
  }

   /**
   * Get provenancePermissions
   * @return provenancePermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getProvenancePermissions() {
    return provenancePermissions;
  }

  public void setProvenancePermissions(PermissionsDTO provenancePermissions) {
    this.provenancePermissions = provenancePermissions;
  }

  public CurrentUserEntity countersPermissions(PermissionsDTO countersPermissions) {
    this.countersPermissions = countersPermissions;
    return this;
  }

   /**
   * Get countersPermissions
   * @return countersPermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getCountersPermissions() {
    return countersPermissions;
  }

  public void setCountersPermissions(PermissionsDTO countersPermissions) {
    this.countersPermissions = countersPermissions;
  }

  public CurrentUserEntity tenantsPermissions(PermissionsDTO tenantsPermissions) {
    this.tenantsPermissions = tenantsPermissions;
    return this;
  }

   /**
   * Get tenantsPermissions
   * @return tenantsPermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getTenantsPermissions() {
    return tenantsPermissions;
  }

  public void setTenantsPermissions(PermissionsDTO tenantsPermissions) {
    this.tenantsPermissions = tenantsPermissions;
  }

  public CurrentUserEntity controllerPermissions(PermissionsDTO controllerPermissions) {
    this.controllerPermissions = controllerPermissions;
    return this;
  }

   /**
   * Get controllerPermissions
   * @return controllerPermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getControllerPermissions() {
    return controllerPermissions;
  }

  public void setControllerPermissions(PermissionsDTO controllerPermissions) {
    this.controllerPermissions = controllerPermissions;
  }

  public CurrentUserEntity policiesPermissions(PermissionsDTO policiesPermissions) {
    this.policiesPermissions = policiesPermissions;
    return this;
  }

   /**
   * Get policiesPermissions
   * @return policiesPermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getPoliciesPermissions() {
    return policiesPermissions;
  }

  public void setPoliciesPermissions(PermissionsDTO policiesPermissions) {
    this.policiesPermissions = policiesPermissions;
  }

  public CurrentUserEntity systemPermissions(PermissionsDTO systemPermissions) {
    this.systemPermissions = systemPermissions;
    return this;
  }

   /**
   * Get systemPermissions
   * @return systemPermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getSystemPermissions() {
    return systemPermissions;
  }

  public void setSystemPermissions(PermissionsDTO systemPermissions) {
    this.systemPermissions = systemPermissions;
  }

  public CurrentUserEntity restrictedComponentsPermissions(PermissionsDTO restrictedComponentsPermissions) {
    this.restrictedComponentsPermissions = restrictedComponentsPermissions;
    return this;
  }

   /**
   * Get restrictedComponentsPermissions
   * @return restrictedComponentsPermissions
  **/
  @ApiModelProperty(value = "")
  public PermissionsDTO getRestrictedComponentsPermissions() {
    return restrictedComponentsPermissions;
  }

  public void setRestrictedComponentsPermissions(PermissionsDTO restrictedComponentsPermissions) {
    this.restrictedComponentsPermissions = restrictedComponentsPermissions;
  }

  public CurrentUserEntity componentRestrictionPermissions(List<ComponentRestrictionPermissionDTO> componentRestrictionPermissions) {
    this.componentRestrictionPermissions = componentRestrictionPermissions;
    return this;
  }

  public CurrentUserEntity addComponentRestrictionPermissionsItem(ComponentRestrictionPermissionDTO componentRestrictionPermissionsItem) {
    if (this.componentRestrictionPermissions == null) {
      this.componentRestrictionPermissions = new ArrayList<ComponentRestrictionPermissionDTO>();
    }
    this.componentRestrictionPermissions.add(componentRestrictionPermissionsItem);
    return this;
  }

   /**
   * Permissions for specific component restrictions.
   * @return componentRestrictionPermissions
  **/
  @ApiModelProperty(value = "Permissions for specific component restrictions.")
  public List<ComponentRestrictionPermissionDTO> getComponentRestrictionPermissions() {
    return componentRestrictionPermissions;
  }

  public void setComponentRestrictionPermissions(List<ComponentRestrictionPermissionDTO> componentRestrictionPermissions) {
    this.componentRestrictionPermissions = componentRestrictionPermissions;
  }

  public CurrentUserEntity canVersionFlows(Boolean canVersionFlows) {
    this.canVersionFlows = canVersionFlows;
    return this;
  }

   /**
   * Whether the current user can version flows.
   * @return canVersionFlows
  **/
  @ApiModelProperty(value = "Whether the current user can version flows.")
  public Boolean getCanVersionFlows() {
    return canVersionFlows;
  }

  public void setCanVersionFlows(Boolean canVersionFlows) {
    this.canVersionFlows = canVersionFlows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserEntity currentUserEntity = (CurrentUserEntity) o;
    return Objects.equals(this.identity, currentUserEntity.identity) &&
        Objects.equals(this.anonymous, currentUserEntity.anonymous) &&
        Objects.equals(this.provenancePermissions, currentUserEntity.provenancePermissions) &&
        Objects.equals(this.countersPermissions, currentUserEntity.countersPermissions) &&
        Objects.equals(this.tenantsPermissions, currentUserEntity.tenantsPermissions) &&
        Objects.equals(this.controllerPermissions, currentUserEntity.controllerPermissions) &&
        Objects.equals(this.policiesPermissions, currentUserEntity.policiesPermissions) &&
        Objects.equals(this.systemPermissions, currentUserEntity.systemPermissions) &&
        Objects.equals(this.restrictedComponentsPermissions, currentUserEntity.restrictedComponentsPermissions) &&
        Objects.equals(this.componentRestrictionPermissions, currentUserEntity.componentRestrictionPermissions) &&
        Objects.equals(this.canVersionFlows, currentUserEntity.canVersionFlows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, anonymous, provenancePermissions, countersPermissions, tenantsPermissions, controllerPermissions, policiesPermissions, systemPermissions, restrictedComponentsPermissions, componentRestrictionPermissions, canVersionFlows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserEntity {\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    provenancePermissions: ").append(toIndentedString(provenancePermissions)).append("\n");
    sb.append("    countersPermissions: ").append(toIndentedString(countersPermissions)).append("\n");
    sb.append("    tenantsPermissions: ").append(toIndentedString(tenantsPermissions)).append("\n");
    sb.append("    controllerPermissions: ").append(toIndentedString(controllerPermissions)).append("\n");
    sb.append("    policiesPermissions: ").append(toIndentedString(policiesPermissions)).append("\n");
    sb.append("    systemPermissions: ").append(toIndentedString(systemPermissions)).append("\n");
    sb.append("    restrictedComponentsPermissions: ").append(toIndentedString(restrictedComponentsPermissions)).append("\n");
    sb.append("    componentRestrictionPermissions: ").append(toIndentedString(componentRestrictionPermissions)).append("\n");
    sb.append("    canVersionFlows: ").append(toIndentedString(canVersionFlows)).append("\n");
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
