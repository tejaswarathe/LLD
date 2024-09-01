package LLDQuestions.ParkingLot.Models;

import LLDQuestions.ParkingLot.Services.ParkingSpotManager;
import LLDQuestions.ParkingLot.Services.ParkingSpotManagerFactory;

public class ParkingLot {

    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getVehicleType());

        return true;
    }

}
