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
public class EventsStatementsSummaryByUserByEventName implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String user;
    private final String eventName;
    private final ULong countStar;
    private final ULong sumTimerWait;
    private final ULong minTimerWait;
    private final ULong avgTimerWait;
    private final ULong maxTimerWait;
    private final ULong sumLockTime;
    private final ULong sumErrors;
    private final ULong sumWarnings;
    private final ULong sumRowsAffected;
    private final ULong sumRowsSent;
    private final ULong sumRowsExamined;
    private final ULong sumCreatedTmpDiskTables;
    private final ULong sumCreatedTmpTables;
    private final ULong sumSelectFullJoin;
    private final ULong sumSelectFullRangeJoin;
    private final ULong sumSelectRange;
    private final ULong sumSelectRangeCheck;
    private final ULong sumSelectScan;
    private final ULong sumSortMergePasses;
    private final ULong sumSortRange;
    private final ULong sumSortRows;
    private final ULong sumSortScan;
    private final ULong sumNoIndexUsed;
    private final ULong sumNoGoodIndexUsed;
    private final ULong sumCpuTime;
    private final ULong maxControlledMemory;
    private final ULong maxTotalMemory;
    private final ULong countSecondary;

    public EventsStatementsSummaryByUserByEventName(EventsStatementsSummaryByUserByEventName value) {
        this.user = value.user;
        this.eventName = value.eventName;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
        this.sumLockTime = value.sumLockTime;
        this.sumErrors = value.sumErrors;
        this.sumWarnings = value.sumWarnings;
        this.sumRowsAffected = value.sumRowsAffected;
        this.sumRowsSent = value.sumRowsSent;
        this.sumRowsExamined = value.sumRowsExamined;
        this.sumCreatedTmpDiskTables = value.sumCreatedTmpDiskTables;
        this.sumCreatedTmpTables = value.sumCreatedTmpTables;
        this.sumSelectFullJoin = value.sumSelectFullJoin;
        this.sumSelectFullRangeJoin = value.sumSelectFullRangeJoin;
        this.sumSelectRange = value.sumSelectRange;
        this.sumSelectRangeCheck = value.sumSelectRangeCheck;
        this.sumSelectScan = value.sumSelectScan;
        this.sumSortMergePasses = value.sumSortMergePasses;
        this.sumSortRange = value.sumSortRange;
        this.sumSortRows = value.sumSortRows;
        this.sumSortScan = value.sumSortScan;
        this.sumNoIndexUsed = value.sumNoIndexUsed;
        this.sumNoGoodIndexUsed = value.sumNoGoodIndexUsed;
        this.sumCpuTime = value.sumCpuTime;
        this.maxControlledMemory = value.maxControlledMemory;
        this.maxTotalMemory = value.maxTotalMemory;
        this.countSecondary = value.countSecondary;
    }

    public EventsStatementsSummaryByUserByEventName(
        String user,
        String eventName,
        ULong countStar,
        ULong sumTimerWait,
        ULong minTimerWait,
        ULong avgTimerWait,
        ULong maxTimerWait,
        ULong sumLockTime,
        ULong sumErrors,
        ULong sumWarnings,
        ULong sumRowsAffected,
        ULong sumRowsSent,
        ULong sumRowsExamined,
        ULong sumCreatedTmpDiskTables,
        ULong sumCreatedTmpTables,
        ULong sumSelectFullJoin,
        ULong sumSelectFullRangeJoin,
        ULong sumSelectRange,
        ULong sumSelectRangeCheck,
        ULong sumSelectScan,
        ULong sumSortMergePasses,
        ULong sumSortRange,
        ULong sumSortRows,
        ULong sumSortScan,
        ULong sumNoIndexUsed,
        ULong sumNoGoodIndexUsed,
        ULong sumCpuTime,
        ULong maxControlledMemory,
        ULong maxTotalMemory,
        ULong countSecondary
    ) {
        this.user = user;
        this.eventName = eventName;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
        this.sumLockTime = sumLockTime;
        this.sumErrors = sumErrors;
        this.sumWarnings = sumWarnings;
        this.sumRowsAffected = sumRowsAffected;
        this.sumRowsSent = sumRowsSent;
        this.sumRowsExamined = sumRowsExamined;
        this.sumCreatedTmpDiskTables = sumCreatedTmpDiskTables;
        this.sumCreatedTmpTables = sumCreatedTmpTables;
        this.sumSelectFullJoin = sumSelectFullJoin;
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
        this.sumSelectRange = sumSelectRange;
        this.sumSelectRangeCheck = sumSelectRangeCheck;
        this.sumSelectScan = sumSelectScan;
        this.sumSortMergePasses = sumSortMergePasses;
        this.sumSortRange = sumSortRange;
        this.sumSortRows = sumSortRows;
        this.sumSortScan = sumSortScan;
        this.sumNoIndexUsed = sumNoIndexUsed;
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
        this.sumCpuTime = sumCpuTime;
        this.maxControlledMemory = maxControlledMemory;
        this.maxTotalMemory = maxTotalMemory;
        this.countSecondary = countSecondary;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.USER</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return this.countStar;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return this.maxTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_LOCK_TIME</code>.
     */
    public ULong getSumLockTime() {
        return this.sumLockTime;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ERRORS</code>.
     */
    public ULong getSumErrors() {
        return this.sumErrors;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_WARNINGS</code>.
     */
    public ULong getSumWarnings() {
        return this.sumWarnings;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    public ULong getSumRowsAffected() {
        return this.sumRowsAffected;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ROWS_SENT</code>.
     */
    public ULong getSumRowsSent() {
        return this.sumRowsSent;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    public ULong getSumRowsExamined() {
        return this.sumRowsExamined;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public ULong getSumCreatedTmpDiskTables() {
        return this.sumCreatedTmpDiskTables;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    public ULong getSumCreatedTmpTables() {
        return this.sumCreatedTmpTables;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    public ULong getSumSelectFullJoin() {
        return this.sumSelectFullJoin;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public ULong getSumSelectFullRangeJoin() {
        return this.sumSelectFullRangeJoin;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_RANGE</code>.
     */
    public ULong getSumSelectRange() {
        return this.sumSelectRange;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    public ULong getSumSelectRangeCheck() {
        return this.sumSelectRangeCheck;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SELECT_SCAN</code>.
     */
    public ULong getSumSelectScan() {
        return this.sumSelectScan;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    public ULong getSumSortMergePasses() {
        return this.sumSortMergePasses;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_RANGE</code>.
     */
    public ULong getSumSortRange() {
        return this.sumSortRange;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_ROWS</code>.
     */
    public ULong getSumSortRows() {
        return this.sumSortRows;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_SORT_SCAN</code>.
     */
    public ULong getSumSortScan() {
        return this.sumSortScan;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    public ULong getSumNoIndexUsed() {
        return this.sumNoIndexUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public ULong getSumNoGoodIndexUsed() {
        return this.sumNoGoodIndexUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.SUM_CPU_TIME</code>.
     */
    public ULong getSumCpuTime() {
        return this.sumCpuTime;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.MAX_CONTROLLED_MEMORY</code>.
     */
    public ULong getMaxControlledMemory() {
        return this.maxControlledMemory;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.MAX_TOTAL_MEMORY</code>.
     */
    public ULong getMaxTotalMemory() {
        return this.maxTotalMemory;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_summary_by_user_by_event_name.COUNT_SECONDARY</code>.
     */
    public ULong getCountSecondary() {
        return this.countSecondary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EventsStatementsSummaryByUserByEventName other = (EventsStatementsSummaryByUserByEventName) obj;
        if (this.user == null) {
            if (other.user != null)
                return false;
        }
        else if (!this.user.equals(other.user))
            return false;
        if (this.eventName == null) {
            if (other.eventName != null)
                return false;
        }
        else if (!this.eventName.equals(other.eventName))
            return false;
        if (this.countStar == null) {
            if (other.countStar != null)
                return false;
        }
        else if (!this.countStar.equals(other.countStar))
            return false;
        if (this.sumTimerWait == null) {
            if (other.sumTimerWait != null)
                return false;
        }
        else if (!this.sumTimerWait.equals(other.sumTimerWait))
            return false;
        if (this.minTimerWait == null) {
            if (other.minTimerWait != null)
                return false;
        }
        else if (!this.minTimerWait.equals(other.minTimerWait))
            return false;
        if (this.avgTimerWait == null) {
            if (other.avgTimerWait != null)
                return false;
        }
        else if (!this.avgTimerWait.equals(other.avgTimerWait))
            return false;
        if (this.maxTimerWait == null) {
            if (other.maxTimerWait != null)
                return false;
        }
        else if (!this.maxTimerWait.equals(other.maxTimerWait))
            return false;
        if (this.sumLockTime == null) {
            if (other.sumLockTime != null)
                return false;
        }
        else if (!this.sumLockTime.equals(other.sumLockTime))
            return false;
        if (this.sumErrors == null) {
            if (other.sumErrors != null)
                return false;
        }
        else if (!this.sumErrors.equals(other.sumErrors))
            return false;
        if (this.sumWarnings == null) {
            if (other.sumWarnings != null)
                return false;
        }
        else if (!this.sumWarnings.equals(other.sumWarnings))
            return false;
        if (this.sumRowsAffected == null) {
            if (other.sumRowsAffected != null)
                return false;
        }
        else if (!this.sumRowsAffected.equals(other.sumRowsAffected))
            return false;
        if (this.sumRowsSent == null) {
            if (other.sumRowsSent != null)
                return false;
        }
        else if (!this.sumRowsSent.equals(other.sumRowsSent))
            return false;
        if (this.sumRowsExamined == null) {
            if (other.sumRowsExamined != null)
                return false;
        }
        else if (!this.sumRowsExamined.equals(other.sumRowsExamined))
            return false;
        if (this.sumCreatedTmpDiskTables == null) {
            if (other.sumCreatedTmpDiskTables != null)
                return false;
        }
        else if (!this.sumCreatedTmpDiskTables.equals(other.sumCreatedTmpDiskTables))
            return false;
        if (this.sumCreatedTmpTables == null) {
            if (other.sumCreatedTmpTables != null)
                return false;
        }
        else if (!this.sumCreatedTmpTables.equals(other.sumCreatedTmpTables))
            return false;
        if (this.sumSelectFullJoin == null) {
            if (other.sumSelectFullJoin != null)
                return false;
        }
        else if (!this.sumSelectFullJoin.equals(other.sumSelectFullJoin))
            return false;
        if (this.sumSelectFullRangeJoin == null) {
            if (other.sumSelectFullRangeJoin != null)
                return false;
        }
        else if (!this.sumSelectFullRangeJoin.equals(other.sumSelectFullRangeJoin))
            return false;
        if (this.sumSelectRange == null) {
            if (other.sumSelectRange != null)
                return false;
        }
        else if (!this.sumSelectRange.equals(other.sumSelectRange))
            return false;
        if (this.sumSelectRangeCheck == null) {
            if (other.sumSelectRangeCheck != null)
                return false;
        }
        else if (!this.sumSelectRangeCheck.equals(other.sumSelectRangeCheck))
            return false;
        if (this.sumSelectScan == null) {
            if (other.sumSelectScan != null)
                return false;
        }
        else if (!this.sumSelectScan.equals(other.sumSelectScan))
            return false;
        if (this.sumSortMergePasses == null) {
            if (other.sumSortMergePasses != null)
                return false;
        }
        else if (!this.sumSortMergePasses.equals(other.sumSortMergePasses))
            return false;
        if (this.sumSortRange == null) {
            if (other.sumSortRange != null)
                return false;
        }
        else if (!this.sumSortRange.equals(other.sumSortRange))
            return false;
        if (this.sumSortRows == null) {
            if (other.sumSortRows != null)
                return false;
        }
        else if (!this.sumSortRows.equals(other.sumSortRows))
            return false;
        if (this.sumSortScan == null) {
            if (other.sumSortScan != null)
                return false;
        }
        else if (!this.sumSortScan.equals(other.sumSortScan))
            return false;
        if (this.sumNoIndexUsed == null) {
            if (other.sumNoIndexUsed != null)
                return false;
        }
        else if (!this.sumNoIndexUsed.equals(other.sumNoIndexUsed))
            return false;
        if (this.sumNoGoodIndexUsed == null) {
            if (other.sumNoGoodIndexUsed != null)
                return false;
        }
        else if (!this.sumNoGoodIndexUsed.equals(other.sumNoGoodIndexUsed))
            return false;
        if (this.sumCpuTime == null) {
            if (other.sumCpuTime != null)
                return false;
        }
        else if (!this.sumCpuTime.equals(other.sumCpuTime))
            return false;
        if (this.maxControlledMemory == null) {
            if (other.maxControlledMemory != null)
                return false;
        }
        else if (!this.maxControlledMemory.equals(other.maxControlledMemory))
            return false;
        if (this.maxTotalMemory == null) {
            if (other.maxTotalMemory != null)
                return false;
        }
        else if (!this.maxTotalMemory.equals(other.maxTotalMemory))
            return false;
        if (this.countSecondary == null) {
            if (other.countSecondary != null)
                return false;
        }
        else if (!this.countSecondary.equals(other.countSecondary))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.user == null) ? 0 : this.user.hashCode());
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.countStar == null) ? 0 : this.countStar.hashCode());
        result = prime * result + ((this.sumTimerWait == null) ? 0 : this.sumTimerWait.hashCode());
        result = prime * result + ((this.minTimerWait == null) ? 0 : this.minTimerWait.hashCode());
        result = prime * result + ((this.avgTimerWait == null) ? 0 : this.avgTimerWait.hashCode());
        result = prime * result + ((this.maxTimerWait == null) ? 0 : this.maxTimerWait.hashCode());
        result = prime * result + ((this.sumLockTime == null) ? 0 : this.sumLockTime.hashCode());
        result = prime * result + ((this.sumErrors == null) ? 0 : this.sumErrors.hashCode());
        result = prime * result + ((this.sumWarnings == null) ? 0 : this.sumWarnings.hashCode());
        result = prime * result + ((this.sumRowsAffected == null) ? 0 : this.sumRowsAffected.hashCode());
        result = prime * result + ((this.sumRowsSent == null) ? 0 : this.sumRowsSent.hashCode());
        result = prime * result + ((this.sumRowsExamined == null) ? 0 : this.sumRowsExamined.hashCode());
        result = prime * result + ((this.sumCreatedTmpDiskTables == null) ? 0 : this.sumCreatedTmpDiskTables.hashCode());
        result = prime * result + ((this.sumCreatedTmpTables == null) ? 0 : this.sumCreatedTmpTables.hashCode());
        result = prime * result + ((this.sumSelectFullJoin == null) ? 0 : this.sumSelectFullJoin.hashCode());
        result = prime * result + ((this.sumSelectFullRangeJoin == null) ? 0 : this.sumSelectFullRangeJoin.hashCode());
        result = prime * result + ((this.sumSelectRange == null) ? 0 : this.sumSelectRange.hashCode());
        result = prime * result + ((this.sumSelectRangeCheck == null) ? 0 : this.sumSelectRangeCheck.hashCode());
        result = prime * result + ((this.sumSelectScan == null) ? 0 : this.sumSelectScan.hashCode());
        result = prime * result + ((this.sumSortMergePasses == null) ? 0 : this.sumSortMergePasses.hashCode());
        result = prime * result + ((this.sumSortRange == null) ? 0 : this.sumSortRange.hashCode());
        result = prime * result + ((this.sumSortRows == null) ? 0 : this.sumSortRows.hashCode());
        result = prime * result + ((this.sumSortScan == null) ? 0 : this.sumSortScan.hashCode());
        result = prime * result + ((this.sumNoIndexUsed == null) ? 0 : this.sumNoIndexUsed.hashCode());
        result = prime * result + ((this.sumNoGoodIndexUsed == null) ? 0 : this.sumNoGoodIndexUsed.hashCode());
        result = prime * result + ((this.sumCpuTime == null) ? 0 : this.sumCpuTime.hashCode());
        result = prime * result + ((this.maxControlledMemory == null) ? 0 : this.maxControlledMemory.hashCode());
        result = prime * result + ((this.maxTotalMemory == null) ? 0 : this.maxTotalMemory.hashCode());
        result = prime * result + ((this.countSecondary == null) ? 0 : this.countSecondary.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsStatementsSummaryByUserByEventName (");

        sb.append(user);
        sb.append(", ").append(eventName);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);
        sb.append(", ").append(sumLockTime);
        sb.append(", ").append(sumErrors);
        sb.append(", ").append(sumWarnings);
        sb.append(", ").append(sumRowsAffected);
        sb.append(", ").append(sumRowsSent);
        sb.append(", ").append(sumRowsExamined);
        sb.append(", ").append(sumCreatedTmpDiskTables);
        sb.append(", ").append(sumCreatedTmpTables);
        sb.append(", ").append(sumSelectFullJoin);
        sb.append(", ").append(sumSelectFullRangeJoin);
        sb.append(", ").append(sumSelectRange);
        sb.append(", ").append(sumSelectRangeCheck);
        sb.append(", ").append(sumSelectScan);
        sb.append(", ").append(sumSortMergePasses);
        sb.append(", ").append(sumSortRange);
        sb.append(", ").append(sumSortRows);
        sb.append(", ").append(sumSortScan);
        sb.append(", ").append(sumNoIndexUsed);
        sb.append(", ").append(sumNoGoodIndexUsed);
        sb.append(", ").append(sumCpuTime);
        sb.append(", ").append(maxControlledMemory);
        sb.append(", ").append(maxTotalMemory);
        sb.append(", ").append(countSecondary);

        sb.append(")");
        return sb.toString();
    }
}
