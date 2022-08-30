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
import at.mic.superset.swagger.client.model.DatabaseRestApiGetListUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DatabaseRestApiGetList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DatabaseRestApiGetList {
  @SerializedName("allow_ctas")
  private Boolean allowCtas = null;

  @SerializedName("allow_cvas")
  private Boolean allowCvas = null;

  @SerializedName("allow_dml")
  private Boolean allowDml = null;

  @SerializedName("allow_file_upload")
  private Boolean allowFileUpload = null;

  @SerializedName("allow_multi_schema_metadata_fetch")
  private Boolean allowMultiSchemaMetadataFetch = null;

  @SerializedName("allow_run_async")
  private Boolean allowRunAsync = null;

  @SerializedName("allows_cost_estimate")
  private Object allowsCostEstimate = null;

  @SerializedName("allows_subquery")
  private Object allowsSubquery = null;

  @SerializedName("allows_virtual_table_explore")
  private Object allowsVirtualTableExplore = null;

  @SerializedName("backend")
  private Object backend = null;

  @SerializedName("changed_on")
  private OffsetDateTime changedOn = null;

  @SerializedName("changed_on_delta_humanized")
  private Object changedOnDeltaHumanized = null;

  @SerializedName("created_by")
  private DatabaseRestApiGetListUser createdBy = null;

  @SerializedName("database_name")
  private String databaseName = null;

  @SerializedName("disable_data_preview")
  private Object disableDataPreview = null;

  @SerializedName("explore_database_id")
  private Object exploreDatabaseId = null;

  @SerializedName("expose_in_sqllab")
  private Boolean exposeInSqllab = null;

  @SerializedName("extra")
  private String extra = null;

  @SerializedName("force_ctas_schema")
  private String forceCtasSchema = null;

  @SerializedName("id")
  private Integer id = null;

  public DatabaseRestApiGetList allowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
    return this;
  }

   /**
   * Get allowCtas
   * @return allowCtas
  **/
  @Schema(description = "")
  public Boolean isAllowCtas() {
    return allowCtas;
  }

  public void setAllowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
  }

  public DatabaseRestApiGetList allowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
    return this;
  }

   /**
   * Get allowCvas
   * @return allowCvas
  **/
  @Schema(description = "")
  public Boolean isAllowCvas() {
    return allowCvas;
  }

  public void setAllowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
  }

  public DatabaseRestApiGetList allowDml(Boolean allowDml) {
    this.allowDml = allowDml;
    return this;
  }

   /**
   * Get allowDml
   * @return allowDml
  **/
  @Schema(description = "")
  public Boolean isAllowDml() {
    return allowDml;
  }

  public void setAllowDml(Boolean allowDml) {
    this.allowDml = allowDml;
  }

  public DatabaseRestApiGetList allowFileUpload(Boolean allowFileUpload) {
    this.allowFileUpload = allowFileUpload;
    return this;
  }

   /**
   * Get allowFileUpload
   * @return allowFileUpload
  **/
  @Schema(description = "")
  public Boolean isAllowFileUpload() {
    return allowFileUpload;
  }

  public void setAllowFileUpload(Boolean allowFileUpload) {
    this.allowFileUpload = allowFileUpload;
  }

  public DatabaseRestApiGetList allowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
    return this;
  }

   /**
   * Get allowMultiSchemaMetadataFetch
   * @return allowMultiSchemaMetadataFetch
  **/
  @Schema(description = "")
  public Boolean isAllowMultiSchemaMetadataFetch() {
    return allowMultiSchemaMetadataFetch;
  }

  public void setAllowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
  }

  public DatabaseRestApiGetList allowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
    return this;
  }

   /**
   * Get allowRunAsync
   * @return allowRunAsync
  **/
  @Schema(description = "")
  public Boolean isAllowRunAsync() {
    return allowRunAsync;
  }

  public void setAllowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
  }

   /**
   * Get allowsCostEstimate
   * @return allowsCostEstimate
  **/
  @Schema(description = "")
  public Object getAllowsCostEstimate() {
    return allowsCostEstimate;
  }

   /**
   * Get allowsSubquery
   * @return allowsSubquery
  **/
  @Schema(description = "")
  public Object getAllowsSubquery() {
    return allowsSubquery;
  }

   /**
   * Get allowsVirtualTableExplore
   * @return allowsVirtualTableExplore
  **/
  @Schema(description = "")
  public Object getAllowsVirtualTableExplore() {
    return allowsVirtualTableExplore;
  }

   /**
   * Get backend
   * @return backend
  **/
  @Schema(description = "")
  public Object getBackend() {
    return backend;
  }

  public DatabaseRestApiGetList changedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
    return this;
  }

   /**
   * Get changedOn
   * @return changedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
  }

   /**
   * Get changedOnDeltaHumanized
   * @return changedOnDeltaHumanized
  **/
  @Schema(description = "")
  public Object getChangedOnDeltaHumanized() {
    return changedOnDeltaHumanized;
  }

  public DatabaseRestApiGetList createdBy(DatabaseRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public DatabaseRestApiGetListUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(DatabaseRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
  }

  public DatabaseRestApiGetList databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @Schema(required = true, description = "")
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

   /**
   * Get disableDataPreview
   * @return disableDataPreview
  **/
  @Schema(description = "")
  public Object getDisableDataPreview() {
    return disableDataPreview;
  }

   /**
   * Get exploreDatabaseId
   * @return exploreDatabaseId
  **/
  @Schema(description = "")
  public Object getExploreDatabaseId() {
    return exploreDatabaseId;
  }

  public DatabaseRestApiGetList exposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
    return this;
  }

   /**
   * Get exposeInSqllab
   * @return exposeInSqllab
  **/
  @Schema(description = "")
  public Boolean isExposeInSqllab() {
    return exposeInSqllab;
  }

  public void setExposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
  }

  public DatabaseRestApiGetList extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public DatabaseRestApiGetList forceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
    return this;
  }

   /**
   * Get forceCtasSchema
   * @return forceCtasSchema
  **/
  @Schema(description = "")
  public String getForceCtasSchema() {
    return forceCtasSchema;
  }

  public void setForceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
  }

  public DatabaseRestApiGetList id(Integer id) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseRestApiGetList databaseRestApiGetList = (DatabaseRestApiGetList) o;
    return Objects.equals(this.allowCtas, databaseRestApiGetList.allowCtas) &&
        Objects.equals(this.allowCvas, databaseRestApiGetList.allowCvas) &&
        Objects.equals(this.allowDml, databaseRestApiGetList.allowDml) &&
        Objects.equals(this.allowFileUpload, databaseRestApiGetList.allowFileUpload) &&
        Objects.equals(this.allowMultiSchemaMetadataFetch, databaseRestApiGetList.allowMultiSchemaMetadataFetch) &&
        Objects.equals(this.allowRunAsync, databaseRestApiGetList.allowRunAsync) &&
        Objects.equals(this.allowsCostEstimate, databaseRestApiGetList.allowsCostEstimate) &&
        Objects.equals(this.allowsSubquery, databaseRestApiGetList.allowsSubquery) &&
        Objects.equals(this.allowsVirtualTableExplore, databaseRestApiGetList.allowsVirtualTableExplore) &&
        Objects.equals(this.backend, databaseRestApiGetList.backend) &&
        Objects.equals(this.changedOn, databaseRestApiGetList.changedOn) &&
        Objects.equals(this.changedOnDeltaHumanized, databaseRestApiGetList.changedOnDeltaHumanized) &&
        Objects.equals(this.createdBy, databaseRestApiGetList.createdBy) &&
        Objects.equals(this.databaseName, databaseRestApiGetList.databaseName) &&
        Objects.equals(this.disableDataPreview, databaseRestApiGetList.disableDataPreview) &&
        Objects.equals(this.exploreDatabaseId, databaseRestApiGetList.exploreDatabaseId) &&
        Objects.equals(this.exposeInSqllab, databaseRestApiGetList.exposeInSqllab) &&
        Objects.equals(this.extra, databaseRestApiGetList.extra) &&
        Objects.equals(this.forceCtasSchema, databaseRestApiGetList.forceCtasSchema) &&
        Objects.equals(this.id, databaseRestApiGetList.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCtas, allowCvas, allowDml, allowFileUpload, allowMultiSchemaMetadataFetch, allowRunAsync, allowsCostEstimate, allowsSubquery, allowsVirtualTableExplore, backend, changedOn, changedOnDeltaHumanized, createdBy, databaseName, disableDataPreview, exploreDatabaseId, exposeInSqllab, extra, forceCtasSchema, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseRestApiGetList {\n");
    
    sb.append("    allowCtas: ").append(toIndentedString(allowCtas)).append("\n");
    sb.append("    allowCvas: ").append(toIndentedString(allowCvas)).append("\n");
    sb.append("    allowDml: ").append(toIndentedString(allowDml)).append("\n");
    sb.append("    allowFileUpload: ").append(toIndentedString(allowFileUpload)).append("\n");
    sb.append("    allowMultiSchemaMetadataFetch: ").append(toIndentedString(allowMultiSchemaMetadataFetch)).append("\n");
    sb.append("    allowRunAsync: ").append(toIndentedString(allowRunAsync)).append("\n");
    sb.append("    allowsCostEstimate: ").append(toIndentedString(allowsCostEstimate)).append("\n");
    sb.append("    allowsSubquery: ").append(toIndentedString(allowsSubquery)).append("\n");
    sb.append("    allowsVirtualTableExplore: ").append(toIndentedString(allowsVirtualTableExplore)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    disableDataPreview: ").append(toIndentedString(disableDataPreview)).append("\n");
    sb.append("    exploreDatabaseId: ").append(toIndentedString(exploreDatabaseId)).append("\n");
    sb.append("    exposeInSqllab: ").append(toIndentedString(exposeInSqllab)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    forceCtasSchema: ").append(toIndentedString(forceCtasSchema)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
