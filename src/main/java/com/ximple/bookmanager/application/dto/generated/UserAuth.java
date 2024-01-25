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
 * UserAuth
 */
@lombok.Data
@lombok.Builder
@lombok.Getter
@lombok.AllArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T17:58:21.952677-06:00[America/Mexico_City]")
public class UserAuth {

  private Optional<String> username = Optional.empty();

  private Optional<String> token = Optional.empty();

  public UserAuth username(String username) {
    this.username = Optional.of(username);
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", example = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public Optional<String> getUsername() {
    return username;
  }

  public void setUsername(Optional<String> username) {
    this.username = username;
  }

  public UserAuth token(String token) {
    this.token = Optional.of(token);
    return this;
  }

  /**
   * Get token
   * @return token
  */
  
  @Schema(name = "token", example = "=123312zxc1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public Optional<String> getToken() {
    return token;
  }

  public void setToken(Optional<String> token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuth userAuth = (UserAuth) o;
    return Objects.equals(this.username, userAuth.username) &&
        Objects.equals(this.token, userAuth.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuth {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

