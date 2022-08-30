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
import at.mic.superset.swagger.client.model.ChartDataColumn;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ChartDataAdhocMetricSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataAdhocMetricSchema {
  /**
   * Aggregation operator. Only required for simple expression types.
   */
  @JsonAdapter(AggregateEnum.Adapter.class)
  public enum AggregateEnum {
    AVG("AVG"),
    COUNT("COUNT"),
    COUNT_DISTINCT("COUNT_DISTINCT"),
    MAX("MAX"),
    MIN("MIN"),
    SUM("SUM");

    private String value;

    AggregateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AggregateEnum fromValue(String input) {
      for (AggregateEnum b : AggregateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AggregateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AggregateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AggregateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("aggregate")
  private AggregateEnum aggregate = null;

  @SerializedName("column")
  private ChartDataColumn column = null;

  /**
   * Simple or SQL metric
   */
  @JsonAdapter(ExpressionTypeEnum.Adapter.class)
  public enum ExpressionTypeEnum {
    SIMPLE("SIMPLE"),
    SQL("SQL");

    private String value;

    ExpressionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExpressionTypeEnum fromValue(String input) {
      for (ExpressionTypeEnum b : ExpressionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExpressionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpressionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ExpressionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ExpressionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("expressionType")
  private ExpressionTypeEnum expressionType = null;

  @SerializedName("hasCustomLabel")
  private Boolean hasCustomLabel = null;

  @SerializedName("isExtra")
  private Boolean isExtra = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("optionName")
  private String optionName = null;

  @SerializedName("sqlExpression")
  private String sqlExpression = null;

  @SerializedName("timeGrain")
  private String timeGrain = null;

  public ChartDataAdhocMetricSchema aggregate(AggregateEnum aggregate) {
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Aggregation operator. Only required for simple expression types.
   * @return aggregate
  **/
  @Schema(description = "Aggregation operator. Only required for simple expression types.")
  public AggregateEnum getAggregate() {
    return aggregate;
  }

  public void setAggregate(AggregateEnum aggregate) {
    this.aggregate = aggregate;
  }

  public ChartDataAdhocMetricSchema column(ChartDataColumn column) {
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @Schema(description = "")
  public ChartDataColumn getColumn() {
    return column;
  }

  public void setColumn(ChartDataColumn column) {
    this.column = column;
  }

  public ChartDataAdhocMetricSchema expressionType(ExpressionTypeEnum expressionType) {
    this.expressionType = expressionType;
    return this;
  }

   /**
   * Simple or SQL metric
   * @return expressionType
  **/
  @Schema(example = "SQL", required = true, description = "Simple or SQL metric")
  public ExpressionTypeEnum getExpressionType() {
    return expressionType;
  }

  public void setExpressionType(ExpressionTypeEnum expressionType) {
    this.expressionType = expressionType;
  }

  public ChartDataAdhocMetricSchema hasCustomLabel(Boolean hasCustomLabel) {
    this.hasCustomLabel = hasCustomLabel;
    return this;
  }

   /**
   * When false, the label will be automatically generated based on the aggregate expression. When true, a custom label has to be specified.
   * @return hasCustomLabel
  **/
  @Schema(example = "true", description = "When false, the label will be automatically generated based on the aggregate expression. When true, a custom label has to be specified.")
  public Boolean isHasCustomLabel() {
    return hasCustomLabel;
  }

  public void setHasCustomLabel(Boolean hasCustomLabel) {
    this.hasCustomLabel = hasCustomLabel;
  }

  public ChartDataAdhocMetricSchema isExtra(Boolean isExtra) {
    this.isExtra = isExtra;
    return this;
  }

   /**
   * Indicates if the filter has been added by a filter component as opposed to being a part of the original query.
   * @return isExtra
  **/
  @Schema(description = "Indicates if the filter has been added by a filter component as opposed to being a part of the original query.")
  public Boolean isIsExtra() {
    return isExtra;
  }

  public void setIsExtra(Boolean isExtra) {
    this.isExtra = isExtra;
  }

  public ChartDataAdhocMetricSchema label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label for the metric. Is automatically generated unless hasCustomLabel is true, in which case label must be defined.
   * @return label
  **/
  @Schema(example = "Weighted observations", description = "Label for the metric. Is automatically generated unless hasCustomLabel is true, in which case label must be defined.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ChartDataAdhocMetricSchema optionName(String optionName) {
    this.optionName = optionName;
    return this;
  }

   /**
   * Unique identifier. Can be any string value, as long as all metrics have a unique identifier. If undefined, a random name will be generated.
   * @return optionName
  **/
  @Schema(example = "metric_aec60732-fac0-4b17-b736-93f1a5c93e30", description = "Unique identifier. Can be any string value, as long as all metrics have a unique identifier. If undefined, a random name will be generated.")
  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  public ChartDataAdhocMetricSchema sqlExpression(String sqlExpression) {
    this.sqlExpression = sqlExpression;
    return this;
  }

   /**
   * The metric as defined by a SQL aggregate expression. Only required for SQL expression type.
   * @return sqlExpression
  **/
  @Schema(example = "SUM(weight * observations) / SUM(weight)", description = "The metric as defined by a SQL aggregate expression. Only required for SQL expression type.")
  public String getSqlExpression() {
    return sqlExpression;
  }

  public void setSqlExpression(String sqlExpression) {
    this.sqlExpression = sqlExpression;
  }

  public ChartDataAdhocMetricSchema timeGrain(String timeGrain) {
    this.timeGrain = timeGrain;
    return this;
  }

   /**
   * Optional time grain for temporal filters
   * @return timeGrain
  **/
  @Schema(example = "PT1M", description = "Optional time grain for temporal filters")
  public String getTimeGrain() {
    return timeGrain;
  }

  public void setTimeGrain(String timeGrain) {
    this.timeGrain = timeGrain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataAdhocMetricSchema chartDataAdhocMetricSchema = (ChartDataAdhocMetricSchema) o;
    return Objects.equals(this.aggregate, chartDataAdhocMetricSchema.aggregate) &&
        Objects.equals(this.column, chartDataAdhocMetricSchema.column) &&
        Objects.equals(this.expressionType, chartDataAdhocMetricSchema.expressionType) &&
        Objects.equals(this.hasCustomLabel, chartDataAdhocMetricSchema.hasCustomLabel) &&
        Objects.equals(this.isExtra, chartDataAdhocMetricSchema.isExtra) &&
        Objects.equals(this.label, chartDataAdhocMetricSchema.label) &&
        Objects.equals(this.optionName, chartDataAdhocMetricSchema.optionName) &&
        Objects.equals(this.sqlExpression, chartDataAdhocMetricSchema.sqlExpression) &&
        Objects.equals(this.timeGrain, chartDataAdhocMetricSchema.timeGrain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregate, column, expressionType, hasCustomLabel, isExtra, label, optionName, sqlExpression, timeGrain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataAdhocMetricSchema {\n");
    
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    expressionType: ").append(toIndentedString(expressionType)).append("\n");
    sb.append("    hasCustomLabel: ").append(toIndentedString(hasCustomLabel)).append("\n");
    sb.append("    isExtra: ").append(toIndentedString(isExtra)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    optionName: ").append(toIndentedString(optionName)).append("\n");
    sb.append("    sqlExpression: ").append(toIndentedString(sqlExpression)).append("\n");
    sb.append("    timeGrain: ").append(toIndentedString(timeGrain)).append("\n");
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
