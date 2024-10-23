/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTablespacesBrief implements Serializable {

    private static final long serialVersionUID = 1L;

    private final byte[] space;
    private final String name;
    private final String path;
    private final byte[] flag;
    private final String spaceType;

    public InnodbTablespacesBrief(InnodbTablespacesBrief value) {
        this.space = value.space;
        this.name = value.name;
        this.path = value.path;
        this.flag = value.flag;
        this.spaceType = value.spaceType;
    }

    public InnodbTablespacesBrief(
        byte[] space,
        String name,
        String path,
        byte[] flag,
        String spaceType
    ) {
        this.space = space;
        this.name = name;
        this.path = path;
        this.flag = flag;
        this.spaceType = spaceType;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_BRIEF.SPACE</code>.
     */
    public byte[] getSpace() {
        return this.space;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES_BRIEF.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES_BRIEF.PATH</code>.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES_BRIEF.FLAG</code>.
     */
    public byte[] getFlag() {
        return this.flag;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_BRIEF.SPACE_TYPE</code>.
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbTablespacesBrief other = (InnodbTablespacesBrief) obj;
        if (this.space == null) {
            if (other.space != null)
                return false;
        }
        else if (!Arrays.equals(this.space, other.space))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.path == null) {
            if (other.path != null)
                return false;
        }
        else if (!this.path.equals(other.path))
            return false;
        if (this.flag == null) {
            if (other.flag != null)
                return false;
        }
        else if (!Arrays.equals(this.flag, other.flag))
            return false;
        if (this.spaceType == null) {
            if (other.spaceType != null)
                return false;
        }
        else if (!this.spaceType.equals(other.spaceType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.space == null) ? 0 : Arrays.hashCode(this.space));
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.path == null) ? 0 : this.path.hashCode());
        result = prime * result + ((this.flag == null) ? 0 : Arrays.hashCode(this.flag));
        result = prime * result + ((this.spaceType == null) ? 0 : this.spaceType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTablespacesBrief (");

        sb.append("[binary...]");
        sb.append(", ").append(name);
        sb.append(", ").append(path);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(spaceType);

        sb.append(")");
        return sb.toString();
    }
}