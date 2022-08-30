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
 * ScreenshotQuerySchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ScreenshotQuerySchema {
  @SerializedName("force")
  private Boolean force = null;

  @SerializedName("thumb_size")
  private List<Integer> thumbSize = null;

  @SerializedName("window_size")
  private List<Integer> windowSize = null;

  public ScreenshotQuerySchema force(Boolean force) {
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @Schema(description = "")
  public Boolean isForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  public ScreenshotQuerySchema thumbSize(List<Integer> thumbSize) {
    this.thumbSize = thumbSize;
    return this;
  }

  public ScreenshotQuerySchema addThumbSizeItem(Integer thumbSizeItem) {
    if (this.thumbSize == null) {
      this.thumbSize = new ArrayList<Integer>();
    }
    this.thumbSize.add(thumbSizeItem);
    return this;
  }

   /**
   * Get thumbSize
   * @return thumbSize
  **/
  @Schema(description = "")
  public List<Integer> getThumbSize() {
    return thumbSize;
  }

  public void setThumbSize(List<Integer> thumbSize) {
    this.thumbSize = thumbSize;
  }

  public ScreenshotQuerySchema windowSize(List<Integer> windowSize) {
    this.windowSize = windowSize;
    return this;
  }

  public ScreenshotQuerySchema addWindowSizeItem(Integer windowSizeItem) {
    if (this.windowSize == null) {
      this.windowSize = new ArrayList<Integer>();
    }
    this.windowSize.add(windowSizeItem);
    return this;
  }

   /**
   * Get windowSize
   * @return windowSize
  **/
  @Schema(description = "")
  public List<Integer> getWindowSize() {
    return windowSize;
  }

  public void setWindowSize(List<Integer> windowSize) {
    this.windowSize = windowSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotQuerySchema screenshotQuerySchema = (ScreenshotQuerySchema) o;
    return Objects.equals(this.force, screenshotQuerySchema.force) &&
        Objects.equals(this.thumbSize, screenshotQuerySchema.thumbSize) &&
        Objects.equals(this.windowSize, screenshotQuerySchema.windowSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, thumbSize, windowSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotQuerySchema {\n");
    
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    thumbSize: ").append(toIndentedString(thumbSize)).append("\n");
    sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
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
