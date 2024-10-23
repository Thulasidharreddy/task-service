/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RwlockInstances implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final ULong objectInstanceBegin;
    private final ULong writeLockedByThreadId;
    private final UInteger readLockedByCount;

    public RwlockInstances(RwlockInstances value) {
        this.name = value.name;
        this.objectInstanceBegin = value.objectInstanceBegin;
        this.writeLockedByThreadId = value.writeLockedByThreadId;
        this.readLockedByCount = value.readLockedByCount;
    }

    public RwlockInstances(
        String name,
        ULong objectInstanceBegin,
        ULong writeLockedByThreadId,
        UInteger readLockedByCount
    ) {
        this.name = name;
        this.objectInstanceBegin = objectInstanceBegin;
        this.writeLockedByThreadId = writeLockedByThreadId;
        this.readLockedByCount = readLockedByCount;
    }

    /**
     * Getter for <code>performance_schema.rwlock_instances.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for
     * <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return this.objectInstanceBegin;
    }

    /**
     * Getter for
     * <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
     */
    public ULong getWriteLockedByThreadId() {
        return this.writeLockedByThreadId;
    }

    /**
     * Getter for
     * <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
     */
    public UInteger getReadLockedByCount() {
        return this.readLockedByCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RwlockInstances other = (RwlockInstances) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.objectInstanceBegin == null) {
            if (other.objectInstanceBegin != null)
                return false;
        }
        else if (!this.objectInstanceBegin.equals(other.objectInstanceBegin))
            return false;
        if (this.writeLockedByThreadId == null) {
            if (other.writeLockedByThreadId != null)
                return false;
        }
        else if (!this.writeLockedByThreadId.equals(other.writeLockedByThreadId))
            return false;
        if (this.readLockedByCount == null) {
            if (other.readLockedByCount != null)
                return false;
        }
        else if (!this.readLockedByCount.equals(other.readLockedByCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.objectInstanceBegin == null) ? 0 : this.objectInstanceBegin.hashCode());
        result = prime * result + ((this.writeLockedByThreadId == null) ? 0 : this.writeLockedByThreadId.hashCode());
        result = prime * result + ((this.readLockedByCount == null) ? 0 : this.readLockedByCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RwlockInstances (");

        sb.append(name);
        sb.append(", ").append(objectInstanceBegin);
        sb.append(", ").append(writeLockedByThreadId);
        sb.append(", ").append(readLockedByCount);

        sb.append(")");
        return sb.toString();
    }
}