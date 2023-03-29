package com.example;

public class Car {

    private int year;
    private String make;
    private String model;
    private int odometer;
    private double engineLiters;

    public Car() {
        year = 0;
        make = "";
        model = "";
        odometer = 0;
        engineLiters = 0.0;
    }

    public Car(int year, String make, String model, int odometer, double engineLiters) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.engineLiters = engineLiters;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getOdometer() {
        return odometer;
    }

    public double getEngineLiters() {
        return engineLiters;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setEngineLiters(double engineLiters) {
        this.engineLiters = engineLiters;
    }

}
