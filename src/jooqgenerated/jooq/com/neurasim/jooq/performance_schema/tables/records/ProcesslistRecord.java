/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.ProcesslistExecutionEngine;
import com.neurasim.jooq.performance_schema.tables.Processlist;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcesslistRecord extends UpdatableRecordImpl<ProcesslistRecord> implements Record9<ULong, String, String, String, String, Long, String, String, ProcesslistExecutionEngine> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.processlist.ID</code>.
     */
    public ProcesslistRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.ID</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.processlist.USER</code>.
     */
    public ProcesslistRecord setUser(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.USER</code>.
     */
    public String getUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.processlist.HOST</code>.
     */
    public ProcesslistRecord setHost(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.HOST</code>.
     */
    public String getHost() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.processlist.DB</code>.
     */
    public ProcesslistRecord setDb(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.DB</code>.
     */
    public String getDb() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.processlist.COMMAND</code>.
     */
    public ProcesslistRecord setCommand(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.COMMAND</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.processlist.TIME</code>.
     */
    public ProcesslistRecord setTime(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.TIME</code>.
     */
    public Long getTime() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>performance_schema.processlist.STATE</code>.
     */
    public ProcesslistRecord setState(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.STATE</code>.
     */
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.processlist.INFO</code>.
     */
    public ProcesslistRecord setInfo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.INFO</code>.
     */
    public String getInfo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.processlist.EXECUTION_ENGINE</code>.
     */
    public ProcesslistRecord setExecutionEngine(ProcesslistExecutionEngine value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.processlist.EXECUTION_ENGINE</code>.
     */
    public ProcesslistExecutionEngine getExecutionEngine() {
        return (ProcesslistExecutionEngine) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, String, String, String, Long, String, String, ProcesslistExecutionEngine> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, String, String, String, String, Long, String, String, ProcesslistExecutionEngine> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Processlist.PROCESSLIST.ID;
    }

    @Override
    public Field<String> field2() {
        return Processlist.PROCESSLIST.USER;
    }

    @Override
    public Field<String> field3() {
        return Processlist.PROCESSLIST.HOST;
    }

    @Override
    public Field<String> field4() {
        return Processlist.PROCESSLIST.DB;
    }

    @Override
    public Field<String> field5() {
        return Processlist.PROCESSLIST.COMMAND;
    }

    @Override
    public Field<Long> field6() {
        return Processlist.PROCESSLIST.TIME;
    }

    @Override
    public Field<String> field7() {
        return Processlist.PROCESSLIST.STATE;
    }

    @Override
    public Field<String> field8() {
        return Processlist.PROCESSLIST.INFO;
    }

    @Override
    public Field<ProcesslistExecutionEngine> field9() {
        return Processlist.PROCESSLIST.EXECUTION_ENGINE;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUser();
    }

    @Override
    public String component3() {
        return getHost();
    }

    @Override
    public String component4() {
        return getDb();
    }

    @Override
    public String component5() {
        return getCommand();
    }

    @Override
    public Long component6() {
        return getTime();
    }

    @Override
    public String component7() {
        return getState();
    }

    @Override
    public String component8() {
        return getInfo();
    }

    @Override
    public ProcesslistExecutionEngine component9() {
        return getExecutionEngine();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUser();
    }

    @Override
    public String value3() {
        return getHost();
    }

    @Override
    public String value4() {
        return getDb();
    }

    @Override
    public String value5() {
        return getCommand();
    }

    @Override
    public Long value6() {
        return getTime();
    }

    @Override
    public String value7() {
        return getState();
    }

    @Override
    public String value8() {
        return getInfo();
    }

    @Override
    public ProcesslistExecutionEngine value9() {
        return getExecutionEngine();
    }

    @Override
    public ProcesslistRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public ProcesslistRecord value2(String value) {
        setUser(value);
        return this;
    }

    @Override
    public ProcesslistRecord value3(String value) {
        setHost(value);
        return this;
    }

    @Override
    public ProcesslistRecord value4(String value) {
        setDb(value);
        return this;
    }

    @Override
    public ProcesslistRecord value5(String value) {
        setCommand(value);
        return this;
    }

    @Override
    public ProcesslistRecord value6(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public ProcesslistRecord value7(String value) {
        setState(value);
        return this;
    }

    @Override
    public ProcesslistRecord value8(String value) {
        setInfo(value);
        return this;
    }

    @Override
    public ProcesslistRecord value9(ProcesslistExecutionEngine value) {
        setExecutionEngine(value);
        return this;
    }

    @Override
    public ProcesslistRecord values(ULong value1, String value2, String value3, String value4, String value5, Long value6, String value7, String value8, ProcesslistExecutionEngine value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcesslistRecord
     */
    public ProcesslistRecord() {
        super(Processlist.PROCESSLIST);
    }

    /**
     * Create a detached, initialised ProcesslistRecord
     */
    public ProcesslistRecord(ULong id, String user, String host, String db, String command, Long time, String state, String info, ProcesslistExecutionEngine executionEngine) {
        super(Processlist.PROCESSLIST);

        setId(id);
        setUser(user);
        setHost(host);
        setDb(db);
        setCommand(command);
        setTime(time);
        setState(state);
        setInfo(info);
        setExecutionEngine(executionEngine);
    }

    /**
     * Create a detached, initialised ProcesslistRecord
     */
    public ProcesslistRecord(com.neurasim.jooq.performance_schema.tables.pojos.Processlist value) {
        super(Processlist.PROCESSLIST);

        if (value != null) {
            setId(value.getId());
            setUser(value.getUser());
            setHost(value.getHost());
            setDb(value.getDb());
            setCommand(value.getCommand());
            setTime(value.getTime());
            setState(value.getState());
            setInfo(value.getInfo());
            setExecutionEngine(value.getExecutionEngine());
        }
    }
}