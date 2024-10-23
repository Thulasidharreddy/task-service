/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.EventsTransactionsSummaryByHostByEventName;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsTransactionsSummaryByHostByEventNameRecord extends TableRecordImpl<EventsTransactionsSummaryByHostByEventNameRecord> implements Record17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.HOST</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setHost(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.HOST</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.EVENT_NAME</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setEventName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_STAR</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setCountStar(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setSumTimerWait(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setMinTimerWait(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setAvgTimerWait(ULong value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setMaxTimerWait(ULong value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_WRITE</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setCountReadWrite(ULong value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_WRITE</code>.
     */
    public ULong getCountReadWrite() {
        return (ULong) get(7);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setSumTimerReadWrite(ULong value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public ULong getSumTimerReadWrite() {
        return (ULong) get(8);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setMinTimerReadWrite(ULong value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public ULong getMinTimerReadWrite() {
        return (ULong) get(9);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setAvgTimerReadWrite(ULong value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public ULong getAvgTimerReadWrite() {
        return (ULong) get(10);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setMaxTimerReadWrite(ULong value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public ULong getMaxTimerReadWrite() {
        return (ULong) get(11);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_ONLY</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setCountReadOnly(ULong value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_ONLY</code>.
     */
    public ULong getCountReadOnly() {
        return (ULong) get(12);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setSumTimerReadOnly(ULong value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public ULong getSumTimerReadOnly() {
        return (ULong) get(13);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setMinTimerReadOnly(ULong value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public ULong getMinTimerReadOnly() {
        return (ULong) get(14);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setAvgTimerReadOnly(ULong value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public ULong getAvgTimerReadOnly() {
        return (ULong) get(15);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public EventsTransactionsSummaryByHostByEventNameRecord setMaxTimerReadOnly(ULong value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public ULong getMaxTimerReadOnly() {
        return (ULong) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.HOST;
    }

    @Override
    public Field<String> field2() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.COUNT_STAR;
    }

    @Override
    public Field<ULong> field4() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.SUM_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field5() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.MIN_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field6() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.AVG_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field7() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.MAX_TIMER_WAIT;
    }

    @Override
    public Field<ULong> field8() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.COUNT_READ_WRITE;
    }

    @Override
    public Field<ULong> field9() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.SUM_TIMER_READ_WRITE;
    }

    @Override
    public Field<ULong> field10() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.MIN_TIMER_READ_WRITE;
    }

    @Override
    public Field<ULong> field11() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.AVG_TIMER_READ_WRITE;
    }

    @Override
    public Field<ULong> field12() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.MAX_TIMER_READ_WRITE;
    }

    @Override
    public Field<ULong> field13() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.COUNT_READ_ONLY;
    }

    @Override
    public Field<ULong> field14() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.SUM_TIMER_READ_ONLY;
    }

    @Override
    public Field<ULong> field15() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.MIN_TIMER_READ_ONLY;
    }

    @Override
    public Field<ULong> field16() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.AVG_TIMER_READ_ONLY;
    }

    @Override
    public Field<ULong> field17() {
        return EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME.MAX_TIMER_READ_ONLY;
    }

    @Override
    public String component1() {
        return getHost();
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
    public ULong component8() {
        return getCountReadWrite();
    }

    @Override
    public ULong component9() {
        return getSumTimerReadWrite();
    }

    @Override
    public ULong component10() {
        return getMinTimerReadWrite();
    }

    @Override
    public ULong component11() {
        return getAvgTimerReadWrite();
    }

    @Override
    public ULong component12() {
        return getMaxTimerReadWrite();
    }

    @Override
    public ULong component13() {
        return getCountReadOnly();
    }

    @Override
    public ULong component14() {
        return getSumTimerReadOnly();
    }

    @Override
    public ULong component15() {
        return getMinTimerReadOnly();
    }

    @Override
    public ULong component16() {
        return getAvgTimerReadOnly();
    }

    @Override
    public ULong component17() {
        return getMaxTimerReadOnly();
    }

    @Override
    public String value1() {
        return getHost();
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
    public ULong value8() {
        return getCountReadWrite();
    }

    @Override
    public ULong value9() {
        return getSumTimerReadWrite();
    }

    @Override
    public ULong value10() {
        return getMinTimerReadWrite();
    }

    @Override
    public ULong value11() {
        return getAvgTimerReadWrite();
    }

    @Override
    public ULong value12() {
        return getMaxTimerReadWrite();
    }

    @Override
    public ULong value13() {
        return getCountReadOnly();
    }

    @Override
    public ULong value14() {
        return getSumTimerReadOnly();
    }

    @Override
    public ULong value15() {
        return getMinTimerReadOnly();
    }

    @Override
    public ULong value16() {
        return getAvgTimerReadOnly();
    }

    @Override
    public ULong value17() {
        return getMaxTimerReadOnly();
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value1(String value) {
        setHost(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value3(ULong value) {
        setCountStar(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value4(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value5(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value6(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value7(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value8(ULong value) {
        setCountReadWrite(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value9(ULong value) {
        setSumTimerReadWrite(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value10(ULong value) {
        setMinTimerReadWrite(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value11(ULong value) {
        setAvgTimerReadWrite(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value12(ULong value) {
        setMaxTimerReadWrite(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value13(ULong value) {
        setCountReadOnly(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value14(ULong value) {
        setSumTimerReadOnly(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value15(ULong value) {
        setMinTimerReadOnly(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value16(ULong value) {
        setAvgTimerReadOnly(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord value17(ULong value) {
        setMaxTimerReadOnly(value);
        return this;
    }

    @Override
    public EventsTransactionsSummaryByHostByEventNameRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, ULong value14, ULong value15, ULong value16, ULong value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsTransactionsSummaryByHostByEventNameRecord
     */
    public EventsTransactionsSummaryByHostByEventNameRecord() {
        super(EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised
     * EventsTransactionsSummaryByHostByEventNameRecord
     */
    public EventsTransactionsSummaryByHostByEventNameRecord(String host, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countReadWrite, ULong sumTimerReadWrite, ULong minTimerReadWrite, ULong avgTimerReadWrite, ULong maxTimerReadWrite, ULong countReadOnly, ULong sumTimerReadOnly, ULong minTimerReadOnly, ULong avgTimerReadOnly, ULong maxTimerReadOnly) {
        super(EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);

        setHost(host);
        setEventName(eventName);
        setCountStar(countStar);
        setSumTimerWait(sumTimerWait);
        setMinTimerWait(minTimerWait);
        setAvgTimerWait(avgTimerWait);
        setMaxTimerWait(maxTimerWait);
        setCountReadWrite(countReadWrite);
        setSumTimerReadWrite(sumTimerReadWrite);
        setMinTimerReadWrite(minTimerReadWrite);
        setAvgTimerReadWrite(avgTimerReadWrite);
        setMaxTimerReadWrite(maxTimerReadWrite);
        setCountReadOnly(countReadOnly);
        setSumTimerReadOnly(sumTimerReadOnly);
        setMinTimerReadOnly(minTimerReadOnly);
        setAvgTimerReadOnly(avgTimerReadOnly);
        setMaxTimerReadOnly(maxTimerReadOnly);
    }

    /**
     * Create a detached, initialised
     * EventsTransactionsSummaryByHostByEventNameRecord
     */
    public EventsTransactionsSummaryByHostByEventNameRecord(com.neurasim.jooq.performance_schema.tables.pojos.EventsTransactionsSummaryByHostByEventName value) {
        super(EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);

        if (value != null) {
            setHost(value.getHost());
            setEventName(value.getEventName());
            setCountStar(value.getCountStar());
            setSumTimerWait(value.getSumTimerWait());
            setMinTimerWait(value.getMinTimerWait());
            setAvgTimerWait(value.getAvgTimerWait());
            setMaxTimerWait(value.getMaxTimerWait());
            setCountReadWrite(value.getCountReadWrite());
            setSumTimerReadWrite(value.getSumTimerReadWrite());
            setMinTimerReadWrite(value.getMinTimerReadWrite());
            setAvgTimerReadWrite(value.getAvgTimerReadWrite());
            setMaxTimerReadWrite(value.getMaxTimerReadWrite());
            setCountReadOnly(value.getCountReadOnly());
            setSumTimerReadOnly(value.getSumTimerReadOnly());
            setMinTimerReadOnly(value.getMinTimerReadOnly());
            setAvgTimerReadOnly(value.getAvgTimerReadOnly());
            setMaxTimerReadOnly(value.getMaxTimerReadOnly());
        }
    }
}
