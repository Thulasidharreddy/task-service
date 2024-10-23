/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * Table privileges
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesPriv implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String host;
    private final String db;
    private final String user;
    private final String tableName;
    private final String grantor;
    private final LocalDateTime timestamp;
    private final String tablePriv;
    private final String columnPriv;

    public TablesPriv(TablesPriv value) {
        this.host = value.host;
        this.db = value.db;
        this.user = value.user;
        this.tableName = value.tableName;
        this.grantor = value.grantor;
        this.timestamp = value.timestamp;
        this.tablePriv = value.tablePriv;
        this.columnPriv = value.columnPriv;
    }

    public TablesPriv(
        String host,
        String db,
        String user,
        String tableName,
        String grantor,
        LocalDateTime timestamp,
        String tablePriv,
        String columnPriv
    ) {
        this.host = host;
        this.db = db;
        this.user = user;
        this.tableName = tableName;
        this.grantor = grantor;
        this.timestamp = timestamp;
        this.tablePriv = tablePriv;
        this.columnPriv = columnPriv;
    }

    /**
     * Getter for <code>mysql.tables_priv.Host</code>.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for <code>mysql.tables_priv.Db</code>.
     */
    public String getDb() {
        return this.db;
    }

    /**
     * Getter for <code>mysql.tables_priv.User</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for <code>mysql.tables_priv.Table_name</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>mysql.tables_priv.Grantor</code>.
     */
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * Getter for <code>mysql.tables_priv.Timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Getter for <code>mysql.tables_priv.Table_priv</code>.
     */
    public String getTablePriv() {
        return this.tablePriv;
    }

    /**
     * Getter for <code>mysql.tables_priv.Column_priv</code>.
     */
    public String getColumnPriv() {
        return this.columnPriv;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TablesPriv other = (TablesPriv) obj;
        if (this.host == null) {
            if (other.host != null)
                return false;
        }
        else if (!this.host.equals(other.host))
            return false;
        if (this.db == null) {
            if (other.db != null)
                return false;
        }
        else if (!this.db.equals(other.db))
            return false;
        if (this.user == null) {
            if (other.user != null)
                return false;
        }
        else if (!this.user.equals(other.user))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.grantor == null) {
            if (other.grantor != null)
                return false;
        }
        else if (!this.grantor.equals(other.grantor))
            return false;
        if (this.timestamp == null) {
            if (other.timestamp != null)
                return false;
        }
        else if (!this.timestamp.equals(other.timestamp))
            return false;
        if (this.tablePriv == null) {
            if (other.tablePriv != null)
                return false;
        }
        else if (!this.tablePriv.equals(other.tablePriv))
            return false;
        if (this.columnPriv == null) {
            if (other.columnPriv != null)
                return false;
        }
        else if (!this.columnPriv.equals(other.columnPriv))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.host == null) ? 0 : this.host.hashCode());
        result = prime * result + ((this.db == null) ? 0 : this.db.hashCode());
        result = prime * result + ((this.user == null) ? 0 : this.user.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.timestamp == null) ? 0 : this.timestamp.hashCode());
        result = prime * result + ((this.tablePriv == null) ? 0 : this.tablePriv.hashCode());
        result = prime * result + ((this.columnPriv == null) ? 0 : this.columnPriv.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TablesPriv (");

        sb.append(host);
        sb.append(", ").append(db);
        sb.append(", ").append(user);
        sb.append(", ").append(tableName);
        sb.append(", ").append(grantor);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(tablePriv);
        sb.append(", ").append(columnPriv);

        sb.append(")");
        return sb.toString();
    }
}
