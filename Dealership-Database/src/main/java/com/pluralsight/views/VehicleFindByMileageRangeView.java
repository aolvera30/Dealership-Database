package com.pluralsight.views;

import com.pluralsight.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class VehicleFindByMileageRangeView {
    public int getMinMileage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter minimum mileage: ");
        return in.nextInt();
    }

    public int getMaxMileage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum mileage: ");
        return in.nextInt();
    }

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Vehicles by mileage range:");
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getMileage() + " miles"));
    }
}