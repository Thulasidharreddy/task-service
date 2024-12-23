/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.enums.TimeZoneUseLeapSeconds;
import com.neurasim.jooq.mysql.tables.TimeZone;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Time zones
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneRecord extends UpdatableRecordImpl<TimeZoneRecord> implements Record2<UInteger, TimeZoneUseLeapSeconds> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.time_zone.Time_zone_id</code>.
     */
    public TimeZoneRecord setTimeZoneId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.time_zone.Time_zone_id</code>.
     */
    public UInteger getTimeZoneId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.time_zone.Use_leap_seconds</code>.
     */
    public TimeZoneRecord setUseLeapSeconds(TimeZoneUseLeapSeconds value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.time_zone.Use_leap_seconds</code>.
     */
    public TimeZoneUseLeapSeconds getUseLeapSeconds() {
        return (TimeZoneUseLeapSeconds) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UInteger, TimeZoneUseLeapSeconds> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UInteger, TimeZoneUseLeapSeconds> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return TimeZone.TIME_ZONE.TIME_ZONE_ID;
    }

    @Override
    public Field<TimeZoneUseLeapSeconds> field2() {
        return TimeZone.TIME_ZONE.USE_LEAP_SECONDS;
    }

    @Override
    public UInteger component1() {
        return getTimeZoneId();
    }

    @Override
    public TimeZoneUseLeapSeconds component2() {
        return getUseLeapSeconds();
    }

    @Override
    public UInteger value1() {
        return getTimeZoneId();
    }

    @Override
    public TimeZoneUseLeapSeconds value2() {
        return getUseLeapSeconds();
    }

    @Override
    public TimeZoneRecord value1(UInteger value) {
        setTimeZoneId(value);
        return this;
    }

    @Override
    public TimeZoneRecord value2(TimeZoneUseLeapSeconds value) {
        setUseLeapSeconds(value);
        return this;
    }

    @Override
    public TimeZoneRecord values(UInteger value1, TimeZoneUseLeapSeconds value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimeZoneRecord
     */
    public TimeZoneRecord() {
        super(TimeZone.TIME_ZONE);
    }

    /**
     * Create a detached, initialised TimeZoneRecord
     */
    public TimeZoneRecord(UInteger timeZoneId, TimeZoneUseLeapSeconds useLeapSeconds) {
        super(TimeZone.TIME_ZONE);

        setTimeZoneId(timeZoneId);
        setUseLeapSeconds(useLeapSeconds);
    }

    /**
     * Create a detached, initialised TimeZoneRecord
     */
    public TimeZoneRecord(com.neurasim.jooq.mysql.tables.pojos.TimeZone value) {
        super(TimeZone.TIME_ZONE);

        if (value != null) {
            setTimeZoneId(value.getTimeZoneId());
            setUseLeapSeconds(value.getUseLeapSeconds());
        }
    }
}
