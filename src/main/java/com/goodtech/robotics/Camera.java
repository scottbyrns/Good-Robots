package com.goodtech.robotics;

/**
 * Created with IntelliJ IDEA.
 * User: gail
 * Date: 9/15/13
 * Time: 2:21 AM
 * To change this template use File | Settings | File Templates.
 */
import javafx.application.HostServices;
import org.myrobotlab.framework.Service;

import java.awt.image.BufferedImage;

/**
 * Abstraction of the common camera functionality for cameras.
 *
 * @author Scott Byrns
 * @version 0.1a
 */
public abstract class Camera extends Sensor {

    /**
     * Width of the image
     */
    private int width;
    /**
     * Height of the image
     */
    private int height;

    protected int[] imageData;

    private Service hostService;

    public Camera (Service hostServices, int height, int width) {
        this.width = width;
        this.height = height;
        imageData = new int[getWidth() * getHeight() * 3];
        setHostService(hostService);
    }

    /**
     * Set the host Kinect device for this function
     *
     * @param hostService host service
     */
    protected void setHostService(Service hostService) {
        this.hostService = hostService;
    }

    protected Service getHostService () {
        return this.hostService;
    }

    /**
     * Capture a single still image from the kinects RGB camera.
     *
     * @return still image from rgb camera
     */
    public BufferedImage captureStillImage () {
        return captureImage();
    }

    public BufferedImage captureImage () {

        int[] imageRGB = new int[getWidth()*getHeight()];
        int pos = 0;
        for (int i = 0; i < getImageData().length; i += 3) {
            imageRGB[pos++] = (256*256*getImageData()[i]+256*getImageData()[i+1]+getImageData()[i+2]);
        }

        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);

        image.setRGB(0, 0, getWidth(), getHeight(), imageRGB, 0, 640);
        return image;
    }

    /**
     * Get the width of the image
     *
     * @return width
     */
    protected int getWidth () {
        return width;
    }

    /**
     * Get the height of the image
     *
     * @return height
     */
    protected int getHeight () {
        return height;
    }

    public void setImageData(int[] imageData) {
        this.imageData = imageData;
    }

    public int[] getImageData() {
        return this.imageData;
    }

    /**
     * Open a connection to the camera.
     */
    public abstract void open();
    /**
     * Close the connection to the camera.
     */
    public abstract void close();
}