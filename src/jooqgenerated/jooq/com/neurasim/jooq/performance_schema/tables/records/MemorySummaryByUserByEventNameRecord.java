/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.MemorySummaryByUserByEventName;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemorySummaryByUserByEventNameRecord extends TableRecordImpl<MemorySummaryByUserByEventNameRecord> implements Record12<String, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.USER</code>.
     */
    public MemorySummaryByUserByEventNameRecord setUser(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public MemorySummaryByUserByEventNameRecord setEventName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_ALLOC</code>.
     */
    public MemorySummaryByUserByEventNameRecord setCountAlloc(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_ALLOC</code>.
     */
    public ULong getCountAlloc() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_FREE</code>.
     */
    public MemorySummaryByUserByEventNameRecord setCountFree(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_FREE</code>.
     */
    public ULong getCountFree() {
        return (ULong) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public MemorySummaryByUserByEventNameRecord setSumNumberOfBytesAlloc(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public ULong getSumNumberOfBytesAlloc() {
        return (ULong) get(4);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public MemorySummaryByUserByEventNameRecord setSumNumberOfBytesFree(ULong value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public ULong getSumNumberOfBytesFree() {
        return (ULong) get(5);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.LOW_COUNT_USED</code>.
     */
    public MemorySummaryByUserByEventNameRecord setLowCountUsed(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.LOW_COUNT_USED</code>.
     */
    public Long getLowCountUsed() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public MemorySummaryByUserByEventNameRecord setCurrentCountUsed(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public Long getCurrentCountUsed() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_COUNT_USED</code>.
     */
    public MemorySummaryByUserByEventNameRecord setHighCountUsed(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_COUNT_USED</code>.
     */
    public Long getHighCountUsed() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public MemorySummaryByUserByEventNameRecord setLowNumberOfBytesUsed(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getLowNumberOfBytesUsed() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public MemorySummaryByUserByEventNameRecord setCurrentNumberOfBytesUsed(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getCurrentNumberOfBytesUsed() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public MemorySummaryByUserByEventNameRecord setHighNumberOfBytesUsed(Long value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getHighNumberOfBytesUsed() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.USER;
    }

    @Override
    public Field<String> field2() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.EVENT_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_ALLOC;
    }

    @Override
    public Field<ULong> field4() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_FREE;
    }

    @Override
    public Field<ULong> field5() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_ALLOC;
    }

    @Override
    public Field<ULong> field6() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_FREE;
    }

    @Override
    public Field<Long> field7() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.LOW_COUNT_USED;
    }

    @Override
    public Field<Long> field8() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.CURRENT_COUNT_USED;
    }

    @Override
    public Field<Long> field9() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.HIGH_COUNT_USED;
    }

    @Override
    public Field<Long> field10() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.LOW_NUMBER_OF_BYTES_USED;
    }

    @Override
    public Field<Long> field11() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.CURRENT_NUMBER_OF_BYTES_USED;
    }

    @Override
    public Field<Long> field12() {
        return MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME.HIGH_NUMBER_OF_BYTES_USED;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public String component2() {
        return getEventName();
    }

    @Override
    public ULong component3() {
        return getCountAlloc();
    }

    @Override
    public ULong component4() {
        return getCountFree();
    }

    @Override
    public ULong component5() {
        return getSumNumberOfBytesAlloc();
    }

    @Override
    public ULong component6() {
        return getSumNumberOfBytesFree();
    }

    @Override
    public Long component7() {
        return getLowCountUsed();
    }

    @Override
    public Long component8() {
        return getCurrentCountUsed();
    }

    @Override
    public Long component9() {
        return getHighCountUsed();
    }

    @Override
    public Long component10() {
        return getLowNumberOfBytesUsed();
    }

    @Override
    public Long component11() {
        return getCurrentNumberOfBytesUsed();
    }

    @Override
    public Long component12() {
        return getHighNumberOfBytesUsed();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public String value2() {
        return getEventName();
    }

    @Override
    public ULong value3() {
        return getCountAlloc();
    }

    @Override
    public ULong value4() {
        return getCountFree();
    }

    @Override
    public ULong value5() {
        return getSumNumberOfBytesAlloc();
    }

    @Override
    public ULong value6() {
        return getSumNumberOfBytesFree();
    }

    @Override
    public Long value7() {
        return getLowCountUsed();
    }

    @Override
    public Long value8() {
        return getCurrentCountUsed();
    }

    @Override
    public Long value9() {
        return getHighCountUsed();
    }

    @Override
    public Long value10() {
        return getLowNumberOfBytesUsed();
    }

    @Override
    public Long value11() {
        return getCurrentNumberOfBytesUsed();
    }

    @Override
    public Long value12() {
        return getHighNumberOfBytesUsed();
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value2(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value3(ULong value) {
        setCountAlloc(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value4(ULong value) {
        setCountFree(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value5(ULong value) {
        setSumNumberOfBytesAlloc(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value6(ULong value) {
        setSumNumberOfBytesFree(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value7(Long value) {
        setLowCountUsed(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value8(Long value) {
        setCurrentCountUsed(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value9(Long value) {
        setHighCountUsed(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value10(Long value) {
        setLowNumberOfBytesUsed(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value11(Long value) {
        setCurrentNumberOfBytesUsed(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord value12(Long value) {
        setHighNumberOfBytesUsed(value);
        return this;
    }

    @Override
    public MemorySummaryByUserByEventNameRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, Long value7, Long value8, Long value9, Long value10, Long value11, Long value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemorySummaryByUserByEventNameRecord
     */
    public MemorySummaryByUserByEventNameRecord() {
        super(MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised MemorySummaryByUserByEventNameRecord
     */
    public MemorySummaryByUserByEventNameRecord(String user, String eventName, ULong countAlloc, ULong countFree, ULong sumNumberOfBytesAlloc, ULong sumNumberOfBytesFree, Long lowCountUsed, Long currentCountUsed, Long highCountUsed, Long lowNumberOfBytesUsed, Long currentNumberOfBytesUsed, Long highNumberOfBytesUsed) {
        super(MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME);

        setUser(user);
        setEventName(eventName);
        setCountAlloc(countAlloc);
        setCountFree(countFree);
        setSumNumberOfBytesAlloc(sumNumberOfBytesAlloc);
        setSumNumberOfBytesFree(sumNumberOfBytesFree);
        setLowCountUsed(lowCountUsed);
        setCurrentCountUsed(currentCountUsed);
        setHighCountUsed(highCountUsed);
        setLowNumberOfBytesUsed(lowNumberOfBytesUsed);
        setCurrentNumberOfBytesUsed(currentNumberOfBytesUsed);
        setHighNumberOfBytesUsed(highNumberOfBytesUsed);
    }

    /**
     * Create a detached, initialised MemorySummaryByUserByEventNameRecord
     */
    public MemorySummaryByUserByEventNameRecord(com.neurasim.jooq.performance_schema.tables.pojos.MemorySummaryByUserByEventName value) {
        super(MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME);

        if (value != null) {
            setUser(value.getUser());
            setEventName(value.getEventName());
            setCountAlloc(value.getCountAlloc());
            setCountFree(value.getCountFree());
            setSumNumberOfBytesAlloc(value.getSumNumberOfBytesAlloc());
            setSumNumberOfBytesFree(value.getSumNumberOfBytesFree());
            setLowCountUsed(value.getLowCountUsed());
            setCurrentCountUsed(value.getCurrentCountUsed());
            setHighCountUsed(value.getHighCountUsed());
            setLowNumberOfBytesUsed(value.getLowNumberOfBytesUsed());
            setCurrentNumberOfBytesUsed(value.getCurrentNumberOfBytesUsed());
            setHighNumberOfBytesUsed(value.getHighNumberOfBytesUsed());
        }
    }
}
