/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.TlsChannelStatus;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TlsChannelStatusRecord extends TableRecordImpl<TlsChannelStatusRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.tls_channel_status.CHANNEL</code>.
     */
    public TlsChannelStatusRecord setChannel(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.CHANNEL</code>.
     */
    public String getChannel() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.tls_channel_status.PROPERTY</code>.
     */
    public TlsChannelStatusRecord setProperty(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.PROPERTY</code>.
     */
    public String getProperty() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.tls_channel_status.VALUE</code>.
     */
    public TlsChannelStatusRecord setValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.VALUE</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TlsChannelStatus.TLS_CHANNEL_STATUS.CHANNEL;
    }

    @Override
    public Field<String> field2() {
        return TlsChannelStatus.TLS_CHANNEL_STATUS.PROPERTY;
    }

    @Override
    public Field<String> field3() {
        return TlsChannelStatus.TLS_CHANNEL_STATUS.VALUE;
    }

    @Override
    public String component1() {
        return getChannel();
    }

    @Override
    public String component2() {
        return getProperty();
    }

    @Override
    public String component3() {
        return getValue();
    }

    @Override
    public String value1() {
        return getChannel();
    }

    @Override
    public String value2() {
        return getProperty();
    }

    @Override
    public String value3() {
        return getValue();
    }

    @Override
    public TlsChannelStatusRecord value1(String value) {
        setChannel(value);
        return this;
    }

    @Override
    public TlsChannelStatusRecord value2(String value) {
        setProperty(value);
        return this;
    }

    @Override
    public TlsChannelStatusRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TlsChannelStatusRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TlsChannelStatusRecord
     */
    public TlsChannelStatusRecord() {
        super(TlsChannelStatus.TLS_CHANNEL_STATUS);
    }

    /**
     * Create a detached, initialised TlsChannelStatusRecord
     */
    public TlsChannelStatusRecord(String channel, String property, String value) {
        super(TlsChannelStatus.TLS_CHANNEL_STATUS);

        setChannel(channel);
        setProperty(property);
        setValue(value);
    }

    /**
     * Create a detached, initialised TlsChannelStatusRecord
     */
    public TlsChannelStatusRecord(com.neurasim.jooq.performance_schema.tables.pojos.TlsChannelStatus value) {
        super(TlsChannelStatus.TLS_CHANNEL_STATUS);

        if (value != null) {
            setChannel(value.getChannel());
            setProperty(value.getProperty());
            setValue(value.getValue());
        }
    }
}
