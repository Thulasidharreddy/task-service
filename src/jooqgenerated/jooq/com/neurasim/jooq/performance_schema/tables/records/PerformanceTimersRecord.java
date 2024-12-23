/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.PerformanceTimersTimerName;
import com.neurasim.jooq.performance_schema.tables.PerformanceTimers;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PerformanceTimersRecord extends TableRecordImpl<PerformanceTimersRecord> implements Record4<PerformanceTimersTimerName, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
     */
    public PerformanceTimersRecord setTimerName(PerformanceTimersTimerName value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
     */
    public PerformanceTimersTimerName getTimerName() {
        return (PerformanceTimersTimerName) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
     */
    public PerformanceTimersRecord setTimerFrequency(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
     */
    public Long getTimerFrequency() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
     */
    public PerformanceTimersRecord setTimerResolution(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
     */
    public Long getTimerResolution() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
     */
    public PerformanceTimersRecord setTimerOverhead(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
     */
    public Long getTimerOverhead() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<PerformanceTimersTimerName, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<PerformanceTimersTimerName, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<PerformanceTimersTimerName> field1() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_NAME;
    }

    @Override
    public Field<Long> field2() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_FREQUENCY;
    }

    @Override
    public Field<Long> field3() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_RESOLUTION;
    }

    @Override
    public Field<Long> field4() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_OVERHEAD;
    }

    @Override
    public PerformanceTimersTimerName component1() {
        return getTimerName();
    }

    @Override
    public Long component2() {
        return getTimerFrequency();
    }

    @Override
    public Long component3() {
        return getTimerResolution();
    }

    @Override
    public Long component4() {
        return getTimerOverhead();
    }

    @Override
    public PerformanceTimersTimerName value1() {
        return getTimerName();
    }

    @Override
    public Long value2() {
        return getTimerFrequency();
    }

    @Override
    public Long value3() {
        return getTimerResolution();
    }

    @Override
    public Long value4() {
        return getTimerOverhead();
    }

    @Override
    public PerformanceTimersRecord value1(PerformanceTimersTimerName value) {
        setTimerName(value);
        return this;
    }

    @Override
    public PerformanceTimersRecord value2(Long value) {
        setTimerFrequency(value);
        return this;
    }

    @Override
    public PerformanceTimersRecord value3(Long value) {
        setTimerResolution(value);
        return this;
    }

    @Override
    public PerformanceTimersRecord value4(Long value) {
        setTimerOverhead(value);
        return this;
    }

    @Override
    public PerformanceTimersRecord values(PerformanceTimersTimerName value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PerformanceTimersRecord
     */
    public PerformanceTimersRecord() {
        super(PerformanceTimers.PERFORMANCE_TIMERS);
    }

    /**
     * Create a detached, initialised PerformanceTimersRecord
     */
    public PerformanceTimersRecord(PerformanceTimersTimerName timerName, Long timerFrequency, Long timerResolution, Long timerOverhead) {
        super(PerformanceTimers.PERFORMANCE_TIMERS);

        setTimerName(timerName);
        setTimerFrequency(timerFrequency);
        setTimerResolution(timerResolution);
        setTimerOverhead(timerOverhead);
    }

    /**
     * Create a detached, initialised PerformanceTimersRecord
     */
    public PerformanceTimersRecord(com.neurasim.jooq.performance_schema.tables.pojos.PerformanceTimers value) {
        super(PerformanceTimers.PERFORMANCE_TIMERS);

        if (value != null) {
            setTimerName(value.getTimerName());
            setTimerFrequency(value.getTimerFrequency());
            setTimerResolution(value.getTimerResolution());
            setTimerOverhead(value.getTimerOverhead());
        }
    }
}
