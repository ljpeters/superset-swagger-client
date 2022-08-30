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
 * ChartDataGeohashEncodeOptionsSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataGeohashEncodeOptionsSchema {
  @SerializedName("geohash")
  private String geohash = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  public ChartDataGeohashEncodeOptionsSchema geohash(String geohash) {
    this.geohash = geohash;
    return this;
  }

   /**
   * Name of target column for encoded geohash string
   * @return geohash
  **/
  @Schema(required = true, description = "Name of target column for encoded geohash string")
  public String getGeohash() {
    return geohash;
  }

  public void setGeohash(String geohash) {
    this.geohash = geohash;
  }

  public ChartDataGeohashEncodeOptionsSchema latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Name of source latitude column
   * @return latitude
  **/
  @Schema(required = true, description = "Name of source latitude column")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public ChartDataGeohashEncodeOptionsSchema longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Name of source longitude column
   * @return longitude
  **/
  @Schema(required = true, description = "Name of source longitude column")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataGeohashEncodeOptionsSchema chartDataGeohashEncodeOptionsSchema = (ChartDataGeohashEncodeOptionsSchema) o;
    return Objects.equals(this.geohash, chartDataGeohashEncodeOptionsSchema.geohash) &&
        Objects.equals(this.latitude, chartDataGeohashEncodeOptionsSchema.latitude) &&
        Objects.equals(this.longitude, chartDataGeohashEncodeOptionsSchema.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geohash, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataGeohashEncodeOptionsSchema {\n");
    
    sb.append("    geohash: ").append(toIndentedString(geohash)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
