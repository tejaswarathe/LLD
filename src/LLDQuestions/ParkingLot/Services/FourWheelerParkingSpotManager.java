package LLDQuestions.ParkingLot.Services;

import LLDQuestions.ParkingLot.Models.ParkingSpot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

    public ParkingSpot getEmptyParking() {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(parkingSpot.isEmpty()) {
                return parkingSpot;
            }
        }
        return null;
    }

}
