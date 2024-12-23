/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbIndexStats implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String databaseName;
    private final String tableName;
    private final String indexName;
    private final LocalDateTime lastUpdate;
    private final String statName;
    private final ULong statValue;
    private final ULong sampleSize;
    private final String statDescription;

    public InnodbIndexStats(InnodbIndexStats value) {
        this.databaseName = value.databaseName;
        this.tableName = value.tableName;
        this.indexName = value.indexName;
        this.lastUpdate = value.lastUpdate;
        this.statName = value.statName;
        this.statValue = value.statValue;
        this.sampleSize = value.sampleSize;
        this.statDescription = value.statDescription;
    }

    public InnodbIndexStats(
        String databaseName,
        String tableName,
        String indexName,
        LocalDateTime lastUpdate,
        String statName,
        ULong statValue,
        ULong sampleSize,
        String statDescription
    ) {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.indexName = indexName;
        this.lastUpdate = lastUpdate;
        this.statName = statName;
        this.statValue = statValue;
        this.sampleSize = sampleSize;
        this.statDescription = statDescription;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.database_name</code>.
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.table_name</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.index_name</code>.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.stat_name</code>.
     */
    public String getStatName() {
        return this.statName;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.stat_value</code>.
     */
    public ULong getStatValue() {
        return this.statValue;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.sample_size</code>.
     */
    public ULong getSampleSize() {
        return this.sampleSize;
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.stat_description</code>.
     */
    public String getStatDescription() {
        return this.statDescription;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbIndexStats other = (InnodbIndexStats) obj;
        if (this.databaseName == null) {
            if (other.databaseName != null)
                return false;
        }
        else if (!this.databaseName.equals(other.databaseName))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.indexName == null) {
            if (other.indexName != null)
                return false;
        }
        else if (!this.indexName.equals(other.indexName))
            return false;
        if (this.lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        }
        else if (!this.lastUpdate.equals(other.lastUpdate))
            return false;
        if (this.statName == null) {
            if (other.statName != null)
                return false;
        }
        else if (!this.statName.equals(other.statName))
            return false;
        if (this.statValue == null) {
            if (other.statValue != null)
                return false;
        }
        else if (!this.statValue.equals(other.statValue))
            return false;
        if (this.sampleSize == null) {
            if (other.sampleSize != null)
                return false;
        }
        else if (!this.sampleSize.equals(other.sampleSize))
            return false;
        if (this.statDescription == null) {
            if (other.statDescription != null)
                return false;
        }
        else if (!this.statDescription.equals(other.statDescription))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.databaseName == null) ? 0 : this.databaseName.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.indexName == null) ? 0 : this.indexName.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        result = prime * result + ((this.statName == null) ? 0 : this.statName.hashCode());
        result = prime * result + ((this.statValue == null) ? 0 : this.statValue.hashCode());
        result = prime * result + ((this.sampleSize == null) ? 0 : this.sampleSize.hashCode());
        result = prime * result + ((this.statDescription == null) ? 0 : this.statDescription.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbIndexStats (");

        sb.append(databaseName);
        sb.append(", ").append(tableName);
        sb.append(", ").append(indexName);
        sb.append(", ").append(lastUpdate);
        sb.append(", ").append(statName);
        sb.append(", ").append(statValue);
        sb.append(", ").append(sampleSize);
        sb.append(", ").append(statDescription);

        sb.append(")");
        return sb.toString();
    }
}
