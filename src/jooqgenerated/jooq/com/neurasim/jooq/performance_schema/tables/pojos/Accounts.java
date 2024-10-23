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
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String user;
    private final String host;
    private final Long currentConnections;
    private final Long totalConnections;
    private final ULong maxSessionControlledMemory;
    private final ULong maxSessionTotalMemory;

    public Accounts(Accounts value) {
        this.user = value.user;
        this.host = value.host;
        this.currentConnections = value.currentConnections;
        this.totalConnections = value.totalConnections;
        this.maxSessionControlledMemory = value.maxSessionControlledMemory;
        this.maxSessionTotalMemory = value.maxSessionTotalMemory;
    }

    public Accounts(
        String user,
        String host,
        Long currentConnections,
        Long totalConnections,
        ULong maxSessionControlledMemory,
        ULong maxSessionTotalMemory
    ) {
        this.user = user;
        this.host = host;
        this.currentConnections = currentConnections;
        this.totalConnections = totalConnections;
        this.maxSessionControlledMemory = maxSessionControlledMemory;
        this.maxSessionTotalMemory = maxSessionTotalMemory;
    }

    /**
     * Getter for <code>performance_schema.accounts.USER</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for <code>performance_schema.accounts.HOST</code>.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for <code>performance_schema.accounts.CURRENT_CONNECTIONS</code>.
     */
    public Long getCurrentConnections() {
        return this.currentConnections;
    }

    /**
     * Getter for <code>performance_schema.accounts.TOTAL_CONNECTIONS</code>.
     */
    public Long getTotalConnections() {
        return this.totalConnections;
    }

    /**
     * Getter for
     * <code>performance_schema.accounts.MAX_SESSION_CONTROLLED_MEMORY</code>.
     */
    public ULong getMaxSessionControlledMemory() {
        return this.maxSessionControlledMemory;
    }

    /**
     * Getter for
     * <code>performance_schema.accounts.MAX_SESSION_TOTAL_MEMORY</code>.
     */
    public ULong getMaxSessionTotalMemory() {
        return this.maxSessionTotalMemory;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Accounts other = (Accounts) obj;
        if (this.user == null) {
            if (other.user != null)
                return false;
        }
        else if (!this.user.equals(other.user))
            return false;
        if (this.host == null) {
            if (other.host != null)
                return false;
        }
        else if (!this.host.equals(other.host))
            return false;
        if (this.currentConnections == null) {
            if (other.currentConnections != null)
                return false;
        }
        else if (!this.currentConnections.equals(other.currentConnections))
            return false;
        if (this.totalConnections == null) {
            if (other.totalConnections != null)
                return false;
        }
        else if (!this.totalConnections.equals(other.totalConnections))
            return false;
        if (this.maxSessionControlledMemory == null) {
            if (other.maxSessionControlledMemory != null)
                return false;
        }
        else if (!this.maxSessionControlledMemory.equals(other.maxSessionControlledMemory))
            return false;
        if (this.maxSessionTotalMemory == null) {
            if (other.maxSessionTotalMemory != null)
                return false;
        }
        else if (!this.maxSessionTotalMemory.equals(other.maxSessionTotalMemory))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.user == null) ? 0 : this.user.hashCode());
        result = prime * result + ((this.host == null) ? 0 : this.host.hashCode());
        result = prime * result + ((this.currentConnections == null) ? 0 : this.currentConnections.hashCode());
        result = prime * result + ((this.totalConnections == null) ? 0 : this.totalConnections.hashCode());
        result = prime * result + ((this.maxSessionControlledMemory == null) ? 0 : this.maxSessionControlledMemory.hashCode());
        result = prime * result + ((this.maxSessionTotalMemory == null) ? 0 : this.maxSessionTotalMemory.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Accounts (");

        sb.append(user);
        sb.append(", ").append(host);
        sb.append(", ").append(currentConnections);
        sb.append(", ").append(totalConnections);
        sb.append(", ").append(maxSessionControlledMemory);
        sb.append(", ").append(maxSessionTotalMemory);

        sb.append(")");
        return sb.toString();
    }
}