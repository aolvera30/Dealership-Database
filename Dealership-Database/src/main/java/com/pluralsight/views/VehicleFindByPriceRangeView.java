package com.pluralsight.views;


import com.pluralsight.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class VehicleFindByPriceRangeView {
    public double getMinPrice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter minimum price: ");
        return in.nextDouble();
    }

    public double getMaxPrice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum price: ");
        return in.nextDouble();
    }

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Vehicles by price range:");
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " $" + vehicle.getPrice()));
    }
}