/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTempTableInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong tableId;
    private final String name;
    private final UInteger nCols;
    private final UInteger space;

    public InnodbTempTableInfo(InnodbTempTableInfo value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.nCols = value.nCols;
        this.space = value.space;
    }

    public InnodbTempTableInfo(
        ULong tableId,
        String name,
        UInteger nCols,
        UInteger space
    ) {
        this.tableId = tableId;
        this.name = name;
        this.nCols = nCols;
        this.space = space;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return this.tableId;
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
     */
    public UInteger getNCols() {
        return this.nCols;
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
     */
    public UInteger getSpace() {
        return this.space;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbTempTableInfo other = (InnodbTempTableInfo) obj;
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
        if (this.nCols == null) {
            if (other.nCols != null)
                return false;
        }
        else if (!this.nCols.equals(other.nCols))
            return false;
        if (this.space == null) {
            if (other.space != null)
                return false;
        }
        else if (!this.space.equals(other.space))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableId == null) ? 0 : this.tableId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.nCols == null) ? 0 : this.nCols.hashCode());
        result = prime * result + ((this.space == null) ? 0 : this.space.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTempTableInfo (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(nCols);
        sb.append(", ").append(space);

        sb.append(")");
        return sb.toString();
    }
}
