/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.tables.records.PasswordHistoryRecord;

import java.time.LocalDateTime;
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


/**
 * Password history for user accounts
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PasswordHistory extends TableImpl<PasswordHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.password_history</code>
     */
    public static final PasswordHistory PASSWORD_HISTORY = new PasswordHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PasswordHistoryRecord> getRecordType() {
        return PasswordHistoryRecord.class;
    }

    /**
     * The column <code>mysql.password_history.Host</code>.
     */
    public final TableField<PasswordHistoryRecord, String> HOST = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.password_history.User</code>.
     */
    public final TableField<PasswordHistoryRecord, String> USER = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.password_history.Password_timestamp</code>.
     */
    public final TableField<PasswordHistoryRecord, LocalDateTime> PASSWORD_TIMESTAMP = createField(DSL.name("Password_timestamp"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP(6)", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.password_history.Password</code>.
     */
    public final TableField<PasswordHistoryRecord, String> PASSWORD = createField(DSL.name("Password"), SQLDataType.CLOB, this, "");

    private PasswordHistory(Name alias, Table<PasswordHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private PasswordHistory(Name alias, Table<PasswordHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Password history for user accounts"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.password_history</code> table reference
     */
    public PasswordHistory(String alias) {
        this(DSL.name(alias), PASSWORD_HISTORY);
    }

    /**
     * Create an aliased <code>mysql.password_history</code> table reference
     */
    public PasswordHistory(Name alias) {
        this(alias, PASSWORD_HISTORY);
    }

    /**
     * Create a <code>mysql.password_history</code> table reference
     */
    public PasswordHistory() {
        this(DSL.name("password_history"), null);
    }

    public <O extends Record> PasswordHistory(Table<O> child, ForeignKey<O, PasswordHistoryRecord> key) {
        super(child, key, PASSWORD_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<PasswordHistoryRecord> getPrimaryKey() {
        return Keys.KEY_PASSWORD_HISTORY_PRIMARY;
    }

    @Override
    public PasswordHistory as(String alias) {
        return new PasswordHistory(DSL.name(alias), this);
    }

    @Override
    public PasswordHistory as(Name alias) {
        return new PasswordHistory(alias, this);
    }

    @Override
    public PasswordHistory as(Table<?> alias) {
        return new PasswordHistory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordHistory rename(String name) {
        return new PasswordHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordHistory rename(Name name) {
        return new PasswordHistory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordHistory rename(Table<?> name) {
        return new PasswordHistory(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}