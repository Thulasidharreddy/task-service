/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.InnodbForeign;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbForeignRecord extends TableRecordImpl<InnodbForeignRecord> implements Record5<String, String, String, Long, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN.ID</code>.
     */
    public InnodbForeignRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN.FOR_NAME</code>.
     */
    public InnodbForeignRecord setForName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.FOR_NAME</code>.
     */
    public String getForName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN.REF_NAME</code>.
     */
    public InnodbForeignRecord setRefName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.REF_NAME</code>.
     */
    public String getRefName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN.N_COLS</code>.
     */
    public InnodbForeignRecord setNCols(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.N_COLS</code>.
     */
    public Long getNCols() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN.TYPE</code>.
     */
    public InnodbForeignRecord setType(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.TYPE</code>.
     */
    public ULong getType() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Long, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Long, ULong> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbForeign.INNODB_FOREIGN.ID;
    }

    @Override
    public Field<String> field2() {
        return InnodbForeign.INNODB_FOREIGN.FOR_NAME;
    }

    @Override
    public Field<String> field3() {
        return InnodbForeign.INNODB_FOREIGN.REF_NAME;
    }

    @Override
    public Field<Long> field4() {
        return InnodbForeign.INNODB_FOREIGN.N_COLS;
    }

    @Override
    public Field<ULong> field5() {
        return InnodbForeign.INNODB_FOREIGN.TYPE;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getForName();
    }

    @Override
    public String component3() {
        return getRefName();
    }

    @Override
    public Long component4() {
        return getNCols();
    }

    @Override
    public ULong component5() {
        return getType();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getForName();
    }

    @Override
    public String value3() {
        return getRefName();
    }

    @Override
    public Long value4() {
        return getNCols();
    }

    @Override
    public ULong value5() {
        return getType();
    }

    @Override
    public InnodbForeignRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public InnodbForeignRecord value2(String value) {
        setForName(value);
        return this;
    }

    @Override
    public InnodbForeignRecord value3(String value) {
        setRefName(value);
        return this;
    }

    @Override
    public InnodbForeignRecord value4(Long value) {
        setNCols(value);
        return this;
    }

    @Override
    public InnodbForeignRecord value5(ULong value) {
        setType(value);
        return this;
    }

    @Override
    public InnodbForeignRecord values(String value1, String value2, String value3, Long value4, ULong value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbForeignRecord
     */
    public InnodbForeignRecord() {
        super(InnodbForeign.INNODB_FOREIGN);
    }

    /**
     * Create a detached, initialised InnodbForeignRecord
     */
    public InnodbForeignRecord(String id, String forName, String refName, Long nCols, ULong type) {
        super(InnodbForeign.INNODB_FOREIGN);

        setId(id);
        setForName(forName);
        setRefName(refName);
        setNCols(nCols);
        setType(type);
    }

    /**
     * Create a detached, initialised InnodbForeignRecord
     */
    public InnodbForeignRecord(com.neurasim.jooq.information_schema.tables.pojos.InnodbForeign value) {
        super(InnodbForeign.INNODB_FOREIGN);

        if (value != null) {
            setId(value.getId());
            setForName(value.getForName());
            setRefName(value.getRefName());
            setNCols(value.getNCols());
            setType(value.getType());
        }
    }
}