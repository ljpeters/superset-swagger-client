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
import java.io.File;
import java.io.IOException;
/**
 * Body4
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-29T11:55:36.089+02:00[Europe/Berlin]")
public class Body4 {
  @SerializedName("formData")
  private File formData = null;

  @SerializedName("overwrite")
  private Boolean overwrite = null;

  @SerializedName("passwords")
  private String passwords = null;

  public Body4 formData(File formData) {
    this.formData = formData;
    return this;
  }

   /**
   * upload file (ZIP or YAML)
   * @return formData
  **/
  @Schema(description = "upload file (ZIP or YAML)")
  public File getFormData() {
    return formData;
  }

  public void setFormData(File formData) {
    this.formData = formData;
  }

  public Body4 overwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

   /**
   * overwrite existing datasets?
   * @return overwrite
  **/
  @Schema(description = "overwrite existing datasets?")
  public Boolean isOverwrite() {
    return overwrite;
  }

  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }

  public Body4 passwords(String passwords) {
    this.passwords = passwords;
    return this;
  }

   /**
   * JSON map of passwords for each featured database in the ZIP file. If the ZIP includes a database config in the path &#x60;databases/MyDatabase.yaml&#x60;, the password should be provided in the following format: &#x60;{\&quot;databases/MyDatabase.yaml\&quot;: \&quot;my_password\&quot;}&#x60;.
   * @return passwords
  **/
  @Schema(description = "JSON map of passwords for each featured database in the ZIP file. If the ZIP includes a database config in the path `databases/MyDatabase.yaml`, the password should be provided in the following format: `{\"databases/MyDatabase.yaml\": \"my_password\"}`.")
  public String getPasswords() {
    return passwords;
  }

  public void setPasswords(String passwords) {
    this.passwords = passwords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body4 body4 = (Body4) o;
    return Objects.equals(this.formData, body4.formData) &&
        Objects.equals(this.overwrite, body4.overwrite) &&
        Objects.equals(this.passwords, body4.passwords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(formData), overwrite, passwords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    passwords: ").append(toIndentedString(passwords)).append("\n");
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
