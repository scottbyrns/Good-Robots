package com.goodtech.robotics;

import org.foundation.ml.Measurement;
import org.junit.Test;
import org.myrobotlab.service.Arduino;
import org.myrobotlab.service.IPCamera;
import org.myrobotlab.service.Servo;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class TestRobot {

    @Test
    public void testSensors() throws Exception {

        Robot robot = new Robot();

        List<Sensor> sensorMap = robot.getSensors();

        Sensor sensor = new Sensor();

        sensor.setName("PH Sensor");

        Range range = new Range();

        sensor.setRange(new Range());

        sensorMap.add(sensor);

        Arduino arduino = new Arduino("Plantoid");

        robot.getServices().add(arduino);

        robot.getServices().add(new Servo("Left X Axis"));
        robot.getServices().add(new Servo("Right X Axis"));
        robot.getServices().add(new Servo("Left Y Axis"));
        robot.getServices().add(new Servo("Right Y Axis"));



        arduino.connect();

        IRCameraSensor irCameraSensor = new IRCameraSensor(new IPCamera("IR Camera"), 640, 480);

        robot.getSensors().add(irCameraSensor);

        BufferedImage bufferedImage = irCameraSensor.captureStillImage();



    }
}
