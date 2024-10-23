/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import com.neurasim.jooq.mysql.enums.DbAlterPriv;
import com.neurasim.jooq.mysql.enums.DbAlterRoutinePriv;
import com.neurasim.jooq.mysql.enums.DbCreatePriv;
import com.neurasim.jooq.mysql.enums.DbCreateRoutinePriv;
import com.neurasim.jooq.mysql.enums.DbCreateTmpTablePriv;
import com.neurasim.jooq.mysql.enums.DbCreateViewPriv;
import com.neurasim.jooq.mysql.enums.DbDeletePriv;
import com.neurasim.jooq.mysql.enums.DbDropPriv;
import com.neurasim.jooq.mysql.enums.DbEventPriv;
import com.neurasim.jooq.mysql.enums.DbExecutePriv;
import com.neurasim.jooq.mysql.enums.DbGrantPriv;
import com.neurasim.jooq.mysql.enums.DbIndexPriv;
import com.neurasim.jooq.mysql.enums.DbInsertPriv;
import com.neurasim.jooq.mysql.enums.DbLockTablesPriv;
import com.neurasim.jooq.mysql.enums.DbReferencesPriv;
import com.neurasim.jooq.mysql.enums.DbSelectPriv;
import com.neurasim.jooq.mysql.enums.DbShowViewPriv;
import com.neurasim.jooq.mysql.enums.DbTriggerPriv;
import com.neurasim.jooq.mysql.enums.DbUpdatePriv;

import java.io.Serializable;


