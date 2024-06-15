package com.pluralsight.views;

import com.pluralsight.models.Vehicle;

import java.util.List;

public class VehicleListView {

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println();
        System.out.println("All vehicles");
        System.out.println("-".repeat(40));
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " - " + vehicle.getYear() + " - $" + vehicle.getPrice()));
    }
}