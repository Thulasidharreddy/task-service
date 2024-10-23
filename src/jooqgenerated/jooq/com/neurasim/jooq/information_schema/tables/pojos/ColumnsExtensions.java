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
public class ColumnsExtensions implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final JSON engineAttribute;
    private final JSON secondaryEngineAttribute;

    public ColumnsExtensions(ColumnsExtensions value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.engineAttribute = value.engineAttribute;
        this.secondaryEngineAttribute = value.secondaryEngineAttribute;
    }

    public ColumnsExtensions(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        JSON engineAttribute,
        JSON secondaryEngineAttribute
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.engineAttribute = engineAttribute;
        this.secondaryEngineAttribute = secondaryEngineAttribute;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.COLUMNS_EXTENSIONS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public JSON getEngineAttribute() {
        return this.engineAttribute;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public JSON getSecondaryEngineAttribute() {
        return this.secondaryEngineAttribute;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ColumnsExtensions other = (ColumnsExtensions) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.engineAttribute == null) {
            if (other.engineAttribute != null)
                return false;
        }
        else if (!this.engineAttribute.equals(other.engineAttribute))
            return false;
        if (this.secondaryEngineAttribute == null) {
            if (other.secondaryEngineAttribute != null)
                return false;
        }
        else if (!this.secondaryEngineAttribute.equals(other.secondaryEngineAttribute))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.engineAttribute == null) ? 0 : this.engineAttribute.hashCode());
        result = prime * result + ((this.secondaryEngineAttribute == null) ? 0 : this.secondaryEngineAttribute.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnsExtensions (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(engineAttribute);
        sb.append(", ").append(secondaryEngineAttribute);

        sb.append(")");
        return sb.toString();
    }
}