/**
 * Database privileges
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Db implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String host;
    private final String db;
    private final String user;
    private final DbSelectPriv selectPriv;
    private final DbInsertPriv insertPriv;
    private final DbUpdatePriv updatePriv;
    private final DbDeletePriv deletePriv;
    private final DbCreatePriv createPriv;
    private final DbDropPriv dropPriv;
    private final DbGrantPriv grantPriv;
    private final DbReferencesPriv referencesPriv;
    private final DbIndexPriv indexPriv;
    private final DbAlterPriv alterPriv;
    private final DbCreateTmpTablePriv createTmpTablePriv;
    private final DbLockTablesPriv lockTablesPriv;
    private final DbCreateViewPriv createViewPriv;
    private final DbShowViewPriv showViewPriv;
    private final DbCreateRoutinePriv createRoutinePriv;
    private final DbAlterRoutinePriv alterRoutinePriv;
    private final DbExecutePriv executePriv;
    private final DbEventPriv eventPriv;
    private final DbTriggerPriv triggerPriv;

    public Db(Db value) {
        this.host = value.host;
        this.db = value.db;
        this.user = value.user;
        this.selectPriv = value.selectPriv;
        this.insertPriv = value.insertPriv;
        this.updatePriv = value.updatePriv;
        this.deletePriv = value.deletePriv;
        this.createPriv = value.createPriv;
        this.dropPriv = value.dropPriv;
        this.grantPriv = value.grantPriv;
        this.referencesPriv = value.referencesPriv;
        this.indexPriv = value.indexPriv;
        this.alterPriv = value.alterPriv;
        this.createTmpTablePriv = value.createTmpTablePriv;
        this.lockTablesPriv = value.lockTablesPriv;
        this.createViewPriv = value.createViewPriv;
        this.showViewPriv = value.showViewPriv;
        this.createRoutinePriv = value.createRoutinePriv;
        this.alterRoutinePriv = value.alterRoutinePriv;
        this.executePriv = value.executePriv;
        this.eventPriv = value.eventPriv;
        this.triggerPriv = value.triggerPriv;
    }

    public Db(
        String host,
        String db,
        String user,
        DbSelectPriv selectPriv,
        DbInsertPriv insertPriv,
        DbUpdatePriv updatePriv,
        DbDeletePriv deletePriv,
        DbCreatePriv createPriv,
        DbDropPriv dropPriv,
        DbGrantPriv grantPriv,
        DbReferencesPriv referencesPriv,
        DbIndexPriv indexPriv,
        DbAlterPriv alterPriv,
        DbCreateTmpTablePriv createTmpTablePriv,
        DbLockTablesPriv lockTablesPriv,
        DbCreateViewPriv createViewPriv,
        DbShowViewPriv showViewPriv,
        DbCreateRoutinePriv createRoutinePriv,
        DbAlterRoutinePriv alterRoutinePriv,
        DbExecutePriv executePriv,
        DbEventPriv eventPriv,
        DbTriggerPriv triggerPriv
    ) {
        this.host = host;
        this.db = db;
        this.user = user;
        this.selectPriv = selectPriv;
        this.insertPriv = insertPriv;
        this.updatePriv = updatePriv;
        this.deletePriv = deletePriv;
        this.createPriv = createPriv;
        this.dropPriv = dropPriv;
        this.grantPriv = grantPriv;
        this.referencesPriv = referencesPriv;
        this.indexPriv = indexPriv;
        this.alterPriv = alterPriv;
        this.createTmpTablePriv = createTmpTablePriv;
        this.lockTablesPriv = lockTablesPriv;
        this.createViewPriv = createViewPriv;
        this.showViewPriv = showViewPriv;
        this.createRoutinePriv = createRoutinePriv;
        this.alterRoutinePriv = alterRoutinePriv;
        this.executePriv = executePriv;
        this.eventPriv = eventPriv;
        this.triggerPriv = triggerPriv;
    }

    /**
     * Getter for <code>mysql.db.Host</code>.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for <code>mysql.db.Db</code>.
     */
    public String getDb() {
        return this.db;
    }

    /**
     * Getter for <code>mysql.db.User</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for <code>mysql.db.Select_priv</code>.
     */
    public DbSelectPriv getSelectPriv() {
        return this.selectPriv;
    }

    /**
     * Getter for <code>mysql.db.Insert_priv</code>.
     */
    public DbInsertPriv getInsertPriv() {
        return this.insertPriv;
    }

    /**
     * Getter for <code>mysql.db.Update_priv</code>.
     */
    public DbUpdatePriv getUpdatePriv() {
        return this.updatePriv;
    }

    /**
     * Getter for <code>mysql.db.Delete_priv</code>.
     */
    public DbDeletePriv getDeletePriv() {
        return this.deletePriv;
    }

    /**
     * Getter for <code>mysql.db.Create_priv</code>.
     */
    public DbCreatePriv getCreatePriv() {
        return this.createPriv;
    }

    /**
     * Getter for <code>mysql.db.Drop_priv</code>.
     */
    public DbDropPriv getDropPriv() {
        return this.dropPriv;
    }

    /**
     * Getter for <code>mysql.db.Grant_priv</code>.
     */
    public DbGrantPriv getGrantPriv() {
        return this.grantPriv;
    }

    /**
     * Getter for <code>mysql.db.References_priv</code>.
     */
    public DbReferencesPriv getReferencesPriv() {
        return this.referencesPriv;
    }

    /**
     * Getter for <code>mysql.db.Index_priv</code>.
     */
    public DbIndexPriv getIndexPriv() {
        return this.indexPriv;
    }

    /**
     * Getter for <code>mysql.db.Alter_priv</code>.
     */
    public DbAlterPriv getAlterPriv() {
        return this.alterPriv;
    }

    /**
     * Getter for <code>mysql.db.Create_tmp_table_priv</code>.
     */
    public DbCreateTmpTablePriv getCreateTmpTablePriv() {
        return this.createTmpTablePriv;
    }

    /**
     * Getter for <code>mysql.db.Lock_tables_priv</code>.
     */
    public DbLockTablesPriv getLockTablesPriv() {
        return this.lockTablesPriv;
    }

    /**
     * Getter for <code>mysql.db.Create_view_priv</code>.
     */
    public DbCreateViewPriv getCreateViewPriv() {
        return this.createViewPriv;
    }

    /**
     * Getter for <code>mysql.db.Show_view_priv</code>.
     */
    public DbShowViewPriv getShowViewPriv() {
        return this.showViewPriv;
    }

    /**
     * Getter for <code>mysql.db.Create_routine_priv</code>.
     */
    public DbCreateRoutinePriv getCreateRoutinePriv() {
        return this.createRoutinePriv;
    }

    /**
     * Getter for <code>mysql.db.Alter_routine_priv</code>.
     */
    public DbAlterRoutinePriv getAlterRoutinePriv() {
        return this.alterRoutinePriv;
    }

    /**
     * Getter for <code>mysql.db.Execute_priv</code>.
     */
    public DbExecutePriv getExecutePriv() {
        return this.executePriv;
    }

    /**
     * Getter for <code>mysql.db.Event_priv</code>.
     */
    public DbEventPriv getEventPriv() {
        return this.eventPriv;
    }

    /**
     * Getter for <code>mysql.db.Trigger_priv</code>.
     */
    public DbTriggerPriv getTriggerPriv() {
        return this.triggerPriv;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Db other = (Db) obj;
        if (this.host == null) {
            if (other.host != null)
                return false;
        }
        else if (!this.host.equals(other.host))
            return false;
        if (this.db == null) {
            if (other.db != null)
                return false;
        }
        else if (!this.db.equals(other.db))
            return false;
        if (this.user == null) {
            if (other.user != null)
                return false;
        }
        else if (!this.user.equals(other.user))
            return false;
        if (this.selectPriv == null) {
            if (other.selectPriv != null)
                return false;
        }
        else if (!this.selectPriv.equals(other.selectPriv))
            return false;
        if (this.insertPriv == null) {
            if (other.insertPriv != null)
                return false;
        }
        else if (!this.insertPriv.equals(other.insertPriv))
            return false;
        if (this.updatePriv == null) {
            if (other.updatePriv != null)
                return false;
        }
        else if (!this.updatePriv.equals(other.updatePriv))
            return false;
        if (this.deletePriv == null) {
            if (other.deletePriv != null)
                return false;
        }
        else if (!this.deletePriv.equals(other.deletePriv))
            return false;
        if (this.createPriv == null) {
            if (other.createPriv != null)
                return false;
        }
        else if (!this.createPriv.equals(other.createPriv))
            return false;
        if (this.dropPriv == null) {
            if (other.dropPriv != null)
                return false;
        }
        else if (!this.dropPriv.equals(other.dropPriv))
            return false;
        if (this.grantPriv == null) {
            if (other.grantPriv != null)
                return false;
        }
        else if (!this.grantPriv.equals(other.grantPriv))
            return false;
        if (this.referencesPriv == null) {
            if (other.referencesPriv != null)
                return false;
        }
        else if (!this.referencesPriv.equals(other.referencesPriv))
            return false;
        if (this.indexPriv == null) {
            if (other.indexPriv != null)
                return false;
        }
        else if (!this.indexPriv.equals(other.indexPriv))
            return false;
        if (this.alterPriv == null) {
            if (other.alterPriv != null)
                return false;
        }
        else if (!this.alterPriv.equals(other.alterPriv))
            return false;
        if (this.createTmpTablePriv == null) {
            if (other.createTmpTablePriv != null)
                return false;
        }
        else if (!this.createTmpTablePriv.equals(other.createTmpTablePriv))
            return false;
        if (this.lockTablesPriv == null) {
            if (other.lockTablesPriv != null)
                return false;
        }
        else if (!this.lockTablesPriv.equals(other.lockTablesPriv))
            return false;
        if (this.createViewPriv == null) {
            if (other.createViewPriv != null)
                return false;
        }
        else if (!this.createViewPriv.equals(other.createViewPriv))
            return false;
        if (this.showViewPriv == null) {
            if (other.showViewPriv != null)
                return false;
        }
        else if (!this.showViewPriv.equals(other.showViewPriv))
            return false;
        if (this.createRoutinePriv == null) {
            if (other.createRoutinePriv != null)
                return false;
        }
        else if (!this.createRoutinePriv.equals(other.createRoutinePriv))
            return false;
        if (this.alterRoutinePriv == null) {
            if (other.alterRoutinePriv != null)
                return false;
        }
        else if (!this.alterRoutinePriv.equals(other.alterRoutinePriv))
            return false;
        if (this.executePriv == null) {
            if (other.executePriv != null)
                return false;
        }
        else if (!this.executePriv.equals(other.executePriv))
            return false;
        if (this.eventPriv == null) {
            if (other.eventPriv != null)
                return false;
        }
        else if (!this.eventPriv.equals(other.eventPriv))
            return false;
        if (this.triggerPriv == null) {
            if (other.triggerPriv != null)
                return false;
        }
        else if (!this.triggerPriv.equals(other.triggerPriv))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.host == null) ? 0 : this.host.hashCode());
        result = prime * result + ((this.db == null) ? 0 : this.db.hashCode());
        result = prime * result + ((this.user == null) ? 0 : this.user.hashCode());
        result = prime * result + ((this.selectPriv == null) ? 0 : this.selectPriv.hashCode());
        result = prime * result + ((this.insertPriv == null) ? 0 : this.insertPriv.hashCode());
        result = prime * result + ((this.updatePriv == null) ? 0 : this.updatePriv.hashCode());
        result = prime * result + ((this.deletePriv == null) ? 0 : this.deletePriv.hashCode());
        result = prime * result + ((this.createPriv == null) ? 0 : this.createPriv.hashCode());
        result = prime * result + ((this.dropPriv == null) ? 0 : this.dropPriv.hashCode());
        result = prime * result + ((this.grantPriv == null) ? 0 : this.grantPriv.hashCode());
        result = prime * result + ((this.referencesPriv == null) ? 0 : this.referencesPriv.hashCode());
        result = prime * result + ((this.indexPriv == null) ? 0 : this.indexPriv.hashCode());
        result = prime * result + ((this.alterPriv == null) ? 0 : this.alterPriv.hashCode());
        result = prime * result + ((this.createTmpTablePriv == null) ? 0 : this.createTmpTablePriv.hashCode());
        result = prime * result + ((this.lockTablesPriv == null) ? 0 : this.lockTablesPriv.hashCode());
        result = prime * result + ((this.createViewPriv == null) ? 0 : this.createViewPriv.hashCode());
        result = prime * result + ((this.showViewPriv == null) ? 0 : this.showViewPriv.hashCode());
        result = prime * result + ((this.createRoutinePriv == null) ? 0 : this.createRoutinePriv.hashCode());
        result = prime * result + ((this.alterRoutinePriv == null) ? 0 : this.alterRoutinePriv.hashCode());
        result = prime * result + ((this.executePriv == null) ? 0 : this.executePriv.hashCode());
        result = prime * result + ((this.eventPriv == null) ? 0 : this.eventPriv.hashCode());
        result = prime * result + ((this.triggerPriv == null) ? 0 : this.triggerPriv.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Db (");

        sb.append(host);
        sb.append(", ").append(db);
        sb.append(", ").append(user);
        sb.append(", ").append(selectPriv);
        sb.append(", ").append(insertPriv);
        sb.append(", ").append(updatePriv);
        sb.append(", ").append(deletePriv);
        sb.append(", ").append(createPriv);
        sb.append(", ").append(dropPriv);
        sb.append(", ").append(grantPriv);
        sb.append(", ").append(referencesPriv);
        sb.append(", ").append(indexPriv);
        sb.append(", ").append(alterPriv);
        sb.append(", ").append(createTmpTablePriv);
        sb.append(", ").append(lockTablesPriv);
        sb.append(", ").append(createViewPriv);
        sb.append(", ").append(showViewPriv);
        sb.append(", ").append(createRoutinePriv);
        sb.append(", ").append(alterRoutinePriv);
        sb.append(", ").append(executePriv);
        sb.append(", ").append(eventPriv);
        sb.append(", ").append(triggerPriv);

        sb.append(")");
        return sb.toString();
    }
}
