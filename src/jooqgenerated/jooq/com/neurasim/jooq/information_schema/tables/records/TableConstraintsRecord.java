/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.TableConstraints;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraintsRecord extends TableRecordImpl<TableConstraintsRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public TableConstraintsRecord setConstraintCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public TableConstraintsRecord setConstraintSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public TableConstraintsRecord setConstraintName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public TableConstraintsRecord setTableSchema(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
     */
    public TableConstraintsRecord setTableName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public TableConstraintsRecord setConstraintType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public String getConstraintType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS.ENFORCED</code>.
     */
    public TableConstraintsRecord setEnforced(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS.ENFORCED</code>.
     */
    public String getEnforced() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME;
    }

    @Override
    public Field<String> field4() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field5() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME;
    }

    @Override
    public Field<String> field6() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE;
    }

    @Override
    public Field<String> field7() {
        return TableConstraints.TABLE_CONSTRAINTS.ENFORCED;
    }

    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    public String component3() {
        return getConstraintName();
    }

    @Override
    public String component4() {
        return getTableSchema();
    }

    @Override
    public String component5() {
        return getTableName();
    }

    @Override
    public String component6() {
        return getConstraintType();
    }

    @Override
    public String component7() {
        return getEnforced();
    }

    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    public String value3() {
        return getConstraintName();
    }

    @Override
    public String value4() {
        return getTableSchema();
    }

    @Override
    public String value5() {
        return getTableName();
    }

    @Override
    public String value6() {
        return getConstraintType();
    }

    @Override
    public String value7() {
        return getEnforced();
    }

    @Override
    public TableConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public TableConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public TableConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public TableConstraintsRecord value4(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public TableConstraintsRecord value5(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TableConstraintsRecord value6(String value) {
        setConstraintType(value);
        return this;
    }

    @Override
    public TableConstraintsRecord value7(String value) {
        setEnforced(value);
        return this;
    }

    @Override
    public TableConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached TableConstraintsRecord
     */
    public TableConstraintsRecord() {
        super(TableConstraints.TABLE_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised TableConstraintsRecord
     */
    public TableConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableSchema, String tableName, String constraintType, String enforced) {
        super(TableConstraints.TABLE_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setConstraintType(constraintType);
        setEnforced(enforced);
    }

    /**
     * Create a detached, initialised TableConstraintsRecord
     */
    public TableConstraintsRecord(com.neurasim.jooq.information_schema.tables.pojos.TableConstraints value) {
        super(TableConstraints.TABLE_CONSTRAINTS);

        if (value != null) {
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setConstraintType(value.getConstraintType());
            setEnforced(value.getEnforced());
        }
    }
}
