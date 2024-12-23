/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import com.neurasim.jooq.information_schema.enums.TablesRowFormat;
import com.neurasim.jooq.information_schema.enums.TablesTableType;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final TablesTableType tableType;
    private final String engine;
    private final Integer version;
    private final TablesRowFormat rowFormat;
    private final ULong tableRows;
    private final ULong avgRowLength;
    private final ULong dataLength;
    private final ULong maxDataLength;
    private final ULong indexLength;
    private final ULong dataFree;
    private final ULong autoIncrement;
    private final LocalDateTime createTime;
    private final LocalDateTime updateTime;
    private final LocalDateTime checkTime;
    private final String tableCollation;
    private final Long checksum;
    private final String createOptions;
    private final String tableComment;

    public Tables(Tables value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.tableType = value.tableType;
        this.engine = value.engine;
        this.version = value.version;
        this.rowFormat = value.rowFormat;
        this.tableRows = value.tableRows;
        this.avgRowLength = value.avgRowLength;
        this.dataLength = value.dataLength;
        this.maxDataLength = value.maxDataLength;
        this.indexLength = value.indexLength;
        this.dataFree = value.dataFree;
        this.autoIncrement = value.autoIncrement;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.checkTime = value.checkTime;
        this.tableCollation = value.tableCollation;
        this.checksum = value.checksum;
        this.createOptions = value.createOptions;
        this.tableComment = value.tableComment;
    }

    public Tables(
        String tableCatalog,
        String tableSchema,
        String tableName,
        TablesTableType tableType,
        String engine,
        Integer version,
        TablesRowFormat rowFormat,
        ULong tableRows,
        ULong avgRowLength,
        ULong dataLength,
        ULong maxDataLength,
        ULong indexLength,
        ULong dataFree,
        ULong autoIncrement,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        LocalDateTime checkTime,
        String tableCollation,
        Long checksum,
        String createOptions,
        String tableComment
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.tableType = tableType;
        this.engine = engine;
        this.version = version;
        this.rowFormat = rowFormat;
        this.tableRows = tableRows;
        this.avgRowLength = avgRowLength;
        this.dataLength = dataLength;
        this.maxDataLength = maxDataLength;
        this.indexLength = indexLength;
        this.dataFree = dataFree;
        this.autoIncrement = autoIncrement;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.checkTime = checkTime;
        this.tableCollation = tableCollation;
        this.checksum = checksum;
        this.createOptions = createOptions;
        this.tableComment = tableComment;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_TYPE</code>.
     */
    public TablesTableType getTableType() {
        return this.tableType;
    }

    /**
     * Getter for <code>information_schema.TABLES.ENGINE</code>.
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * Getter for <code>information_schema.TABLES.VERSION</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>information_schema.TABLES.ROW_FORMAT</code>.
     */
    public TablesRowFormat getRowFormat() {
        return this.rowFormat;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_ROWS</code>.
     */
    public ULong getTableRows() {
        return this.tableRows;
    }

    /**
     * Getter for <code>information_schema.TABLES.AVG_ROW_LENGTH</code>.
     */
    public ULong getAvgRowLength() {
        return this.avgRowLength;
    }

    /**
     * Getter for <code>information_schema.TABLES.DATA_LENGTH</code>.
     */
    public ULong getDataLength() {
        return this.dataLength;
    }

    /**
     * Getter for <code>information_schema.TABLES.MAX_DATA_LENGTH</code>.
     */
    public ULong getMaxDataLength() {
        return this.maxDataLength;
    }

    /**
     * Getter for <code>information_schema.TABLES.INDEX_LENGTH</code>.
     */
    public ULong getIndexLength() {
        return this.indexLength;
    }

    /**
     * Getter for <code>information_schema.TABLES.DATA_FREE</code>.
     */
    public ULong getDataFree() {
        return this.dataFree;
    }

    /**
     * Getter for <code>information_schema.TABLES.AUTO_INCREMENT</code>.
     */
    public ULong getAutoIncrement() {
        return this.autoIncrement;
    }

    /**
     * Getter for <code>information_schema.TABLES.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Getter for <code>information_schema.TABLES.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Getter for <code>information_schema.TABLES.CHECK_TIME</code>.
     */
    public LocalDateTime getCheckTime() {
        return this.checkTime;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_COLLATION</code>.
     */
    public String getTableCollation() {
        return this.tableCollation;
    }

    /**
     * Getter for <code>information_schema.TABLES.CHECKSUM</code>.
     */
    public Long getChecksum() {
        return this.checksum;
    }

    /**
     * Getter for <code>information_schema.TABLES.CREATE_OPTIONS</code>.
     */
    public String getCreateOptions() {
        return this.createOptions;
    }

    /**
     * Getter for <code>information_schema.TABLES.TABLE_COMMENT</code>.
     */
    public String getTableComment() {
        return this.tableComment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Tables other = (Tables) obj;
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
        if (this.tableType == null) {
            if (other.tableType != null)
                return false;
        }
        else if (!this.tableType.equals(other.tableType))
            return false;
        if (this.engine == null) {
            if (other.engine != null)
                return false;
        }
        else if (!this.engine.equals(other.engine))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        }
        else if (!this.version.equals(other.version))
            return false;
        if (this.rowFormat == null) {
            if (other.rowFormat != null)
                return false;
        }
        else if (!this.rowFormat.equals(other.rowFormat))
            return false;
        if (this.tableRows == null) {
            if (other.tableRows != null)
                return false;
        }
        else if (!this.tableRows.equals(other.tableRows))
            return false;
        if (this.avgRowLength == null) {
            if (other.avgRowLength != null)
                return false;
        }
        else if (!this.avgRowLength.equals(other.avgRowLength))
            return false;
        if (this.dataLength == null) {
            if (other.dataLength != null)
                return false;
        }
        else if (!this.dataLength.equals(other.dataLength))
            return false;
        if (this.maxDataLength == null) {
            if (other.maxDataLength != null)
                return false;
        }
        else if (!this.maxDataLength.equals(other.maxDataLength))
            return false;
        if (this.indexLength == null) {
            if (other.indexLength != null)
                return false;
        }
        else if (!this.indexLength.equals(other.indexLength))
            return false;
        if (this.dataFree == null) {
            if (other.dataFree != null)
                return false;
        }
        else if (!this.dataFree.equals(other.dataFree))
            return false;
        if (this.autoIncrement == null) {
            if (other.autoIncrement != null)
                return false;
        }
        else if (!this.autoIncrement.equals(other.autoIncrement))
            return false;
        if (this.createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!this.createTime.equals(other.createTime))
            return false;
        if (this.updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!this.updateTime.equals(other.updateTime))
            return false;
        if (this.checkTime == null) {
            if (other.checkTime != null)
                return false;
        }
        else if (!this.checkTime.equals(other.checkTime))
            return false;
        if (this.tableCollation == null) {
            if (other.tableCollation != null)
                return false;
        }
        else if (!this.tableCollation.equals(other.tableCollation))
            return false;
        if (this.checksum == null) {
            if (other.checksum != null)
                return false;
        }
        else if (!this.checksum.equals(other.checksum))
            return false;
        if (this.createOptions == null) {
            if (other.createOptions != null)
                return false;
        }
        else if (!this.createOptions.equals(other.createOptions))
            return false;
        if (this.tableComment == null) {
            if (other.tableComment != null)
                return false;
        }
        else if (!this.tableComment.equals(other.tableComment))
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
        result = prime * result + ((this.tableType == null) ? 0 : this.tableType.hashCode());
        result = prime * result + ((this.engine == null) ? 0 : this.engine.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        result = prime * result + ((this.rowFormat == null) ? 0 : this.rowFormat.hashCode());
        result = prime * result + ((this.tableRows == null) ? 0 : this.tableRows.hashCode());
        result = prime * result + ((this.avgRowLength == null) ? 0 : this.avgRowLength.hashCode());
        result = prime * result + ((this.dataLength == null) ? 0 : this.dataLength.hashCode());
        result = prime * result + ((this.maxDataLength == null) ? 0 : this.maxDataLength.hashCode());
        result = prime * result + ((this.indexLength == null) ? 0 : this.indexLength.hashCode());
        result = prime * result + ((this.dataFree == null) ? 0 : this.dataFree.hashCode());
        result = prime * result + ((this.autoIncrement == null) ? 0 : this.autoIncrement.hashCode());
        result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
        result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
        result = prime * result + ((this.checkTime == null) ? 0 : this.checkTime.hashCode());
        result = prime * result + ((this.tableCollation == null) ? 0 : this.tableCollation.hashCode());
        result = prime * result + ((this.checksum == null) ? 0 : this.checksum.hashCode());
        result = prime * result + ((this.createOptions == null) ? 0 : this.createOptions.hashCode());
        result = prime * result + ((this.tableComment == null) ? 0 : this.tableComment.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tables (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(tableType);
        sb.append(", ").append(engine);
        sb.append(", ").append(version);
        sb.append(", ").append(rowFormat);
        sb.append(", ").append(tableRows);
        sb.append(", ").append(avgRowLength);
        sb.append(", ").append(dataLength);
        sb.append(", ").append(maxDataLength);
        sb.append(", ").append(indexLength);
        sb.append(", ").append(dataFree);
        sb.append(", ").append(autoIncrement);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(tableCollation);
        sb.append(", ").append(checksum);
        sb.append(", ").append(createOptions);
        sb.append(", ").append(tableComment);

        sb.append(")");
        return sb.toString();
    }
}
