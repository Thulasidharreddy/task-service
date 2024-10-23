/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import com.neurasim.jooq.mysql.enums.SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType;
import com.neurasim.jooq.mysql.enums.SlaveRelayLogInfoRequireTablePrimaryKeyCheck;

import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Relay Log Information
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveRelayLogInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger numberOfLines;
    private final String relayLogName;
    private final ULong relayLogPos;
    private final String masterLogName;
    private final ULong masterLogPos;
    private final Integer sqlDelay;
    private final UInteger numberOfWorkers;
    private final UInteger id;
    private final String channelName;
    private final String privilegeChecksUsername;
    private final String privilegeChecksHostname;
    private final Byte requireRowFormat;
    private final SlaveRelayLogInfoRequireTablePrimaryKeyCheck requireTablePrimaryKeyCheck;
    private final SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType assignGtidsToAnonymousTransactionsType;
    private final String assignGtidsToAnonymousTransactionsValue;

    public SlaveRelayLogInfo(SlaveRelayLogInfo value) {
        this.numberOfLines = value.numberOfLines;
        this.relayLogName = value.relayLogName;
        this.relayLogPos = value.relayLogPos;
        this.masterLogName = value.masterLogName;
        this.masterLogPos = value.masterLogPos;
        this.sqlDelay = value.sqlDelay;
        this.numberOfWorkers = value.numberOfWorkers;
        this.id = value.id;
        this.channelName = value.channelName;
        this.privilegeChecksUsername = value.privilegeChecksUsername;
        this.privilegeChecksHostname = value.privilegeChecksHostname;
        this.requireRowFormat = value.requireRowFormat;
        this.requireTablePrimaryKeyCheck = value.requireTablePrimaryKeyCheck;
        this.assignGtidsToAnonymousTransactionsType = value.assignGtidsToAnonymousTransactionsType;
        this.assignGtidsToAnonymousTransactionsValue = value.assignGtidsToAnonymousTransactionsValue;
    }

    public SlaveRelayLogInfo(
        UInteger numberOfLines,
        String relayLogName,
        ULong relayLogPos,
        String masterLogName,
        ULong masterLogPos,
        Integer sqlDelay,
        UInteger numberOfWorkers,
        UInteger id,
        String channelName,
        String privilegeChecksUsername,
        String privilegeChecksHostname,
        Byte requireRowFormat,
        SlaveRelayLogInfoRequireTablePrimaryKeyCheck requireTablePrimaryKeyCheck,
        SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType assignGtidsToAnonymousTransactionsType,
        String assignGtidsToAnonymousTransactionsValue
    ) {
        this.numberOfLines = numberOfLines;
        this.relayLogName = relayLogName;
        this.relayLogPos = relayLogPos;
        this.masterLogName = masterLogName;
        this.masterLogPos = masterLogPos;
        this.sqlDelay = sqlDelay;
        this.numberOfWorkers = numberOfWorkers;
        this.id = id;
        this.channelName = channelName;
        this.privilegeChecksUsername = privilegeChecksUsername;
        this.privilegeChecksHostname = privilegeChecksHostname;
        this.requireRowFormat = requireRowFormat;
        this.requireTablePrimaryKeyCheck = requireTablePrimaryKeyCheck;
        this.assignGtidsToAnonymousTransactionsType = assignGtidsToAnonymousTransactionsType;
        this.assignGtidsToAnonymousTransactionsValue = assignGtidsToAnonymousTransactionsValue;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Number_of_lines</code>.
     * Number of lines in the file or rows in the table. Used to version table
     * definitions.
     */
    public UInteger getNumberOfLines() {
        return this.numberOfLines;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Relay_log_name</code>. The
     * name of the current relay log file.
     */
    public String getRelayLogName() {
        return this.relayLogName;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Relay_log_pos</code>. The
     * relay log position of the last executed event.
     */
    public ULong getRelayLogPos() {
        return this.relayLogPos;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Master_log_name</code>. The
     * name of the master binary log file from which the events in the relay log
     * file were read.
     */
    public String getMasterLogName() {
        return this.masterLogName;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Master_log_pos</code>. The
     * master log position of the last executed event.
     */
    public ULong getMasterLogPos() {
        return this.masterLogPos;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Sql_delay</code>. The number
     * of seconds that the slave must lag behind the master.
     */
    public Integer getSqlDelay() {
        return this.sqlDelay;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Number_of_workers</code>.
     */
    public UInteger getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Id</code>. Internal Id that
     * uniquely identifies this record.
     */
    public UInteger getId() {
        return this.id;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Channel_name</code>. The
     * channel on which the replica is connected to a source. Used in
     * Multisource Replication
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Getter for
     * <code>mysql.slave_relay_log_info.Privilege_checks_username</code>.
     * Username part of PRIVILEGE_CHECKS_USER.
     */
    public String getPrivilegeChecksUsername() {
        return this.privilegeChecksUsername;
    }

    /**
     * Getter for
     * <code>mysql.slave_relay_log_info.Privilege_checks_hostname</code>.
     * Hostname part of PRIVILEGE_CHECKS_USER.
     */
    public String getPrivilegeChecksHostname() {
        return this.privilegeChecksHostname;
    }

    /**
     * Getter for <code>mysql.slave_relay_log_info.Require_row_format</code>.
     * Indicates whether the channel shall only accept row based events.
     */
    public Byte getRequireRowFormat() {
        return this.requireRowFormat;
    }

    /**
     * Getter for
     * <code>mysql.slave_relay_log_info.Require_table_primary_key_check</code>.
     * Indicates what is the channel policy regarding tables without primary
     * keys on create and alter table queries
     */
    public SlaveRelayLogInfoRequireTablePrimaryKeyCheck getRequireTablePrimaryKeyCheck() {
        return this.requireTablePrimaryKeyCheck;
    }

    /**
     * Getter for
     * <code>mysql.slave_relay_log_info.Assign_gtids_to_anonymous_transactions_type</code>.
     * Indicates whether the channel will generate a new GTID for anonymous
     * transactions. OFF means that anonymous transactions will remain
     * anonymous. LOCAL means that anonymous transactions will be assigned a
     * newly generated GTID based on server_uuid. UUID indicates that anonymous
     * transactions will be assigned a newly generated GTID based on
     * Assign_gtids_to_anonymous_transactions_value
     */
    public SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType getAssignGtidsToAnonymousTransactionsType() {
        return this.assignGtidsToAnonymousTransactionsType;
    }

    /**
     * Getter for
     * <code>mysql.slave_relay_log_info.Assign_gtids_to_anonymous_transactions_value</code>.
     * Indicates the UUID used while generating GTIDs for anonymous transactions
     */
    public String getAssignGtidsToAnonymousTransactionsValue() {
        return this.assignGtidsToAnonymousTransactionsValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SlaveRelayLogInfo other = (SlaveRelayLogInfo) obj;
        if (this.numberOfLines == null) {
            if (other.numberOfLines != null)
                return false;
        }
        else if (!this.numberOfLines.equals(other.numberOfLines))
            return false;
        if (this.relayLogName == null) {
            if (other.relayLogName != null)
                return false;
        }
        else if (!this.relayLogName.equals(other.relayLogName))
            return false;
        if (this.relayLogPos == null) {
            if (other.relayLogPos != null)
                return false;
        }
        else if (!this.relayLogPos.equals(other.relayLogPos))
            return false;
        if (this.masterLogName == null) {
            if (other.masterLogName != null)
                return false;
        }
        else if (!this.masterLogName.equals(other.masterLogName))
            return false;
        if (this.masterLogPos == null) {
            if (other.masterLogPos != null)
                return false;
        }
        else if (!this.masterLogPos.equals(other.masterLogPos))
            return false;
        if (this.sqlDelay == null) {
            if (other.sqlDelay != null)
                return false;
        }
        else if (!this.sqlDelay.equals(other.sqlDelay))
            return false;
        if (this.numberOfWorkers == null) {
            if (other.numberOfWorkers != null)
                return false;
        }
        else if (!this.numberOfWorkers.equals(other.numberOfWorkers))
            return false;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.channelName == null) {
            if (other.channelName != null)
                return false;
        }
        else if (!this.channelName.equals(other.channelName))
            return false;
        if (this.privilegeChecksUsername == null) {
            if (other.privilegeChecksUsername != null)
                return false;
        }
        else if (!this.privilegeChecksUsername.equals(other.privilegeChecksUsername))
            return false;
        if (this.privilegeChecksHostname == null) {
            if (other.privilegeChecksHostname != null)
                return false;
        }
        else if (!this.privilegeChecksHostname.equals(other.privilegeChecksHostname))
            return false;
        if (this.requireRowFormat == null) {
            if (other.requireRowFormat != null)
                return false;
        }
        else if (!this.requireRowFormat.equals(other.requireRowFormat))
            return false;
        if (this.requireTablePrimaryKeyCheck == null) {
            if (other.requireTablePrimaryKeyCheck != null)
                return false;
        }
        else if (!this.requireTablePrimaryKeyCheck.equals(other.requireTablePrimaryKeyCheck))
            return false;
        if (this.assignGtidsToAnonymousTransactionsType == null) {
            if (other.assignGtidsToAnonymousTransactionsType != null)
                return false;
        }
        else if (!this.assignGtidsToAnonymousTransactionsType.equals(other.assignGtidsToAnonymousTransactionsType))
            return false;
        if (this.assignGtidsToAnonymousTransactionsValue == null) {
            if (other.assignGtidsToAnonymousTransactionsValue != null)
                return false;
        }
        else if (!this.assignGtidsToAnonymousTransactionsValue.equals(other.assignGtidsToAnonymousTransactionsValue))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.numberOfLines == null) ? 0 : this.numberOfLines.hashCode());
        result = prime * result + ((this.relayLogName == null) ? 0 : this.relayLogName.hashCode());
        result = prime * result + ((this.relayLogPos == null) ? 0 : this.relayLogPos.hashCode());
        result = prime * result + ((this.masterLogName == null) ? 0 : this.masterLogName.hashCode());
        result = prime * result + ((this.masterLogPos == null) ? 0 : this.masterLogPos.hashCode());
        result = prime * result + ((this.sqlDelay == null) ? 0 : this.sqlDelay.hashCode());
        result = prime * result + ((this.numberOfWorkers == null) ? 0 : this.numberOfWorkers.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.channelName == null) ? 0 : this.channelName.hashCode());
        result = prime * result + ((this.privilegeChecksUsername == null) ? 0 : this.privilegeChecksUsername.hashCode());
        result = prime * result + ((this.privilegeChecksHostname == null) ? 0 : this.privilegeChecksHostname.hashCode());
        result = prime * result + ((this.requireRowFormat == null) ? 0 : this.requireRowFormat.hashCode());
        result = prime * result + ((this.requireTablePrimaryKeyCheck == null) ? 0 : this.requireTablePrimaryKeyCheck.hashCode());
        result = prime * result + ((this.assignGtidsToAnonymousTransactionsType == null) ? 0 : this.assignGtidsToAnonymousTransactionsType.hashCode());
        result = prime * result + ((this.assignGtidsToAnonymousTransactionsValue == null) ? 0 : this.assignGtidsToAnonymousTransactionsValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SlaveRelayLogInfo (");

        sb.append(numberOfLines);
        sb.append(", ").append(relayLogName);
        sb.append(", ").append(relayLogPos);
        sb.append(", ").append(masterLogName);
        sb.append(", ").append(masterLogPos);
        sb.append(", ").append(sqlDelay);
        sb.append(", ").append(numberOfWorkers);
        sb.append(", ").append(id);
        sb.append(", ").append(channelName);
        sb.append(", ").append(privilegeChecksUsername);
        sb.append(", ").append(privilegeChecksHostname);
        sb.append(", ").append(requireRowFormat);
        sb.append(", ").append(requireTablePrimaryKeyCheck);
        sb.append(", ").append(assignGtidsToAnonymousTransactionsType);
        sb.append(", ").append(assignGtidsToAnonymousTransactionsValue);

        sb.append(")");
        return sb.toString();
    }
}