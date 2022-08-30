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
 * ChartCacheScreenshotResponseSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartCacheScreenshotResponseSchema {
  @SerializedName("cache_key")
  private String cacheKey = null;

  @SerializedName("chart_url")
  private String chartUrl = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  public ChartCacheScreenshotResponseSchema cacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
    return this;
  }

   /**
   * The cache key
   * @return cacheKey
  **/
  @Schema(description = "The cache key")
  public String getCacheKey() {
    return cacheKey;
  }

  public void setCacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
  }

  public ChartCacheScreenshotResponseSchema chartUrl(String chartUrl) {
    this.chartUrl = chartUrl;
    return this;
  }

   /**
   * The url to render the chart
   * @return chartUrl
  **/
  @Schema(description = "The url to render the chart")
  public String getChartUrl() {
    return chartUrl;
  }

  public void setChartUrl(String chartUrl) {
    this.chartUrl = chartUrl;
  }

  public ChartCacheScreenshotResponseSchema imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The url to fetch the screenshot
   * @return imageUrl
  **/
  @Schema(description = "The url to fetch the screenshot")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartCacheScreenshotResponseSchema chartCacheScreenshotResponseSchema = (ChartCacheScreenshotResponseSchema) o;
    return Objects.equals(this.cacheKey, chartCacheScreenshotResponseSchema.cacheKey) &&
        Objects.equals(this.chartUrl, chartCacheScreenshotResponseSchema.chartUrl) &&
        Objects.equals(this.imageUrl, chartCacheScreenshotResponseSchema.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheKey, chartUrl, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartCacheScreenshotResponseSchema {\n");
    
    sb.append("    cacheKey: ").append(toIndentedString(cacheKey)).append("\n");
    sb.append("    chartUrl: ").append(toIndentedString(chartUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
