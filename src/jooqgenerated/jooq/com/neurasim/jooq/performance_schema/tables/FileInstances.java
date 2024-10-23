/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Indexes;
import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.FileInstancesRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileInstances extends TableImpl<FileInstancesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.file_instances</code>
     */
    public static final FileInstances FILE_INSTANCES = new FileInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileInstancesRecord> getRecordType() {
        return FileInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.file_instances.FILE_NAME</code>.
     */
    public final TableField<FileInstancesRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_instances.EVENT_NAME</code>.
     */
    public final TableField<FileInstancesRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_instances.OPEN_COUNT</code>.
     */
    public final TableField<FileInstancesRecord, UInteger> OPEN_COUNT = createField(DSL.name("OPEN_COUNT"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private FileInstances(Name alias, Table<FileInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileInstances(Name alias, Table<FileInstancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.file_instances</code> table
     * reference
     */
    public FileInstances(String alias) {
        this(DSL.name(alias), FILE_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.file_instances</code> table
     * reference
     */
    public FileInstances(Name alias) {
        this(alias, FILE_INSTANCES);
    }

    /**
     * Create a <code>performance_schema.file_instances</code> table reference
     */
    public FileInstances() {
        this(DSL.name("file_instances"), null);
    }

    public <O extends Record> FileInstances(Table<O> child, ForeignKey<O, FileInstancesRecord> key) {
        super(child, key, FILE_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FILE_INSTANCES_EVENT_NAME);
    }

    @Override
    public UniqueKey<FileInstancesRecord> getPrimaryKey() {
        return Keys.KEY_FILE_INSTANCES_PRIMARY;
    }

    @Override
    public FileInstances as(String alias) {
        return new FileInstances(DSL.name(alias), this);
    }

    @Override
    public FileInstances as(Name alias) {
        return new FileInstances(alias, this);
    }

    @Override
    public FileInstances as(Table<?> alias) {
        return new FileInstances(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileInstances rename(String name) {
        return new FileInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileInstances rename(Name name) {
        return new FileInstances(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileInstances rename(Table<?> name) {
        return new FileInstances(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}