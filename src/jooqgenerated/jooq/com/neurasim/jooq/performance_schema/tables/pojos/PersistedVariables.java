/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersistedVariables implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String variableName;
    private final String variableValue;

    public PersistedVariables(PersistedVariables value) {
        this.variableName = value.variableName;
        this.variableValue = value.variableValue;
    }

    public PersistedVariables(
        String variableName,
        String variableValue
    ) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    /**
     * Getter for
     * <code>performance_schema.persisted_variables.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return this.variableName;
    }

    /**
     * Getter for
     * <code>performance_schema.persisted_variables.VARIABLE_VALUE</code>.
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
        final PersistedVariables other = (PersistedVariables) obj;
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
        result = prime * result + ((this.variableName == null) ? 0 : this.variableName.hashCode());
        result = prime * result + ((this.variableValue == null) ? 0 : this.variableValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersistedVariables (");

        sb.append(variableName);
        sb.append(", ").append(variableValue);

        sb.append(")");
        return sb.toString();
    }
}
