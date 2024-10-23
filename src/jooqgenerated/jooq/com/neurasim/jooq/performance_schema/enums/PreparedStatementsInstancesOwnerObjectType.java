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
public enum PreparedStatementsInstancesOwnerObjectType implements EnumType {

    EVENT("EVENT"),

    FUNCTION("FUNCTION"),

    PROCEDURE("PROCEDURE"),

    TABLE("TABLE"),

    TRIGGER("TRIGGER");

    private final String literal;

    private PreparedStatementsInstancesOwnerObjectType(String literal) {
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
        return "prepared_statements_instances_OWNER_OBJECT_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static PreparedStatementsInstancesOwnerObjectType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(PreparedStatementsInstancesOwnerObjectType.class, literal);
    }
}