/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import com.neurasim.jooq.information_schema.enums.SchemataDefaultEncryption;

import java.io.Serializable;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String catalogName;
    private final String schemaName;
    private final String defaultCharacterSetName;
    private final String defaultCollationName;
    private final byte[] sqlPath;
    private final SchemataDefaultEncryption defaultEncryption;

    public Schemata(Schemata value) {
        this.catalogName = value.catalogName;
        this.schemaName = value.schemaName;
        this.defaultCharacterSetName = value.defaultCharacterSetName;
        this.defaultCollationName = value.defaultCollationName;
        this.sqlPath = value.sqlPath;
        this.defaultEncryption = value.defaultEncryption;
    }

    public Schemata(
        String catalogName,
        String schemaName,
        String defaultCharacterSetName,
        String defaultCollationName,
        byte[] sqlPath,
        SchemataDefaultEncryption defaultEncryption
    ) {
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.defaultCharacterSetName = defaultCharacterSetName;
        this.defaultCollationName = defaultCollationName;
        this.sqlPath = sqlPath;
        this.defaultEncryption = defaultEncryption;
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public String getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public String getDefaultCollationName() {
        return this.defaultCollationName;
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.SQL_PATH</code>.
     */
    public byte[] getSqlPath() {
        return this.sqlPath;
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.DEFAULT_ENCRYPTION</code>.
     */
    public SchemataDefaultEncryption getDefaultEncryption() {
        return this.defaultEncryption;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Schemata other = (Schemata) obj;
        if (this.catalogName == null) {
            if (other.catalogName != null)
                return false;
        }
        else if (!this.catalogName.equals(other.catalogName))
            return false;
        if (this.schemaName == null) {
            if (other.schemaName != null)
                return false;
        }
        else if (!this.schemaName.equals(other.schemaName))
            return false;
        if (this.defaultCharacterSetName == null) {
            if (other.defaultCharacterSetName != null)
                return false;
        }
        else if (!this.defaultCharacterSetName.equals(other.defaultCharacterSetName))
            return false;
        if (this.defaultCollationName == null) {
            if (other.defaultCollationName != null)
                return false;
        }
        else if (!this.defaultCollationName.equals(other.defaultCollationName))
            return false;
        if (this.sqlPath == null) {
            if (other.sqlPath != null)
                return false;
        }
        else if (!Arrays.equals(this.sqlPath, other.sqlPath))
            return false;
        if (this.defaultEncryption == null) {
            if (other.defaultEncryption != null)
                return false;
        }
        else if (!this.defaultEncryption.equals(other.defaultEncryption))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.catalogName == null) ? 0 : this.catalogName.hashCode());
        result = prime * result + ((this.schemaName == null) ? 0 : this.schemaName.hashCode());
        result = prime * result + ((this.defaultCharacterSetName == null) ? 0 : this.defaultCharacterSetName.hashCode());
        result = prime * result + ((this.defaultCollationName == null) ? 0 : this.defaultCollationName.hashCode());
        result = prime * result + ((this.sqlPath == null) ? 0 : Arrays.hashCode(this.sqlPath));
        result = prime * result + ((this.defaultEncryption == null) ? 0 : this.defaultEncryption.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schemata (");

        sb.append(catalogName);
        sb.append(", ").append(schemaName);
        sb.append(", ").append(defaultCharacterSetName);
        sb.append(", ").append(defaultCollationName);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(defaultEncryption);

        sb.append(")");
        return sb.toString();
    }
}
