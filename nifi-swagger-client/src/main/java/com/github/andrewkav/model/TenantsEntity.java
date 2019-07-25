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
 * TenantsEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class TenantsEntity {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<TenantEntity> users = new ArrayList<TenantEntity>();

  public static final String SERIALIZED_NAME_USER_GROUPS = "userGroups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  private List<TenantEntity> userGroups = new ArrayList<TenantEntity>();

  public TenantsEntity users(List<TenantEntity> users) {
    this.users = users;
    return this;
  }

  public TenantsEntity addUsersItem(TenantEntity usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<TenantEntity>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<TenantEntity> getUsers() {
    return users;
  }

  public void setUsers(List<TenantEntity> users) {
    this.users = users;
  }

  public TenantsEntity userGroups(List<TenantEntity> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public TenantsEntity addUserGroupsItem(TenantEntity userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<TenantEntity>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @ApiModelProperty(value = "")
  public List<TenantEntity> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<TenantEntity> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantsEntity tenantsEntity = (TenantsEntity) o;
    return Objects.equals(this.users, tenantsEntity.users) &&
        Objects.equals(this.userGroups, tenantsEntity.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, userGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantsEntity {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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

