/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * General log
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeneralLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private final LocalDateTime eventTime;
    private final String userHost;
    private final ULong threadId;
    private final UInteger serverId;
    private final String commandType;
    private final byte[] argument;

    public GeneralLog(GeneralLog value) {
        this.eventTime = value.eventTime;
        this.userHost = value.userHost;
        this.threadId = value.threadId;
        this.serverId = value.serverId;
        this.commandType = value.commandType;
        this.argument = value.argument;
    }

    public GeneralLog(
        LocalDateTime eventTime,
        String userHost,
        ULong threadId,
        UInteger serverId,
        String commandType,
        byte[] argument
    ) {
        this.eventTime = eventTime;
        this.userHost = userHost;
        this.threadId = threadId;
        this.serverId = serverId;
        this.commandType = commandType;
        this.argument = argument;
    }

    /**
     * Getter for <code>mysql.general_log.event_time</code>.
     */
    public LocalDateTime getEventTime() {
        return this.eventTime;
    }

    /**
     * Getter for <code>mysql.general_log.user_host</code>.
     */
    public String getUserHost() {
        return this.userHost;
    }

    /**
     * Getter for <code>mysql.general_log.thread_id</code>.
     */
    public ULong getThreadId() {
        return this.threadId;
    }

    /**
     * Getter for <code>mysql.general_log.server_id</code>.
     */
    public UInteger getServerId() {
        return this.serverId;
    }

    /**
     * Getter for <code>mysql.general_log.command_type</code>.
     */
    public String getCommandType() {
        return this.commandType;
    }

    /**
     * Getter for <code>mysql.general_log.argument</code>.
     */
    public byte[] getArgument() {
        return this.argument;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GeneralLog other = (GeneralLog) obj;
        if (this.eventTime == null) {
            if (other.eventTime != null)
                return false;
        }
        else if (!this.eventTime.equals(other.eventTime))
            return false;
        if (this.userHost == null) {
            if (other.userHost != null)
                return false;
        }
        else if (!this.userHost.equals(other.userHost))
            return false;
        if (this.threadId == null) {
            if (other.threadId != null)
                return false;
        }
        else if (!this.threadId.equals(other.threadId))
            return false;
        if (this.serverId == null) {
            if (other.serverId != null)
                return false;
        }
        else if (!this.serverId.equals(other.serverId))
            return false;
        if (this.commandType == null) {
            if (other.commandType != null)
                return false;
        }
        else if (!this.commandType.equals(other.commandType))
            return false;
        if (this.argument == null) {
            if (other.argument != null)
                return false;
        }
        else if (!Arrays.equals(this.argument, other.argument))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.eventTime == null) ? 0 : this.eventTime.hashCode());
        result = prime * result + ((this.userHost == null) ? 0 : this.userHost.hashCode());
        result = prime * result + ((this.threadId == null) ? 0 : this.threadId.hashCode());
        result = prime * result + ((this.serverId == null) ? 0 : this.serverId.hashCode());
        result = prime * result + ((this.commandType == null) ? 0 : this.commandType.hashCode());
        result = prime * result + ((this.argument == null) ? 0 : Arrays.hashCode(this.argument));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GeneralLog (");

        sb.append(eventTime);
        sb.append(", ").append(userHost);
        sb.append(", ").append(threadId);
        sb.append(", ").append(serverId);
        sb.append(", ").append(commandType);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
