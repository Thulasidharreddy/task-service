/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TlsChannelStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String channel;
    private final String property;
    private final String value;

    public TlsChannelStatus(TlsChannelStatus value) {
        this.channel = value.channel;
        this.property = value.property;
        this.value = value.value;
    }

    public TlsChannelStatus(
        String channel,
        String property,
        String value
    ) {
        this.channel = channel;
        this.property = property;
        this.value = value;
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.CHANNEL</code>.
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.PROPERTY</code>.
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.VALUE</code>.
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TlsChannelStatus other = (TlsChannelStatus) obj;
        if (this.channel == null) {
            if (other.channel != null)
                return false;
        }
        else if (!this.channel.equals(other.channel))
            return false;
        if (this.property == null) {
            if (other.property != null)
                return false;
        }
        else if (!this.property.equals(other.property))
            return false;
        if (this.value == null) {
            if (other.value != null)
                return false;
        }
        else if (!this.value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.channel == null) ? 0 : this.channel.hashCode());
        result = prime * result + ((this.property == null) ? 0 : this.property.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TlsChannelStatus (");

        sb.append(channel);
        sb.append(", ").append(property);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}