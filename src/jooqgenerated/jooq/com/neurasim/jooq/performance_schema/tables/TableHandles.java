/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Indexes;
import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.TableHandlesRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableHandles extends TableImpl<TableHandlesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.table_handles</code>
     */
    public static final TableHandles TABLE_HANDLES = new TableHandles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableHandlesRecord> getRecordType() {
        return TableHandlesRecord.class;
    }

    /**
     * The column <code>performance_schema.table_handles.OBJECT_TYPE</code>.
     */
    public final TableField<TableHandlesRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OBJECT_SCHEMA</code>.
     */
    public final TableField<TableHandlesRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OBJECT_NAME</code>.
     */
    public final TableField<TableHandlesRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.table_handles.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<TableHandlesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_handles.OWNER_THREAD_ID</code>.
     */
    public final TableField<TableHandlesRecord, ULong> OWNER_THREAD_ID = createField(DSL.name("OWNER_THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.table_handles.OWNER_EVENT_ID</code>.
     */
    public final TableField<TableHandlesRecord, ULong> OWNER_EVENT_ID = createField(DSL.name("OWNER_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.table_handles.INTERNAL_LOCK</code>.
     */
    public final TableField<TableHandlesRecord, String> INTERNAL_LOCK = createField(DSL.name("INTERNAL_LOCK"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_handles.EXTERNAL_LOCK</code>.
     */
    public final TableField<TableHandlesRecord, String> EXTERNAL_LOCK = createField(DSL.name("EXTERNAL_LOCK"), SQLDataType.VARCHAR(64), this, "");

    private TableHandles(Name alias, Table<TableHandlesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableHandles(Name alias, Table<TableHandlesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.table_handles</code> table
     * reference
     */
    public TableHandles(String alias) {
        this(DSL.name(alias), TABLE_HANDLES);
    }

    /**
     * Create an aliased <code>performance_schema.table_handles</code> table
     * reference
     */
    public TableHandles(Name alias) {
        this(alias, TABLE_HANDLES);
    }

    /**
     * Create a <code>performance_schema.table_handles</code> table reference
     */
    public TableHandles() {
        this(DSL.name("table_handles"), null);
    }

    public <O extends Record> TableHandles(Table<O> child, ForeignKey<O, TableHandlesRecord> key) {
        super(child, key, TABLE_HANDLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.TABLE_HANDLES_OBJECT_TYPE, Indexes.TABLE_HANDLES_OWNER_THREAD_ID);
    }

    @Override
    public UniqueKey<TableHandlesRecord> getPrimaryKey() {
        return Keys.KEY_TABLE_HANDLES_PRIMARY;
    }

    @Override
    public TableHandles as(String alias) {
        return new TableHandles(DSL.name(alias), this);
    }

    @Override
    public TableHandles as(Name alias) {
        return new TableHandles(alias, this);
    }

    @Override
    public TableHandles as(Table<?> alias) {
        return new TableHandles(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableHandles rename(String name) {
        return new TableHandles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableHandles rename(Name name) {
        return new TableHandles(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableHandles rename(Table<?> name) {
        return new TableHandles(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, ULong, ULong, ULong, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}