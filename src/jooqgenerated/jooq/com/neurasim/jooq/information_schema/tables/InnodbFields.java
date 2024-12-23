/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.InnodbFieldsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFields extends TableImpl<InnodbFieldsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_FIELDS</code>
     */
    public static final InnodbFields INNODB_FIELDS = new InnodbFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFieldsRecord> getRecordType() {
        return InnodbFieldsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FIELDS.INDEX_ID</code>.
     */
    public final TableField<InnodbFieldsRecord, byte[]> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_FIELDS.NAME</code>.
     */
    public final TableField<InnodbFieldsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_FIELDS.POS</code>.
     */
    public final TableField<InnodbFieldsRecord, ULong> POS = createField(DSL.name("POS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbFields(Name alias, Table<InnodbFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFields(Name alias, Table<InnodbFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FIELDS</code> table
     * reference
     */
    public InnodbFields(String alias) {
        this(DSL.name(alias), INNODB_FIELDS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FIELDS</code> table
     * reference
     */
    public InnodbFields(Name alias) {
        this(alias, INNODB_FIELDS);
    }

    /**
     * Create a <code>information_schema.INNODB_FIELDS</code> table reference
     */
    public InnodbFields() {
        this(DSL.name("INNODB_FIELDS"), null);
    }

    public <O extends Record> InnodbFields(Table<O> child, ForeignKey<O, InnodbFieldsRecord> key) {
        super(child, key, INNODB_FIELDS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbFields as(String alias) {
        return new InnodbFields(DSL.name(alias), this);
    }

    @Override
    public InnodbFields as(Name alias) {
        return new InnodbFields(alias, this);
    }

    @Override
    public InnodbFields as(Table<?> alias) {
        return new InnodbFields(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFields rename(String name) {
        return new InnodbFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFields rename(Name name) {
        return new InnodbFields(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFields rename(Table<?> name) {
        return new InnodbFields(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<byte[], String, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super byte[], ? super String, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super byte[], ? super String, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
