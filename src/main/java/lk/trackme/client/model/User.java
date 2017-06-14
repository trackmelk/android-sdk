/**
 * trackme.lk API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lk.trackme.client.model;

import lk.trackme.client.model.UserSettings;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class User {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("api_key")
  private String apiKey = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("profile_picture")
  private String profilePicture = null;
  @SerializedName("settings")
  private UserSettings settings = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name used to log in
   **/
  @ApiModelProperty(required = true, value = "Name used to log in")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Password
   **/
  @ApiModelProperty(required = true, value = "Password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * First name
   **/
  @ApiModelProperty(required = true, value = "First name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Last name
   **/
  @ApiModelProperty(required = true, value = "Last name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Email address
   **/
  @ApiModelProperty(required = true, value = "Email address")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Phone number, mobile number is preferred
   **/
  @ApiModelProperty(value = "Phone number, mobile number is preferred")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Profile picture URL
   **/
  @ApiModelProperty(value = "Profile picture URL")
  public String getProfilePicture() {
    return profilePicture;
  }
  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }

  /**
   * User's preferences
   **/
  @ApiModelProperty(value = "User's preferences")
  public UserSettings getSettings() {
    return settings;
  }
  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return (this.id == null ? user.id == null : this.id.equals(user.id)) &&
        (this.username == null ? user.username == null : this.username.equals(user.username)) &&
        (this.password == null ? user.password == null : this.password.equals(user.password)) &&
        (this.apiKey == null ? user.apiKey == null : this.apiKey.equals(user.apiKey)) &&
        (this.firstName == null ? user.firstName == null : this.firstName.equals(user.firstName)) &&
        (this.lastName == null ? user.lastName == null : this.lastName.equals(user.lastName)) &&
        (this.email == null ? user.email == null : this.email.equals(user.email)) &&
        (this.phoneNumber == null ? user.phoneNumber == null : this.phoneNumber.equals(user.phoneNumber)) &&
        (this.profilePicture == null ? user.profilePicture == null : this.profilePicture.equals(user.profilePicture)) &&
        (this.settings == null ? user.settings == null : this.settings.equals(user.settings));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.apiKey == null ? 0: this.apiKey.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phoneNumber == null ? 0: this.phoneNumber.hashCode());
    result = 31 * result + (this.profilePicture == null ? 0: this.profilePicture.hashCode());
    result = 31 * result + (this.settings == null ? 0: this.settings.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  apiKey: ").append(apiKey).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  profilePicture: ").append(profilePicture).append("\n");
    sb.append("  settings: ").append(settings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
