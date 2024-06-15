package com.pluralsight.services;

import com.pluralsight.models.Vehicle;
import java.util.List;

public interface VehiclesDAO {
    List<Vehicle> listAllVehicles();
    void addVehicle(Vehicle vehicle);
    void removeVehicle(String vin);
    List<Vehicle> findVehiclesWithinPriceRange(double minPrice, double maxPrice);
    List<Vehicle> findVehiclesByMakeModel(String make, String model);
    List<Vehicle> findVehiclesByYearRange(int minYear, int maxYear);
    List<Vehicle> findVehiclesByColor(String color);
    List<Vehicle> findVehiclesByMileageRange(int minMileage, int maxMileage);
    List<Vehicle> findVehiclesByType(String vehicleType);
}