package com.pluralsight.application;


import com.pluralsight.controllers.VehicleController;
import com.pluralsight.views.*;
import java.util.Scanner;

public class DealershipApplication {
    private final VehicleController vehicleController;
    private final VehicleAddView vehicleAddView;
    private final VehicleListView vehicleListView;
    private final VehicleDeleteView vehicleDeleteView;
    private final VehicleFindByMakeModelView vehicleFindByMakeModelView;
    private final VehicleFindByPriceRangeView vehicleFindByPriceRangeView;
    private final VehicleFindByYearRangeView vehicleFindByYearRangeView;
    private final VehicleFindByColorView vehicleFindByColorView;
    private final VehicleFindByMileageRangeView vehicleFindByMileageRangeView;
    private final VehicleFindByTypeView vehicleFindByTypeView;

    public DealershipApplication(VehicleController vehicleController,
                                 VehicleAddView vehicleAddView,
                                 VehicleListView vehicleListView,
                                 VehicleDeleteView vehicleDeleteView,
                                 VehicleFindByMakeModelView vehicleFindByMakeModelView,
                                 VehicleFindByPriceRangeView vehicleFindByPriceRangeView,
                                 VehicleFindByYearRangeView vehicleFindByYearRangeView,
                                 VehicleFindByColorView vehicleFindByColorView,
                                 VehicleFindByMileageRangeView vehicleFindByMileageRangeView,
                                 VehicleFindByTypeView vehicleFindByTypeView) {
        this.vehicleController = vehicleController;
        this.vehicleAddView = vehicleAddView;
        this.vehicleListView = vehicleListView;
        this.vehicleDeleteView = vehicleDeleteView;
        this.vehicleFindByMakeModelView = vehicleFindByMakeModelView;
        this.vehicleFindByPriceRangeView = vehicleFindByPriceRangeView;
        this.vehicleFindByYearRangeView = vehicleFindByYearRangeView;
        this.vehicleFindByColorView = vehicleFindByColorView;
        this.vehicleFindByMileageRangeView = vehicleFindByMileageRangeView;
        this.vehicleFindByTypeView = vehicleFindByTypeView;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. List all vehicles");
            System.out.println("2. Add a vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Find vehicles within a price range");
            System.out.println("5. Find vehicles by make/model");
            System.out.println("6. Find vehicles by year range");
            System.out.println("7. Find vehicles by color");
            System.out.println("8. Find vehicles by mileage range");
            System.out.println("9. Find vehicles by type");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    vehicleListView.displayVehicles(vehicleController.listAllVehicles());
                    break;
                case 2:
                    vehicleController.addVehicle(vehicleAddView.getVehicleDetails());
                    break;
                case 3:
                    vehicleController.removeVehicle(vehicleDeleteView.getVin());
                    break;
                case 4:
                    vehicleFindByPriceRangeView.displayVehicles(vehicleController.findVehiclesWithinPriceRange(
                            vehicleFindByPriceRangeView.getMinPrice(), vehicleFindByPriceRangeView.getMaxPrice()));
                    break;
                case 5:
                    vehicleFindByMakeModelView.displayVehicles(vehicleController.findVehiclesByMakeModel(
                            vehicleFindByMakeModelView.getMake(), vehicleFindByMakeModelView.getModel()));
                    break;
                case 6:
                    vehicleFindByYearRangeView.displayVehicles(vehicleController.findVehiclesByYearRange(
                            vehicleFindByYearRangeView.getMinYear(), vehicleFindByYearRangeView.getMaxYear()));
                    break;
                case 7:
                    vehicleFindByColorView.displayVehicles(vehicleController.findVehiclesByColor(vehicleFindByColorView.getColor()));
                    break;
                case 8:
                    vehicleFindByMileageRangeView.displayVehicles(vehicleController.findVehiclesByMileageRange(
                            vehicleFindByMileageRangeView.getMinMileage(), vehicleFindByMileageRangeView.getMaxMileage()));
                    break;
                case 9:
                    vehicleFindByTypeView.displayVehicles(vehicleController.findVehiclesByType(vehicleFindByTypeView.getType()));
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}