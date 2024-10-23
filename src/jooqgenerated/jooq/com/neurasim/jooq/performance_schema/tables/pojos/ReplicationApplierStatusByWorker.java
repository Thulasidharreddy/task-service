/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.ReplicationApplierStatusByWorkerServiceState;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatusByWorker implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String channelName;
    private final ULong workerId;
    private final ULong threadId;
    private final ReplicationApplierStatusByWorkerServiceState serviceState;
    private final Integer lastErrorNumber;
    private final String lastErrorMessage;
    private final LocalDateTime lastErrorTimestamp;
    private final String lastAppliedTransaction;
    private final LocalDateTime lastAppliedTransactionOriginalCommitTimestamp;
    private final LocalDateTime lastAppliedTransactionImmediateCommitTimestamp;
    private final LocalDateTime lastAppliedTransactionStartApplyTimestamp;
    private final LocalDateTime lastAppliedTransactionEndApplyTimestamp;
    private final String applyingTransaction;
    private final LocalDateTime applyingTransactionOriginalCommitTimestamp;
    private final LocalDateTime applyingTransactionImmediateCommitTimestamp;
    private final LocalDateTime applyingTransactionStartApplyTimestamp;
    private final ULong lastAppliedTransactionRetriesCount;
    private final Integer lastAppliedTransactionLastTransientErrorNumber;
    private final String lastAppliedTransactionLastTransientErrorMessage;
    private final LocalDateTime lastAppliedTransactionLastTransientErrorTimestamp;
    private final ULong applyingTransactionRetriesCount;
    private final Integer applyingTransactionLastTransientErrorNumber;
    private final String applyingTransactionLastTransientErrorMessage;
    private final LocalDateTime applyingTransactionLastTransientErrorTimestamp;

    public ReplicationApplierStatusByWorker(ReplicationApplierStatusByWorker value) {
        this.channelName = value.channelName;
        this.workerId = value.workerId;
        this.threadId = value.threadId;
        this.serviceState = value.serviceState;
        this.lastErrorNumber = value.lastErrorNumber;
        this.lastErrorMessage = value.lastErrorMessage;
        this.lastErrorTimestamp = value.lastErrorTimestamp;
        this.lastAppliedTransaction = value.lastAppliedTransaction;
        this.lastAppliedTransactionOriginalCommitTimestamp = value.lastAppliedTransactionOriginalCommitTimestamp;
        this.lastAppliedTransactionImmediateCommitTimestamp = value.lastAppliedTransactionImmediateCommitTimestamp;
        this.lastAppliedTransactionStartApplyTimestamp = value.lastAppliedTransactionStartApplyTimestamp;
        this.lastAppliedTransactionEndApplyTimestamp = value.lastAppliedTransactionEndApplyTimestamp;
        this.applyingTransaction = value.applyingTransaction;
        this.applyingTransactionOriginalCommitTimestamp = value.applyingTransactionOriginalCommitTimestamp;
        this.applyingTransactionImmediateCommitTimestamp = value.applyingTransactionImmediateCommitTimestamp;
        this.applyingTransactionStartApplyTimestamp = value.applyingTransactionStartApplyTimestamp;
        this.lastAppliedTransactionRetriesCount = value.lastAppliedTransactionRetriesCount;
        this.lastAppliedTransactionLastTransientErrorNumber = value.lastAppliedTransactionLastTransientErrorNumber;
        this.lastAppliedTransactionLastTransientErrorMessage = value.lastAppliedTransactionLastTransientErrorMessage;
        this.lastAppliedTransactionLastTransientErrorTimestamp = value.lastAppliedTransactionLastTransientErrorTimestamp;
        this.applyingTransactionRetriesCount = value.applyingTransactionRetriesCount;
        this.applyingTransactionLastTransientErrorNumber = value.applyingTransactionLastTransientErrorNumber;
        this.applyingTransactionLastTransientErrorMessage = value.applyingTransactionLastTransientErrorMessage;
        this.applyingTransactionLastTransientErrorTimestamp = value.applyingTransactionLastTransientErrorTimestamp;
    }

    public ReplicationApplierStatusByWorker(
        String channelName,
        ULong workerId,
        ULong threadId,
        ReplicationApplierStatusByWorkerServiceState serviceState,
        Integer lastErrorNumber,
        String lastErrorMessage,
        LocalDateTime lastErrorTimestamp,
        String lastAppliedTransaction,
        LocalDateTime lastAppliedTransactionOriginalCommitTimestamp,
        LocalDateTime lastAppliedTransactionImmediateCommitTimestamp,
        LocalDateTime lastAppliedTransactionStartApplyTimestamp,
        LocalDateTime lastAppliedTransactionEndApplyTimestamp,
        String applyingTransaction,
        LocalDateTime applyingTransactionOriginalCommitTimestamp,
        LocalDateTime applyingTransactionImmediateCommitTimestamp,
        LocalDateTime applyingTransactionStartApplyTimestamp,
        ULong lastAppliedTransactionRetriesCount,
        Integer lastAppliedTransactionLastTransientErrorNumber,
        String lastAppliedTransactionLastTransientErrorMessage,
        LocalDateTime lastAppliedTransactionLastTransientErrorTimestamp,
        ULong applyingTransactionRetriesCount,
        Integer applyingTransactionLastTransientErrorNumber,
        String applyingTransactionLastTransientErrorMessage,
        LocalDateTime applyingTransactionLastTransientErrorTimestamp
    ) {
        this.channelName = channelName;
        this.workerId = workerId;
        this.threadId = threadId;
        this.serviceState = serviceState;
        this.lastErrorNumber = lastErrorNumber;
        this.lastErrorMessage = lastErrorMessage;
        this.lastErrorTimestamp = lastErrorTimestamp;
        this.lastAppliedTransaction = lastAppliedTransaction;
        this.lastAppliedTransactionOriginalCommitTimestamp = lastAppliedTransactionOriginalCommitTimestamp;
        this.lastAppliedTransactionImmediateCommitTimestamp = lastAppliedTransactionImmediateCommitTimestamp;
        this.lastAppliedTransactionStartApplyTimestamp = lastAppliedTransactionStartApplyTimestamp;
        this.lastAppliedTransactionEndApplyTimestamp = lastAppliedTransactionEndApplyTimestamp;
        this.applyingTransaction = applyingTransaction;
        this.applyingTransactionOriginalCommitTimestamp = applyingTransactionOriginalCommitTimestamp;
        this.applyingTransactionImmediateCommitTimestamp = applyingTransactionImmediateCommitTimestamp;
        this.applyingTransactionStartApplyTimestamp = applyingTransactionStartApplyTimestamp;
        this.lastAppliedTransactionRetriesCount = lastAppliedTransactionRetriesCount;
        this.lastAppliedTransactionLastTransientErrorNumber = lastAppliedTransactionLastTransientErrorNumber;
        this.lastAppliedTransactionLastTransientErrorMessage = lastAppliedTransactionLastTransientErrorMessage;
        this.lastAppliedTransactionLastTransientErrorTimestamp = lastAppliedTransactionLastTransientErrorTimestamp;
        this.applyingTransactionRetriesCount = applyingTransactionRetriesCount;
        this.applyingTransactionLastTransientErrorNumber = applyingTransactionLastTransientErrorNumber;
        this.applyingTransactionLastTransientErrorMessage = applyingTransactionLastTransientErrorMessage;
        this.applyingTransactionLastTransientErrorTimestamp = applyingTransactionLastTransientErrorTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.WORKER_ID</code>.
     */
    public ULong getWorkerId() {
        return this.workerId;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return this.threadId;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.SERVICE_STATE</code>.
     */
    public ReplicationApplierStatusByWorkerServiceState getServiceState() {
        return this.serviceState;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_NUMBER</code>.
     */
    public Integer getLastErrorNumber() {
        return this.lastErrorNumber;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_MESSAGE</code>.
     */
    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP</code>.
     */
    public LocalDateTime getLastErrorTimestamp() {
        return this.lastErrorTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION</code>.
     */
    public String getLastAppliedTransaction() {
        return this.lastAppliedTransaction;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getLastAppliedTransactionOriginalCommitTimestamp() {
        return this.lastAppliedTransactionOriginalCommitTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getLastAppliedTransactionImmediateCommitTimestamp() {
        return this.lastAppliedTransactionImmediateCommitTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP</code>.
     */
    public LocalDateTime getLastAppliedTransactionStartApplyTimestamp() {
        return this.lastAppliedTransactionStartApplyTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP</code>.
     */
    public LocalDateTime getLastAppliedTransactionEndApplyTimestamp() {
        return this.lastAppliedTransactionEndApplyTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION</code>.
     */
    public String getApplyingTransaction() {
        return this.applyingTransaction;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getApplyingTransactionOriginalCommitTimestamp() {
        return this.applyingTransactionOriginalCommitTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP</code>.
     */
    public LocalDateTime getApplyingTransactionImmediateCommitTimestamp() {
        return this.applyingTransactionImmediateCommitTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_START_APPLY_TIMESTAMP</code>.
     */
    public LocalDateTime getApplyingTransactionStartApplyTimestamp() {
        return this.applyingTransactionStartApplyTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_RETRIES_COUNT</code>.
     */
    public ULong getLastAppliedTransactionRetriesCount() {
        return this.lastAppliedTransactionRetriesCount;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER</code>.
     */
    public Integer getLastAppliedTransactionLastTransientErrorNumber() {
        return this.lastAppliedTransactionLastTransientErrorNumber;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE</code>.
     */
    public String getLastAppliedTransactionLastTransientErrorMessage() {
        return this.lastAppliedTransactionLastTransientErrorMessage;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP</code>.
     */
    public LocalDateTime getLastAppliedTransactionLastTransientErrorTimestamp() {
        return this.lastAppliedTransactionLastTransientErrorTimestamp;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_RETRIES_COUNT</code>.
     */
    public ULong getApplyingTransactionRetriesCount() {
        return this.applyingTransactionRetriesCount;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER</code>.
     */
    public Integer getApplyingTransactionLastTransientErrorNumber() {
        return this.applyingTransactionLastTransientErrorNumber;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE</code>.
     */
    public String getApplyingTransactionLastTransientErrorMessage() {
        return this.applyingTransactionLastTransientErrorMessage;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP</code>.
     */
    public LocalDateTime getApplyingTransactionLastTransientErrorTimestamp() {
        return this.applyingTransactionLastTransientErrorTimestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ReplicationApplierStatusByWorker other = (ReplicationApplierStatusByWorker) obj;
        if (this.channelName == null) {
            if (other.channelName != null)
                return false;
        }
        else if (!this.channelName.equals(other.channelName))
            return false;
        if (this.workerId == null) {
            if (other.workerId != null)
                return false;
        }
        else if (!this.workerId.equals(other.workerId))
            return false;
        if (this.threadId == null) {
            if (other.threadId != null)
                return false;
        }
        else if (!this.threadId.equals(other.threadId))
            return false;
        if (this.serviceState == null) {
            if (other.serviceState != null)
                return false;
        }
        else if (!this.serviceState.equals(other.serviceState))
            return false;
        if (this.lastErrorNumber == null) {
            if (other.lastErrorNumber != null)
                return false;
        }
        else if (!this.lastErrorNumber.equals(other.lastErrorNumber))
            return false;
        if (this.lastErrorMessage == null) {
            if (other.lastErrorMessage != null)
                return false;
        }
        else if (!this.lastErrorMessage.equals(other.lastErrorMessage))
            return false;
        if (this.lastErrorTimestamp == null) {
            if (other.lastErrorTimestamp != null)
                return false;
        }
        else if (!this.lastErrorTimestamp.equals(other.lastErrorTimestamp))
            return false;
        if (this.lastAppliedTransaction == null) {
            if (other.lastAppliedTransaction != null)
                return false;
        }
        else if (!this.lastAppliedTransaction.equals(other.lastAppliedTransaction))
            return false;
        if (this.lastAppliedTransactionOriginalCommitTimestamp == null) {
            if (other.lastAppliedTransactionOriginalCommitTimestamp != null)
                return false;
        }
        else if (!this.lastAppliedTransactionOriginalCommitTimestamp.equals(other.lastAppliedTransactionOriginalCommitTimestamp))
            return false;
        if (this.lastAppliedTransactionImmediateCommitTimestamp == null) {
            if (other.lastAppliedTransactionImmediateCommitTimestamp != null)
                return false;
        }
        else if (!this.lastAppliedTransactionImmediateCommitTimestamp.equals(other.lastAppliedTransactionImmediateCommitTimestamp))
            return false;
        if (this.lastAppliedTransactionStartApplyTimestamp == null) {
            if (other.lastAppliedTransactionStartApplyTimestamp != null)
                return false;
        }
        else if (!this.lastAppliedTransactionStartApplyTimestamp.equals(other.lastAppliedTransactionStartApplyTimestamp))
            return false;
        if (this.lastAppliedTransactionEndApplyTimestamp == null) {
            if (other.lastAppliedTransactionEndApplyTimestamp != null)
                return false;
        }
        else if (!this.lastAppliedTransactionEndApplyTimestamp.equals(other.lastAppliedTransactionEndApplyTimestamp))
            return false;
        if (this.applyingTransaction == null) {
            if (other.applyingTransaction != null)
                return false;
        }
        else if (!this.applyingTransaction.equals(other.applyingTransaction))
            return false;
        if (this.applyingTransactionOriginalCommitTimestamp == null) {
            if (other.applyingTransactionOriginalCommitTimestamp != null)
                return false;
        }
        else if (!this.applyingTransactionOriginalCommitTimestamp.equals(other.applyingTransactionOriginalCommitTimestamp))
            return false;
        if (this.applyingTransactionImmediateCommitTimestamp == null) {
            if (other.applyingTransactionImmediateCommitTimestamp != null)
                return false;
        }
        else if (!this.applyingTransactionImmediateCommitTimestamp.equals(other.applyingTransactionImmediateCommitTimestamp))
            return false;
        if (this.applyingTransactionStartApplyTimestamp == null) {
            if (other.applyingTransactionStartApplyTimestamp != null)
                return false;
        }
        else if (!this.applyingTransactionStartApplyTimestamp.equals(other.applyingTransactionStartApplyTimestamp))
            return false;
        if (this.lastAppliedTransactionRetriesCount == null) {
            if (other.lastAppliedTransactionRetriesCount != null)
                return false;
        }
        else if (!this.lastAppliedTransactionRetriesCount.equals(other.lastAppliedTransactionRetriesCount))
            return false;
        if (this.lastAppliedTransactionLastTransientErrorNumber == null) {
            if (other.lastAppliedTransactionLastTransientErrorNumber != null)
                return false;
        }
        else if (!this.lastAppliedTransactionLastTransientErrorNumber.equals(other.lastAppliedTransactionLastTransientErrorNumber))
            return false;
        if (this.lastAppliedTransactionLastTransientErrorMessage == null) {
            if (other.lastAppliedTransactionLastTransientErrorMessage != null)
                return false;
        }
        else if (!this.lastAppliedTransactionLastTransientErrorMessage.equals(other.lastAppliedTransactionLastTransientErrorMessage))
            return false;
        if (this.lastAppliedTransactionLastTransientErrorTimestamp == null) {
            if (other.lastAppliedTransactionLastTransientErrorTimestamp != null)
                return false;
        }
        else if (!this.lastAppliedTransactionLastTransientErrorTimestamp.equals(other.lastAppliedTransactionLastTransientErrorTimestamp))
            return false;
        if (this.applyingTransactionRetriesCount == null) {
            if (other.applyingTransactionRetriesCount != null)
                return false;
        }
        else if (!this.applyingTransactionRetriesCount.equals(other.applyingTransactionRetriesCount))
            return false;
        if (this.applyingTransactionLastTransientErrorNumber == null) {
            if (other.applyingTransactionLastTransientErrorNumber != null)
                return false;
        }
        else if (!this.applyingTransactionLastTransientErrorNumber.equals(other.applyingTransactionLastTransientErrorNumber))
            return false;
        if (this.applyingTransactionLastTransientErrorMessage == null) {
            if (other.applyingTransactionLastTransientErrorMessage != null)
                return false;
        }
        else if (!this.applyingTransactionLastTransientErrorMessage.equals(other.applyingTransactionLastTransientErrorMessage))
            return false;
        if (this.applyingTransactionLastTransientErrorTimestamp == null) {
            if (other.applyingTransactionLastTransientErrorTimestamp != null)
                return false;
        }
        else if (!this.applyingTransactionLastTransientErrorTimestamp.equals(other.applyingTransactionLastTransientErrorTimestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.channelName == null) ? 0 : this.channelName.hashCode());
        result = prime * result + ((this.workerId == null) ? 0 : this.workerId.hashCode());
        result = prime * result + ((this.threadId == null) ? 0 : this.threadId.hashCode());
        result = prime * result + ((this.serviceState == null) ? 0 : this.serviceState.hashCode());
        result = prime * result + ((this.lastErrorNumber == null) ? 0 : this.lastErrorNumber.hashCode());
        result = prime * result + ((this.lastErrorMessage == null) ? 0 : this.lastErrorMessage.hashCode());
        result = prime * result + ((this.lastErrorTimestamp == null) ? 0 : this.lastErrorTimestamp.hashCode());
        result = prime * result + ((this.lastAppliedTransaction == null) ? 0 : this.lastAppliedTransaction.hashCode());
        result = prime * result + ((this.lastAppliedTransactionOriginalCommitTimestamp == null) ? 0 : this.lastAppliedTransactionOriginalCommitTimestamp.hashCode());
        result = prime * result + ((this.lastAppliedTransactionImmediateCommitTimestamp == null) ? 0 : this.lastAppliedTransactionImmediateCommitTimestamp.hashCode());
        result = prime * result + ((this.lastAppliedTransactionStartApplyTimestamp == null) ? 0 : this.lastAppliedTransactionStartApplyTimestamp.hashCode());
        result = prime * result + ((this.lastAppliedTransactionEndApplyTimestamp == null) ? 0 : this.lastAppliedTransactionEndApplyTimestamp.hashCode());
        result = prime * result + ((this.applyingTransaction == null) ? 0 : this.applyingTransaction.hashCode());
        result = prime * result + ((this.applyingTransactionOriginalCommitTimestamp == null) ? 0 : this.applyingTransactionOriginalCommitTimestamp.hashCode());
        result = prime * result + ((this.applyingTransactionImmediateCommitTimestamp == null) ? 0 : this.applyingTransactionImmediateCommitTimestamp.hashCode());
        result = prime * result + ((this.applyingTransactionStartApplyTimestamp == null) ? 0 : this.applyingTransactionStartApplyTimestamp.hashCode());
        result = prime * result + ((this.lastAppliedTransactionRetriesCount == null) ? 0 : this.lastAppliedTransactionRetriesCount.hashCode());
        result = prime * result + ((this.lastAppliedTransactionLastTransientErrorNumber == null) ? 0 : this.lastAppliedTransactionLastTransientErrorNumber.hashCode());
        result = prime * result + ((this.lastAppliedTransactionLastTransientErrorMessage == null) ? 0 : this.lastAppliedTransactionLastTransientErrorMessage.hashCode());
        result = prime * result + ((this.lastAppliedTransactionLastTransientErrorTimestamp == null) ? 0 : this.lastAppliedTransactionLastTransientErrorTimestamp.hashCode());
        result = prime * result + ((this.applyingTransactionRetriesCount == null) ? 0 : this.applyingTransactionRetriesCount.hashCode());
        result = prime * result + ((this.applyingTransactionLastTransientErrorNumber == null) ? 0 : this.applyingTransactionLastTransientErrorNumber.hashCode());
        result = prime * result + ((this.applyingTransactionLastTransientErrorMessage == null) ? 0 : this.applyingTransactionLastTransientErrorMessage.hashCode());
        result = prime * result + ((this.applyingTransactionLastTransientErrorTimestamp == null) ? 0 : this.applyingTransactionLastTransientErrorTimestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReplicationApplierStatusByWorker (");

        sb.append(channelName);
        sb.append(", ").append(workerId);
        sb.append(", ").append(threadId);
        sb.append(", ").append(serviceState);
        sb.append(", ").append(lastErrorNumber);
        sb.append(", ").append(lastErrorMessage);
        sb.append(", ").append(lastErrorTimestamp);
        sb.append(", ").append(lastAppliedTransaction);
        sb.append(", ").append(lastAppliedTransactionOriginalCommitTimestamp);
        sb.append(", ").append(lastAppliedTransactionImmediateCommitTimestamp);
        sb.append(", ").append(lastAppliedTransactionStartApplyTimestamp);
        sb.append(", ").append(lastAppliedTransactionEndApplyTimestamp);
        sb.append(", ").append(applyingTransaction);
        sb.append(", ").append(applyingTransactionOriginalCommitTimestamp);
        sb.append(", ").append(applyingTransactionImmediateCommitTimestamp);
        sb.append(", ").append(applyingTransactionStartApplyTimestamp);
        sb.append(", ").append(lastAppliedTransactionRetriesCount);
        sb.append(", ").append(lastAppliedTransactionLastTransientErrorNumber);
        sb.append(", ").append(lastAppliedTransactionLastTransientErrorMessage);
        sb.append(", ").append(lastAppliedTransactionLastTransientErrorTimestamp);
        sb.append(", ").append(applyingTransactionRetriesCount);
        sb.append(", ").append(applyingTransactionLastTransientErrorNumber);
        sb.append(", ").append(applyingTransactionLastTransientErrorMessage);
        sb.append(", ").append(applyingTransactionLastTransientErrorTimestamp);

        sb.append(")");
        return sb.toString();
    }
}