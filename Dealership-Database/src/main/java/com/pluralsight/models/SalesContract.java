package com.pluralsight.models;


import java.io.Serializable;
import java.sql.Date;

public class SalesContract implements Serializable {
    private int contractId;
    private String vin;
    private String customerName;
    private Date saleDate;
    private double salePrice;

    // No-argument constructor
    public SalesContract() {}

    // Constructor with arguments
    public SalesContract(int contractId, String vin, String customerName, Date saleDate, double salePrice) {
        this.contractId = contractId;
        this.vin = vin;
        this.customerName = customerName;
        this.saleDate = saleDate;
        this.salePrice = salePrice;
    }

    // Getters and Setters
    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}