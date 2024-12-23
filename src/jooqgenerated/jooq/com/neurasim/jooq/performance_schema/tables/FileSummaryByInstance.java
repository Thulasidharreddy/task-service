/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Indexes;
import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.FileSummaryByInstanceRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileSummaryByInstance extends TableImpl<FileSummaryByInstanceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.file_summary_by_instance</code>
     */
    public static final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = new FileSummaryByInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileSummaryByInstanceRecord> getRecordType() {
        return FileSummaryByInstanceRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.FILE_NAME</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.EVENT_NAME</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.COUNT_STAR</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.COUNT_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_READ = createField(DSL.name("COUNT_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.SUM_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_READ = createField(DSL.name("SUM_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MIN_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_READ = createField(DSL.name("MIN_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.AVG_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_READ = createField(DSL.name("AVG_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MAX_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_READ = createField(DSL.name("MAX_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, Long> SUM_NUMBER_OF_BYTES_READ = createField(DSL.name("SUM_NUMBER_OF_BYTES_READ"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.COUNT_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_WRITE = createField(DSL.name("COUNT_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.SUM_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_WRITE = createField(DSL.name("SUM_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MIN_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_WRITE = createField(DSL.name("MIN_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.AVG_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_WRITE = createField(DSL.name("AVG_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MAX_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_WRITE = createField(DSL.name("MAX_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, Long> SUM_NUMBER_OF_BYTES_WRITE = createField(DSL.name("SUM_NUMBER_OF_BYTES_WRITE"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.COUNT_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_MISC = createField(DSL.name("COUNT_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.SUM_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_MISC = createField(DSL.name("SUM_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MIN_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_MISC = createField(DSL.name("MIN_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.AVG_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_MISC = createField(DSL.name("AVG_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.file_summary_by_instance.MAX_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_MISC = createField(DSL.name("MAX_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private FileSummaryByInstance(Name alias, Table<FileSummaryByInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileSummaryByInstance(Name alias, Table<FileSummaryByInstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.file_summary_by_instance</code> table reference
     */
    public FileSummaryByInstance(String alias) {
        this(DSL.name(alias), FILE_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create an aliased
     * <code>performance_schema.file_summary_by_instance</code> table reference
     */
    public FileSummaryByInstance(Name alias) {
        this(alias, FILE_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create a <code>performance_schema.file_summary_by_instance</code> table
     * reference
     */
    public FileSummaryByInstance() {
        this(DSL.name("file_summary_by_instance"), null);
    }

    public <O extends Record> FileSummaryByInstance(Table<O> child, ForeignKey<O, FileSummaryByInstanceRecord> key) {
        super(child, key, FILE_SUMMARY_BY_INSTANCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FILE_SUMMARY_BY_INSTANCE_EVENT_NAME, Indexes.FILE_SUMMARY_BY_INSTANCE_FILE_NAME);
    }

    @Override
    public UniqueKey<FileSummaryByInstanceRecord> getPrimaryKey() {
        return Keys.KEY_FILE_SUMMARY_BY_INSTANCE_PRIMARY;
    }

    @Override
    public FileSummaryByInstance as(String alias) {
        return new FileSummaryByInstance(DSL.name(alias), this);
    }

    @Override
    public FileSummaryByInstance as(Name alias) {
        return new FileSummaryByInstance(alias, this);
    }

    @Override
    public FileSummaryByInstance as(Table<?> alias) {
        return new FileSummaryByInstance(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileSummaryByInstance rename(String name) {
        return new FileSummaryByInstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileSummaryByInstance rename(Name name) {
        return new FileSummaryByInstance(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileSummaryByInstance rename(Table<?> name) {
        return new FileSummaryByInstance(name.getQualifiedName(), null);
    }
}
