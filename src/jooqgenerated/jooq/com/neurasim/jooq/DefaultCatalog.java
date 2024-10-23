/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.user_task_management.UserTaskManagement;

import java.util.Arrays;
import java.util.List;

import org.jooq.Constants;
import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>mysql</code>.
     */
    public final Mysql MYSQL = Mysql.MYSQL;

    /**
     * The schema <code>performance_schema</code>.
     */
    public final PerformanceSchema PERFORMANCE_SCHEMA = PerformanceSchema.PERFORMANCE_SCHEMA;

    /**
     * The schema <code>user_task_management</code>.
     */
    public final UserTaskManagement USER_TASK_MANAGEMENT = UserTaskManagement.USER_TASK_MANAGEMENT;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.asList(
            InformationSchema.INFORMATION_SCHEMA,
            Mysql.MYSQL,
            PerformanceSchema.PERFORMANCE_SCHEMA,
            UserTaskManagement.USER_TASK_MANAGEMENT
        );
    }

    /**
     * A reference to the 3.17 minor release of the code generator. If this
     * doesn't compile, it's because the runtime library uses an older minor
     * release, namely: 3.17. You can turn off the generation of this reference
     * by specifying /configuration/generator/generate/jooqVersionReference
     */
    private static final String REQUIRE_RUNTIME_JOOQ_VERSION = Constants.VERSION_3_17;
}