/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SetupMetricsMetricType implements EnumType {

    ASYNC_COUNTER("ASYNC COUNTER"),

    ASYNC_UPDOWN_COUNTER("ASYNC UPDOWN COUNTER"),

    ASYNC_GAUGE_COUNTER("ASYNC GAUGE COUNTER");

    private final String literal;

    private SetupMetricsMetricType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "setup_metrics_METRIC_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static SetupMetricsMetricType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(SetupMetricsMetricType.class, literal);
    }
}