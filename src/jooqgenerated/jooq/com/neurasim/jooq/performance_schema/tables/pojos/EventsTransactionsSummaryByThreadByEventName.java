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
public class EventsTransactionsSummaryByThreadByEventName implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong threadId;
    private final String eventName;
    private final ULong countStar;
    private final ULong sumTimerWait;
    private final ULong minTimerWait;
    private final ULong avgTimerWait;
    private final ULong maxTimerWait;
    private final ULong countReadWrite;
    private final ULong sumTimerReadWrite;
    private final ULong minTimerReadWrite;
    private final ULong avgTimerReadWrite;
    private final ULong maxTimerReadWrite;
    private final ULong countReadOnly;
    private final ULong sumTimerReadOnly;
    private final ULong minTimerReadOnly;
    private final ULong avgTimerReadOnly;
    private final ULong maxTimerReadOnly;

    public EventsTransactionsSummaryByThreadByEventName(EventsTransactionsSummaryByThreadByEventName value) {
        this.threadId = value.threadId;
        this.eventName = value.eventName;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
        this.countReadWrite = value.countReadWrite;
        this.sumTimerReadWrite = value.sumTimerReadWrite;
        this.minTimerReadWrite = value.minTimerReadWrite;
        this.avgTimerReadWrite = value.avgTimerReadWrite;
        this.maxTimerReadWrite = value.maxTimerReadWrite;
        this.countReadOnly = value.countReadOnly;
        this.sumTimerReadOnly = value.sumTimerReadOnly;
        this.minTimerReadOnly = value.minTimerReadOnly;
        this.avgTimerReadOnly = value.avgTimerReadOnly;
        this.maxTimerReadOnly = value.maxTimerReadOnly;
    }

    public EventsTransactionsSummaryByThreadByEventName(
        ULong threadId,
        String eventName,
        ULong countStar,
        ULong sumTimerWait,
        ULong minTimerWait,
        ULong avgTimerWait,
        ULong maxTimerWait,
        ULong countReadWrite,
        ULong sumTimerReadWrite,
        ULong minTimerReadWrite,
        ULong avgTimerReadWrite,
        ULong maxTimerReadWrite,
        ULong countReadOnly,
        ULong sumTimerReadOnly,
        ULong minTimerReadOnly,
        ULong avgTimerReadOnly,
        ULong maxTimerReadOnly
    ) {
        this.threadId = threadId;
        this.eventName = eventName;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
        this.countReadWrite = countReadWrite;
        this.sumTimerReadWrite = sumTimerReadWrite;
        this.minTimerReadWrite = minTimerReadWrite;
        this.avgTimerReadWrite = avgTimerReadWrite;
        this.maxTimerReadWrite = maxTimerReadWrite;
        this.countReadOnly = countReadOnly;
        this.sumTimerReadOnly = sumTimerReadOnly;
        this.minTimerReadOnly = minTimerReadOnly;
        this.avgTimerReadOnly = avgTimerReadOnly;
        this.maxTimerReadOnly = maxTimerReadOnly;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return this.threadId;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return this.countStar;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return this.maxTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.COUNT_READ_WRITE</code>.
     */
    public ULong getCountReadWrite() {
        return this.countReadWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public ULong getSumTimerReadWrite() {
        return this.sumTimerReadWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public ULong getMinTimerReadWrite() {
        return this.minTimerReadWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public ULong getAvgTimerReadWrite() {
        return this.avgTimerReadWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public ULong getMaxTimerReadWrite() {
        return this.maxTimerReadWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.COUNT_READ_ONLY</code>.
     */
    public ULong getCountReadOnly() {
        return this.countReadOnly;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public ULong getSumTimerReadOnly() {
        return this.sumTimerReadOnly;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public ULong getMinTimerReadOnly() {
        return this.minTimerReadOnly;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public ULong getAvgTimerReadOnly() {
        return this.avgTimerReadOnly;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public ULong getMaxTimerReadOnly() {
        return this.maxTimerReadOnly;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EventsTransactionsSummaryByThreadByEventName other = (EventsTransactionsSummaryByThreadByEventName) obj;
        if (this.threadId == null) {
            if (other.threadId != null)
                return false;
        }
        else if (!this.threadId.equals(other.threadId))
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
        if (this.countReadWrite == null) {
            if (other.countReadWrite != null)
                return false;
        }
        else if (!this.countReadWrite.equals(other.countReadWrite))
            return false;
        if (this.sumTimerReadWrite == null) {
            if (other.sumTimerReadWrite != null)
                return false;
        }
        else if (!this.sumTimerReadWrite.equals(other.sumTimerReadWrite))
            return false;
        if (this.minTimerReadWrite == null) {
            if (other.minTimerReadWrite != null)
                return false;
        }
        else if (!this.minTimerReadWrite.equals(other.minTimerReadWrite))
            return false;
        if (this.avgTimerReadWrite == null) {
            if (other.avgTimerReadWrite != null)
                return false;
        }
        else if (!this.avgTimerReadWrite.equals(other.avgTimerReadWrite))
            return false;
        if (this.maxTimerReadWrite == null) {
            if (other.maxTimerReadWrite != null)
                return false;
        }
        else if (!this.maxTimerReadWrite.equals(other.maxTimerReadWrite))
            return false;
        if (this.countReadOnly == null) {
            if (other.countReadOnly != null)
                return false;
        }
        else if (!this.countReadOnly.equals(other.countReadOnly))
            return false;
        if (this.sumTimerReadOnly == null) {
            if (other.sumTimerReadOnly != null)
                return false;
        }
        else if (!this.sumTimerReadOnly.equals(other.sumTimerReadOnly))
            return false;
        if (this.minTimerReadOnly == null) {
            if (other.minTimerReadOnly != null)
                return false;
        }
        else if (!this.minTimerReadOnly.equals(other.minTimerReadOnly))
            return false;
        if (this.avgTimerReadOnly == null) {
            if (other.avgTimerReadOnly != null)
                return false;
        }
        else if (!this.avgTimerReadOnly.equals(other.avgTimerReadOnly))
            return false;
        if (this.maxTimerReadOnly == null) {
            if (other.maxTimerReadOnly != null)
                return false;
        }
        else if (!this.maxTimerReadOnly.equals(other.maxTimerReadOnly))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.threadId == null) ? 0 : this.threadId.hashCode());
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.countStar == null) ? 0 : this.countStar.hashCode());
        result = prime * result + ((this.sumTimerWait == null) ? 0 : this.sumTimerWait.hashCode());
        result = prime * result + ((this.minTimerWait == null) ? 0 : this.minTimerWait.hashCode());
        result = prime * result + ((this.avgTimerWait == null) ? 0 : this.avgTimerWait.hashCode());
        result = prime * result + ((this.maxTimerWait == null) ? 0 : this.maxTimerWait.hashCode());
        result = prime * result + ((this.countReadWrite == null) ? 0 : this.countReadWrite.hashCode());
        result = prime * result + ((this.sumTimerReadWrite == null) ? 0 : this.sumTimerReadWrite.hashCode());
        result = prime * result + ((this.minTimerReadWrite == null) ? 0 : this.minTimerReadWrite.hashCode());
        result = prime * result + ((this.avgTimerReadWrite == null) ? 0 : this.avgTimerReadWrite.hashCode());
        result = prime * result + ((this.maxTimerReadWrite == null) ? 0 : this.maxTimerReadWrite.hashCode());
        result = prime * result + ((this.countReadOnly == null) ? 0 : this.countReadOnly.hashCode());
        result = prime * result + ((this.sumTimerReadOnly == null) ? 0 : this.sumTimerReadOnly.hashCode());
        result = prime * result + ((this.minTimerReadOnly == null) ? 0 : this.minTimerReadOnly.hashCode());
        result = prime * result + ((this.avgTimerReadOnly == null) ? 0 : this.avgTimerReadOnly.hashCode());
        result = prime * result + ((this.maxTimerReadOnly == null) ? 0 : this.maxTimerReadOnly.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsTransactionsSummaryByThreadByEventName (");

        sb.append(threadId);
        sb.append(", ").append(eventName);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);
        sb.append(", ").append(countReadWrite);
        sb.append(", ").append(sumTimerReadWrite);
        sb.append(", ").append(minTimerReadWrite);
        sb.append(", ").append(avgTimerReadWrite);
        sb.append(", ").append(maxTimerReadWrite);
        sb.append(", ").append(countReadOnly);
        sb.append(", ").append(sumTimerReadOnly);
        sb.append(", ").append(minTimerReadOnly);
        sb.append(", ").append(avgTimerReadOnly);
        sb.append(", ").append(maxTimerReadOnly);

        sb.append(")");
        return sb.toString();
    }
}
