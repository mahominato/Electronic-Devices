package com.example.demodevice;

import org.example.demodevice.Devicetype;

import static org.example.demodevice.Devicetype.TABLET;

public class Tablet extends Device {
    private double batteryLife;
    private boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(TABLET, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    public Tablet(Devicetype type, String name, double price, double weight, double batteryLife, int hasStylus) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
    }

    public double getBatteryLife() { return batteryLife; }
    public void setBatteryLife(double batteryLife) { this.batteryLife = batteryLife; }
    public boolean isHasStylus() { return hasStylus; }
    public void setHasStylus(boolean hasStylus) { this.hasStylus = hasStylus; }

    @Override
    public String toString() {
        return super.toString() + " - Battery: " + batteryLife + " hours, Stylus: " + (hasStylus ? "Yes" : "No");
    }
}
