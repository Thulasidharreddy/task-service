/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import com.neurasim.jooq.mysql.enums.RoleEdgesWithAdminOption;

import java.io.Serializable;


/**
 * Role hierarchy and role grants
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleEdges implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String fromHost;
    private final String fromUser;
    private final String toHost;
    private final String toUser;
    private final RoleEdgesWithAdminOption withAdminOption;

    public RoleEdges(RoleEdges value) {
        this.fromHost = value.fromHost;
        this.fromUser = value.fromUser;
        this.toHost = value.toHost;
        this.toUser = value.toUser;
        this.withAdminOption = value.withAdminOption;
    }

    public RoleEdges(
        String fromHost,
        String fromUser,
        String toHost,
        String toUser,
        RoleEdgesWithAdminOption withAdminOption
    ) {
        this.fromHost = fromHost;
        this.fromUser = fromUser;
        this.toHost = toHost;
        this.toUser = toUser;
        this.withAdminOption = withAdminOption;
    }

    /**
     * Getter for <code>mysql.role_edges.FROM_HOST</code>.
     */
    public String getFromHost() {
        return this.fromHost;
    }

    /**
     * Getter for <code>mysql.role_edges.FROM_USER</code>.
     */
    public String getFromUser() {
        return this.fromUser;
    }

    /**
     * Getter for <code>mysql.role_edges.TO_HOST</code>.
     */
    public String getToHost() {
        return this.toHost;
    }

    /**
     * Getter for <code>mysql.role_edges.TO_USER</code>.
     */
    public String getToUser() {
        return this.toUser;
    }

    /**
     * Getter for <code>mysql.role_edges.WITH_ADMIN_OPTION</code>.
     */
    public RoleEdgesWithAdminOption getWithAdminOption() {
        return this.withAdminOption;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RoleEdges other = (RoleEdges) obj;
        if (this.fromHost == null) {
            if (other.fromHost != null)
                return false;
        }
        else if (!this.fromHost.equals(other.fromHost))
            return false;
        if (this.fromUser == null) {
            if (other.fromUser != null)
                return false;
        }
        else if (!this.fromUser.equals(other.fromUser))
            return false;
        if (this.toHost == null) {
            if (other.toHost != null)
                return false;
        }
        else if (!this.toHost.equals(other.toHost))
            return false;
        if (this.toUser == null) {
            if (other.toUser != null)
                return false;
        }
        else if (!this.toUser.equals(other.toUser))
            return false;
        if (this.withAdminOption == null) {
            if (other.withAdminOption != null)
                return false;
        }
        else if (!this.withAdminOption.equals(other.withAdminOption))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.fromHost == null) ? 0 : this.fromHost.hashCode());
        result = prime * result + ((this.fromUser == null) ? 0 : this.fromUser.hashCode());
        result = prime * result + ((this.toHost == null) ? 0 : this.toHost.hashCode());
        result = prime * result + ((this.toUser == null) ? 0 : this.toUser.hashCode());
        result = prime * result + ((this.withAdminOption == null) ? 0 : this.withAdminOption.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleEdges (");

        sb.append(fromHost);
        sb.append(", ").append(fromUser);
        sb.append(", ").append(toHost);
        sb.append(", ").append(toUser);
        sb.append(", ").append(withAdminOption);

        sb.append(")");
        return sb.toString();
    }
}
