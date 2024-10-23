/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsWaitsSummaryByThreadByEventNameRecord extends UpdatableRecordImpl<EventsWaitsSummaryByThreadByEventNameRecord> implements Record7<ULong, String, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setThreadId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setEventName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setCountStar(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setSumTimerWait(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setMinTimerWait(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setAvgTimerWait(ULong value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public EventsWaitsSummaryByThreadByEventNameRecord setMaxTimerWait(ULong value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<ULong, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<ULong, String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.THREAD_ID;
    }

    @Override
    public Field<String> field2() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.COUNT_STAR;
    }

    @Override
    public Field<ULong> field4() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.SUM_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field5() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.MIN_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field6() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.AVG_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field7() {
        return EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME.MAX_TIMER_WAIT;
    }

    @Override
    public ULong component1() {
        return getThreadId();
    }

    @Override
    public String component2() {
        return getEventName();
    }

    @Override
    public ULong component3() {
        return getCountStar();
    }

    @Override
    public ULong component4() {
        return getSumTimerWait();
    }

    @Override
    public ULong component5() {
        return getMinTimerWait();
    }

    @Override
    public ULong component6() {
        return getAvgTimerWait();
    }

    @Override
    public ULong component7() {
        return getMaxTimerWait();
    }

    @Override
    public ULong value1() {
        return getThreadId();
    }

    @Override
    public String value2() {
        return getEventName();
    }

    @Override
    public ULong value3() {
        return getCountStar();
    }

    @Override
    public ULong value4() {
        return getSumTimerWait();
    }

    @Override
    public ULong value5() {
        return getMinTimerWait();
    }

    @Override
    public ULong value6() {
        return getAvgTimerWait();
    }

    @Override
    public ULong value7() {
        return getMaxTimerWait();
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value3(ULong value) {
        setCountStar(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value4(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value5(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value6(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord value7(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    @Override
    public EventsWaitsSummaryByThreadByEventNameRecord values(ULong value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsWaitsSummaryByThreadByEventNameRecord
     */
    public EventsWaitsSummaryByThreadByEventNameRecord() {
        super(EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised
     * EventsWaitsSummaryByThreadByEventNameRecord
     */
    public EventsWaitsSummaryByThreadByEventNameRecord(ULong threadId, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait) {
        super(EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);

        setThreadId(threadId);
        setEventName(eventName);
        setCountStar(countStar);
        setSumTimerWait(sumTimerWait);
        setMinTimerWait(minTimerWait);
        setAvgTimerWait(avgTimerWait);
        setMaxTimerWait(maxTimerWait);
    }

    /**
     * Create a detached, initialised
     * EventsWaitsSummaryByThreadByEventNameRecord
     */
    public EventsWaitsSummaryByThreadByEventNameRecord(com.neurasim.jooq.performance_schema.tables.pojos.EventsWaitsSummaryByThreadByEventName value) {
        super(EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);

        if (value != null) {
            setThreadId(value.getThreadId());
            setEventName(value.getEventName());
            setCountStar(value.getCountStar());
            setSumTimerWait(value.getSumTimerWait());
            setMinTimerWait(value.getMinTimerWait());
            setAvgTimerWait(value.getAvgTimerWait());
            setMaxTimerWait(value.getMaxTimerWait());
        }
    }
}
