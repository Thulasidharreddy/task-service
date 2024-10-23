/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.FilesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.FILES</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>information_schema.FILES.FILE_ID</code>.
     */
    public final TableField<FilesRecord, Long> FILE_ID = createField(DSL.name("FILE_ID"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.FILE_NAME</code>.
     */
    public final TableField<FilesRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public final TableField<FilesRecord, String> FILE_TYPE = createField(DSL.name("FILE_TYPE"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public final TableField<FilesRecord, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), SQLDataType.VARCHAR(268).nullable(false), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public final TableField<FilesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR.nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public final TableField<FilesRecord, byte[]> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public final TableField<FilesRecord, byte[]> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public final TableField<FilesRecord, String> LOGFILE_GROUP_NAME = createField(DSL.name("LOGFILE_GROUP_NAME"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public final TableField<FilesRecord, Long> LOGFILE_GROUP_NUMBER = createField(DSL.name("LOGFILE_GROUP_NUMBER"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.ENGINE</code>.
     */
    public final TableField<FilesRecord, String> ENGINE = createField(DSL.name("ENGINE"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public final TableField<FilesRecord, byte[]> FULLTEXT_KEYS = createField(DSL.name("FULLTEXT_KEYS"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public final TableField<FilesRecord, byte[]> DELETED_ROWS = createField(DSL.name("DELETED_ROWS"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public final TableField<FilesRecord, byte[]> UPDATE_COUNT = createField(DSL.name("UPDATE_COUNT"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public final TableField<FilesRecord, Long> FREE_EXTENTS = createField(DSL.name("FREE_EXTENTS"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public final TableField<FilesRecord, Long> TOTAL_EXTENTS = createField(DSL.name("TOTAL_EXTENTS"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> EXTENT_SIZE = createField(DSL.name("EXTENT_SIZE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> INITIAL_SIZE = createField(DSL.name("INITIAL_SIZE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> MAXIMUM_SIZE = createField(DSL.name("MAXIMUM_SIZE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> AUTOEXTEND_SIZE = createField(DSL.name("AUTOEXTEND_SIZE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> CREATION_TIME = createField(DSL.name("CREATION_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> LAST_UPDATE_TIME = createField(DSL.name("LAST_UPDATE_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> LAST_ACCESS_TIME = createField(DSL.name("LAST_ACCESS_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> RECOVER_TIME = createField(DSL.name("RECOVER_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public final TableField<FilesRecord, byte[]> TRANSACTION_COUNTER = createField(DSL.name("TRANSACTION_COUNTER"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.VERSION</code>.
     */
    public final TableField<FilesRecord, Long> VERSION = createField(DSL.name("VERSION"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public final TableField<FilesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public final TableField<FilesRecord, byte[]> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.DATA_FREE</code>.
     */
    public final TableField<FilesRecord, Long> DATA_FREE = createField(DSL.name("DATA_FREE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> CHECK_TIME = createField(DSL.name("CHECK_TIME"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.CHECKSUM</code>.
     */
    public final TableField<FilesRecord, byte[]> CHECKSUM = createField(DSL.name("CHECKSUM"), SQLDataType.VARBINARY, this, "");

    /**
     * The column <code>information_schema.FILES.STATUS</code>.
     */
    public final TableField<FilesRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.EXTRA</code>.
     */
    public final TableField<FilesRecord, String> EXTRA = createField(DSL.name("EXTRA"), SQLDataType.VARCHAR(256), this, "");

    private Files(Name alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(Name alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    public Files(String alias) {
        this(DSL.name(alias), FILES);
    }

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    public Files(Name alias) {
        this(alias, FILES);
    }

    /**
     * Create a <code>information_schema.FILES</code> table reference
     */
    public Files() {
        this(DSL.name("FILES"), null);
    }

    public <O extends Record> Files(Table<O> child, ForeignKey<O, FilesRecord> key) {
        super(child, key, FILES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Files as(String alias) {
        return new Files(DSL.name(alias), this);
    }

    @Override
    public Files as(Name alias) {
        return new Files(alias, this);
    }

    @Override
    public Files as(Table<?> alias) {
        return new Files(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Name name) {
        return new Files(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Table<?> name) {
        return new Files(name.getQualifiedName(), null);
    }
}
