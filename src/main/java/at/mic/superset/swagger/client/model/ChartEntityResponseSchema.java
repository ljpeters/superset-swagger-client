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
 * ChartEntityResponseSchema
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class ChartEntityResponseSchema {
  @SerializedName("cache_timeout")
  private Integer cacheTimeout = null;

  @SerializedName("certification_details")
  private String certificationDetails = null;

  @SerializedName("certified_by")
  private String certifiedBy = null;

  @SerializedName("changed_on")
  private String changedOn = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("description_markeddown")
  private String descriptionMarkeddown = null;

  @SerializedName("form_data")
  private Object formData = null;

  @SerializedName("slice_id")
  private Integer sliceId = null;

  @SerializedName("slice_name")
  private String sliceName = null;

  @SerializedName("slice_url")
  private String sliceUrl = null;

  public ChartEntityResponseSchema cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Duration (in seconds) of the caching timeout for this chart. Note this defaults to the datasource/table timeout if undefined.
   * @return cacheTimeout
  **/
  @Schema(description = "Duration (in seconds) of the caching timeout for this chart. Note this defaults to the datasource/table timeout if undefined.")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public ChartEntityResponseSchema certificationDetails(String certificationDetails) {
    this.certificationDetails = certificationDetails;
    return this;
  }

   /**
   * Details of the certification
   * @return certificationDetails
  **/
  @Schema(description = "Details of the certification")
  public String getCertificationDetails() {
    return certificationDetails;
  }

  public void setCertificationDetails(String certificationDetails) {
    this.certificationDetails = certificationDetails;
  }

  public ChartEntityResponseSchema certifiedBy(String certifiedBy) {
    this.certifiedBy = certifiedBy;
    return this;
  }

   /**
   * Person or group that has certified this chart
   * @return certifiedBy
  **/
  @Schema(description = "Person or group that has certified this chart")
  public String getCertifiedBy() {
    return certifiedBy;
  }

  public void setCertifiedBy(String certifiedBy) {
    this.certifiedBy = certifiedBy;
  }

  public ChartEntityResponseSchema changedOn(String changedOn) {
    this.changedOn = changedOn;
    return this;
  }

   /**
   * The ISO date that the chart was last changed.
   * @return changedOn
  **/
  @Schema(description = "The ISO date that the chart was last changed.")
  public String getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(String changedOn) {
    this.changedOn = changedOn;
  }

  public ChartEntityResponseSchema description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the chart propose.
   * @return description
  **/
  @Schema(description = "A description of the chart propose.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChartEntityResponseSchema descriptionMarkeddown(String descriptionMarkeddown) {
    this.descriptionMarkeddown = descriptionMarkeddown;
    return this;
  }

   /**
   * Sanitized HTML version of the chart description.
   * @return descriptionMarkeddown
  **/
  @Schema(description = "Sanitized HTML version of the chart description.")
  public String getDescriptionMarkeddown() {
    return descriptionMarkeddown;
  }

  public void setDescriptionMarkeddown(String descriptionMarkeddown) {
    this.descriptionMarkeddown = descriptionMarkeddown;
  }

  public ChartEntityResponseSchema formData(Object formData) {
    this.formData = formData;
    return this;
  }

   /**
   * Form data from the Explore controls used to form the chart&#x27;s data query.
   * @return formData
  **/
  @Schema(description = "Form data from the Explore controls used to form the chart's data query.")
  public Object getFormData() {
    return formData;
  }

  public void setFormData(Object formData) {
    this.formData = formData;
  }

  public ChartEntityResponseSchema sliceId(Integer sliceId) {
    this.sliceId = sliceId;
    return this;
  }

   /**
   * Get sliceId
   * @return sliceId
  **/
  @Schema(description = "")
  public Integer getSliceId() {
    return sliceId;
  }

  public void setSliceId(Integer sliceId) {
    this.sliceId = sliceId;
  }

  public ChartEntityResponseSchema sliceName(String sliceName) {
    this.sliceName = sliceName;
    return this;
  }

   /**
   * The name of the chart.
   * @return sliceName
  **/
  @Schema(description = "The name of the chart.")
  public String getSliceName() {
    return sliceName;
  }

  public void setSliceName(String sliceName) {
    this.sliceName = sliceName;
  }

  public ChartEntityResponseSchema sliceUrl(String sliceUrl) {
    this.sliceUrl = sliceUrl;
    return this;
  }

   /**
   * The URL of the chart.
   * @return sliceUrl
  **/
  @Schema(description = "The URL of the chart.")
  public String getSliceUrl() {
    return sliceUrl;
  }

  public void setSliceUrl(String sliceUrl) {
    this.sliceUrl = sliceUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartEntityResponseSchema chartEntityResponseSchema = (ChartEntityResponseSchema) o;
    return Objects.equals(this.cacheTimeout, chartEntityResponseSchema.cacheTimeout) &&
        Objects.equals(this.certificationDetails, chartEntityResponseSchema.certificationDetails) &&
        Objects.equals(this.certifiedBy, chartEntityResponseSchema.certifiedBy) &&
        Objects.equals(this.changedOn, chartEntityResponseSchema.changedOn) &&
        Objects.equals(this.description, chartEntityResponseSchema.description) &&
        Objects.equals(this.descriptionMarkeddown, chartEntityResponseSchema.descriptionMarkeddown) &&
        Objects.equals(this.formData, chartEntityResponseSchema.formData) &&
        Objects.equals(this.sliceId, chartEntityResponseSchema.sliceId) &&
        Objects.equals(this.sliceName, chartEntityResponseSchema.sliceName) &&
        Objects.equals(this.sliceUrl, chartEntityResponseSchema.sliceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheTimeout, certificationDetails, certifiedBy, changedOn, description, descriptionMarkeddown, formData, sliceId, sliceName, sliceUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartEntityResponseSchema {\n");
    
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    certificationDetails: ").append(toIndentedString(certificationDetails)).append("\n");
    sb.append("    certifiedBy: ").append(toIndentedString(certifiedBy)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionMarkeddown: ").append(toIndentedString(descriptionMarkeddown)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    sliceName: ").append(toIndentedString(sliceName)).append("\n");
    sb.append("    sliceUrl: ").append(toIndentedString(sliceUrl)).append("\n");
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
