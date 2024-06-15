package com.pluralsight.controllers;

import com.pluralsight.models.Vehicle;
import com.pluralsight.services.MySqlVehiclesDAO;

import java.util.List;

public class VehicleController {
    private final MySqlVehiclesDAO vehiclesDAO;

    public VehicleController(MySqlVehiclesDAO vehiclesDAO) {
        this.vehiclesDAO = vehiclesDAO;
    }

    public List<Vehicle> listAllVehicles() {
        return vehiclesDAO.listAllVehicles();
    }

    public void addVehicle(Vehicle vehicle) {
        vehiclesDAO.addVehicle(vehicle);
    }

    public void removeVehicle(String vin) {
        vehiclesDAO.removeVehicle(vin);
    }

    public List<Vehicle> findVehiclesWithinPriceRange(double minPrice, double maxPrice) {
        return vehiclesDAO.findVehiclesWithinPriceRange(minPrice, maxPrice);
    }

    public List<Vehicle> findVehiclesByMakeModel(String make, String model) {
        return vehiclesDAO.findVehiclesByMakeModel(make, model);
    }

    public List<Vehicle> findVehiclesByYearRange(int minYear, int maxYear) {
        return vehiclesDAO.findVehiclesByYearRange(minYear, maxYear);
    }

    public List<Vehicle> findVehiclesByColor(String color) {
        return vehiclesDAO.findVehiclesByColor(color);
    }

    public List<Vehicle> findVehiclesByMileageRange(int minMileage, int maxMileage) {
        return vehiclesDAO.findVehiclesByMileageRange(minMileage, maxMileage);
    }

    public List<Vehicle> findVehiclesByType(String vehicleType) {
        return vehiclesDAO.findVehiclesByType(vehicleType);
    }
}
