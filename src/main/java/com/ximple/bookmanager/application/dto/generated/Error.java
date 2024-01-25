package com.ximple.bookmanager.application.dto.generated;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Error
 */
@lombok.Data
@lombok.Builder
@lombok.Getter
@lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T17:58:21.952677-06:00[America/Mexico_City]")
public class Error {

  private Optional<String> errorCode = Optional.empty();

  private Optional<String> errorDescription = Optional.empty();

  private Optional<String> timestamp = Optional.empty();

  public Error errorCode(String errorCode) {
    this.errorCode = Optional.of(errorCode);
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  
  @Schema(name = "error_code", example = "ERR-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_code")
  public Optional<String> getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Optional<String> errorCode) {
    this.errorCode = errorCode;
  }

  public Error errorDescription(String errorDescription) {
    this.errorDescription = Optional.of(errorDescription);
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
  */
  
  @Schema(name = "error_description", example = "This is an error message example", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_description")
  public Optional<String> getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(Optional<String> errorDescription) {
    this.errorDescription = errorDescription;
  }

  public Error timestamp(String timestamp) {
    this.timestamp = Optional.of(timestamp);
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  
  @Schema(name = "timestamp", example = "2024-01-24T20:00:50.283+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public Optional<String> getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Optional<String> timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.errorDescription, error.errorDescription) &&
        Objects.equals(this.timestamp, error.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

