/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import java.io.Serializable;


/**
 * Leap seconds information for time zones
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneLeapSecond implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long transitionTime;
    private final Integer correction;

    public TimeZoneLeapSecond(TimeZoneLeapSecond value) {
        this.transitionTime = value.transitionTime;
        this.correction = value.correction;
    }

    public TimeZoneLeapSecond(
        Long transitionTime,
        Integer correction
    ) {
        this.transitionTime = transitionTime;
        this.correction = correction;
    }

    /**
     * Getter for <code>mysql.time_zone_leap_second.Transition_time</code>.
     */
    public Long getTransitionTime() {
        return this.transitionTime;
    }

    /**
     * Getter for <code>mysql.time_zone_leap_second.Correction</code>.
     */
    public Integer getCorrection() {
        return this.correction;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TimeZoneLeapSecond other = (TimeZoneLeapSecond) obj;
        if (this.transitionTime == null) {
            if (other.transitionTime != null)
                return false;
        }
        else if (!this.transitionTime.equals(other.transitionTime))
            return false;
        if (this.correction == null) {
            if (other.correction != null)
                return false;
        }
        else if (!this.correction.equals(other.correction))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.transitionTime == null) ? 0 : this.transitionTime.hashCode());
        result = prime * result + ((this.correction == null) ? 0 : this.correction.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TimeZoneLeapSecond (");

        sb.append(transitionTime);
        sb.append(", ").append(correction);

        sb.append(")");
        return sb.toString();
    }
}