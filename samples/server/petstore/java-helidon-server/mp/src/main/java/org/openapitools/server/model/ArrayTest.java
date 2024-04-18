/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ReadOnlyFirst;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;


public class ArrayTest  {
  
  private List<String> arrayOfString = null;

  private List<List<Long>> arrayArrayOfInteger = null;

  private List<List<@Valid ReadOnlyFirst>> arrayArrayOfModel = null;

 /**
   * Get arrayOfString
   * @return arrayOfString
  **/
 @Size(min=0,max=3)  public List<String> getArrayOfString() {
    return arrayOfString;
  }

  /**
    * Set arrayOfString
  **/
  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

 /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  **/
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  /**
    * Set arrayArrayOfInteger
  **/
  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

 /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  **/
  public List<List<@Valid ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  /**
    * Set arrayArrayOfModel
  **/
  public void setArrayArrayOfModel(List<List<@Valid ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  public ArrayTest arrayArrayOfModel(List<List<@Valid ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<@Valid ReadOnlyFirst> arrayArrayOfModelItem) {
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

