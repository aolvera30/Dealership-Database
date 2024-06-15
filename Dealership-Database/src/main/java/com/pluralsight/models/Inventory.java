package com.pluralsight.models;


import java.io.Serializable;

public class Inventory implements Serializable {
    private int dealershipId;
    private String vin;

    // No-argument constructor
    public Inventory() {}

    // Constructor with arguments
    public Inventory(int dealershipId, String vin) {
        this.dealershipId = dealershipId;
        this.vin = vin;
    }

    // Getters and Setters
    public int getDealershipId() {
        return dealershipId;
    }

    public void setDealershipId(int dealershipId) {
        this.dealershipId = dealershipId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
