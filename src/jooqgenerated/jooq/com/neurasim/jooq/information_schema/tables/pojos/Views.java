/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import com.neurasim.jooq.information_schema.enums.ViewsCheckOption;
import com.neurasim.jooq.information_schema.enums.ViewsIsUpdatable;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Views implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String viewDefinition;
    private final ViewsCheckOption checkOption;
    private final ViewsIsUpdatable isUpdatable;
    private final String definer;
    private final String securityType;
    private final String characterSetClient;
    private final String collationConnection;

    public Views(Views value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.viewDefinition = value.viewDefinition;
        this.checkOption = value.checkOption;
        this.isUpdatable = value.isUpdatable;
        this.definer = value.definer;
        this.securityType = value.securityType;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
    }

    public Views(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String viewDefinition,
        ViewsCheckOption checkOption,
        ViewsIsUpdatable isUpdatable,
        String definer,
        String securityType,
        String characterSetClient,
        String collationConnection
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.viewDefinition = viewDefinition;
        this.checkOption = checkOption;
        this.isUpdatable = isUpdatable;
        this.definer = definer;
        this.securityType = securityType;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
    }

    /**
     * Getter for <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    public String getViewDefinition() {
        return this.viewDefinition;
    }

    /**
     * Getter for <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    public ViewsCheckOption getCheckOption() {
        return this.checkOption;
    }

    /**
     * Getter for <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    public ViewsIsUpdatable getIsUpdatable() {
        return this.isUpdatable;
    }

    /**
     * Getter for <code>information_schema.VIEWS.DEFINER</code>.
     */
    public String getDefiner() {
        return this.definer;
    }

    /**
     * Getter for <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    public String getSecurityType() {
        return this.securityType;
    }

    /**
     * Getter for <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return this.characterSetClient;
    }

    /**
     * Getter for <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return this.collationConnection;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Views other = (Views) obj;
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
        if (this.viewDefinition == null) {
            if (other.viewDefinition != null)
                return false;
        }
        else if (!this.viewDefinition.equals(other.viewDefinition))
            return false;
        if (this.checkOption == null) {
            if (other.checkOption != null)
                return false;
        }
        else if (!this.checkOption.equals(other.checkOption))
            return false;
        if (this.isUpdatable == null) {
            if (other.isUpdatable != null)
                return false;
        }
        else if (!this.isUpdatable.equals(other.isUpdatable))
            return false;
        if (this.definer == null) {
            if (other.definer != null)
                return false;
        }
        else if (!this.definer.equals(other.definer))
            return false;
        if (this.securityType == null) {
            if (other.securityType != null)
                return false;
        }
        else if (!this.securityType.equals(other.securityType))
            return false;
        if (this.characterSetClient == null) {
            if (other.characterSetClient != null)
                return false;
        }
        else if (!this.characterSetClient.equals(other.characterSetClient))
            return false;
        if (this.collationConnection == null) {
            if (other.collationConnection != null)
                return false;
        }
        else if (!this.collationConnection.equals(other.collationConnection))
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
        result = prime * result + ((this.viewDefinition == null) ? 0 : this.viewDefinition.hashCode());
        result = prime * result + ((this.checkOption == null) ? 0 : this.checkOption.hashCode());
        result = prime * result + ((this.isUpdatable == null) ? 0 : this.isUpdatable.hashCode());
        result = prime * result + ((this.definer == null) ? 0 : this.definer.hashCode());
        result = prime * result + ((this.securityType == null) ? 0 : this.securityType.hashCode());
        result = prime * result + ((this.characterSetClient == null) ? 0 : this.characterSetClient.hashCode());
        result = prime * result + ((this.collationConnection == null) ? 0 : this.collationConnection.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Views (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(viewDefinition);
        sb.append(", ").append(checkOption);
        sb.append(", ").append(isUpdatable);
        sb.append(", ").append(definer);
        sb.append(", ").append(securityType);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);

        sb.append(")");
        return sb.toString();
    }
}