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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Fruit;
import org.openapitools.client.model.NullableShape;
import org.openapitools.client.model.Shape;
import org.openapitools.client.model.ShapeOrNull;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Drawing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Drawing {
  public static final String SERIALIZED_NAME_MAIN_SHAPE = "mainShape";
  @SerializedName(SERIALIZED_NAME_MAIN_SHAPE)
  private Shape mainShape;

  public static final String SERIALIZED_NAME_SHAPE_OR_NULL = "shapeOrNull";
  @SerializedName(SERIALIZED_NAME_SHAPE_OR_NULL)
  private ShapeOrNull shapeOrNull;

  public static final String SERIALIZED_NAME_NULLABLE_SHAPE = "nullableShape";
  @SerializedName(SERIALIZED_NAME_NULLABLE_SHAPE)
  private NullableShape nullableShape;

  public static final String SERIALIZED_NAME_SHAPES = "shapes";
  @SerializedName(SERIALIZED_NAME_SHAPES)
  private List<Shape> shapes;

  public Drawing() {
  }

  public Drawing mainShape(Shape mainShape) {
    
    this.mainShape = mainShape;
    return this;
  }

   /**
   * Get mainShape
   * @return mainShape
  **/
  @javax.annotation.Nullable
  public Shape getMainShape() {
    return mainShape;
  }


  public void setMainShape(Shape mainShape) {
    this.mainShape = mainShape;
  }


  public Drawing shapeOrNull(ShapeOrNull shapeOrNull) {
    
    this.shapeOrNull = shapeOrNull;
    return this;
  }

   /**
   * Get shapeOrNull
   * @return shapeOrNull
  **/
  @javax.annotation.Nullable
  public ShapeOrNull getShapeOrNull() {
    return shapeOrNull;
  }


  public void setShapeOrNull(ShapeOrNull shapeOrNull) {
    this.shapeOrNull = shapeOrNull;
  }


  public Drawing nullableShape(NullableShape nullableShape) {
    
    this.nullableShape = nullableShape;
    return this;
  }

   /**
   * Get nullableShape
   * @return nullableShape
  **/
  @javax.annotation.Nullable
  public NullableShape getNullableShape() {
    return nullableShape;
  }


  public void setNullableShape(NullableShape nullableShape) {
    this.nullableShape = nullableShape;
  }


  public Drawing shapes(List<Shape> shapes) {
    
    this.shapes = shapes;
    return this;
  }

  public Drawing addShapesItem(Shape shapesItem) {
    if (this.shapes == null) {
      this.shapes = new ArrayList<>();
    }
    this.shapes.add(shapesItem);
    return this;
  }

   /**
   * Get shapes
   * @return shapes
  **/
  @javax.annotation.Nullable
  public List<Shape> getShapes() {
    return shapes;
  }


  public void setShapes(List<Shape> shapes) {
    this.shapes = shapes;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Drawing instance itself
   */
  public Drawing putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drawing drawing = (Drawing) o;
    return Objects.equals(this.mainShape, drawing.mainShape) &&
        Objects.equals(this.shapeOrNull, drawing.shapeOrNull) &&
        Objects.equals(this.nullableShape, drawing.nullableShape) &&
        Objects.equals(this.shapes, drawing.shapes)&&
        Objects.equals(this.additionalProperties, drawing.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainShape, shapeOrNull, nullableShape, shapes, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drawing {\n");
    sb.append("    mainShape: ").append(toIndentedString(mainShape)).append("\n");
    sb.append("    shapeOrNull: ").append(toIndentedString(shapeOrNull)).append("\n");
    sb.append("    nullableShape: ").append(toIndentedString(nullableShape)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("mainShape");
    openapiFields.add("shapeOrNull");
    openapiFields.add("nullableShape");
    openapiFields.add("shapes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Drawing
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Drawing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Drawing is not found in the empty JSON string", Drawing.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `mainShape`
      if (jsonObj.get("mainShape") != null && !jsonObj.get("mainShape").isJsonNull()) {
        Shape.validateJsonElement(jsonObj.get("mainShape"));
      }
      // validate the optional field `shapeOrNull`
      if (jsonObj.get("shapeOrNull") != null && !jsonObj.get("shapeOrNull").isJsonNull()) {
        ShapeOrNull.validateJsonElement(jsonObj.get("shapeOrNull"));
      }
      // validate the optional field `nullableShape`
      if (jsonObj.get("nullableShape") != null && !jsonObj.get("nullableShape").isJsonNull()) {
        NullableShape.validateJsonElement(jsonObj.get("nullableShape"));
      }
      if (jsonObj.get("shapes") != null && !jsonObj.get("shapes").isJsonNull()) {
        JsonArray jsonArrayshapes = jsonObj.getAsJsonArray("shapes");
        if (jsonArrayshapes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shapes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shapes` to be an array in the JSON string but got `%s`", jsonObj.get("shapes").toString()));
          }

          // validate the optional field `shapes` (array)
          for (int i = 0; i < jsonArrayshapes.size(); i++) {
            Shape.validateJsonElement(jsonArrayshapes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Drawing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Drawing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Drawing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Drawing.class));

       return (TypeAdapter<T>) new TypeAdapter<Drawing>() {
           @Override
           public void write(JsonWriter out, Drawing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Drawing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Drawing instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Drawing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Drawing
  * @throws IOException if the JSON string is invalid with respect to Drawing
  */
  public static Drawing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Drawing.class);
  }

 /**
  * Convert an instance of Drawing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

