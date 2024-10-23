/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum DbAlterPriv implements EnumType {

    N("N"),

    Y("Y");

    private final String literal;

    private DbAlterPriv(String literal) {
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
        return "db_Alter_priv";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static DbAlterPriv lookupLiteral(String literal) {
        return EnumType.lookupLiteral(DbAlterPriv.class, literal);
    }
}
