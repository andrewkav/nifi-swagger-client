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
 * ControllerServiceStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-24T10:52:32.266Z[GMT]")
public class ControllerServiceStatusDTO {
  /**
   * The run status of this ControllerService
   */
  @JsonAdapter(RunStatusEnum.Adapter.class)
  public enum RunStatusEnum {
    ENABLED("ENABLED"),
    
    ENABLING("ENABLING"),
    
    DISABLED("DISABLED"),
    
    DISABLING("DISABLING");

    private String value;

    RunStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunStatusEnum fromValue(String value) {
      for (RunStatusEnum b : RunStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RunStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RunStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RUN_STATUS = "runStatus";
  @SerializedName(SERIALIZED_NAME_RUN_STATUS)
  private RunStatusEnum runStatus;

  /**
   * Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)
   */
  @JsonAdapter(ValidationStatusEnum.Adapter.class)
  public enum ValidationStatusEnum {
    VALID("VALID"),
    
    INVALID("INVALID"),
    
    VALIDATING("VALIDATING");

    private String value;

    ValidationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationStatusEnum fromValue(String value) {
      for (ValidationStatusEnum b : ValidationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ValidationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private ValidationStatusEnum validationStatus;

  public static final String SERIALIZED_NAME_ACTIVE_THREAD_COUNT = "activeThreadCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THREAD_COUNT)
  private Integer activeThreadCount;

   /**
   * The run status of this ControllerService
   * @return runStatus
  **/
  @ApiModelProperty(value = "The run status of this ControllerService")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }

   /**
   * Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)
   * @return validationStatus
  **/
  @ApiModelProperty(value = "Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)")
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }

  public ControllerServiceStatusDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the component.
   * @return activeThreadCount
  **/
  @ApiModelProperty(value = "The number of active threads for the component.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceStatusDTO controllerServiceStatusDTO = (ControllerServiceStatusDTO) o;
    return Objects.equals(this.runStatus, controllerServiceStatusDTO.runStatus) &&
        Objects.equals(this.validationStatus, controllerServiceStatusDTO.validationStatus) &&
        Objects.equals(this.activeThreadCount, controllerServiceStatusDTO.activeThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runStatus, validationStatus, activeThreadCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceStatusDTO {\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
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

