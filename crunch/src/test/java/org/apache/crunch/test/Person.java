/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.crunch.test;

@SuppressWarnings("all")
public class Person extends org.apache.avro.specific.SpecificRecordBase implements
    org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser()
      .parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"org.apache.crunch.test\",\"fields\":[{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"siblingnames\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  @Deprecated
  public java.lang.CharSequence name;
  @Deprecated
  public int age;
  @Deprecated
  public java.util.List<java.lang.CharSequence> siblingnames;

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter. Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0:
      return name;
    case 1:
      return age;
    case 2:
      return siblingnames;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader. Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0:
      name = (java.lang.CharSequence) value$;
      break;
    case 1:
      age = (java.lang.Integer) value$;
      break;
    case 2:
      siblingnames = (java.util.List<java.lang.CharSequence>) value$;
      break;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * 
   * @param value
   *          the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * 
   * @param value
   *          the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'siblingnames' field.
   */
  public java.util.List<java.lang.CharSequence> getSiblingnames() {
    return siblingnames;
  }

  /**
   * Sets the value of the 'siblingnames' field.
   * 
   * @param value
   *          the value to set.
   */
  public void setSiblingnames(java.util.List<java.lang.CharSequence> value) {
    this.siblingnames = value;
  }

  /** Creates a new Person RecordBuilder */
  public static org.apache.crunch.test.Person.Builder newBuilder() {
    return new org.apache.crunch.test.Person.Builder();
  }

  /** Creates a new Person RecordBuilder by copying an existing Builder */
  public static org.apache.crunch.test.Person.Builder newBuilder(org.apache.crunch.test.Person.Builder other) {
    return new org.apache.crunch.test.Person.Builder(other);
  }

  /** Creates a new Person RecordBuilder by copying an existing Person instance */
  public static org.apache.crunch.test.Person.Builder newBuilder(org.apache.crunch.test.Person other) {
    return new org.apache.crunch.test.Person.Builder(other);
  }

  /**
   * RecordBuilder for Person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person> implements
      org.apache.avro.data.RecordBuilder<Person> {

    private java.lang.CharSequence name;
    private int age;
    private java.util.List<java.lang.CharSequence> siblingnames;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.crunch.test.Person.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.crunch.test.Person.Builder other) {
      super(other);
    }

    /** Creates a Builder by copying an existing Person instance */
    private Builder(org.apache.crunch.test.Person other) {
      super(org.apache.crunch.test.Person.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = (java.lang.Integer) data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.siblingnames)) {
        this.siblingnames = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[2].schema(),
            other.siblingnames);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }

    /** Sets the value of the 'name' field */
    public org.apache.crunch.test.Person.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'name' field */
    public org.apache.crunch.test.Person.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'age' field */
    public java.lang.Integer getAge() {
      return age;
    }

    /** Sets the value of the 'age' field */
    public org.apache.crunch.test.Person.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'age' field */
    public org.apache.crunch.test.Person.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'siblingnames' field */
    public java.util.List<java.lang.CharSequence> getSiblingnames() {
      return siblingnames;
    }

    /** Sets the value of the 'siblingnames' field */
    public org.apache.crunch.test.Person.Builder setSiblingnames(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.siblingnames = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'siblingnames' field has been set */
    public boolean hasSiblingnames() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'siblingnames' field */
    public org.apache.crunch.test.Person.Builder clearSiblingnames() {
      siblingnames = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Person build() {
      try {
        Person record = new Person();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.siblingnames = fieldSetFlags()[2] ? this.siblingnames
            : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
