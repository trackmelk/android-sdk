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

import java.util.Date;
import lk.trackme.client.model.Device;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Position {
  
  @SerializedName("device")
  private Device device = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("latitude")
  private Double latitude = null;
  @SerializedName("longitude")
  private Double longitude = null;
  @SerializedName("altitude")
  private Double altitude = null;
  @SerializedName("speed")
  private Double speed = null;
  @SerializedName("course")
  private Double course = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("id")
  private Long id = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Device getDevice() {
    return device;
  }
  public void setDevice(Device device) {
    this.device = device;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAltitude() {
    return altitude;
  }
  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSpeed() {
    return speed;
  }
  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCourse() {
    return course;
  }
  public void setCourse(Double course) {
    this.course = course;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
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
    Position position = (Position) o;
    return (this.device == null ? position.device == null : this.device.equals(position.device)) &&
        (this.time == null ? position.time == null : this.time.equals(position.time)) &&
        (this.latitude == null ? position.latitude == null : this.latitude.equals(position.latitude)) &&
        (this.longitude == null ? position.longitude == null : this.longitude.equals(position.longitude)) &&
        (this.altitude == null ? position.altitude == null : this.altitude.equals(position.altitude)) &&
        (this.speed == null ? position.speed == null : this.speed.equals(position.speed)) &&
        (this.course == null ? position.course == null : this.course.equals(position.course)) &&
        (this.address == null ? position.address == null : this.address.equals(position.address)) &&
        (this.id == null ? position.id == null : this.id.equals(position.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.device == null ? 0: this.device.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.altitude == null ? 0: this.altitude.hashCode());
    result = 31 * result + (this.speed == null ? 0: this.speed.hashCode());
    result = 31 * result + (this.course == null ? 0: this.course.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("  device: ").append(device).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  altitude: ").append(altitude).append("\n");
    sb.append("  speed: ").append(speed).append("\n");
    sb.append("  course: ").append(course).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}