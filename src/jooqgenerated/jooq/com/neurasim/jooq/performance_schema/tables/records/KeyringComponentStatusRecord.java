/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.KeyringComponentStatus;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeyringComponentStatusRecord extends TableRecordImpl<KeyringComponentStatusRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.keyring_component_status.STATUS_KEY</code>.
     */
    public KeyringComponentStatusRecord setStatusKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.keyring_component_status.STATUS_KEY</code>.
     */
    public String getStatusKey() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.keyring_component_status.STATUS_VALUE</code>.
     */
    public KeyringComponentStatusRecord setStatusValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.keyring_component_status.STATUS_VALUE</code>.
     */
    public String getStatusValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return KeyringComponentStatus.KEYRING_COMPONENT_STATUS.STATUS_KEY;
    }

    @Override
    public Field<String> field2() {
        return KeyringComponentStatus.KEYRING_COMPONENT_STATUS.STATUS_VALUE;
    }

    @Override
    public String component1() {
        return getStatusKey();
    }

    @Override
    public String component2() {
        return getStatusValue();
    }

    @Override
    public String value1() {
        return getStatusKey();
    }

    @Override
    public String value2() {
        return getStatusValue();
    }

    @Override
    public KeyringComponentStatusRecord value1(String value) {
        setStatusKey(value);
        return this;
    }

    @Override
    public KeyringComponentStatusRecord value2(String value) {
        setStatusValue(value);
        return this;
    }

    @Override
    public KeyringComponentStatusRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyringComponentStatusRecord
     */
    public KeyringComponentStatusRecord() {
        super(KeyringComponentStatus.KEYRING_COMPONENT_STATUS);
    }

    /**
     * Create a detached, initialised KeyringComponentStatusRecord
     */
    public KeyringComponentStatusRecord(String statusKey, String statusValue) {
        super(KeyringComponentStatus.KEYRING_COMPONENT_STATUS);

        setStatusKey(statusKey);
        setStatusValue(statusValue);
    }

    /**
     * Create a detached, initialised KeyringComponentStatusRecord
     */
    public KeyringComponentStatusRecord(com.neurasim.jooq.performance_schema.tables.pojos.KeyringComponentStatus value) {
        super(KeyringComponentStatus.KEYRING_COMPONENT_STATUS);

        if (value != null) {
            setStatusKey(value.getStatusKey());
            setStatusValue(value.getStatusValue());
        }
    }
}