package com.goodtech.robotics;

import org.myrobotlab.framework.Service;

/**
 *
 */
public class IRCameraSensor extends Camera
{

    public IRCameraSensor(Service hostServices, int height, int width) {
        super(hostServices, height, width);
    }

    @Override
    public void open() {
        getHostService().startService();
    }

    @Override
    public void close() {
        getHostService().stopService();
    }
}
