package com.goodtech.robotics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.myrobotlab.service.IPCamera;

/**
 * Test the plantoid.
 */
public class TestPlantoid {

    private Robot robot;

    @Before
    public void setUp() throws Exception {
        robot = new Robot();

    }

    @Test
    public void testPlantoidIRCameraInitialization ()
    {

        IRCameraSensor irCameraSensor = new IRCameraSensor(new IPCamera("IR Camera"), 640, 480);

        robot.getSensors().add(irCameraSensor);

        irCameraSensor.open();
        irCameraSensor.captureStillImage();
        irCameraSensor.close();

    }

    @After
    public void tearDown() throws Exception {


    }
}
