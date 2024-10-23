/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.Component;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Components
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ComponentRecord extends UpdatableRecordImpl<ComponentRecord> implements Record3<UInteger, UInteger, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.component.component_id</code>.
     */
    public ComponentRecord setComponentId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.component.component_id</code>.
     */
    public UInteger getComponentId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.component.component_group_id</code>.
     */
    public ComponentRecord setComponentGroupId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.component.component_group_id</code>.
     */
    public UInteger getComponentGroupId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>mysql.component.component_urn</code>.
     */
    public ComponentRecord setComponentUrn(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.component.component_urn</code>.
     */
    public String getComponentUrn() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UInteger, UInteger, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Component.COMPONENT.COMPONENT_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return Component.COMPONENT.COMPONENT_GROUP_ID;
    }

    @Override
    public Field<String> field3() {
        return Component.COMPONENT.COMPONENT_URN;
    }

    @Override
    public UInteger component1() {
        return getComponentId();
    }

    @Override
    public UInteger component2() {
        return getComponentGroupId();
    }

    @Override
    public String component3() {
        return getComponentUrn();
    }

    @Override
    public UInteger value1() {
        return getComponentId();
    }

    @Override
    public UInteger value2() {
        return getComponentGroupId();
    }

    @Override
    public String value3() {
        return getComponentUrn();
    }

    @Override
    public ComponentRecord value1(UInteger value) {
        setComponentId(value);
        return this;
    }

    @Override
    public ComponentRecord value2(UInteger value) {
        setComponentGroupId(value);
        return this;
    }

    @Override
    public ComponentRecord value3(String value) {
        setComponentUrn(value);
        return this;
    }

    @Override
    public ComponentRecord values(UInteger value1, UInteger value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ComponentRecord
     */
    public ComponentRecord() {
        super(Component.COMPONENT);
    }

    /**
     * Create a detached, initialised ComponentRecord
     */
    public ComponentRecord(UInteger componentId, UInteger componentGroupId, String componentUrn) {
        super(Component.COMPONENT);

        setComponentId(componentId);
        setComponentGroupId(componentGroupId);
        setComponentUrn(componentUrn);
    }

    /**
     * Create a detached, initialised ComponentRecord
     */
    public ComponentRecord(com.neurasim.jooq.mysql.tables.pojos.Component value) {
        super(Component.COMPONENT);

        if (value != null) {
            setComponentId(value.getComponentId());
            setComponentGroupId(value.getComponentGroupId());
            setComponentUrn(value.getComponentUrn());
        }
    }
}
