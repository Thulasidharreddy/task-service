/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Indexes;
import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.CondInstancesRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class CondInstances extends TableImpl<CondInstancesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.cond_instances</code>
     */
    public static final CondInstances COND_INSTANCES = new CondInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CondInstancesRecord> getRecordType() {
        return CondInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.cond_instances.NAME</code>.
     */
    public final TableField<CondInstancesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.cond_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<CondInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private CondInstances(Name alias, Table<CondInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CondInstances(Name alias, Table<CondInstancesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table
     * reference
     */
    public CondInstances(String alias) {
        this(DSL.name(alias), COND_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table
     * reference
     */
    public CondInstances(Name alias) {
        this(alias, COND_INSTANCES);
    }

    /**
     * Create a <code>performance_schema.cond_instances</code> table reference
     */
    public CondInstances() {
        this(DSL.name("cond_instances"), null);
    }

    public <O extends Record> CondInstances(Table<O> child, ForeignKey<O, CondInstancesRecord> key) {
        super(child, key, COND_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.COND_INSTANCES_NAME);
    }

    @Override
    public UniqueKey<CondInstancesRecord> getPrimaryKey() {
        return Keys.KEY_COND_INSTANCES_PRIMARY;
    }

    @Override
    public CondInstances as(String alias) {
        return new CondInstances(DSL.name(alias), this);
    }

    @Override
    public CondInstances as(Name alias) {
        return new CondInstances(alias, this);
    }

    @Override
    public CondInstances as(Table<?> alias) {
        return new CondInstances(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CondInstances rename(String name) {
        return new CondInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CondInstances rename(Name name) {
        return new CondInstances(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CondInstances rename(Table<?> name) {
        return new CondInstances(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, ULong> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
