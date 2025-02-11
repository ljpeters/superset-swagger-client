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

import java.util.List;
import java.util.Objects;
import java.util.Arrays;
import at.mic.superset.swagger.client.model.ChartDataRestApiGetListSqlaTable;
import at.mic.superset.swagger.client.model.ChartDataRestApiGetListUser;
import at.mic.superset.swagger.client.model.ChartDataRestApiGetListUser1;
import at.mic.superset.swagger.client.model.ChartDataRestApiGetListUser2;
import at.mic.superset.swagger.client.model.ChartDataRestApiGetListUser3;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ChartDataRestApiGetList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartDataRestApiGetList {
  @SerializedName("cache_timeout")
  private Integer cacheTimeout = null;

  @SerializedName("certification_details")
  private String certificationDetails = null;

  @SerializedName("certified_by")
  private String certifiedBy = null;

  @SerializedName("changed_by")
  private ChartDataRestApiGetListUser2 changedBy = null;

  @SerializedName("changed_by_name")
  private Object changedByName = null;

  @SerializedName("changed_by_url")
  private Object changedByUrl = null;

  @SerializedName("changed_on_delta_humanized")
  private Object changedOnDeltaHumanized = null;

  @SerializedName("changed_on_utc")
  private Object changedOnUtc = null;

  @SerializedName("created_by")
  private ChartDataRestApiGetListUser1 createdBy = null;

  @SerializedName("datasource_id")
  private Integer datasourceId = null;

  @SerializedName("datasource_name_text")
  private Object datasourceNameText = null;

  @SerializedName("datasource_type")
  private String datasourceType = null;

  @SerializedName("datasource_url")
  private Object datasourceUrl = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("description_markeddown")
  private Object descriptionMarkeddown = null;

  @SerializedName("edit_url")
  private Object editUrl = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("is_managed_externally")
  private Boolean isManagedExternally = null;

  @SerializedName("last_saved_at")
  private OffsetDateTime lastSavedAt = null;

  @SerializedName("last_saved_by")
  private ChartDataRestApiGetListUser lastSavedBy = null;

  @SerializedName("owners")
  private List<ChartDataRestApiGetListUser3> owners = null;

  @SerializedName("params")
  private String params = null;

  @SerializedName("slice_name")
  private String sliceName = null;

  @SerializedName("table")
  private ChartDataRestApiGetListSqlaTable table = null;

  @SerializedName("thumbnail_url")
  private Object thumbnailUrl = null;

  @SerializedName("url")
  private Object url = null;

  @SerializedName("viz_type")
  private String vizType = null;

  public ChartDataRestApiGetList cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @Schema(description = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public ChartDataRestApiGetList certificationDetails(String certificationDetails) {
    this.certificationDetails = certificationDetails;
    return this;
  }

   /**
   * Get certificationDetails
   * @return certificationDetails
  **/
  @Schema(description = "")
  public String getCertificationDetails() {
    return certificationDetails;
  }

  public void setCertificationDetails(String certificationDetails) {
    this.certificationDetails = certificationDetails;
  }

  public ChartDataRestApiGetList certifiedBy(String certifiedBy) {
    this.certifiedBy = certifiedBy;
    return this;
  }

   /**
   * Get certifiedBy
   * @return certifiedBy
  **/
  @Schema(description = "")
  public String getCertifiedBy() {
    return certifiedBy;
  }

  public void setCertifiedBy(String certifiedBy) {
    this.certifiedBy = certifiedBy;
  }

  public ChartDataRestApiGetList changedBy(ChartDataRestApiGetListUser2 changedBy) {
    this.changedBy = changedBy;
    return this;
  }

   /**
   * Get changedBy
   * @return changedBy
  **/
  @Schema(description = "")
  public ChartDataRestApiGetListUser2 getChangedBy() {
    return changedBy;
  }

  public void setChangedBy(ChartDataRestApiGetListUser2 changedBy) {
    this.changedBy = changedBy;
  }

   /**
   * Get changedByName
   * @return changedByName
  **/
  @Schema(description = "")
  public Object getChangedByName() {
    return changedByName;
  }

   /**
   * Get changedByUrl
   * @return changedByUrl
  **/
  @Schema(description = "")
  public Object getChangedByUrl() {
    return changedByUrl;
  }

   /**
   * Get changedOnDeltaHumanized
   * @return changedOnDeltaHumanized
  **/
  @Schema(description = "")
  public Object getChangedOnDeltaHumanized() {
    return changedOnDeltaHumanized;
  }

   /**
   * Get changedOnUtc
   * @return changedOnUtc
  **/
  @Schema(description = "")
  public Object getChangedOnUtc() {
    return changedOnUtc;
  }

  public ChartDataRestApiGetList createdBy(ChartDataRestApiGetListUser1 createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public ChartDataRestApiGetListUser1 getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(ChartDataRestApiGetListUser1 createdBy) {
    this.createdBy = createdBy;
  }

  public ChartDataRestApiGetList datasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * Get datasourceId
   * @return datasourceId
  **/
  @Schema(description = "")
  public Integer getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
  }

   /**
   * Get datasourceNameText
   * @return datasourceNameText
  **/
  @Schema(description = "")
  public Object getDatasourceNameText() {
    return datasourceNameText;
  }

  public ChartDataRestApiGetList datasourceType(String datasourceType) {
    this.datasourceType = datasourceType;
    return this;
  }

   /**
   * Get datasourceType
   * @return datasourceType
  **/
  @Schema(description = "")
  public String getDatasourceType() {
    return datasourceType;
  }

  public void setDatasourceType(String datasourceType) {
    this.datasourceType = datasourceType;
  }

   /**
   * Get datasourceUrl
   * @return datasourceUrl
  **/
  @Schema(description = "")
  public Object getDatasourceUrl() {
    return datasourceUrl;
  }

  public ChartDataRestApiGetList description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Get descriptionMarkeddown
   * @return descriptionMarkeddown
  **/
  @Schema(description = "")
  public Object getDescriptionMarkeddown() {
    return descriptionMarkeddown;
  }

   /**
   * Get editUrl
   * @return editUrl
  **/
  @Schema(description = "")
  public Object getEditUrl() {
    return editUrl;
  }

  public ChartDataRestApiGetList id(Integer id) {
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

  public ChartDataRestApiGetList isManagedExternally(Boolean isManagedExternally) {
    this.isManagedExternally = isManagedExternally;
    return this;
  }

   /**
   * Get isManagedExternally
   * @return isManagedExternally
  **/
  @Schema(description = "")
  public Boolean isIsManagedExternally() {
    return isManagedExternally;
  }

  public void setIsManagedExternally(Boolean isManagedExternally) {
    this.isManagedExternally = isManagedExternally;
  }

  public ChartDataRestApiGetList lastSavedAt(OffsetDateTime lastSavedAt) {
    this.lastSavedAt = lastSavedAt;
    return this;
  }

   /**
   * Get lastSavedAt
   * @return lastSavedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getLastSavedAt() {
    return lastSavedAt;
  }

  public void setLastSavedAt(OffsetDateTime lastSavedAt) {
    this.lastSavedAt = lastSavedAt;
  }

  public ChartDataRestApiGetList lastSavedBy(ChartDataRestApiGetListUser lastSavedBy) {
    this.lastSavedBy = lastSavedBy;
    return this;
  }

   /**
   * Get lastSavedBy
   * @return lastSavedBy
  **/
  @Schema(description = "")
  public ChartDataRestApiGetListUser getLastSavedBy() {
    return lastSavedBy;
  }

  public void setLastSavedBy(ChartDataRestApiGetListUser lastSavedBy) {
    this.lastSavedBy = lastSavedBy;
  }

  public ChartDataRestApiGetList owners(List<ChartDataRestApiGetListUser3> owners) {
    this.owners = owners;
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public List<ChartDataRestApiGetListUser3> getOwners() {
    return owners;
  }

  public void setOwners(List<ChartDataRestApiGetListUser3> owners) {
    this.owners = owners;
  }

  public ChartDataRestApiGetList params(String params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @Schema(description = "")
  public String getParams() {
    return params;
  }

  public void setParams(String params) {
    this.params = params;
  }

  public ChartDataRestApiGetList sliceName(String sliceName) {
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

  public ChartDataRestApiGetList table(ChartDataRestApiGetListSqlaTable table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @Schema(description = "")
  public ChartDataRestApiGetListSqlaTable getTable() {
    return table;
  }

  public void setTable(ChartDataRestApiGetListSqlaTable table) {
    this.table = table;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @Schema(description = "")
  public Object getThumbnailUrl() {
    return thumbnailUrl;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public Object getUrl() {
    return url;
  }

  public ChartDataRestApiGetList vizType(String vizType) {
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
    ChartDataRestApiGetList chartDataRestApiGetList = (ChartDataRestApiGetList) o;
    return Objects.equals(this.cacheTimeout, chartDataRestApiGetList.cacheTimeout) &&
        Objects.equals(this.certificationDetails, chartDataRestApiGetList.certificationDetails) &&
        Objects.equals(this.certifiedBy, chartDataRestApiGetList.certifiedBy) &&
        Objects.equals(this.changedBy, chartDataRestApiGetList.changedBy) &&
        Objects.equals(this.changedByName, chartDataRestApiGetList.changedByName) &&
        Objects.equals(this.changedByUrl, chartDataRestApiGetList.changedByUrl) &&
        Objects.equals(this.changedOnDeltaHumanized, chartDataRestApiGetList.changedOnDeltaHumanized) &&
        Objects.equals(this.changedOnUtc, chartDataRestApiGetList.changedOnUtc) &&
        Objects.equals(this.createdBy, chartDataRestApiGetList.createdBy) &&
        Objects.equals(this.datasourceId, chartDataRestApiGetList.datasourceId) &&
        Objects.equals(this.datasourceNameText, chartDataRestApiGetList.datasourceNameText) &&
        Objects.equals(this.datasourceType, chartDataRestApiGetList.datasourceType) &&
        Objects.equals(this.datasourceUrl, chartDataRestApiGetList.datasourceUrl) &&
        Objects.equals(this.description, chartDataRestApiGetList.description) &&
        Objects.equals(this.descriptionMarkeddown, chartDataRestApiGetList.descriptionMarkeddown) &&
        Objects.equals(this.editUrl, chartDataRestApiGetList.editUrl) &&
        Objects.equals(this.id, chartDataRestApiGetList.id) &&
        Objects.equals(this.isManagedExternally, chartDataRestApiGetList.isManagedExternally) &&
        Objects.equals(this.lastSavedAt, chartDataRestApiGetList.lastSavedAt) &&
        Objects.equals(this.lastSavedBy, chartDataRestApiGetList.lastSavedBy) &&
        Objects.equals(this.owners, chartDataRestApiGetList.owners) &&
        Objects.equals(this.params, chartDataRestApiGetList.params) &&
        Objects.equals(this.sliceName, chartDataRestApiGetList.sliceName) &&
        Objects.equals(this.table, chartDataRestApiGetList.table) &&
        Objects.equals(this.thumbnailUrl, chartDataRestApiGetList.thumbnailUrl) &&
        Objects.equals(this.url, chartDataRestApiGetList.url) &&
        Objects.equals(this.vizType, chartDataRestApiGetList.vizType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheTimeout, certificationDetails, certifiedBy, changedBy, changedByName, changedByUrl, changedOnDeltaHumanized, changedOnUtc, createdBy, datasourceId, datasourceNameText, datasourceType, datasourceUrl, description, descriptionMarkeddown, editUrl, id, isManagedExternally, lastSavedAt, lastSavedBy, owners, params, sliceName, table, thumbnailUrl, url, vizType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataRestApiGetList {\n");
    
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    certificationDetails: ").append(toIndentedString(certificationDetails)).append("\n");
    sb.append("    certifiedBy: ").append(toIndentedString(certifiedBy)).append("\n");
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    changedByName: ").append(toIndentedString(changedByName)).append("\n");
    sb.append("    changedByUrl: ").append(toIndentedString(changedByUrl)).append("\n");
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    changedOnUtc: ").append(toIndentedString(changedOnUtc)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    datasourceNameText: ").append(toIndentedString(datasourceNameText)).append("\n");
    sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
    sb.append("    datasourceUrl: ").append(toIndentedString(datasourceUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionMarkeddown: ").append(toIndentedString(descriptionMarkeddown)).append("\n");
    sb.append("    editUrl: ").append(toIndentedString(editUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isManagedExternally: ").append(toIndentedString(isManagedExternally)).append("\n");
    sb.append("    lastSavedAt: ").append(toIndentedString(lastSavedAt)).append("\n");
    sb.append("    lastSavedBy: ").append(toIndentedString(lastSavedBy)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    sliceName: ").append(toIndentedString(sliceName)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
