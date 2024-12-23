/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.InnodbVirtualRecord;

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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbVirtual extends TableImpl<InnodbVirtualRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_VIRTUAL</code>
     */
    public static final InnodbVirtual INNODB_VIRTUAL = new InnodbVirtual();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbVirtualRecord> getRecordType() {
        return InnodbVirtualRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.TABLE_ID</code>.
     */
    public final TableField<InnodbVirtualRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.POS</code>.
     */
    public final TableField<InnodbVirtualRecord, UInteger> POS = createField(DSL.name("POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.BASE_POS</code>.
     */
    public final TableField<InnodbVirtualRecord, UInteger> BASE_POS = createField(DSL.name("BASE_POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    private InnodbVirtual(Name alias, Table<InnodbVirtualRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbVirtual(Name alias, Table<InnodbVirtualRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_VIRTUAL</code> table
     * reference
     */
    public InnodbVirtual(String alias) {
        this(DSL.name(alias), INNODB_VIRTUAL);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_VIRTUAL</code> table
     * reference
     */
    public InnodbVirtual(Name alias) {
        this(alias, INNODB_VIRTUAL);
    }

    /**
     * Create a <code>information_schema.INNODB_VIRTUAL</code> table reference
     */
    public InnodbVirtual() {
        this(DSL.name("INNODB_VIRTUAL"), null);
    }

    public <O extends Record> InnodbVirtual(Table<O> child, ForeignKey<O, InnodbVirtualRecord> key) {
        super(child, key, INNODB_VIRTUAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbVirtual as(String alias) {
        return new InnodbVirtual(DSL.name(alias), this);
    }

    @Override
    public InnodbVirtual as(Name alias) {
        return new InnodbVirtual(alias, this);
    }

    @Override
    public InnodbVirtual as(Table<?> alias) {
        return new InnodbVirtual(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbVirtual rename(String name) {
        return new InnodbVirtual(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbVirtual rename(Name name) {
        return new InnodbVirtual(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbVirtual rename(Table<?> name) {
        return new InnodbVirtual(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super ULong, ? super UInteger, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super ULong, ? super UInteger, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
