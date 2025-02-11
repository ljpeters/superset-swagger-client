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
import at.mic.superset.swagger.client.model.LogRestApiGetUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * LogRestApiGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class LogRestApiGet {
  @SerializedName("action")
  private String action = null;

  @SerializedName("dashboard_id")
  private Integer dashboardId = null;

  @SerializedName("dttm")
  private OffsetDateTime dttm = null;

  @SerializedName("duration_ms")
  private Integer durationMs = null;

  @SerializedName("json")
  private String json = null;

  @SerializedName("referrer")
  private String referrer = null;

  @SerializedName("slice_id")
  private Integer sliceId = null;

  @SerializedName("user")
  private LogRestApiGetUser user = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public LogRestApiGet action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public LogRestApiGet dashboardId(Integer dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * Get dashboardId
   * @return dashboardId
  **/
  @Schema(description = "")
  public Integer getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(Integer dashboardId) {
    this.dashboardId = dashboardId;
  }

  public LogRestApiGet dttm(OffsetDateTime dttm) {
    this.dttm = dttm;
    return this;
  }

   /**
   * Get dttm
   * @return dttm
  **/
  @Schema(description = "")
  public OffsetDateTime getDttm() {
    return dttm;
  }

  public void setDttm(OffsetDateTime dttm) {
    this.dttm = dttm;
  }

  public LogRestApiGet durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

   /**
   * Get durationMs
   * @return durationMs
  **/
  @Schema(description = "")
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  public LogRestApiGet json(String json) {
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @Schema(description = "")
  public String getJson() {
    return json;
  }

  public void setJson(String json) {
    this.json = json;
  }

  public LogRestApiGet referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @Schema(description = "")
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public LogRestApiGet sliceId(Integer sliceId) {
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

  public LogRestApiGet user(LogRestApiGetUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public LogRestApiGetUser getUser() {
    return user;
  }

  public void setUser(LogRestApiGetUser user) {
    this.user = user;
  }

  public LogRestApiGet userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRestApiGet logRestApiGet = (LogRestApiGet) o;
    return Objects.equals(this.action, logRestApiGet.action) &&
        Objects.equals(this.dashboardId, logRestApiGet.dashboardId) &&
        Objects.equals(this.dttm, logRestApiGet.dttm) &&
        Objects.equals(this.durationMs, logRestApiGet.durationMs) &&
        Objects.equals(this.json, logRestApiGet.json) &&
        Objects.equals(this.referrer, logRestApiGet.referrer) &&
        Objects.equals(this.sliceId, logRestApiGet.sliceId) &&
        Objects.equals(this.user, logRestApiGet.user) &&
        Objects.equals(this.userId, logRestApiGet.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dashboardId, dttm, durationMs, json, referrer, sliceId, user, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRestApiGet {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    dttm: ").append(toIndentedString(dttm)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
