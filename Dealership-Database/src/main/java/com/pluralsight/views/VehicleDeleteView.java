package com.pluralsight.views;

import java.util.Scanner;

public class VehicleDeleteView {
    public String getVin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the VIN of the vehicle to delete: ");
        return in.nextLine().strip();
    }
}