package com.pluralsight.views;
import com.pluralsight.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class VehicleFindByYearRangeView {
    public int getMinYear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter minimum year: ");
        return in.nextInt();
    }

    public int getMaxYear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum year: ");
        return in.nextInt();
    }

    public void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Vehicles by year range:");
        vehicles.forEach(vehicle -> System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getYear()));
    }
}