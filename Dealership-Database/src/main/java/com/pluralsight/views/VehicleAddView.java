package com.pluralsight.views;


import com.pluralsight.models.Vehicle;
import java.util.Scanner;

public class VehicleAddView {
    public Vehicle getVehicleDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter VIN: ");
        String vin = scanner.nextLine();

        System.out.println("Enter Make: ");
        String make = scanner.nextLine();

        System.out.println("Enter Model: ");
        String model = scanner.nextLine();

        System.out.println("Enter Year: ");
        int year = scanner.nextInt();

        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.println("Is Sold (true/false): ");
        boolean sold = scanner.nextBoolean();

        System.out.println("Enter Type: ");
        scanner.nextLine(); // Consume the newline character
        String type = scanner.nextLine();

        System.out.println("Enter Mileage: ");
        int mileage = scanner.nextInt();

        System.out.println("Enter Color: ");
        scanner.nextLine(); // Consume the newline character
        String color = scanner.nextLine();

        return new Vehicle(vin, make, model, year, price, sold, type, mileage, color);
    }
}