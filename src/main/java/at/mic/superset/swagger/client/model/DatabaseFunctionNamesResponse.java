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
 * DatabaseFunctionNamesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DatabaseFunctionNamesResponse {
  @SerializedName("function_names")
  private List<String> functionNames = null;

  public DatabaseFunctionNamesResponse functionNames(List<String> functionNames) {
    this.functionNames = functionNames;
    return this;
  }

  public DatabaseFunctionNamesResponse addFunctionNamesItem(String functionNamesItem) {
    if (this.functionNames == null) {
      this.functionNames = new ArrayList<String>();
    }
    this.functionNames.add(functionNamesItem);
    return this;
  }

   /**
   * Get functionNames
   * @return functionNames
  **/
  @Schema(description = "")
  public List<String> getFunctionNames() {
    return functionNames;
  }

  public void setFunctionNames(List<String> functionNames) {
    this.functionNames = functionNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseFunctionNamesResponse databaseFunctionNamesResponse = (DatabaseFunctionNamesResponse) o;
    return Objects.equals(this.functionNames, databaseFunctionNamesResponse.functionNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseFunctionNamesResponse {\n");
    
    sb.append("    functionNames: ").append(toIndentedString(functionNames)).append("\n");
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
