package com.pluralsight.views;

import com.pluralsight.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class VehicleFindByColorView {
    public String getColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the color: ");
        return in.nextLine().strip();
    }

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Vehicles by color:");
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getColor()));
    }
}