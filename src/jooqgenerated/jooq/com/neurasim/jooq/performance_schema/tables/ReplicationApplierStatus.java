/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.ReplicationApplierStatusServiceState;
import com.neurasim.jooq.performance_schema.tables.records.ReplicationApplierStatusRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatus extends TableImpl<ReplicationApplierStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.replication_applier_status</code>
     */
    public static final ReplicationApplierStatus REPLICATION_APPLIER_STATUS = new ReplicationApplierStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationApplierStatusRecord> getRecordType() {
        return ReplicationApplierStatusRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.replication_applier_status.CHANNEL_NAME</code>.
     */
    public final TableField<ReplicationApplierStatusRecord, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.replication_applier_status.SERVICE_STATE</code>.
     */
    public final TableField<ReplicationApplierStatusRecord, ReplicationApplierStatusServiceState> SERVICE_STATE = createField(DSL.name("SERVICE_STATE"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.neurasim.jooq.performance_schema.enums.ReplicationApplierStatusServiceState.class), this, "");

    /**
     * The column
     * <code>performance_schema.replication_applier_status.REMAINING_DELAY</code>.
     */
    public final TableField<ReplicationApplierStatusRecord, UInteger> REMAINING_DELAY = createField(DSL.name("REMAINING_DELAY"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.replication_applier_status.COUNT_TRANSACTIONS_RETRIES</code>.
     */
    public final TableField<ReplicationApplierStatusRecord, ULong> COUNT_TRANSACTIONS_RETRIES = createField(DSL.name("COUNT_TRANSACTIONS_RETRIES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private ReplicationApplierStatus(Name alias, Table<ReplicationApplierStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationApplierStatus(Name alias, Table<ReplicationApplierStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_status</code> table
     * reference
     */
    public ReplicationApplierStatus(String alias) {
        this(DSL.name(alias), REPLICATION_APPLIER_STATUS);
    }

    /**
     * Create an aliased
     * <code>performance_schema.replication_applier_status</code> table
     * reference
     */
    public ReplicationApplierStatus(Name alias) {
        this(alias, REPLICATION_APPLIER_STATUS);
    }

    /**
     * Create a <code>performance_schema.replication_applier_status</code> table
     * reference
     */
    public ReplicationApplierStatus() {
        this(DSL.name("replication_applier_status"), null);
    }

    public <O extends Record> ReplicationApplierStatus(Table<O> child, ForeignKey<O, ReplicationApplierStatusRecord> key) {
        super(child, key, REPLICATION_APPLIER_STATUS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<ReplicationApplierStatusRecord> getPrimaryKey() {
        return Keys.KEY_REPLICATION_APPLIER_STATUS_PRIMARY;
    }

    @Override
    public ReplicationApplierStatus as(String alias) {
        return new ReplicationApplierStatus(DSL.name(alias), this);
    }

    @Override
    public ReplicationApplierStatus as(Name alias) {
        return new ReplicationApplierStatus(alias, this);
    }

    @Override
    public ReplicationApplierStatus as(Table<?> alias) {
        return new ReplicationApplierStatus(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatus rename(String name) {
        return new ReplicationApplierStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatus rename(Name name) {
        return new ReplicationApplierStatus(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatus rename(Table<?> name) {
        return new ReplicationApplierStatus(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, ReplicationApplierStatusServiceState, UInteger, ULong> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super ReplicationApplierStatusServiceState, ? super UInteger, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super ReplicationApplierStatusServiceState, ? super UInteger, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
