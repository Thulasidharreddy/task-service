/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.ReplicationApplierFiltersConfiguredBy;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierFilters implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String channelName;
    private final String filterName;
    private final String filterRule;
    private final ReplicationApplierFiltersConfiguredBy configuredBy;
    private final LocalDateTime activeSince;
    private final ULong counter;

    public ReplicationApplierFilters(ReplicationApplierFilters value) {
        this.channelName = value.channelName;
        this.filterName = value.filterName;
        this.filterRule = value.filterRule;
        this.configuredBy = value.configuredBy;
        this.activeSince = value.activeSince;
        this.counter = value.counter;
    }

    public ReplicationApplierFilters(
        String channelName,
        String filterName,
        String filterRule,
        ReplicationApplierFiltersConfiguredBy configuredBy,
        LocalDateTime activeSince,
        ULong counter
    ) {
        this.channelName = channelName;
        this.filterName = filterName;
        this.filterRule = filterRule;
        this.configuredBy = configuredBy;
        this.activeSince = activeSince;
        this.counter = counter;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_filters.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_filters.FILTER_NAME</code>.
     */
    public String getFilterName() {
        return this.filterName;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_filters.FILTER_RULE</code>.
     */
    public String getFilterRule() {
        return this.filterRule;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_filters.CONFIGURED_BY</code>.
     */
    public ReplicationApplierFiltersConfiguredBy getConfiguredBy() {
        return this.configuredBy;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_filters.ACTIVE_SINCE</code>.
     */
    public LocalDateTime getActiveSince() {
        return this.activeSince;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_filters.COUNTER</code>.
     */
    public ULong getCounter() {
        return this.counter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ReplicationApplierFilters other = (ReplicationApplierFilters) obj;
        if (this.channelName == null) {
            if (other.channelName != null)
                return false;
        }
        else if (!this.channelName.equals(other.channelName))
            return false;
        if (this.filterName == null) {
            if (other.filterName != null)
                return false;
        }
        else if (!this.filterName.equals(other.filterName))
            return false;
        if (this.filterRule == null) {
            if (other.filterRule != null)
                return false;
        }
        else if (!this.filterRule.equals(other.filterRule))
            return false;
        if (this.configuredBy == null) {
            if (other.configuredBy != null)
                return false;
        }
        else if (!this.configuredBy.equals(other.configuredBy))
            return false;
        if (this.activeSince == null) {
            if (other.activeSince != null)
                return false;
        }
        else if (!this.activeSince.equals(other.activeSince))
            return false;
        if (this.counter == null) {
            if (other.counter != null)
                return false;
        }
        else if (!this.counter.equals(other.counter))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.channelName == null) ? 0 : this.channelName.hashCode());
        result = prime * result + ((this.filterName == null) ? 0 : this.filterName.hashCode());
        result = prime * result + ((this.filterRule == null) ? 0 : this.filterRule.hashCode());
        result = prime * result + ((this.configuredBy == null) ? 0 : this.configuredBy.hashCode());
        result = prime * result + ((this.activeSince == null) ? 0 : this.activeSince.hashCode());
        result = prime * result + ((this.counter == null) ? 0 : this.counter.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReplicationApplierFilters (");

        sb.append(channelName);
        sb.append(", ").append(filterName);
        sb.append(", ").append(filterRule);
        sb.append(", ").append(configuredBy);
        sb.append(", ").append(activeSince);
        sb.append(", ").append(counter);

        sb.append(")");
        return sb.toString();
    }
}