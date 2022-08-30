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
 * ChartDataContributionOptionsSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataContributionOptionsSchema {
  /**
   * Should cell values be calculated across the row or column.
   */
  @JsonAdapter(OrientationEnum.Adapter.class)
  public enum OrientationEnum {
    ROW("row"),
    COLUMN("column");

    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OrientationEnum fromValue(String input) {
      for (OrientationEnum b : OrientationEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OrientationEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OrientationEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("orientation")
  private OrientationEnum orientation = null;

  public ChartDataContributionOptionsSchema orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Should cell values be calculated across the row or column.
   * @return orientation
  **/
  @Schema(example = "row", required = true, description = "Should cell values be calculated across the row or column.")
  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataContributionOptionsSchema chartDataContributionOptionsSchema = (ChartDataContributionOptionsSchema) o;
    return Objects.equals(this.orientation, chartDataContributionOptionsSchema.orientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orientation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataContributionOptionsSchema {\n");
    
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
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
