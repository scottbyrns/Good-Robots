package com.goodtech.robotics;

import org.foundation.ml.Measurement;

import java.util.Map;

/**
 * Environment Sensor
 */
public class Sensor {

    /**
     * Unique Identifier
     */
    private Long uid;

    /**
     * The name of the sensor.
     */
    private String name;

    /**
     * The sensors type.
     */
    private SensorType type;

    /**
     * Most recent sensor measurement.
     */
    private Measurement measurement;

    /**
     * The sensors range.
     */
    private Range range;

    /**
     * Historic measurements.
     * Long is time interval.
     */
    private Map<Long, Measurement> historicMeasurements;


    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SensorType getType() {
        return type;
    }

    public void setType(SensorType type) {
        this.type = type;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Map<Long, Measurement> getHistoricMeasurements() {
        return historicMeasurements;
    }

    public void setHistoricMeasurements(Map<Long, Measurement> historicMeasurements) {
        this.historicMeasurements = historicMeasurements;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }
}
