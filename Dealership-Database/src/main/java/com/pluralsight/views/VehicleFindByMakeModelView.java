package com.pluralsight.views;

import com.pluralsight.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class VehicleFindByMakeModelView {
    public String getMake() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the make: ");
        return in.nextLine().strip();
    }

    public String getModel() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the model: ");
        return in.nextLine().strip();
    }

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Vehicles by make/model:");
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel()));
    }
}