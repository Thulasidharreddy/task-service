/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.enums.ResourceGroupsResourceGroupType;
import com.neurasim.jooq.information_schema.tables.records.ResourceGroupsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class ResourceGroups extends TableImpl<ResourceGroupsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.RESOURCE_GROUPS</code>
     */
    public static final ResourceGroups RESOURCE_GROUPS = new ResourceGroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResourceGroupsRecord> getRecordType() {
        return ResourceGroupsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_NAME</code>.
     */
    public final TableField<ResourceGroupsRecord, String> RESOURCE_GROUP_NAME = createField(DSL.name("RESOURCE_GROUP_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_TYPE</code>.
     */
    public final TableField<ResourceGroupsRecord, ResourceGroupsResourceGroupType> RESOURCE_GROUP_TYPE = createField(DSL.name("RESOURCE_GROUP_TYPE"), SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(com.neurasim.jooq.information_schema.enums.ResourceGroupsResourceGroupType.class), this, "");

    /**
     * The column
     * <code>information_schema.RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED</code>.
     */
    public final TableField<ResourceGroupsRecord, Byte> RESOURCE_GROUP_ENABLED = createField(DSL.name("RESOURCE_GROUP_ENABLED"), SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>information_schema.RESOURCE_GROUPS.VCPU_IDS</code>.
     */
    public final TableField<ResourceGroupsRecord, byte[]> VCPU_IDS = createField(DSL.name("VCPU_IDS"), SQLDataType.BLOB, this, "");

    /**
     * The column
     * <code>information_schema.RESOURCE_GROUPS.THREAD_PRIORITY</code>.
     */
    public final TableField<ResourceGroupsRecord, Integer> THREAD_PRIORITY = createField(DSL.name("THREAD_PRIORITY"), SQLDataType.INTEGER.nullable(false), this, "");

    private ResourceGroups(Name alias, Table<ResourceGroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResourceGroups(Name alias, Table<ResourceGroupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.RESOURCE_GROUPS</code> table
     * reference
     */
    public ResourceGroups(String alias) {
        this(DSL.name(alias), RESOURCE_GROUPS);
    }

    /**
     * Create an aliased <code>information_schema.RESOURCE_GROUPS</code> table
     * reference
     */
    public ResourceGroups(Name alias) {
        this(alias, RESOURCE_GROUPS);
    }

    /**
     * Create a <code>information_schema.RESOURCE_GROUPS</code> table reference
     */
    public ResourceGroups() {
        this(DSL.name("RESOURCE_GROUPS"), null);
    }

    public <O extends Record> ResourceGroups(Table<O> child, ForeignKey<O, ResourceGroupsRecord> key) {
        super(child, key, RESOURCE_GROUPS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ResourceGroups as(String alias) {
        return new ResourceGroups(DSL.name(alias), this);
    }

    @Override
    public ResourceGroups as(Name alias) {
        return new ResourceGroups(alias, this);
    }

    @Override
    public ResourceGroups as(Table<?> alias) {
        return new ResourceGroups(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceGroups rename(String name) {
        return new ResourceGroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceGroups rename(Name name) {
        return new ResourceGroups(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceGroups rename(Table<?> name) {
        return new ResourceGroups(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, ResourceGroupsResourceGroupType, Byte, byte[], Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super ResourceGroupsResourceGroupType, ? super Byte, ? super byte[], ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super ResourceGroupsResourceGroupType, ? super Byte, ? super byte[], ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
