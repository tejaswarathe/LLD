package LLDQuestions.ParkingLot.Models;

public class ParkingSpot {

    private int id;

    private boolean isEmpty;
    private ParkingType parkingType;
    private int costPerHour;
    private Vehicle vehicleParked;


    public int getCostPerHour() {
        return costPerHour;
    }


    public boolean isEmpty() {
        return isEmpty;
    }


    public boolean parkVehicle() {
        return true;
    }

    public void unParkVehicle() {
        isEmpty = true;
        vehicleParked = null;
    }
}
