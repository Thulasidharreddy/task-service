/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.user_task_management.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;
    private final String name;
    private final String email;
    private final LocalDateTime createdat;

    public User(User value) {
        this.id = value.id;
        this.name = value.name;
        this.email = value.email;
        this.createdat = value.createdat;
    }

    public User(
        Long id,
        String name,
        String email,
        LocalDateTime createdat
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdat = createdat;
    }

    /**
     * Getter for <code>user_task_management.User.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>user_task_management.User.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>user_task_management.User.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter for <code>user_task_management.User.createdAt</code>.
     */
    public LocalDateTime getCreatedat() {
        return this.createdat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.createdat == null) {
            if (other.createdat != null)
                return false;
        }
        else if (!this.createdat.equals(other.createdat))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.createdat == null) ? 0 : this.createdat.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(email);
        sb.append(", ").append(createdat);

        sb.append(")");
        return sb.toString();
    }
}