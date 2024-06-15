package com.pluralsight;

import com.pluralsight.application.DealershipApplication;
import com.pluralsight.controllers.VehicleController;
import com.pluralsight.services.MySqlVehiclesDAO;
import com.pluralsight.dataSource.dataSourceConnection;
import com.pluralsight.views.*;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        // Get the data source
        DataSource dataSource = dataSourceConnection.getDataSource();

        // Create DAO instance with the data source
        MySqlVehiclesDAO vehiclesDAO = new MySqlVehiclesDAO();

        // Create Controller instance with the DAO
        VehicleController vehicleController = new VehicleController(vehiclesDAO);

        // Create View instances
        VehicleAddView vehicleAddView = new VehicleAddView();
        VehicleListView vehicleListView = new VehicleListView();
        VehicleDeleteView vehicleDeleteView = new VehicleDeleteView();
        VehicleFindByMakeModelView vehicleFindByMakeModelView = new VehicleFindByMakeModelView();
        VehicleFindByPriceRangeView vehicleFindByPriceRangeView = new VehicleFindByPriceRangeView();
        VehicleFindByYearRangeView vehicleFindByYearRangeView = new VehicleFindByYearRangeView();
        VehicleFindByColorView vehicleFindByColorView = new VehicleFindByColorView();
        VehicleFindByMileageRangeView vehicleFindByMileageRangeView = new VehicleFindByMileageRangeView();
        VehicleFindByTypeView vehicleFindByTypeView = new VehicleFindByTypeView();

        // Create application instance and run it
        DealershipApplication app = new DealershipApplication(
                vehicleController,
                vehicleAddView,
                vehicleListView,
                vehicleDeleteView,
                vehicleFindByMakeModelView,
                vehicleFindByPriceRangeView,
                vehicleFindByYearRangeView,
                vehicleFindByColorView,
                vehicleFindByMileageRangeView,
                vehicleFindByTypeView
        );
        app.run();
    }
}