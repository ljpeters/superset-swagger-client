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
 * DatabaseRelatedChart
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DatabaseRelatedChart {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("slice_name")
  private String sliceName = null;

  @SerializedName("viz_type")
  private String vizType = null;

  public DatabaseRelatedChart id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DatabaseRelatedChart sliceName(String sliceName) {
    this.sliceName = sliceName;
    return this;
  }

   /**
   * Get sliceName
   * @return sliceName
  **/
  @Schema(description = "")
  public String getSliceName() {
    return sliceName;
  }

  public void setSliceName(String sliceName) {
    this.sliceName = sliceName;
  }

  public DatabaseRelatedChart vizType(String vizType) {
    this.vizType = vizType;
    return this;
  }

   /**
   * Get vizType
   * @return vizType
  **/
  @Schema(description = "")
  public String getVizType() {
    return vizType;
  }

  public void setVizType(String vizType) {
    this.vizType = vizType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseRelatedChart databaseRelatedChart = (DatabaseRelatedChart) o;
    return Objects.equals(this.id, databaseRelatedChart.id) &&
        Objects.equals(this.sliceName, databaseRelatedChart.sliceName) &&
        Objects.equals(this.vizType, databaseRelatedChart.vizType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sliceName, vizType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseRelatedChart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sliceName: ").append(toIndentedString(sliceName)).append("\n");
    sb.append("    vizType: ").append(toIndentedString(vizType)).append("\n");
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
