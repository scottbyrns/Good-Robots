package com.goodtech.robotics;

import org.foundation.ml.Measurement;

/**
 * Measurement Range
 */
public class Range {

    /**
     * Minimum measurement value.
     */
    private Measurement minimum;

    /**
     * Maximum measurement value.
     */
    private Measurement maximum;

    public Measurement getMinimum() {
        return minimum;
    }

    public void setMinimum(Measurement minimum) {
        this.minimum = minimum;
    }

    public Measurement getMaximum() {
        return maximum;
    }

    public void setMaximum(Measurement maximum) {
        this.maximum = maximum;
    }
}
