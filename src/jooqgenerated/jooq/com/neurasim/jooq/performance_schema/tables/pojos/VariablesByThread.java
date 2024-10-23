/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VariablesByThread implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong threadId;
    private final String variableName;
    private final String variableValue;

    public VariablesByThread(VariablesByThread value) {
        this.threadId = value.threadId;
        this.variableName = value.variableName;
        this.variableValue = value.variableValue;
    }

    public VariablesByThread(
        ULong threadId,
        String variableName,
        String variableValue
    ) {
        this.threadId = threadId;
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    /**
     * Getter for <code>performance_schema.variables_by_thread.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return this.threadId;
    }

    /**
     * Getter for
     * <code>performance_schema.variables_by_thread.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return this.variableName;
    }

    /**
     * Getter for
     * <code>performance_schema.variables_by_thread.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return this.variableValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final VariablesByThread other = (VariablesByThread) obj;
        if (this.threadId == null) {
            if (other.threadId != null)
                return false;
        }
        else if (!this.threadId.equals(other.threadId))
            return false;
        if (this.variableName == null) {
            if (other.variableName != null)
                return false;
        }
        else if (!this.variableName.equals(other.variableName))
            return false;
        if (this.variableValue == null) {
            if (other.variableValue != null)
                return false;
        }
        else if (!this.variableValue.equals(other.variableValue))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.threadId == null) ? 0 : this.threadId.hashCode());
        result = prime * result + ((this.variableName == null) ? 0 : this.variableName.hashCode());
        result = prime * result + ((this.variableValue == null) ? 0 : this.variableValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VariablesByThread (");

        sb.append(threadId);
        sb.append(", ").append(variableName);
        sb.append(", ").append(variableValue);

        sb.append(")");
        return sb.toString();
    }
}