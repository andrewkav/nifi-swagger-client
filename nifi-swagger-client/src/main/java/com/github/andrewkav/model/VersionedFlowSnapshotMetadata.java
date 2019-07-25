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
import com.github.andrewkav.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VersionedFlowSnapshotMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class VersionedFlowSnapshotMetadata {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link = null;

  public static final String SERIALIZED_NAME_BUCKET_IDENTIFIER = "bucketIdentifier";
  @SerializedName(SERIALIZED_NAME_BUCKET_IDENTIFIER)
  private String bucketIdentifier;

  public static final String SERIALIZED_NAME_FLOW_IDENTIFIER = "flowIdentifier";
  @SerializedName(SERIALIZED_NAME_FLOW_IDENTIFIER)
  private String flowIdentifier;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public VersionedFlowSnapshotMetadata link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public VersionedFlowSnapshotMetadata bucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
    return this;
  }

   /**
   * The identifier of the bucket this snapshot belongs to.
   * @return bucketIdentifier
  **/
  @ApiModelProperty(required = true, value = "The identifier of the bucket this snapshot belongs to.")
  public String getBucketIdentifier() {
    return bucketIdentifier;
  }

  public void setBucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
  }

  public VersionedFlowSnapshotMetadata flowIdentifier(String flowIdentifier) {
    this.flowIdentifier = flowIdentifier;
    return this;
  }

   /**
   * The identifier of the flow this snapshot belongs to.
   * @return flowIdentifier
  **/
  @ApiModelProperty(required = true, value = "The identifier of the flow this snapshot belongs to.")
  public String getFlowIdentifier() {
    return flowIdentifier;
  }

  public void setFlowIdentifier(String flowIdentifier) {
    this.flowIdentifier = flowIdentifier;
  }

  public VersionedFlowSnapshotMetadata version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version of this snapshot of the flow.
   * minimum: 1
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of this snapshot of the flow.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

   /**
   * The timestamp when the flow was saved, as milliseconds since epoch.
   * minimum: 1
   * @return timestamp
  **/
  @ApiModelProperty(value = "The timestamp when the flow was saved, as milliseconds since epoch.")
  public Long getTimestamp() {
    return timestamp;
  }

   /**
   * The user that created this snapshot of the flow.
   * @return author
  **/
  @ApiModelProperty(value = "The user that created this snapshot of the flow.")
  public String getAuthor() {
    return author;
  }

  public VersionedFlowSnapshotMetadata comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments provided by the user when creating the snapshot.
   * @return comments
  **/
  @ApiModelProperty(value = "The comments provided by the user when creating the snapshot.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowSnapshotMetadata versionedFlowSnapshotMetadata = (VersionedFlowSnapshotMetadata) o;
    return Objects.equals(this.link, versionedFlowSnapshotMetadata.link) &&
        Objects.equals(this.bucketIdentifier, versionedFlowSnapshotMetadata.bucketIdentifier) &&
        Objects.equals(this.flowIdentifier, versionedFlowSnapshotMetadata.flowIdentifier) &&
        Objects.equals(this.version, versionedFlowSnapshotMetadata.version) &&
        Objects.equals(this.timestamp, versionedFlowSnapshotMetadata.timestamp) &&
        Objects.equals(this.author, versionedFlowSnapshotMetadata.author) &&
        Objects.equals(this.comments, versionedFlowSnapshotMetadata.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, bucketIdentifier, flowIdentifier, version, timestamp, author, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowSnapshotMetadata {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    bucketIdentifier: ").append(toIndentedString(bucketIdentifier)).append("\n");
    sb.append("    flowIdentifier: ").append(toIndentedString(flowIdentifier)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
