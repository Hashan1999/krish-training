/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HASHA
 */
public class Camera implements CameraPrototype {

    private String brand;
    private String model;
    private String type;
    private String sensor;
    private String imageSensor;
    private String videoResolution;
    private String storage;
    private boolean flash;
    private boolean lcdDisplay;

    public Camera(String brand, String model, String type, String sensor, String imageSensor, String videoResolution, String storage, boolean flash, boolean lcdDisplay) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.sensor = sensor;
        this.imageSensor = imageSensor;
        this.videoResolution = videoResolution;
        this.storage = storage;
        this.flash = flash;
        this.lcdDisplay = lcdDisplay;
    }

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getImageSensor() {
        return imageSensor;
    }

    public void setImageSensor(String imageSensor) {
        this.imageSensor = imageSensor;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public boolean isFlash() {
        return flash;
    }

    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    public boolean isLcdDisplay() {
        return lcdDisplay;
    }

    public void setLcdDisplay(boolean lcdDisplay) {
        this.lcdDisplay = lcdDisplay;
    }

    @Override
    public Camera clone() {
        return new Camera(this.brand, this.model, this.type, this.sensor, this.imageSensor, this.videoResolution, this.storage, this.flash, this.lcdDisplay);
    }

    
    @Override
    public String toString() {
        String flashOfCamera = "Not Available";
        String lcdDisplayOfCamera = "Not Available";
        if (this.flash == true) {
            flashOfCamera = "Available";
        }
        if (this.lcdDisplay == true) {
            lcdDisplayOfCamera = "Available";
        }

        return "Brand - " + this.brand + "\n"
                + "Model - " + this.model + "\n"
                + "Type - " + this.type + "\n"
                + "Sensor - " + this.sensor + "\n"
                + "Image Sensor - " + this.imageSensor + "\n"
                + "Video Resolution - " + this.videoResolution + "\n"
                + "Storage - " + this.storage + "\n"
                + "Flash - " + flashOfCamera + "\n"
                + "Lcd Display - " + lcdDisplayOfCamera;

    }

}
