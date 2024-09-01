package ParkingLot.Models;

import ParkingLot.Services.ParkingSpotManager;
import ParkingLot.Services.ParkingSpotManagerFactory;

public class ParkingLot {

    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getVehicleType());


    }

}
