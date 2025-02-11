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
import at.mic.superset.swagger.client.model.DashboardRestApiGetListRole;
import at.mic.superset.swagger.client.model.DashboardRestApiGetListUser;
import at.mic.superset.swagger.client.model.DashboardRestApiGetListUser1;
import at.mic.superset.swagger.client.model.DashboardRestApiGetListUser2;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DashboardRestApiGetList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class DashboardRestApiGetList {
  @SerializedName("certification_details")
  private String certificationDetails = null;

  @SerializedName("certified_by")
  private String certifiedBy = null;

  @SerializedName("changed_by")
  private DashboardRestApiGetListUser1 changedBy = null;

  @SerializedName("changed_by_name")
  private Object changedByName = null;

  @SerializedName("changed_by_url")
  private Object changedByUrl = null;

  @SerializedName("changed_on_delta_humanized")
  private Object changedOnDeltaHumanized = null;

  @SerializedName("changed_on_utc")
  private Object changedOnUtc = null;

  @SerializedName("created_by")
  private DashboardRestApiGetListUser createdBy = null;

  @SerializedName("created_on_delta_humanized")
  private Object createdOnDeltaHumanized = null;

  @SerializedName("css")
  private String css = null;

  @SerializedName("dashboard_title")
  private String dashboardTitle = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("is_managed_externally")
  private Boolean isManagedExternally = null;

  @SerializedName("json_metadata")
  private String jsonMetadata = null;

  @SerializedName("owners")
  private List<DashboardRestApiGetListUser2> owners = null;

  @SerializedName("position_json")
  private String positionJson = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("roles")
  private List<DashboardRestApiGetListRole> roles = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("status")
  private Object status = null;

  @SerializedName("thumbnail_url")
  private Object thumbnailUrl = null;

  @SerializedName("url")
  private Object url = null;

  public DashboardRestApiGetList certificationDetails(String certificationDetails) {
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

  public DashboardRestApiGetList certifiedBy(String certifiedBy) {
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

  public DashboardRestApiGetList changedBy(DashboardRestApiGetListUser1 changedBy) {
    this.changedBy = changedBy;
    return this;
  }

   /**
   * Get changedBy
   * @return changedBy
  **/
  @Schema(description = "")
  public DashboardRestApiGetListUser1 getChangedBy() {
    return changedBy;
  }

  public void setChangedBy(DashboardRestApiGetListUser1 changedBy) {
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

  public DashboardRestApiGetList createdBy(DashboardRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public DashboardRestApiGetListUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(DashboardRestApiGetListUser createdBy) {
    this.createdBy = createdBy;
  }

   /**
   * Get createdOnDeltaHumanized
   * @return createdOnDeltaHumanized
  **/
  @Schema(description = "")
  public Object getCreatedOnDeltaHumanized() {
    return createdOnDeltaHumanized;
  }

  public DashboardRestApiGetList css(String css) {
    this.css = css;
    return this;
  }

   /**
   * Get css
   * @return css
  **/
  @Schema(description = "")
  public String getCss() {
    return css;
  }

  public void setCss(String css) {
    this.css = css;
  }

  public DashboardRestApiGetList dashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
    return this;
  }

   /**
   * Get dashboardTitle
   * @return dashboardTitle
  **/
  @Schema(description = "")
  public String getDashboardTitle() {
    return dashboardTitle;
  }

  public void setDashboardTitle(String dashboardTitle) {
    this.dashboardTitle = dashboardTitle;
  }

  public DashboardRestApiGetList id(Integer id) {
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

  public DashboardRestApiGetList isManagedExternally(Boolean isManagedExternally) {
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

  public DashboardRestApiGetList jsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
    return this;
  }

   /**
   * Get jsonMetadata
   * @return jsonMetadata
  **/
  @Schema(description = "")
  public String getJsonMetadata() {
    return jsonMetadata;
  }

  public void setJsonMetadata(String jsonMetadata) {
    this.jsonMetadata = jsonMetadata;
  }

  public DashboardRestApiGetList owners(List<DashboardRestApiGetListUser2> owners) {
    this.owners = owners;
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @Schema(description = "")
  public List<DashboardRestApiGetListUser2> getOwners() {
    return owners;
  }

  public void setOwners(List<DashboardRestApiGetListUser2> owners) {
    this.owners = owners;
  }

  public DashboardRestApiGetList positionJson(String positionJson) {
    this.positionJson = positionJson;
    return this;
  }

   /**
   * Get positionJson
   * @return positionJson
  **/
  @Schema(description = "")
  public String getPositionJson() {
    return positionJson;
  }

  public void setPositionJson(String positionJson) {
    this.positionJson = positionJson;
  }

  public DashboardRestApiGetList published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @Schema(description = "")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public DashboardRestApiGetList roles(List<DashboardRestApiGetListRole> roles) {
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<DashboardRestApiGetListRole> getRoles() {
    return roles;
  }

  public void setRoles(List<DashboardRestApiGetListRole> roles) {
    this.roles = roles;
  }

  public DashboardRestApiGetList slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @Schema(description = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Object getStatus() {
    return status;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardRestApiGetList dashboardRestApiGetList = (DashboardRestApiGetList) o;
    return Objects.equals(this.certificationDetails, dashboardRestApiGetList.certificationDetails) &&
        Objects.equals(this.certifiedBy, dashboardRestApiGetList.certifiedBy) &&
        Objects.equals(this.changedBy, dashboardRestApiGetList.changedBy) &&
        Objects.equals(this.changedByName, dashboardRestApiGetList.changedByName) &&
        Objects.equals(this.changedByUrl, dashboardRestApiGetList.changedByUrl) &&
        Objects.equals(this.changedOnDeltaHumanized, dashboardRestApiGetList.changedOnDeltaHumanized) &&
        Objects.equals(this.changedOnUtc, dashboardRestApiGetList.changedOnUtc) &&
        Objects.equals(this.createdBy, dashboardRestApiGetList.createdBy) &&
        Objects.equals(this.createdOnDeltaHumanized, dashboardRestApiGetList.createdOnDeltaHumanized) &&
        Objects.equals(this.css, dashboardRestApiGetList.css) &&
        Objects.equals(this.dashboardTitle, dashboardRestApiGetList.dashboardTitle) &&
        Objects.equals(this.id, dashboardRestApiGetList.id) &&
        Objects.equals(this.isManagedExternally, dashboardRestApiGetList.isManagedExternally) &&
        Objects.equals(this.jsonMetadata, dashboardRestApiGetList.jsonMetadata) &&
        Objects.equals(this.owners, dashboardRestApiGetList.owners) &&
        Objects.equals(this.positionJson, dashboardRestApiGetList.positionJson) &&
        Objects.equals(this.published, dashboardRestApiGetList.published) &&
        Objects.equals(this.roles, dashboardRestApiGetList.roles) &&
        Objects.equals(this.slug, dashboardRestApiGetList.slug) &&
        Objects.equals(this.status, dashboardRestApiGetList.status) &&
        Objects.equals(this.thumbnailUrl, dashboardRestApiGetList.thumbnailUrl) &&
        Objects.equals(this.url, dashboardRestApiGetList.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificationDetails, certifiedBy, changedBy, changedByName, changedByUrl, changedOnDeltaHumanized, changedOnUtc, createdBy, createdOnDeltaHumanized, css, dashboardTitle, id, isManagedExternally, jsonMetadata, owners, positionJson, published, roles, slug, status, thumbnailUrl, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardRestApiGetList {\n");
    
    sb.append("    certificationDetails: ").append(toIndentedString(certificationDetails)).append("\n");
    sb.append("    certifiedBy: ").append(toIndentedString(certifiedBy)).append("\n");
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    changedByName: ").append(toIndentedString(changedByName)).append("\n");
    sb.append("    changedByUrl: ").append(toIndentedString(changedByUrl)).append("\n");
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    changedOnUtc: ").append(toIndentedString(changedOnUtc)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOnDeltaHumanized: ").append(toIndentedString(createdOnDeltaHumanized)).append("\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isManagedExternally: ").append(toIndentedString(isManagedExternally)).append("\n");
    sb.append("    jsonMetadata: ").append(toIndentedString(jsonMetadata)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    positionJson: ").append(toIndentedString(positionJson)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
