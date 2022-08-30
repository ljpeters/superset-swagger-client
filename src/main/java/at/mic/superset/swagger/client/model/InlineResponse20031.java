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
import at.mic.superset.swagger.client.model.DatasetRestApiGetList;
import at.mic.superset.swagger.client.model.InlineResponse2001DescriptionColumns;
import at.mic.superset.swagger.client.model.InlineResponse2001LabelColumns;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20031
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class InlineResponse20031 {
  @SerializedName("count")
  private BigDecimal count = null;

  @SerializedName("description_columns")
  private InlineResponse2001DescriptionColumns descriptionColumns = null;

  @SerializedName("ids")
  private List<String> ids = null;

  @SerializedName("label_columns")
  private InlineResponse2001LabelColumns labelColumns = null;

  @SerializedName("list_columns")
  private List<String> listColumns = null;

  @SerializedName("list_title")
  private String listTitle = null;

  @SerializedName("order_columns")
  private List<String> orderColumns = null;

  @SerializedName("result")
  private List<DatasetRestApiGetList> result = null;

  public InlineResponse20031 count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * The total record count on the backend
   * @return count
  **/
  @Schema(description = "The total record count on the backend")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public InlineResponse20031 descriptionColumns(InlineResponse2001DescriptionColumns descriptionColumns) {
    this.descriptionColumns = descriptionColumns;
    return this;
  }

   /**
   * Get descriptionColumns
   * @return descriptionColumns
  **/
  @Schema(description = "")
  public InlineResponse2001DescriptionColumns getDescriptionColumns() {
    return descriptionColumns;
  }

  public void setDescriptionColumns(InlineResponse2001DescriptionColumns descriptionColumns) {
    this.descriptionColumns = descriptionColumns;
  }

  public InlineResponse20031 ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public InlineResponse20031 addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * A list of item ids, useful when you don&#x27;t know the column id
   * @return ids
  **/
  @Schema(description = "A list of item ids, useful when you don't know the column id")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public InlineResponse20031 labelColumns(InlineResponse2001LabelColumns labelColumns) {
    this.labelColumns = labelColumns;
    return this;
  }

   /**
   * Get labelColumns
   * @return labelColumns
  **/
  @Schema(description = "")
  public InlineResponse2001LabelColumns getLabelColumns() {
    return labelColumns;
  }

  public void setLabelColumns(InlineResponse2001LabelColumns labelColumns) {
    this.labelColumns = labelColumns;
  }

  public InlineResponse20031 listColumns(List<String> listColumns) {
    this.listColumns = listColumns;
    return this;
  }

  public InlineResponse20031 addListColumnsItem(String listColumnsItem) {
    if (this.listColumns == null) {
      this.listColumns = new ArrayList<String>();
    }
    this.listColumns.add(listColumnsItem);
    return this;
  }

   /**
   * A list of columns
   * @return listColumns
  **/
  @Schema(description = "A list of columns")
  public List<String> getListColumns() {
    return listColumns;
  }

  public void setListColumns(List<String> listColumns) {
    this.listColumns = listColumns;
  }

  public InlineResponse20031 listTitle(String listTitle) {
    this.listTitle = listTitle;
    return this;
  }

   /**
   * A title to render. Will be translated by babel
   * @return listTitle
  **/
  @Schema(example = "List Items", description = "A title to render. Will be translated by babel")
  public String getListTitle() {
    return listTitle;
  }

  public void setListTitle(String listTitle) {
    this.listTitle = listTitle;
  }

  public InlineResponse20031 orderColumns(List<String> orderColumns) {
    this.orderColumns = orderColumns;
    return this;
  }

  public InlineResponse20031 addOrderColumnsItem(String orderColumnsItem) {
    if (this.orderColumns == null) {
      this.orderColumns = new ArrayList<String>();
    }
    this.orderColumns.add(orderColumnsItem);
    return this;
  }

   /**
   * A list of allowed columns to sort
   * @return orderColumns
  **/
  @Schema(description = "A list of allowed columns to sort")
  public List<String> getOrderColumns() {
    return orderColumns;
  }

  public void setOrderColumns(List<String> orderColumns) {
    this.orderColumns = orderColumns;
  }

  public InlineResponse20031 result(List<DatasetRestApiGetList> result) {
    this.result = result;
    return this;
  }

  public InlineResponse20031 addResultItem(DatasetRestApiGetList resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<DatasetRestApiGetList>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * The result from the get list query
   * @return result
  **/
  @Schema(description = "The result from the get list query")
  public List<DatasetRestApiGetList> getResult() {
    return result;
  }

  public void setResult(List<DatasetRestApiGetList> result) {
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
    InlineResponse20031 inlineResponse20031 = (InlineResponse20031) o;
    return Objects.equals(this.count, inlineResponse20031.count) &&
        Objects.equals(this.descriptionColumns, inlineResponse20031.descriptionColumns) &&
        Objects.equals(this.ids, inlineResponse20031.ids) &&
        Objects.equals(this.labelColumns, inlineResponse20031.labelColumns) &&
        Objects.equals(this.listColumns, inlineResponse20031.listColumns) &&
        Objects.equals(this.listTitle, inlineResponse20031.listTitle) &&
        Objects.equals(this.orderColumns, inlineResponse20031.orderColumns) &&
        Objects.equals(this.result, inlineResponse20031.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, descriptionColumns, ids, labelColumns, listColumns, listTitle, orderColumns, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20031 {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    descriptionColumns: ").append(toIndentedString(descriptionColumns)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    labelColumns: ").append(toIndentedString(labelColumns)).append("\n");
    sb.append("    listColumns: ").append(toIndentedString(listColumns)).append("\n");
    sb.append("    listTitle: ").append(toIndentedString(listTitle)).append("\n");
    sb.append("    orderColumns: ").append(toIndentedString(orderColumns)).append("\n");
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
