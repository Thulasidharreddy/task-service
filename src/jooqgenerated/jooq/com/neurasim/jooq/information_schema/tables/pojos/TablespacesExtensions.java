/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.JSON;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablespacesExtensions implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tablespaceName;
    private final JSON engineAttribute;

    public TablespacesExtensions(TablespacesExtensions value) {
        this.tablespaceName = value.tablespaceName;
        this.engineAttribute = value.engineAttribute;
    }

    public TablespacesExtensions(
        String tablespaceName,
        JSON engineAttribute
    ) {
        this.tablespaceName = tablespaceName;
        this.engineAttribute = engineAttribute;
    }

    /**
     * Getter for
     * <code>information_schema.TABLESPACES_EXTENSIONS.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return this.tablespaceName;
    }

    /**
     * Getter for
     * <code>information_schema.TABLESPACES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public JSON getEngineAttribute() {
        return this.engineAttribute;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TablespacesExtensions other = (TablespacesExtensions) obj;
        if (this.tablespaceName == null) {
            if (other.tablespaceName != null)
                return false;
        }
        else if (!this.tablespaceName.equals(other.tablespaceName))
            return false;
        if (this.engineAttribute == null) {
            if (other.engineAttribute != null)
                return false;
        }
        else if (!this.engineAttribute.equals(other.engineAttribute))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tablespaceName == null) ? 0 : this.tablespaceName.hashCode());
        result = prime * result + ((this.engineAttribute == null) ? 0 : this.engineAttribute.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TablespacesExtensions (");

        sb.append(tablespaceName);
        sb.append(", ").append(engineAttribute);

        sb.append(")");
        return sb.toString();
    }
}
