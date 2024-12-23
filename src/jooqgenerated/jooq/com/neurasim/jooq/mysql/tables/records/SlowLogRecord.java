/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.SlowLog;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Slow log
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlowLogRecord extends TableRecordImpl<SlowLogRecord> implements Record12<LocalDateTime, String, LocalTime, LocalTime, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.slow_log.start_time</code>.
     */
    public SlowLogRecord setStartTime(LocalDateTime value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>mysql.slow_log.user_host</code>.
     */
    public SlowLogRecord setUserHost(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.user_host</code>.
     */
    public String getUserHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.slow_log.query_time</code>.
     */
    public SlowLogRecord setQueryTime(LocalTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.query_time</code>.
     */
    public LocalTime getQueryTime() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>mysql.slow_log.lock_time</code>.
     */
    public SlowLogRecord setLockTime(LocalTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.lock_time</code>.
     */
    public LocalTime getLockTime() {
        return (LocalTime) get(3);
    }

    /**
     * Setter for <code>mysql.slow_log.rows_sent</code>.
     */
    public SlowLogRecord setRowsSent(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.rows_sent</code>.
     */
    public Integer getRowsSent() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mysql.slow_log.rows_examined</code>.
     */
    public SlowLogRecord setRowsExamined(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.rows_examined</code>.
     */
    public Integer getRowsExamined() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mysql.slow_log.db</code>.
     */
    public SlowLogRecord setDb(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.db</code>.
     */
    public String getDb() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mysql.slow_log.last_insert_id</code>.
     */
    public SlowLogRecord setLastInsertId(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.last_insert_id</code>.
     */
    public Integer getLastInsertId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mysql.slow_log.insert_id</code>.
     */
    public SlowLogRecord setInsertId(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.insert_id</code>.
     */
    public Integer getInsertId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mysql.slow_log.server_id</code>.
     */
    public SlowLogRecord setServerId(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.server_id</code>.
     */
    public UInteger getServerId() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>mysql.slow_log.sql_text</code>.
     */
    public SlowLogRecord setSqlText(byte[] value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.sql_text</code>.
     */
    public byte[] getSqlText() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>mysql.slow_log.thread_id</code>.
     */
    public SlowLogRecord setThreadId(ULong value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slow_log.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<LocalDateTime, String, LocalTime, LocalTime, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<LocalDateTime, String, LocalTime, LocalTime, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<LocalDateTime> field1() {
        return SlowLog.SLOW_LOG.START_TIME;
    }

    @Override
    public Field<String> field2() {
        return SlowLog.SLOW_LOG.USER_HOST;
    }

    @Override
    public Field<LocalTime> field3() {
        return SlowLog.SLOW_LOG.QUERY_TIME;
    }

    @Override
    public Field<LocalTime> field4() {
        return SlowLog.SLOW_LOG.LOCK_TIME;
    }

    @Override
    public Field<Integer> field5() {
        return SlowLog.SLOW_LOG.ROWS_SENT;
    }

    @Override
    public Field<Integer> field6() {
        return SlowLog.SLOW_LOG.ROWS_EXAMINED;
    }

    @Override
    public Field<String> field7() {
        return SlowLog.SLOW_LOG.DB;
    }

    @Override
    public Field<Integer> field8() {
        return SlowLog.SLOW_LOG.LAST_INSERT_ID;
    }

    @Override
    public Field<Integer> field9() {
        return SlowLog.SLOW_LOG.INSERT_ID;
    }

    @Override
    public Field<UInteger> field10() {
        return SlowLog.SLOW_LOG.SERVER_ID;
    }

    @Override
    public Field<byte[]> field11() {
        return SlowLog.SLOW_LOG.SQL_TEXT;
    }

    @Override
    public Field<ULong> field12() {
        return SlowLog.SLOW_LOG.THREAD_ID;
    }

    @Override
    public LocalDateTime component1() {
        return getStartTime();
    }

    @Override
    public String component2() {
        return getUserHost();
    }

    @Override
    public LocalTime component3() {
        return getQueryTime();
    }

    @Override
    public LocalTime component4() {
        return getLockTime();
    }

    @Override
    public Integer component5() {
        return getRowsSent();
    }

    @Override
    public Integer component6() {
        return getRowsExamined();
    }

    @Override
    public String component7() {
        return getDb();
    }

    @Override
    public Integer component8() {
        return getLastInsertId();
    }

    @Override
    public Integer component9() {
        return getInsertId();
    }

    @Override
    public UInteger component10() {
        return getServerId();
    }

    @Override
    public byte[] component11() {
        return getSqlText();
    }

    @Override
    public ULong component12() {
        return getThreadId();
    }

    @Override
    public LocalDateTime value1() {
        return getStartTime();
    }

    @Override
    public String value2() {
        return getUserHost();
    }

    @Override
    public LocalTime value3() {
        return getQueryTime();
    }

    @Override
    public LocalTime value4() {
        return getLockTime();
    }

    @Override
    public Integer value5() {
        return getRowsSent();
    }

    @Override
    public Integer value6() {
        return getRowsExamined();
    }

    @Override
    public String value7() {
        return getDb();
    }

    @Override
    public Integer value8() {
        return getLastInsertId();
    }

    @Override
    public Integer value9() {
        return getInsertId();
    }

    @Override
    public UInteger value10() {
        return getServerId();
    }

    @Override
    public byte[] value11() {
        return getSqlText();
    }

    @Override
    public ULong value12() {
        return getThreadId();
    }

    @Override
    public SlowLogRecord value1(LocalDateTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public SlowLogRecord value2(String value) {
        setUserHost(value);
        return this;
    }

    @Override
    public SlowLogRecord value3(LocalTime value) {
        setQueryTime(value);
        return this;
    }

    @Override
    public SlowLogRecord value4(LocalTime value) {
        setLockTime(value);
        return this;
    }

    @Override
    public SlowLogRecord value5(Integer value) {
        setRowsSent(value);
        return this;
    }

    @Override
    public SlowLogRecord value6(Integer value) {
        setRowsExamined(value);
        return this;
    }

    @Override
    public SlowLogRecord value7(String value) {
        setDb(value);
        return this;
    }

    @Override
    public SlowLogRecord value8(Integer value) {
        setLastInsertId(value);
        return this;
    }

    @Override
    public SlowLogRecord value9(Integer value) {
        setInsertId(value);
        return this;
    }

    @Override
    public SlowLogRecord value10(UInteger value) {
        setServerId(value);
        return this;
    }

    @Override
    public SlowLogRecord value11(byte[] value) {
        setSqlText(value);
        return this;
    }

    @Override
    public SlowLogRecord value12(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public SlowLogRecord values(LocalDateTime value1, String value2, LocalTime value3, LocalTime value4, Integer value5, Integer value6, String value7, Integer value8, Integer value9, UInteger value10, byte[] value11, ULong value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlowLogRecord
     */
    public SlowLogRecord() {
        super(SlowLog.SLOW_LOG);
    }

    /**
     * Create a detached, initialised SlowLogRecord
     */
    public SlowLogRecord(LocalDateTime startTime, String userHost, LocalTime queryTime, LocalTime lockTime, Integer rowsSent, Integer rowsExamined, String db, Integer lastInsertId, Integer insertId, UInteger serverId, byte[] sqlText, ULong threadId) {
        super(SlowLog.SLOW_LOG);

        setStartTime(startTime);
        setUserHost(userHost);
        setQueryTime(queryTime);
        setLockTime(lockTime);
        setRowsSent(rowsSent);
        setRowsExamined(rowsExamined);
        setDb(db);
        setLastInsertId(lastInsertId);
        setInsertId(insertId);
        setServerId(serverId);
        setSqlText(sqlText);
        setThreadId(threadId);
    }

    /**
     * Create a detached, initialised SlowLogRecord
     */
    public SlowLogRecord(com.neurasim.jooq.mysql.tables.pojos.SlowLog value) {
        super(SlowLog.SLOW_LOG);

        if (value != null) {
            setStartTime(value.getStartTime());
            setUserHost(value.getUserHost());
            setQueryTime(value.getQueryTime());
            setLockTime(value.getLockTime());
            setRowsSent(value.getRowsSent());
            setRowsExamined(value.getRowsExamined());
            setDb(value.getDb());
            setLastInsertId(value.getLastInsertId());
            setInsertId(value.getInsertId());
            setServerId(value.getServerId());
            setSqlText(value.getSqlText());
            setThreadId(value.getThreadId());
        }
    }
}
