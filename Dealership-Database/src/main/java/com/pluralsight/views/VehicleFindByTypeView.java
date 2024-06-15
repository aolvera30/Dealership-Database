package com.pluralsight.views;


import com.pluralsight.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class VehicleFindByTypeView {
    public String getType() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the vehicle type: ");
        return in.nextLine().strip();
    }

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Vehicles by type:");
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getType()));
    }
}