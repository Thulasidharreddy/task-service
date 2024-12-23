/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.RoleTableGrantsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleTableGrants extends TableImpl<RoleTableGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.ROLE_TABLE_GRANTS</code>
     */
    public static final RoleTableGrants ROLE_TABLE_GRANTS = new RoleTableGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleTableGrantsRecord> getRecordType() {
        return RoleTableGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTOR = createField(DSL.name("GRANTOR"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR_HOST</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTOR_HOST = createField(DSL.name("GRANTOR_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE_HOST</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> GRANTEE_HOST = createField(DSL.name("GRANTEE_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_CATALOG</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_SCHEMA</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.ROLE_TABLE_GRANTS.TABLE_NAME</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(98).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_TABLE_GRANTS.IS_GRANTABLE</code>.
     */
    public final TableField<RoleTableGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private RoleTableGrants(Name alias, Table<RoleTableGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleTableGrants(Name alias, Table<RoleTableGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ROLE_TABLE_GRANTS</code> table
     * reference
     */
    public RoleTableGrants(String alias) {
        this(DSL.name(alias), ROLE_TABLE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.ROLE_TABLE_GRANTS</code> table
     * reference
     */
    public RoleTableGrants(Name alias) {
        this(alias, ROLE_TABLE_GRANTS);
    }

    /**
     * Create a <code>information_schema.ROLE_TABLE_GRANTS</code> table
     * reference
     */
    public RoleTableGrants() {
        this(DSL.name("ROLE_TABLE_GRANTS"), null);
    }

    public <O extends Record> RoleTableGrants(Table<O> child, ForeignKey<O, RoleTableGrantsRecord> key) {
        super(child, key, ROLE_TABLE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleTableGrants as(String alias) {
        return new RoleTableGrants(DSL.name(alias), this);
    }

    @Override
    public RoleTableGrants as(Name alias) {
        return new RoleTableGrants(alias, this);
    }

    @Override
    public RoleTableGrants as(Table<?> alias) {
        return new RoleTableGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleTableGrants rename(String name) {
        return new RoleTableGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleTableGrants rename(Name name) {
        return new RoleTableGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleTableGrants rename(Table<?> name) {
        return new RoleTableGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
