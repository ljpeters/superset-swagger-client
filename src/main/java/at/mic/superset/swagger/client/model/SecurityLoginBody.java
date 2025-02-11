/*
 * Superset
 * Superset
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package at.mic.superset.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SecurityLoginBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class SecurityLoginBody {
  @SerializedName("password")
  private String password = null;

  /**
   * Choose an authentication provider
   */
  @JsonAdapter(ProviderEnum.Adapter.class)
  public enum ProviderEnum {
    DB("db"),
    LDAP("ldap");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProviderEnum fromValue(String input) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProviderEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProviderEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("provider")
  private ProviderEnum provider = null;

  @SerializedName("refresh")
  private Boolean refresh = null;

  @SerializedName("username")
  private String username = null;

  public SecurityLoginBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for authentication
   * @return password
  **/
  @Schema(example = "complex-password", description = "The password for authentication")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SecurityLoginBody provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Choose an authentication provider
   * @return provider
  **/
  @Schema(example = "db", description = "Choose an authentication provider")
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public SecurityLoginBody refresh(Boolean refresh) {
    this.refresh = refresh;
    return this;
  }

   /**
   * If true a refresh token is provided also
   * @return refresh
  **/
  @Schema(example = "true", description = "If true a refresh token is provided also")
  public Boolean isRefresh() {
    return refresh;
  }

  public void setRefresh(Boolean refresh) {
    this.refresh = refresh;
  }

  public SecurityLoginBody username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username for authentication
   * @return username
  **/
  @Schema(example = "admin", description = "The username for authentication")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLoginBody securityLoginBody = (SecurityLoginBody) o;
    return Objects.equals(this.password, securityLoginBody.password) &&
        Objects.equals(this.provider, securityLoginBody.provider) &&
        Objects.equals(this.refresh, securityLoginBody.refresh) &&
        Objects.equals(this.username, securityLoginBody.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, provider, refresh, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLoginBody {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
