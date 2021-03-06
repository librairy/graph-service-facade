/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.graph.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Selection extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Selection\",\"namespace\":\"org.librairy.service.graph.facade.model\",\"fields\":[{\"name\":\"query\",\"type\":{\"type\":\"record\",\"name\":\"Query\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"filter\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"fields\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[],\"order\":\"ignore\"}]}},{\"name\":\"count\",\"type\":\"long\",\"default\":0,\"order\":\"ignore\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.librairy.service.graph.facade.model.Query query;
   private long count;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Selection() {}

  /**
   * All-args constructor.
   */
  public Selection(org.librairy.service.graph.facade.model.Query query, java.lang.Long count) {
    this.query = query;
    this.count = count;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return query;
    case 1: return count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: query = (org.librairy.service.graph.facade.model.Query)value$; break;
    case 1: count = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'query' field.
   */
  public org.librairy.service.graph.facade.model.Query getQuery() {
    return query;
  }

  /**
   * Sets the value of the 'query' field.
   * @param value the value to set.
   */
  public void setQuery(org.librairy.service.graph.facade.model.Query value) {
    this.query = value;
  }

  /**
   * Gets the value of the 'count' field.
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Sets the value of the 'count' field.
   * @param value the value to set.
   */
  public void setCount(java.lang.Long value) {
    this.count = value;
  }

  /** Creates a new Selection RecordBuilder */
  public static org.librairy.service.graph.facade.model.Selection.Builder newBuilder() {
    return new org.librairy.service.graph.facade.model.Selection.Builder();
  }
  
  /** Creates a new Selection RecordBuilder by copying an existing Builder */
  public static org.librairy.service.graph.facade.model.Selection.Builder newBuilder(org.librairy.service.graph.facade.model.Selection.Builder other) {
    return new org.librairy.service.graph.facade.model.Selection.Builder(other);
  }
  
  /** Creates a new Selection RecordBuilder by copying an existing Selection instance */
  public static org.librairy.service.graph.facade.model.Selection.Builder newBuilder(org.librairy.service.graph.facade.model.Selection other) {
    return new org.librairy.service.graph.facade.model.Selection.Builder(other);
  }
  
  /**
   * RecordBuilder for Selection instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Selection>
    implements org.apache.avro.data.RecordBuilder<Selection> {

    private org.librairy.service.graph.facade.model.Query query;
    private long count;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.graph.facade.model.Selection.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.graph.facade.model.Selection.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.query)) {
        this.query = data().deepCopy(fields()[0].schema(), other.query);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.count)) {
        this.count = data().deepCopy(fields()[1].schema(), other.count);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Selection instance */
    private Builder(org.librairy.service.graph.facade.model.Selection other) {
            super(org.librairy.service.graph.facade.model.Selection.SCHEMA$);
      if (isValidValue(fields()[0], other.query)) {
        this.query = data().deepCopy(fields()[0].schema(), other.query);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.count)) {
        this.count = data().deepCopy(fields()[1].schema(), other.count);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'query' field */
    public org.librairy.service.graph.facade.model.Query getQuery() {
      return query;
    }
    
    /** Sets the value of the 'query' field */
    public org.librairy.service.graph.facade.model.Selection.Builder setQuery(org.librairy.service.graph.facade.model.Query value) {
      validate(fields()[0], value);
      this.query = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'query' field has been set */
    public boolean hasQuery() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'query' field */
    public org.librairy.service.graph.facade.model.Selection.Builder clearQuery() {
      query = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'count' field */
    public java.lang.Long getCount() {
      return count;
    }
    
    /** Sets the value of the 'count' field */
    public org.librairy.service.graph.facade.model.Selection.Builder setCount(long value) {
      validate(fields()[1], value);
      this.count = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'count' field has been set */
    public boolean hasCount() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'count' field */
    public org.librairy.service.graph.facade.model.Selection.Builder clearCount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Selection build() {
      try {
        Selection record = new Selection();
        record.query = fieldSetFlags()[0] ? this.query : (org.librairy.service.graph.facade.model.Query) defaultValue(fields()[0]);
        record.count = fieldSetFlags()[1] ? this.count : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
