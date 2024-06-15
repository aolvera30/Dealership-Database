package com.pluralsight.models;

import java.io.Serializable;
import java.sql.Date;

public class LeaseContract implements Serializable {
    private int contractId;
    private String vin;
    private String customerName;
    private Date leaseStartDate;
    private Date leaseEndDate;
    private double monthlyPayment;

    // No-argument constructor
    public LeaseContract() {}

    // Constructor with arguments
    public LeaseContract(int contractId, String vin, String customerName, Date leaseStartDate, Date leaseEndDate, double monthlyPayment) {
        this.contractId = contractId;
        this.vin = vin;
        this.customerName = customerName;
        this.leaseStartDate = leaseStartDate;
        this.leaseEndDate = leaseEndDate;
        this.monthlyPayment = monthlyPayment;
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

    public Date getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(Date leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public Date getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(Date leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}