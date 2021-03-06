/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.graph.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Query extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Query\",\"namespace\":\"org.librairy.service.graph.facade.model\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"filter\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"fields\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[],\"order\":\"ignore\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String type;
   private java.lang.String filter;
   private java.util.List<java.lang.String> fields;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Query() {}

  /**
   * All-args constructor.
   */
  public Query(java.lang.String type, java.lang.String filter, java.util.List<java.lang.String> fields) {
    this.type = type;
    this.filter = filter;
    this.fields = fields;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return filter;
    case 2: return fields;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: filter = (java.lang.String)value$; break;
    case 2: fields = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'filter' field.
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Sets the value of the 'filter' field.
   * @param value the value to set.
   */
  public void setFilter(java.lang.String value) {
    this.filter = value;
  }

  /**
   * Gets the value of the 'fields' field.
   */
  public java.util.List<java.lang.String> getFields() {
    return fields;
  }

  /**
   * Sets the value of the 'fields' field.
   * @param value the value to set.
   */
  public void setFields(java.util.List<java.lang.String> value) {
    this.fields = value;
  }

  /** Creates a new Query RecordBuilder */
  public static org.librairy.service.graph.facade.model.Query.Builder newBuilder() {
    return new org.librairy.service.graph.facade.model.Query.Builder();
  }
  
  /** Creates a new Query RecordBuilder by copying an existing Builder */
  public static org.librairy.service.graph.facade.model.Query.Builder newBuilder(org.librairy.service.graph.facade.model.Query.Builder other) {
    return new org.librairy.service.graph.facade.model.Query.Builder(other);
  }
  
  /** Creates a new Query RecordBuilder by copying an existing Query instance */
  public static org.librairy.service.graph.facade.model.Query.Builder newBuilder(org.librairy.service.graph.facade.model.Query other) {
    return new org.librairy.service.graph.facade.model.Query.Builder(other);
  }
  
  /**
   * RecordBuilder for Query instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Query>
    implements org.apache.avro.data.RecordBuilder<Query> {

    private java.lang.String type;
    private java.lang.String filter;
    private java.util.List<java.lang.String> fields;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.graph.facade.model.Query.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.graph.facade.model.Query.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.filter)) {
        this.filter = data().deepCopy(fields()[1].schema(), other.filter);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.fields)) {
        this.fields = data().deepCopy(fields()[2].schema(), other.fields);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Query instance */
    private Builder(org.librairy.service.graph.facade.model.Query other) {
            super(org.librairy.service.graph.facade.model.Query.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.filter)) {
        this.filter = data().deepCopy(fields()[1].schema(), other.filter);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.fields)) {
        this.fields = data().deepCopy(fields()[2].schema(), other.fields);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public java.lang.String getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.librairy.service.graph.facade.model.Query.Builder setType(java.lang.String value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public org.librairy.service.graph.facade.model.Query.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'filter' field */
    public java.lang.String getFilter() {
      return filter;
    }
    
    /** Sets the value of the 'filter' field */
    public org.librairy.service.graph.facade.model.Query.Builder setFilter(java.lang.String value) {
      validate(fields()[1], value);
      this.filter = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'filter' field has been set */
    public boolean hasFilter() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'filter' field */
    public org.librairy.service.graph.facade.model.Query.Builder clearFilter() {
      filter = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'fields' field */
    public java.util.List<java.lang.String> getFields() {
      return fields;
    }
    
    /** Sets the value of the 'fields' field */
    public org.librairy.service.graph.facade.model.Query.Builder setFields(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.fields = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'fields' field has been set */
    public boolean hasFields() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'fields' field */
    public org.librairy.service.graph.facade.model.Query.Builder clearFields() {
      fields = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Query build() {
      try {
        Query record = new Query();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.filter = fieldSetFlags()[1] ? this.filter : (java.lang.String) defaultValue(fields()[1]);
        record.fields = fieldSetFlags()[2] ? this.fields : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
