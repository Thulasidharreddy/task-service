/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.Users;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends TableRecordImpl<UsersRecord> implements Record5<String, Long, Long, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.users.USER</code>.
     */
    public UsersRecord setUser(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.users.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.users.CURRENT_CONNECTIONS</code>.
     */
    public UsersRecord setCurrentConnections(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.users.CURRENT_CONNECTIONS</code>.
     */
    public Long getCurrentConnections() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>performance_schema.users.TOTAL_CONNECTIONS</code>.
     */
    public UsersRecord setTotalConnections(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.users.TOTAL_CONNECTIONS</code>.
     */
    public Long getTotalConnections() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.users.MAX_SESSION_CONTROLLED_MEMORY</code>.
     */
    public UsersRecord setMaxSessionControlledMemory(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.users.MAX_SESSION_CONTROLLED_MEMORY</code>.
     */
    public ULong getMaxSessionControlledMemory() {
        return (ULong) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.users.MAX_SESSION_TOTAL_MEMORY</code>.
     */
    public UsersRecord setMaxSessionTotalMemory(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.users.MAX_SESSION_TOTAL_MEMORY</code>.
     */
    public ULong getMaxSessionTotalMemory() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, Long, Long, ULong, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, Long, Long, ULong, ULong> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Users.USERS.USER;
    }

    @Override
    public Field<Long> field2() {
        return Users.USERS.CURRENT_CONNECTIONS;
    }

    @Override
    public Field<Long> field3() {
        return Users.USERS.TOTAL_CONNECTIONS;
    }

    @Override
    public Field<ULong> field4() {
        return Users.USERS.MAX_SESSION_CONTROLLED_MEMORY;
    }

    @Override
    public Field<ULong> field5() {
        return Users.USERS.MAX_SESSION_TOTAL_MEMORY;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public Long component2() {
        return getCurrentConnections();
    }

    @Override
    public Long component3() {
        return getTotalConnections();
    }

    @Override
    public ULong component4() {
        return getMaxSessionControlledMemory();
    }

    @Override
    public ULong component5() {
        return getMaxSessionTotalMemory();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public Long value2() {
        return getCurrentConnections();
    }

    @Override
    public Long value3() {
        return getTotalConnections();
    }

    @Override
    public ULong value4() {
        return getMaxSessionControlledMemory();
    }

    @Override
    public ULong value5() {
        return getMaxSessionTotalMemory();
    }

    @Override
    public UsersRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public UsersRecord value2(Long value) {
        setCurrentConnections(value);
        return this;
    }

    @Override
    public UsersRecord value3(Long value) {
        setTotalConnections(value);
        return this;
    }

    @Override
    public UsersRecord value4(ULong value) {
        setMaxSessionControlledMemory(value);
        return this;
    }

    @Override
    public UsersRecord value5(ULong value) {
        setMaxSessionTotalMemory(value);
        return this;
    }

    @Override
    public UsersRecord values(String value1, Long value2, Long value3, ULong value4, ULong value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(String user, Long currentConnections, Long totalConnections, ULong maxSessionControlledMemory, ULong maxSessionTotalMemory) {
        super(Users.USERS);

        setUser(user);
        setCurrentConnections(currentConnections);
        setTotalConnections(totalConnections);
        setMaxSessionControlledMemory(maxSessionControlledMemory);
        setMaxSessionTotalMemory(maxSessionTotalMemory);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(com.neurasim.jooq.performance_schema.tables.pojos.Users value) {
        super(Users.USERS);

        if (value != null) {
            setUser(value.getUser());
            setCurrentConnections(value.getCurrentConnections());
            setTotalConnections(value.getTotalConnections());
            setMaxSessionControlledMemory(value.getMaxSessionControlledMemory());
            setMaxSessionTotalMemory(value.getMaxSessionTotalMemory());
        }
    }
}
