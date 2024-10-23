/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.MemorySummaryByThreadByEventNameRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
public class MemorySummaryByThreadByEventName extends TableImpl<MemorySummaryByThreadByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     */
    public static final MemorySummaryByThreadByEventName MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME = new MemorySummaryByThreadByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemorySummaryByThreadByEventNameRecord> getRecordType() {
        return MemorySummaryByThreadByEventNameRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_ALLOC</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> COUNT_ALLOC = createField(DSL.name("COUNT_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_FREE</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> COUNT_FREE = createField(DSL.name("COUNT_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_ALLOC = createField(DSL.name("SUM_NUMBER_OF_BYTES_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_FREE = createField(DSL.name("SUM_NUMBER_OF_BYTES_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> LOW_COUNT_USED = createField(DSL.name("LOW_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> CURRENT_COUNT_USED = createField(DSL.name("CURRENT_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> HIGH_COUNT_USED = createField(DSL.name("HIGH_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> LOW_NUMBER_OF_BYTES_USED = createField(DSL.name("LOW_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> CURRENT_NUMBER_OF_BYTES_USED = createField(DSL.name("CURRENT_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByThreadByEventNameRecord, Long> HIGH_NUMBER_OF_BYTES_USED = createField(DSL.name("HIGH_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    private MemorySummaryByThreadByEventName(Name alias, Table<MemorySummaryByThreadByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemorySummaryByThreadByEventName(Name alias, Table<MemorySummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     * table reference
     */
    public MemorySummaryByThreadByEventName(String alias) {
        this(DSL.name(alias), MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     * table reference
     */
    public MemorySummaryByThreadByEventName(Name alias) {
        this(alias, MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create a
     * <code>performance_schema.memory_summary_by_thread_by_event_name</code>
     * table reference
     */
    public MemorySummaryByThreadByEventName() {
        this(DSL.name("memory_summary_by_thread_by_event_name"), null);
    }

    public <O extends Record> MemorySummaryByThreadByEventName(Table<O> child, ForeignKey<O, MemorySummaryByThreadByEventNameRecord> key) {
        super(child, key, MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<MemorySummaryByThreadByEventNameRecord> getPrimaryKey() {
        return Keys.KEY_MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME_PRIMARY;
    }

    @Override
    public MemorySummaryByThreadByEventName as(String alias) {
        return new MemorySummaryByThreadByEventName(DSL.name(alias), this);
    }

    @Override
    public MemorySummaryByThreadByEventName as(Name alias) {
        return new MemorySummaryByThreadByEventName(alias, this);
    }

    @Override
    public MemorySummaryByThreadByEventName as(Table<?> alias) {
        return new MemorySummaryByThreadByEventName(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByThreadByEventName rename(String name) {
        return new MemorySummaryByThreadByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByThreadByEventName rename(Name name) {
        return new MemorySummaryByThreadByEventName(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByThreadByEventName rename(Table<?> name) {
        return new MemorySummaryByThreadByEventName(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<ULong, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super ULong, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super ULong, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}