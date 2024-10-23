/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.enums.SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType;
import com.neurasim.jooq.mysql.enums.SlaveRelayLogInfoRequireTablePrimaryKeyCheck;
import com.neurasim.jooq.mysql.tables.records.SlaveRelayLogInfoRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
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
 * Relay Log Information
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveRelayLogInfo extends TableImpl<SlaveRelayLogInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.slave_relay_log_info</code>
     */
    public static final SlaveRelayLogInfo SLAVE_RELAY_LOG_INFO = new SlaveRelayLogInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlaveRelayLogInfoRecord> getRecordType() {
        return SlaveRelayLogInfoRecord.class;
    }

    /**
     * The column <code>mysql.slave_relay_log_info.Number_of_lines</code>.
     * Number of lines in the file or rows in the table. Used to version table
     * definitions.
     */
    public final TableField<SlaveRelayLogInfoRecord, UInteger> NUMBER_OF_LINES = createField(DSL.name("Number_of_lines"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Number of lines in the file or rows in the table. Used to version table definitions.");

    /**
     * The column <code>mysql.slave_relay_log_info.Relay_log_name</code>. The
     * name of the current relay log file.
     */
    public final TableField<SlaveRelayLogInfoRecord, String> RELAY_LOG_NAME = createField(DSL.name("Relay_log_name"), SQLDataType.CLOB, this, "The name of the current relay log file.");

    /**
     * The column <code>mysql.slave_relay_log_info.Relay_log_pos</code>. The
     * relay log position of the last executed event.
     */
    public final TableField<SlaveRelayLogInfoRecord, ULong> RELAY_LOG_POS = createField(DSL.name("Relay_log_pos"), SQLDataType.BIGINTUNSIGNED, this, "The relay log position of the last executed event.");

    /**
     * The column <code>mysql.slave_relay_log_info.Master_log_name</code>. The
     * name of the master binary log file from which the events in the relay log
     * file were read.
     */
    public final TableField<SlaveRelayLogInfoRecord, String> MASTER_LOG_NAME = createField(DSL.name("Master_log_name"), SQLDataType.CLOB, this, "The name of the master binary log file from which the events in the relay log file were read.");

    /**
     * The column <code>mysql.slave_relay_log_info.Master_log_pos</code>. The
     * master log position of the last executed event.
     */
    public final TableField<SlaveRelayLogInfoRecord, ULong> MASTER_LOG_POS = createField(DSL.name("Master_log_pos"), SQLDataType.BIGINTUNSIGNED, this, "The master log position of the last executed event.");

    /**
     * The column <code>mysql.slave_relay_log_info.Sql_delay</code>. The number
     * of seconds that the slave must lag behind the master.
     */
    public final TableField<SlaveRelayLogInfoRecord, Integer> SQL_DELAY = createField(DSL.name("Sql_delay"), SQLDataType.INTEGER, this, "The number of seconds that the slave must lag behind the master.");

    /**
     * The column <code>mysql.slave_relay_log_info.Number_of_workers</code>.
     */
    public final TableField<SlaveRelayLogInfoRecord, UInteger> NUMBER_OF_WORKERS = createField(DSL.name("Number_of_workers"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>mysql.slave_relay_log_info.Id</code>. Internal Id that
     * uniquely identifies this record.
     */
    public final TableField<SlaveRelayLogInfoRecord, UInteger> ID = createField(DSL.name("Id"), SQLDataType.INTEGERUNSIGNED, this, "Internal Id that uniquely identifies this record.");

    /**
     * The column <code>mysql.slave_relay_log_info.Channel_name</code>. The
     * channel on which the replica is connected to a source. Used in
     * Multisource Replication
     */
    public final TableField<SlaveRelayLogInfoRecord, String> CHANNEL_NAME = createField(DSL.name("Channel_name"), SQLDataType.VARCHAR(64).nullable(false), this, "The channel on which the replica is connected to a source. Used in Multisource Replication");

    /**
     * The column
     * <code>mysql.slave_relay_log_info.Privilege_checks_username</code>.
     * Username part of PRIVILEGE_CHECKS_USER.
     */
    public final TableField<SlaveRelayLogInfoRecord, String> PRIVILEGE_CHECKS_USERNAME = createField(DSL.name("Privilege_checks_username"), SQLDataType.VARCHAR(32), this, "Username part of PRIVILEGE_CHECKS_USER.");

    /**
     * The column
     * <code>mysql.slave_relay_log_info.Privilege_checks_hostname</code>.
     * Hostname part of PRIVILEGE_CHECKS_USER.
     */
    public final TableField<SlaveRelayLogInfoRecord, String> PRIVILEGE_CHECKS_HOSTNAME = createField(DSL.name("Privilege_checks_hostname"), SQLDataType.VARCHAR(255), this, "Hostname part of PRIVILEGE_CHECKS_USER.");

    /**
     * The column <code>mysql.slave_relay_log_info.Require_row_format</code>.
     * Indicates whether the channel shall only accept row based events.
     */
    public final TableField<SlaveRelayLogInfoRecord, Byte> REQUIRE_ROW_FORMAT = createField(DSL.name("Require_row_format"), SQLDataType.TINYINT.nullable(false), this, "Indicates whether the channel shall only accept row based events.");

    /**
     * The column
     * <code>mysql.slave_relay_log_info.Require_table_primary_key_check</code>.
     * Indicates what is the channel policy regarding tables without primary
     * keys on create and alter table queries
     */
    public final TableField<SlaveRelayLogInfoRecord, SlaveRelayLogInfoRequireTablePrimaryKeyCheck> REQUIRE_TABLE_PRIMARY_KEY_CHECK = createField(DSL.name("Require_table_primary_key_check"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.inline("STREAM", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.SlaveRelayLogInfoRequireTablePrimaryKeyCheck.class), this, "Indicates what is the channel policy regarding tables without primary keys on create and alter table queries");

    /**
     * The column
     * <code>mysql.slave_relay_log_info.Assign_gtids_to_anonymous_transactions_type</code>.
     * Indicates whether the channel will generate a new GTID for anonymous
     * transactions. OFF means that anonymous transactions will remain
     * anonymous. LOCAL means that anonymous transactions will be assigned a
     * newly generated GTID based on server_uuid. UUID indicates that anonymous
     * transactions will be assigned a newly generated GTID based on
     * Assign_gtids_to_anonymous_transactions_value
     */
    public final TableField<SlaveRelayLogInfoRecord, SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType> ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE = createField(DSL.name("Assign_gtids_to_anonymous_transactions_type"), SQLDataType.VARCHAR(5).nullable(false).defaultValue(DSL.inline("OFF", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType.class), this, "Indicates whether the channel will generate a new GTID for anonymous transactions. OFF means that anonymous transactions will remain anonymous. LOCAL means that anonymous transactions will be assigned a newly generated GTID based on server_uuid. UUID indicates that anonymous transactions will be assigned a newly generated GTID based on Assign_gtids_to_anonymous_transactions_value");

    /**
     * The column
     * <code>mysql.slave_relay_log_info.Assign_gtids_to_anonymous_transactions_value</code>.
     * Indicates the UUID used while generating GTIDs for anonymous transactions
     */
    public final TableField<SlaveRelayLogInfoRecord, String> ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE = createField(DSL.name("Assign_gtids_to_anonymous_transactions_value"), SQLDataType.CLOB, this, "Indicates the UUID used while generating GTIDs for anonymous transactions");

    private SlaveRelayLogInfo(Name alias, Table<SlaveRelayLogInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SlaveRelayLogInfo(Name alias, Table<SlaveRelayLogInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Relay Log Information"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.slave_relay_log_info</code> table reference
     */
    public SlaveRelayLogInfo(String alias) {
        this(DSL.name(alias), SLAVE_RELAY_LOG_INFO);
    }

    /**
     * Create an aliased <code>mysql.slave_relay_log_info</code> table reference
     */
    public SlaveRelayLogInfo(Name alias) {
        this(alias, SLAVE_RELAY_LOG_INFO);
    }

    /**
     * Create a <code>mysql.slave_relay_log_info</code> table reference
     */
    public SlaveRelayLogInfo() {
        this(DSL.name("slave_relay_log_info"), null);
    }

    public <O extends Record> SlaveRelayLogInfo(Table<O> child, ForeignKey<O, SlaveRelayLogInfoRecord> key) {
        super(child, key, SLAVE_RELAY_LOG_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<SlaveRelayLogInfoRecord> getPrimaryKey() {
        return Keys.KEY_SLAVE_RELAY_LOG_INFO_PRIMARY;
    }

    @Override
    public SlaveRelayLogInfo as(String alias) {
        return new SlaveRelayLogInfo(DSL.name(alias), this);
    }

    @Override
    public SlaveRelayLogInfo as(Name alias) {
        return new SlaveRelayLogInfo(alias, this);
    }

    @Override
    public SlaveRelayLogInfo as(Table<?> alias) {
        return new SlaveRelayLogInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveRelayLogInfo rename(String name) {
        return new SlaveRelayLogInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveRelayLogInfo rename(Name name) {
        return new SlaveRelayLogInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveRelayLogInfo rename(Table<?> name) {
        return new SlaveRelayLogInfo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<UInteger, String, ULong, String, ULong, Integer, UInteger, UInteger, String, String, String, Byte, SlaveRelayLogInfoRequireTablePrimaryKeyCheck, SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super UInteger, ? super String, ? super ULong, ? super String, ? super ULong, ? super Integer, ? super UInteger, ? super UInteger, ? super String, ? super String, ? super String, ? super Byte, ? super SlaveRelayLogInfoRequireTablePrimaryKeyCheck, ? super SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super UInteger, ? super String, ? super ULong, ? super String, ? super ULong, ? super Integer, ? super UInteger, ? super UInteger, ? super String, ? super String, ? super String, ? super Byte, ? super SlaveRelayLogInfoRequireTablePrimaryKeyCheck, ? super SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
