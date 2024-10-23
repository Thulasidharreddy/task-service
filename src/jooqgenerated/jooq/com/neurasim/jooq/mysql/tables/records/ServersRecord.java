/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.Servers;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * MySQL Foreign Servers table
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServersRecord extends UpdatableRecordImpl<ServersRecord> implements Record9<String, String, String, String, String, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.servers.Server_name</code>.
     */
    public ServersRecord setServerName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Server_name</code>.
     */
    public String getServerName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.servers.Host</code>.
     */
    public ServersRecord setHost(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Host</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.servers.Db</code>.
     */
    public ServersRecord setDb(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Db</code>.
     */
    public String getDb() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.servers.Username</code>.
     */
    public ServersRecord setUsername(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.servers.Password</code>.
     */
    public ServersRecord setPassword(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Password</code>.
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mysql.servers.Port</code>.
     */
    public ServersRecord setPort(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Port</code>.
     */
    public Integer getPort() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mysql.servers.Socket</code>.
     */
    public ServersRecord setSocket(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Socket</code>.
     */
    public String getSocket() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mysql.servers.Wrapper</code>.
     */
    public ServersRecord setWrapper(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Wrapper</code>.
     */
    public String getWrapper() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mysql.servers.Owner</code>.
     */
    public ServersRecord setOwner(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>mysql.servers.Owner</code>.
     */
    public String getOwner() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, Integer, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, String, Integer, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Servers.SERVERS.SERVER_NAME;
    }

    @Override
    public Field<String> field2() {
        return Servers.SERVERS.HOST;
    }

    @Override
    public Field<String> field3() {
        return Servers.SERVERS.DB;
    }

    @Override
    public Field<String> field4() {
        return Servers.SERVERS.USERNAME;
    }

    @Override
    public Field<String> field5() {
        return Servers.SERVERS.PASSWORD;
    }

    @Override
    public Field<Integer> field6() {
        return Servers.SERVERS.PORT;
    }

    @Override
    public Field<String> field7() {
        return Servers.SERVERS.SOCKET;
    }

    @Override
    public Field<String> field8() {
        return Servers.SERVERS.WRAPPER;
    }

    @Override
    public Field<String> field9() {
        return Servers.SERVERS.OWNER;
    }

    @Override
    public String component1() {
        return getServerName();
    }

    @Override
    public String component2() {
        return getHost();
    }

    @Override
    public String component3() {
        return getDb();
    }

    @Override
    public String component4() {
        return getUsername();
    }

    @Override
    public String component5() {
        return getPassword();
    }

    @Override
    public Integer component6() {
        return getPort();
    }

    @Override
    public String component7() {
        return getSocket();
    }

    @Override
    public String component8() {
        return getWrapper();
    }

    @Override
    public String component9() {
        return getOwner();
    }

    @Override
    public String value1() {
        return getServerName();
    }

    @Override
    public String value2() {
        return getHost();
    }

    @Override
    public String value3() {
        return getDb();
    }

    @Override
    public String value4() {
        return getUsername();
    }

    @Override
    public String value5() {
        return getPassword();
    }

    @Override
    public Integer value6() {
        return getPort();
    }

    @Override
    public String value7() {
        return getSocket();
    }

    @Override
    public String value8() {
        return getWrapper();
    }

    @Override
    public String value9() {
        return getOwner();
    }

    @Override
    public ServersRecord value1(String value) {
        setServerName(value);
        return this;
    }

    @Override
    public ServersRecord value2(String value) {
        setHost(value);
        return this;
    }

    @Override
    public ServersRecord value3(String value) {
        setDb(value);
        return this;
    }

    @Override
    public ServersRecord value4(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public ServersRecord value5(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public ServersRecord value6(Integer value) {
        setPort(value);
        return this;
    }

    @Override
    public ServersRecord value7(String value) {
        setSocket(value);
        return this;
    }

    @Override
    public ServersRecord value8(String value) {
        setWrapper(value);
        return this;
    }

    @Override
    public ServersRecord value9(String value) {
        setOwner(value);
        return this;
    }

    @Override
    public ServersRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, String value9) {
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
     * Create a detached ServersRecord
     */
    public ServersRecord() {
        super(Servers.SERVERS);
    }

    /**
     * Create a detached, initialised ServersRecord
     */
    public ServersRecord(String serverName, String host, String db, String username, String password, Integer port, String socket, String wrapper, String owner) {
        super(Servers.SERVERS);

        setServerName(serverName);
        setHost(host);
        setDb(db);
        setUsername(username);
        setPassword(password);
        setPort(port);
        setSocket(socket);
        setWrapper(wrapper);
        setOwner(owner);
    }

    /**
     * Create a detached, initialised ServersRecord
     */
    public ServersRecord(com.neurasim.jooq.mysql.tables.pojos.Servers value) {
        super(Servers.SERVERS);

        if (value != null) {
            setServerName(value.getServerName());
            setHost(value.getHost());
            setDb(value.getDb());
            setUsername(value.getUsername());
            setPassword(value.getPassword());
            setPort(value.getPort());
            setSocket(value.getSocket());
            setWrapper(value.getWrapper());
            setOwner(value.getOwner());
        }
    }
}