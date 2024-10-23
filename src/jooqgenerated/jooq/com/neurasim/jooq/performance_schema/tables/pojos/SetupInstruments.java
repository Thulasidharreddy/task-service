/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.SetupInstrumentsEnabled;
import com.neurasim.jooq.performance_schema.enums.SetupInstrumentsTimed;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupInstruments implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final SetupInstrumentsEnabled enabled;
    private final SetupInstrumentsTimed timed;
    private final String properties;
    private final String flags;
    private final Integer volatility;
    private final String documentation;

    public SetupInstruments(SetupInstruments value) {
        this.name = value.name;
        this.enabled = value.enabled;
        this.timed = value.timed;
        this.properties = value.properties;
        this.flags = value.flags;
        this.volatility = value.volatility;
        this.documentation = value.documentation;
    }

    public SetupInstruments(
        String name,
        SetupInstrumentsEnabled enabled,
        SetupInstrumentsTimed timed,
        String properties,
        String flags,
        Integer volatility,
        String documentation
    ) {
        this.name = name;
        this.enabled = enabled;
        this.timed = timed;
        this.properties = properties;
        this.flags = flags;
        this.volatility = volatility;
        this.documentation = documentation;
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.ENABLED</code>.
     */
    public SetupInstrumentsEnabled getEnabled() {
        return this.enabled;
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.TIMED</code>.
     */
    public SetupInstrumentsTimed getTimed() {
        return this.timed;
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.PROPERTIES</code>.
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.FLAGS</code>.
     */
    public String getFlags() {
        return this.flags;
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.VOLATILITY</code>.
     */
    public Integer getVolatility() {
        return this.volatility;
    }

    /**
     * Getter for
     * <code>performance_schema.setup_instruments.DOCUMENTATION</code>.
     */
    public String getDocumentation() {
        return this.documentation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SetupInstruments other = (SetupInstruments) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.enabled == null) {
            if (other.enabled != null)
                return false;
        }
        else if (!this.enabled.equals(other.enabled))
            return false;
        if (this.timed == null) {
            if (other.timed != null)
                return false;
        }
        else if (!this.timed.equals(other.timed))
            return false;
        if (this.properties == null) {
            if (other.properties != null)
                return false;
        }
        else if (!this.properties.equals(other.properties))
            return false;
        if (this.flags == null) {
            if (other.flags != null)
                return false;
        }
        else if (!this.flags.equals(other.flags))
            return false;
        if (this.volatility == null) {
            if (other.volatility != null)
                return false;
        }
        else if (!this.volatility.equals(other.volatility))
            return false;
        if (this.documentation == null) {
            if (other.documentation != null)
                return false;
        }
        else if (!this.documentation.equals(other.documentation))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.enabled == null) ? 0 : this.enabled.hashCode());
        result = prime * result + ((this.timed == null) ? 0 : this.timed.hashCode());
        result = prime * result + ((this.properties == null) ? 0 : this.properties.hashCode());
        result = prime * result + ((this.flags == null) ? 0 : this.flags.hashCode());
        result = prime * result + ((this.volatility == null) ? 0 : this.volatility.hashCode());
        result = prime * result + ((this.documentation == null) ? 0 : this.documentation.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SetupInstruments (");

        sb.append(name);
        sb.append(", ").append(enabled);
        sb.append(", ").append(timed);
        sb.append(", ").append(properties);
        sb.append(", ").append(flags);
        sb.append(", ").append(volatility);
        sb.append(", ").append(documentation);

        sb.append(")");
        return sb.toString();
    }
}
