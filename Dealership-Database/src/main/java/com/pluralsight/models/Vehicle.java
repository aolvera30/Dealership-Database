package com.pluralsight.models;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String vin;
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean sold;
    private String type;
    private int mileage;
    private String color; // Add this line

    public Vehicle(String vin, String make, String model, int year, double price, boolean sold, String type, int mileage, String color) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.sold = sold;
        this.type = type;
        this.mileage = mileage;
        this.color = color; // Add this line
    }

    // Getters and Setters
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() { // Add this method
        return color;
    }

    public void setColor(String color) { // Add this method
        this.color = color;
    }
}