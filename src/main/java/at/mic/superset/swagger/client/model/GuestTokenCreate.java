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
import at.mic.superset.swagger.client.model.Resource;
import at.mic.superset.swagger.client.model.RlsRule;
import at.mic.superset.swagger.client.model.User1;
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
 * GuestTokenCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T14:48:42.974+02:00[Europe/Berlin]")
public class GuestTokenCreate {
  @SerializedName("resources")
  private List<Resource> resources = new ArrayList<Resource>();

  @SerializedName("rls")
  private List<RlsRule> rls = new ArrayList<RlsRule>();

  @SerializedName("user")
  private User1 user = null;

  public GuestTokenCreate resources(List<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public GuestTokenCreate addResourcesItem(Resource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Schema(required = true, description = "")
  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  public GuestTokenCreate rls(List<RlsRule> rls) {
    this.rls = rls;
    return this;
  }

  public GuestTokenCreate addRlsItem(RlsRule rlsItem) {
    this.rls.add(rlsItem);
    return this;
  }

   /**
   * Get rls
   * @return rls
  **/
  @Schema(required = true, description = "")
  public List<RlsRule> getRls() {
    return rls;
  }

  public void setRls(List<RlsRule> rls) {
    this.rls = rls;
  }

  public GuestTokenCreate user(User1 user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public User1 getUser() {
    return user;
  }

  public void setUser(User1 user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestTokenCreate guestTokenCreate = (GuestTokenCreate) o;
    return Objects.equals(this.resources, guestTokenCreate.resources) &&
        Objects.equals(this.rls, guestTokenCreate.rls) &&
        Objects.equals(this.user, guestTokenCreate.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, rls, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestTokenCreate {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    rls: ").append(toIndentedString(rls)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
