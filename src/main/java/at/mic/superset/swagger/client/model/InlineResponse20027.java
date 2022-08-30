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
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20027
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class InlineResponse20027 {
  @SerializedName("available_drivers")
  private List<String> availableDrivers = null;

  @SerializedName("default_driver")
  private String defaultDriver = null;

  @SerializedName("engine")
  private String engine = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parameters")
  private Object parameters = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  @SerializedName("sqlalchemy_uri_placeholder")
  private String sqlalchemyUriPlaceholder = null;

  public InlineResponse20027 availableDrivers(List<String> availableDrivers) {
    this.availableDrivers = availableDrivers;
    return this;
  }

  public InlineResponse20027 addAvailableDriversItem(String availableDriversItem) {
    if (this.availableDrivers == null) {
      this.availableDrivers = new ArrayList<String>();
    }
    this.availableDrivers.add(availableDriversItem);
    return this;
  }

   /**
   * Installed drivers for the engine
   * @return availableDrivers
  **/
  @Schema(description = "Installed drivers for the engine")
  public List<String> getAvailableDrivers() {
    return availableDrivers;
  }

  public void setAvailableDrivers(List<String> availableDrivers) {
    this.availableDrivers = availableDrivers;
  }

  public InlineResponse20027 defaultDriver(String defaultDriver) {
    this.defaultDriver = defaultDriver;
    return this;
  }

   /**
   * Default driver for the engine
   * @return defaultDriver
  **/
  @Schema(description = "Default driver for the engine")
  public String getDefaultDriver() {
    return defaultDriver;
  }

  public void setDefaultDriver(String defaultDriver) {
    this.defaultDriver = defaultDriver;
  }

  public InlineResponse20027 engine(String engine) {
    this.engine = engine;
    return this;
  }

   /**
   * Name of the SQLAlchemy engine
   * @return engine
  **/
  @Schema(description = "Name of the SQLAlchemy engine")
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public InlineResponse20027 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the database
   * @return name
  **/
  @Schema(description = "Name of the database")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20027 parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * JSON schema defining the needed parameters
   * @return parameters
  **/
  @Schema(description = "JSON schema defining the needed parameters")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public InlineResponse20027 preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * Is the database preferred?
   * @return preferred
  **/
  @Schema(description = "Is the database preferred?")
  public Boolean isPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public InlineResponse20027 sqlalchemyUriPlaceholder(String sqlalchemyUriPlaceholder) {
    this.sqlalchemyUriPlaceholder = sqlalchemyUriPlaceholder;
    return this;
  }

   /**
   * Example placeholder for the SQLAlchemy URI
   * @return sqlalchemyUriPlaceholder
  **/
  @Schema(description = "Example placeholder for the SQLAlchemy URI")
  public String getSqlalchemyUriPlaceholder() {
    return sqlalchemyUriPlaceholder;
  }

  public void setSqlalchemyUriPlaceholder(String sqlalchemyUriPlaceholder) {
    this.sqlalchemyUriPlaceholder = sqlalchemyUriPlaceholder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027 inlineResponse20027 = (InlineResponse20027) o;
    return Objects.equals(this.availableDrivers, inlineResponse20027.availableDrivers) &&
        Objects.equals(this.defaultDriver, inlineResponse20027.defaultDriver) &&
        Objects.equals(this.engine, inlineResponse20027.engine) &&
        Objects.equals(this.name, inlineResponse20027.name) &&
        Objects.equals(this.parameters, inlineResponse20027.parameters) &&
        Objects.equals(this.preferred, inlineResponse20027.preferred) &&
        Objects.equals(this.sqlalchemyUriPlaceholder, inlineResponse20027.sqlalchemyUriPlaceholder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableDrivers, defaultDriver, engine, name, parameters, preferred, sqlalchemyUriPlaceholder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027 {\n");
    
    sb.append("    availableDrivers: ").append(toIndentedString(availableDrivers)).append("\n");
    sb.append("    defaultDriver: ").append(toIndentedString(defaultDriver)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    sqlalchemyUriPlaceholder: ").append(toIndentedString(sqlalchemyUriPlaceholder)).append("\n");
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
