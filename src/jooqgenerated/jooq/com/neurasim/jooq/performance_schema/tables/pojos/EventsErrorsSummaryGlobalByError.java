/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsErrorsSummaryGlobalByError implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer errorNumber;
    private final String errorName;
    private final String sqlState;
    private final ULong sumErrorRaised;
    private final ULong sumErrorHandled;
    private final LocalDateTime firstSeen;
    private final LocalDateTime lastSeen;

    public EventsErrorsSummaryGlobalByError(EventsErrorsSummaryGlobalByError value) {
        this.errorNumber = value.errorNumber;
        this.errorName = value.errorName;
        this.sqlState = value.sqlState;
        this.sumErrorRaised = value.sumErrorRaised;
        this.sumErrorHandled = value.sumErrorHandled;
        this.firstSeen = value.firstSeen;
        this.lastSeen = value.lastSeen;
    }

    public EventsErrorsSummaryGlobalByError(
        Integer errorNumber,
        String errorName,
        String sqlState,
        ULong sumErrorRaised,
        ULong sumErrorHandled,
        LocalDateTime firstSeen,
        LocalDateTime lastSeen
    ) {
        this.errorNumber = errorNumber;
        this.errorName = errorName;
        this.sqlState = sqlState;
        this.sumErrorRaised = sumErrorRaised;
        this.sumErrorHandled = sumErrorHandled;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.ERROR_NUMBER</code>.
     */
    public Integer getErrorNumber() {
        return this.errorNumber;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.ERROR_NAME</code>.
     */
    public String getErrorName() {
        return this.errorName;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.SQL_STATE</code>.
     */
    public String getSqlState() {
        return this.sqlState;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.SUM_ERROR_RAISED</code>.
     */
    public ULong getSumErrorRaised() {
        return this.sumErrorRaised;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.SUM_ERROR_HANDLED</code>.
     */
    public ULong getSumErrorHandled() {
        return this.sumErrorHandled;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.FIRST_SEEN</code>.
     */
    public LocalDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.LAST_SEEN</code>.
     */
    public LocalDateTime getLastSeen() {
        return this.lastSeen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EventsErrorsSummaryGlobalByError other = (EventsErrorsSummaryGlobalByError) obj;
        if (this.errorNumber == null) {
            if (other.errorNumber != null)
                return false;
        }
        else if (!this.errorNumber.equals(other.errorNumber))
            return false;
        if (this.errorName == null) {
            if (other.errorName != null)
                return false;
        }
        else if (!this.errorName.equals(other.errorName))
            return false;
        if (this.sqlState == null) {
            if (other.sqlState != null)
                return false;
        }
        else if (!this.sqlState.equals(other.sqlState))
            return false;
        if (this.sumErrorRaised == null) {
            if (other.sumErrorRaised != null)
                return false;
        }
        else if (!this.sumErrorRaised.equals(other.sumErrorRaised))
            return false;
        if (this.sumErrorHandled == null) {
            if (other.sumErrorHandled != null)
                return false;
        }
        else if (!this.sumErrorHandled.equals(other.sumErrorHandled))
            return false;
        if (this.firstSeen == null) {
            if (other.firstSeen != null)
                return false;
        }
        else if (!this.firstSeen.equals(other.firstSeen))
            return false;
        if (this.lastSeen == null) {
            if (other.lastSeen != null)
                return false;
        }
        else if (!this.lastSeen.equals(other.lastSeen))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.errorNumber == null) ? 0 : this.errorNumber.hashCode());
        result = prime * result + ((this.errorName == null) ? 0 : this.errorName.hashCode());
        result = prime * result + ((this.sqlState == null) ? 0 : this.sqlState.hashCode());
        result = prime * result + ((this.sumErrorRaised == null) ? 0 : this.sumErrorRaised.hashCode());
        result = prime * result + ((this.sumErrorHandled == null) ? 0 : this.sumErrorHandled.hashCode());
        result = prime * result + ((this.firstSeen == null) ? 0 : this.firstSeen.hashCode());
        result = prime * result + ((this.lastSeen == null) ? 0 : this.lastSeen.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsErrorsSummaryGlobalByError (");

        sb.append(errorNumber);
        sb.append(", ").append(errorName);
        sb.append(", ").append(sqlState);
        sb.append(", ").append(sumErrorRaised);
        sb.append(", ").append(sumErrorHandled);
        sb.append(", ").append(firstSeen);
        sb.append(", ").append(lastSeen);

        sb.append(")");
        return sb.toString();
    }
}
