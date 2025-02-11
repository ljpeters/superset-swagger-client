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
 * ChartDataSortOptionsSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataSortOptionsSchema {
  @SerializedName("aggregates")
  private Object aggregates = null;

  @SerializedName("columns")
  private Object columns = null;

  public ChartDataSortOptionsSchema aggregates(Object aggregates) {
    this.aggregates = aggregates;
    return this;
  }

   /**
   * The keys are the name of the aggregate column to be created, and the values specify the details of how to apply the aggregation. If an operator requires additional options, these can be passed here to be unpacked in the operator call. The following numpy operators are supported: average, argmin, argmax, cumsum, cumprod, max, mean, median, nansum, nanmin, nanmax, nanmean, nanmedian, min, percentile, prod, product, std, sum, var. Any options required by the operator can be passed to the &#x60;options&#x60; object.  In the example, a new column &#x60;first_quantile&#x60; is created based on values in the column &#x60;my_col&#x60; using the &#x60;percentile&#x60; operator with the &#x60;q&#x3D;0.25&#x60; parameter.
   * @return aggregates
  **/
  @Schema(example = "{\"first_quantile\":{\"column\":\"my_col\",\"operator\":\"percentile\",\"options\":{\"q\":0.25}}}", description = "The keys are the name of the aggregate column to be created, and the values specify the details of how to apply the aggregation. If an operator requires additional options, these can be passed here to be unpacked in the operator call. The following numpy operators are supported: average, argmin, argmax, cumsum, cumprod, max, mean, median, nansum, nanmin, nanmax, nanmean, nanmedian, min, percentile, prod, product, std, sum, var. Any options required by the operator can be passed to the `options` object.  In the example, a new column `first_quantile` is created based on values in the column `my_col` using the `percentile` operator with the `q=0.25` parameter.")
  public Object getAggregates() {
    return aggregates;
  }

  public void setAggregates(Object aggregates) {
    this.aggregates = aggregates;
  }

  public ChartDataSortOptionsSchema columns(Object columns) {
    this.columns = columns;
    return this;
  }

   /**
   * columns by by which to sort. The key specifies the column name, value specifies if sorting in ascending order.
   * @return columns
  **/
  @Schema(example = "{\"country\":true,\"gender\":false}", required = true, description = "columns by by which to sort. The key specifies the column name, value specifies if sorting in ascending order.")
  public Object getColumns() {
    return columns;
  }

  public void setColumns(Object columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataSortOptionsSchema chartDataSortOptionsSchema = (ChartDataSortOptionsSchema) o;
    return Objects.equals(this.aggregates, chartDataSortOptionsSchema.aggregates) &&
        Objects.equals(this.columns, chartDataSortOptionsSchema.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, columns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataSortOptionsSchema {\n");
    
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
