package com.pluralsight.services;

import com.pluralsight.dataSource.dataSourceConnection;
import com.pluralsight.models.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlVehiclesDAO implements VehiclesDAO {

    @Override
    public List<Vehicle> listAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Vehicle vehicle = new Vehicle(
                        resultSet.getString("VIN"),
                        resultSet.getString("make"),
                        resultSet.getString("model"),
                        resultSet.getInt("year"),
                        resultSet.getDouble("price"),
                        resultSet.getBoolean("sold"),
                        resultSet.getString("type"),
                        resultSet.getInt("mileage"),
                        resultSet.getString("color")
                );
                vehicles.add(vehicle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        String query = "INSERT INTO vehicles (VIN, make, model, year, price, sold, type, mileage, color) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, vehicle.getVin());
            statement.setString(2, vehicle.getMake());
            statement.setString(3, vehicle.getModel());
            statement.setInt(4, vehicle.getYear());
            statement.setDouble(5, vehicle.getPrice());
            statement.setBoolean(6, vehicle.isSold());
            statement.setString(7, vehicle.getType());
            statement.setInt(8, vehicle.getMileage());
            statement.setString(9, vehicle.getColor());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeVehicle(String vin) {
        String query = "DELETE FROM vehicles WHERE VIN = ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, vin);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Vehicle> findVehiclesWithinPriceRange(double minPrice, double maxPrice) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE price BETWEEN ? AND ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, minPrice);
            statement.setDouble(2, maxPrice);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vehicle vehicle = new Vehicle(
                            resultSet.getString("VIN"),
                            resultSet.getString("make"),
                            resultSet.getString("model"),
                            resultSet.getInt("year"),
                            resultSet.getDouble("price"),
                            resultSet.getBoolean("sold"),
                            resultSet.getString("type"),
                            resultSet.getInt("mileage"),
                            resultSet.getString("color")
                    );
                    vehicles.add(vehicle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> findVehiclesByMakeModel(String make, String model) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE make = ? AND model = ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, make);
            statement.setString(2, model);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vehicle vehicle = new Vehicle(
                            resultSet.getString("VIN"),
                            resultSet.getString("make"),
                            resultSet.getString("model"),
                            resultSet.getInt("year"),
                            resultSet.getDouble("price"),
                            resultSet.getBoolean("sold"),
                            resultSet.getString("type"),
                            resultSet.getInt("mileage"),
                            resultSet.getString("color")
                    );
                    vehicles.add(vehicle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> findVehiclesByYearRange(int minYear, int maxYear) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE year BETWEEN ? AND ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, minYear);
            statement.setInt(2, maxYear);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vehicle vehicle = new Vehicle(
                            resultSet.getString("VIN"),
                            resultSet.getString("make"),
                            resultSet.getString("model"),
                            resultSet.getInt("year"),
                            resultSet.getDouble("price"),
                            resultSet.getBoolean("sold"),
                            resultSet.getString("type"),
                            resultSet.getInt("mileage"),
                            resultSet.getString("color")
                    );
                    vehicles.add(vehicle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> findVehiclesByColor(String color) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE color = ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, color);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vehicle vehicle = new Vehicle(
                            resultSet.getString("VIN"),
                            resultSet.getString("make"),
                            resultSet.getString("model"),
                            resultSet.getInt("year"),
                            resultSet.getDouble("price"),
                            resultSet.getBoolean("sold"),
                            resultSet.getString("type"),
                            resultSet.getInt("mileage"),
                            resultSet.getString("color")
                    );
                    vehicles.add(vehicle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> findVehiclesByMileageRange(int minMileage, int maxMileage) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE mileage BETWEEN ? AND ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, minMileage);
            statement.setInt(2, maxMileage);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vehicle vehicle = new Vehicle(
                            resultSet.getString("VIN"),
                            resultSet.getString("make"),
                            resultSet.getString("model"),
                            resultSet.getInt("year"),
                            resultSet.getDouble("price"),
                            resultSet.getBoolean("sold"),
                            resultSet.getString("type"),
                            resultSet.getInt("mileage"),
                            resultSet.getString("color")
                    );
                    vehicles.add(vehicle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> findVehiclesByType(String vehicleType) {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE type = ?";

        try (Connection connection = dataSourceConnection.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, vehicleType);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vehicle vehicle = new Vehicle(
                            resultSet.getString("VIN"),
                            resultSet.getString("make"),
                            resultSet.getString("model"),
                            resultSet.getInt("year"),
                            resultSet.getDouble("price"),
                            resultSet.getBoolean("sold"),
                            resultSet.getString("type"),
                            resultSet.getInt("mileage"),
                            resultSet.getString("color")
                    );
                    vehicles.add(vehicle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    // Contract methods (commented out for now)
    // @Override
    // public void addSalesContract(SalesContract contract) {
    //     // Implementation here
    // }

    // @Override
    // public void addLeaseContract(LeaseContract contract) {
    //     // Implementation here
    // }
}
