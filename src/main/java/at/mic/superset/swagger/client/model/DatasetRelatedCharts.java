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
import at.mic.superset.swagger.client.model.DatasetRelatedChart;
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
 * DatasetRelatedCharts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DatasetRelatedCharts {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("result")
  private List<DatasetRelatedChart> result = null;

  public DatasetRelatedCharts count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Chart count
   * @return count
  **/
  @Schema(description = "Chart count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DatasetRelatedCharts result(List<DatasetRelatedChart> result) {
    this.result = result;
    return this;
  }

  public DatasetRelatedCharts addResultItem(DatasetRelatedChart resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<DatasetRelatedChart>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * A list of dashboards
   * @return result
  **/
  @Schema(description = "A list of dashboards")
  public List<DatasetRelatedChart> getResult() {
    return result;
  }

  public void setResult(List<DatasetRelatedChart> result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetRelatedCharts datasetRelatedCharts = (DatasetRelatedCharts) o;
    return Objects.equals(this.count, datasetRelatedCharts.count) &&
        Objects.equals(this.result, datasetRelatedCharts.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetRelatedCharts {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
