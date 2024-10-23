/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import com.neurasim.jooq.information_schema.enums.TriggersActionTiming;
import com.neurasim.jooq.information_schema.enums.TriggersEventManipulation;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String triggerCatalog;
    private final String triggerSchema;
    private final String triggerName;
    private final TriggersEventManipulation eventManipulation;
    private final String eventObjectCatalog;
    private final String eventObjectSchema;
    private final String eventObjectTable;
    private final UInteger actionOrder;
    private final byte[] actionCondition;
    private final String actionStatement;
    private final String actionOrientation;
    private final TriggersActionTiming actionTiming;
    private final byte[] actionReferenceOldTable;
    private final byte[] actionReferenceNewTable;
    private final String actionReferenceOldRow;
    private final String actionReferenceNewRow;
    private final LocalDateTime created;
    private final String sqlMode;
    private final String definer;
    private final String characterSetClient;
    private final String collationConnection;
    private final String databaseCollation;

    public Triggers(Triggers value) {
        this.triggerCatalog = value.triggerCatalog;
        this.triggerSchema = value.triggerSchema;
        this.triggerName = value.triggerName;
        this.eventManipulation = value.eventManipulation;
        this.eventObjectCatalog = value.eventObjectCatalog;
        this.eventObjectSchema = value.eventObjectSchema;
        this.eventObjectTable = value.eventObjectTable;
        this.actionOrder = value.actionOrder;
        this.actionCondition = value.actionCondition;
        this.actionStatement = value.actionStatement;
        this.actionOrientation = value.actionOrientation;
        this.actionTiming = value.actionTiming;
        this.actionReferenceOldTable = value.actionReferenceOldTable;
        this.actionReferenceNewTable = value.actionReferenceNewTable;
        this.actionReferenceOldRow = value.actionReferenceOldRow;
        this.actionReferenceNewRow = value.actionReferenceNewRow;
        this.created = value.created;
        this.sqlMode = value.sqlMode;
        this.definer = value.definer;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
        this.databaseCollation = value.databaseCollation;
    }

    public Triggers(
        String triggerCatalog,
        String triggerSchema,
        String triggerName,
        TriggersEventManipulation eventManipulation,
        String eventObjectCatalog,
        String eventObjectSchema,
        String eventObjectTable,
        UInteger actionOrder,
        byte[] actionCondition,
        String actionStatement,
        String actionOrientation,
        TriggersActionTiming actionTiming,
        byte[] actionReferenceOldTable,
        byte[] actionReferenceNewTable,
        String actionReferenceOldRow,
        String actionReferenceNewRow,
        LocalDateTime created,
        String sqlMode,
        String definer,
        String characterSetClient,
        String collationConnection,
        String databaseCollation
    ) {
        this.triggerCatalog = triggerCatalog;
        this.triggerSchema = triggerSchema;
        this.triggerName = triggerName;
        this.eventManipulation = eventManipulation;
        this.eventObjectCatalog = eventObjectCatalog;
        this.eventObjectSchema = eventObjectSchema;
        this.eventObjectTable = eventObjectTable;
        this.actionOrder = actionOrder;
        this.actionCondition = actionCondition;
        this.actionStatement = actionStatement;
        this.actionOrientation = actionOrientation;
        this.actionTiming = actionTiming;
        this.actionReferenceOldTable = actionReferenceOldTable;
        this.actionReferenceNewTable = actionReferenceNewTable;
        this.actionReferenceOldRow = actionReferenceOldRow;
        this.actionReferenceNewRow = actionReferenceNewRow;
        this.created = created;
        this.sqlMode = sqlMode;
        this.definer = definer;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
        this.databaseCollation = databaseCollation;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
     */
    public String getTriggerCatalog() {
        return this.triggerCatalog;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
     */
    public String getTriggerSchema() {
        return this.triggerSchema;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
     */
    public TriggersEventManipulation getEventManipulation() {
        return this.eventManipulation;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
     */
    public String getEventObjectCatalog() {
        return this.eventObjectCatalog;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
     */
    public String getEventObjectSchema() {
        return this.eventObjectSchema;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
     */
    public String getEventObjectTable() {
        return this.eventObjectTable;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
     */
    public UInteger getActionOrder() {
        return this.actionOrder;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
     */
    public byte[] getActionCondition() {
        return this.actionCondition;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
     */
    public String getActionStatement() {
        return this.actionStatement;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
     */
    public String getActionOrientation() {
        return this.actionOrientation;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
     */
    public TriggersActionTiming getActionTiming() {
        return this.actionTiming;
    }

    /**
     * Getter for
     * <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
     */
    public byte[] getActionReferenceOldTable() {
        return this.actionReferenceOldTable;
    }

    /**
     * Getter for
     * <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
     */
    public byte[] getActionReferenceNewTable() {
        return this.actionReferenceNewTable;
    }

    /**
     * Getter for
     * <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
     */
    public String getActionReferenceOldRow() {
        return this.actionReferenceOldRow;
    }

    /**
     * Getter for
     * <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
     */
    public String getActionReferenceNewRow() {
        return this.actionReferenceNewRow;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.CREATED</code>.
     */
    public LocalDateTime getCreated() {
        return this.created;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return this.sqlMode;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.DEFINER</code>.
     */
    public String getDefiner() {
        return this.definer;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return this.characterSetClient;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return this.collationConnection;
    }

    /**
     * Getter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return this.databaseCollation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Triggers other = (Triggers) obj;
        if (this.triggerCatalog == null) {
            if (other.triggerCatalog != null)
                return false;
        }
        else if (!this.triggerCatalog.equals(other.triggerCatalog))
            return false;
        if (this.triggerSchema == null) {
            if (other.triggerSchema != null)
                return false;
        }
        else if (!this.triggerSchema.equals(other.triggerSchema))
            return false;
        if (this.triggerName == null) {
            if (other.triggerName != null)
                return false;
        }
        else if (!this.triggerName.equals(other.triggerName))
            return false;
        if (this.eventManipulation == null) {
            if (other.eventManipulation != null)
                return false;
        }
        else if (!this.eventManipulation.equals(other.eventManipulation))
            return false;
        if (this.eventObjectCatalog == null) {
            if (other.eventObjectCatalog != null)
                return false;
        }
        else if (!this.eventObjectCatalog.equals(other.eventObjectCatalog))
            return false;
        if (this.eventObjectSchema == null) {
            if (other.eventObjectSchema != null)
                return false;
        }
        else if (!this.eventObjectSchema.equals(other.eventObjectSchema))
            return false;
        if (this.eventObjectTable == null) {
            if (other.eventObjectTable != null)
                return false;
        }
        else if (!this.eventObjectTable.equals(other.eventObjectTable))
            return false;
        if (this.actionOrder == null) {
            if (other.actionOrder != null)
                return false;
        }
        else if (!this.actionOrder.equals(other.actionOrder))
            return false;
        if (this.actionCondition == null) {
            if (other.actionCondition != null)
                return false;
        }
        else if (!Arrays.equals(this.actionCondition, other.actionCondition))
            return false;
        if (this.actionStatement == null) {
            if (other.actionStatement != null)
                return false;
        }
        else if (!this.actionStatement.equals(other.actionStatement))
            return false;
        if (this.actionOrientation == null) {
            if (other.actionOrientation != null)
                return false;
        }
        else if (!this.actionOrientation.equals(other.actionOrientation))
            return false;
        if (this.actionTiming == null) {
            if (other.actionTiming != null)
                return false;
        }
        else if (!this.actionTiming.equals(other.actionTiming))
            return false;
        if (this.actionReferenceOldTable == null) {
            if (other.actionReferenceOldTable != null)
                return false;
        }
        else if (!Arrays.equals(this.actionReferenceOldTable, other.actionReferenceOldTable))
            return false;
        if (this.actionReferenceNewTable == null) {
            if (other.actionReferenceNewTable != null)
                return false;
        }
        else if (!Arrays.equals(this.actionReferenceNewTable, other.actionReferenceNewTable))
            return false;
        if (this.actionReferenceOldRow == null) {
            if (other.actionReferenceOldRow != null)
                return false;
        }
        else if (!this.actionReferenceOldRow.equals(other.actionReferenceOldRow))
            return false;
        if (this.actionReferenceNewRow == null) {
            if (other.actionReferenceNewRow != null)
                return false;
        }
        else if (!this.actionReferenceNewRow.equals(other.actionReferenceNewRow))
            return false;
        if (this.created == null) {
            if (other.created != null)
                return false;
        }
        else if (!this.created.equals(other.created))
            return false;
        if (this.sqlMode == null) {
            if (other.sqlMode != null)
                return false;
        }
        else if (!this.sqlMode.equals(other.sqlMode))
            return false;
        if (this.definer == null) {
            if (other.definer != null)
                return false;
        }
        else if (!this.definer.equals(other.definer))
            return false;
        if (this.characterSetClient == null) {
            if (other.characterSetClient != null)
                return false;
        }
        else if (!this.characterSetClient.equals(other.characterSetClient))
            return false;
        if (this.collationConnection == null) {
            if (other.collationConnection != null)
                return false;
        }
        else if (!this.collationConnection.equals(other.collationConnection))
            return false;
        if (this.databaseCollation == null) {
            if (other.databaseCollation != null)
                return false;
        }
        else if (!this.databaseCollation.equals(other.databaseCollation))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.triggerCatalog == null) ? 0 : this.triggerCatalog.hashCode());
        result = prime * result + ((this.triggerSchema == null) ? 0 : this.triggerSchema.hashCode());
        result = prime * result + ((this.triggerName == null) ? 0 : this.triggerName.hashCode());
        result = prime * result + ((this.eventManipulation == null) ? 0 : this.eventManipulation.hashCode());
        result = prime * result + ((this.eventObjectCatalog == null) ? 0 : this.eventObjectCatalog.hashCode());
        result = prime * result + ((this.eventObjectSchema == null) ? 0 : this.eventObjectSchema.hashCode());
        result = prime * result + ((this.eventObjectTable == null) ? 0 : this.eventObjectTable.hashCode());
        result = prime * result + ((this.actionOrder == null) ? 0 : this.actionOrder.hashCode());
        result = prime * result + ((this.actionCondition == null) ? 0 : Arrays.hashCode(this.actionCondition));
        result = prime * result + ((this.actionStatement == null) ? 0 : this.actionStatement.hashCode());
        result = prime * result + ((this.actionOrientation == null) ? 0 : this.actionOrientation.hashCode());
        result = prime * result + ((this.actionTiming == null) ? 0 : this.actionTiming.hashCode());
        result = prime * result + ((this.actionReferenceOldTable == null) ? 0 : Arrays.hashCode(this.actionReferenceOldTable));
        result = prime * result + ((this.actionReferenceNewTable == null) ? 0 : Arrays.hashCode(this.actionReferenceNewTable));
        result = prime * result + ((this.actionReferenceOldRow == null) ? 0 : this.actionReferenceOldRow.hashCode());
        result = prime * result + ((this.actionReferenceNewRow == null) ? 0 : this.actionReferenceNewRow.hashCode());
        result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
        result = prime * result + ((this.sqlMode == null) ? 0 : this.sqlMode.hashCode());
        result = prime * result + ((this.definer == null) ? 0 : this.definer.hashCode());
        result = prime * result + ((this.characterSetClient == null) ? 0 : this.characterSetClient.hashCode());
        result = prime * result + ((this.collationConnection == null) ? 0 : this.collationConnection.hashCode());
        result = prime * result + ((this.databaseCollation == null) ? 0 : this.databaseCollation.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Triggers (");

        sb.append(triggerCatalog);
        sb.append(", ").append(triggerSchema);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(eventManipulation);
        sb.append(", ").append(eventObjectCatalog);
        sb.append(", ").append(eventObjectSchema);
        sb.append(", ").append(eventObjectTable);
        sb.append(", ").append(actionOrder);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(actionStatement);
        sb.append(", ").append(actionOrientation);
        sb.append(", ").append(actionTiming);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(actionReferenceOldRow);
        sb.append(", ").append(actionReferenceNewRow);
        sb.append(", ").append(created);
        sb.append(", ").append(sqlMode);
        sb.append(", ").append(definer);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);
        sb.append(", ").append(databaseCollation);

        sb.append(")");
        return sb.toString();
    }
}