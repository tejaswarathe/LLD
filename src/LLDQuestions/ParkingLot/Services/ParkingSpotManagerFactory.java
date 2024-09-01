package LLDQuestions.ParkingLot.Services;

import LLDQuestions.ParkingLot.Models.VehicleType;

public class ParkingSpotManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        if (vehicleType == VehicleType.FOUR_WHEELER) {
            return new FourWheelerParkingSpotManager();
        }
        if (vehicleType == VehicleType.TWO_WHEELER) {
            return new TwoWheelerParkingSpotManager();
        }
        return new ParkingSpotManager();
    }
}
