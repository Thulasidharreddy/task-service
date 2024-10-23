/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum RoutinesSqlDataAccess implements EnumType {

    CONTAINS_SQL("CONTAINS SQL"),

    NO_SQL("NO SQL"),

    READS_SQL_DATA("READS SQL DATA"),

    MODIFIES_SQL_DATA("MODIFIES SQL DATA");

    private final String literal;

    private RoutinesSqlDataAccess(String literal) {
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
        return "ROUTINES_SQL_DATA_ACCESS";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static RoutinesSqlDataAccess lookupLiteral(String literal) {
        return EnumType.lookupLiteral(RoutinesSqlDataAccess.class, literal);
    }
}
