package com.example.demodevice;

import org.example.demodevice.Devicetype;

public class Smartphone extends Device {
    protected int screenSize;
    protected int resolution;

    public Smartphone(Devicetype smartphone, String name, double price, double weight, int size, int resolution) {
        super(Devicetype.SMARTPHONE, "Unknown", 0.0, 0.0);
        this.screenSize = 0;
        this.resolution = 0;
    }

    public Smartphone(String name, double price, double weight) {
        super(Devicetype.SMARTPHONE, name, price, weight);
    }

    public Smartphone(String name, double price, double weight, int screenSize, int resolution) {
        super(Devicetype.SMARTPHONE, name, price, weight);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + getType() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", screenSize=" + screenSize +
                ", resolution=" + resolution +
                '}';
    }
}
