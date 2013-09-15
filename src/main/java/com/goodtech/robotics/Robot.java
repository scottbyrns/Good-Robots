package com.goodtech.robotics;


import org.goodgod.controller.MessageHandler;
import org.myrobotlab.framework.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Virtual Representation of Robot
 */
public class Robot {


    private Long uid;
    private String name;
//    private RobotType type;
//    private List<PhysicalProperty> physicalProperties;
//    private Persona persona;
    private List<Sensor> sensors = new ArrayList<Sensor>();

    private List<Service> services = new ArrayList<Service>();

    @Deprecated
    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

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

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    @MessageHandler(
            documentation = "Start The Robot",
            group = "Robot",
            channel = "Start"

    )
    public void start () {

    }
}
