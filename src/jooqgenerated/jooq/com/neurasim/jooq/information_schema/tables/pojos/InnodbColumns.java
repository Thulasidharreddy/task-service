/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong tableId;
    private final String name;
    private final ULong pos;
    private final Integer mtype;
    private final Integer prtype;
    private final Integer len;
    private final Integer hasDefault;
    private final String defaultValue;

    public InnodbColumns(InnodbColumns value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.pos = value.pos;
        this.mtype = value.mtype;
        this.prtype = value.prtype;
        this.len = value.len;
        this.hasDefault = value.hasDefault;
        this.defaultValue = value.defaultValue;
    }

    public InnodbColumns(
        ULong tableId,
        String name,
        ULong pos,
        Integer mtype,
        Integer prtype,
        Integer len,
        Integer hasDefault,
        String defaultValue
    ) {
        this.tableId = tableId;
        this.name = name;
        this.pos = pos;
        this.mtype = mtype;
        this.prtype = prtype;
        this.len = len;
        this.hasDefault = hasDefault;
        this.defaultValue = defaultValue;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return this.tableId;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.POS</code>.
     */
    public ULong getPos() {
        return this.pos;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.MTYPE</code>.
     */
    public Integer getMtype() {
        return this.mtype;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.PRTYPE</code>.
     */
    public Integer getPrtype() {
        return this.prtype;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.LEN</code>.
     */
    public Integer getLen() {
        return this.len;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.HAS_DEFAULT</code>.
     */
    public Integer getHasDefault() {
        return this.hasDefault;
    }

    /**
     * Getter for <code>information_schema.INNODB_COLUMNS.DEFAULT_VALUE</code>.
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbColumns other = (InnodbColumns) obj;
        if (this.tableId == null) {
            if (other.tableId != null)
                return false;
        }
        else if (!this.tableId.equals(other.tableId))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.pos == null) {
            if (other.pos != null)
                return false;
        }
        else if (!this.pos.equals(other.pos))
            return false;
        if (this.mtype == null) {
            if (other.mtype != null)
                return false;
        }
        else if (!this.mtype.equals(other.mtype))
            return false;
        if (this.prtype == null) {
            if (other.prtype != null)
                return false;
        }
        else if (!this.prtype.equals(other.prtype))
            return false;
        if (this.len == null) {
            if (other.len != null)
                return false;
        }
        else if (!this.len.equals(other.len))
            return false;
        if (this.hasDefault == null) {
            if (other.hasDefault != null)
                return false;
        }
        else if (!this.hasDefault.equals(other.hasDefault))
            return false;
        if (this.defaultValue == null) {
            if (other.defaultValue != null)
                return false;
        }
        else if (!this.defaultValue.equals(other.defaultValue))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableId == null) ? 0 : this.tableId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.pos == null) ? 0 : this.pos.hashCode());
        result = prime * result + ((this.mtype == null) ? 0 : this.mtype.hashCode());
        result = prime * result + ((this.prtype == null) ? 0 : this.prtype.hashCode());
        result = prime * result + ((this.len == null) ? 0 : this.len.hashCode());
        result = prime * result + ((this.hasDefault == null) ? 0 : this.hasDefault.hashCode());
        result = prime * result + ((this.defaultValue == null) ? 0 : this.defaultValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbColumns (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(pos);
        sb.append(", ").append(mtype);
        sb.append(", ").append(prtype);
        sb.append(", ").append(len);
        sb.append(", ").append(hasDefault);
        sb.append(", ").append(defaultValue);

        sb.append(")");
        return sb.toString();
    }
}