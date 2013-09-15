package com.goodtech.robotics;

/**
 * Sensors Type
 */
public class SensorType {

    /**
     * Unique Identifier
     */
    private Long uid;

    /**
     * Sensor type name.
     */
    private String name;

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
}
