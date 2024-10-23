/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class EventsWaitsSummaryByThreadByEventName extends TableImpl<EventsWaitsSummaryByThreadByEventNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>
     */
    public static final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = new EventsWaitsSummaryByThreadByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsSummaryByThreadByEventNameRecord> getRecordType() {
        return EventsWaitsSummaryByThreadByEventNameRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private EventsWaitsSummaryByThreadByEventName(Name alias, Table<EventsWaitsSummaryByThreadByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsSummaryByThreadByEventName(Name alias, Table<EventsWaitsSummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>
     * table reference
     */
    public EventsWaitsSummaryByThreadByEventName(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>
     * table reference
     */
    public EventsWaitsSummaryByThreadByEventName(Name alias) {
        this(alias, EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create a
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>
     * table reference
     */
    public EventsWaitsSummaryByThreadByEventName() {
        this(DSL.name("events_waits_summary_by_thread_by_event_name"), null);
    }

    public <O extends Record> EventsWaitsSummaryByThreadByEventName(Table<O> child, ForeignKey<O, EventsWaitsSummaryByThreadByEventNameRecord> key) {
        super(child, key, EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<EventsWaitsSummaryByThreadByEventNameRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME_PRIMARY;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventName as(String alias) {
        return new EventsWaitsSummaryByThreadByEventName(DSL.name(alias), this);
    }

    @Override
    public EventsWaitsSummaryByThreadByEventName as(Name alias) {
        return new EventsWaitsSummaryByThreadByEventName(alias, this);
    }

    @Override
    public EventsWaitsSummaryByThreadByEventName as(Table<?> alias) {
        return new EventsWaitsSummaryByThreadByEventName(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByThreadByEventName rename(String name) {
        return new EventsWaitsSummaryByThreadByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByThreadByEventName rename(Name name) {
        return new EventsWaitsSummaryByThreadByEventName(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByThreadByEventName rename(Table<?> name) {
        return new EventsWaitsSummaryByThreadByEventName(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super ULong, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super ULong, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
