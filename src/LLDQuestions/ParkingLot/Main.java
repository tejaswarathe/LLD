package LLDQuestions.ParkingLot;

import LLDQuestions.ParkingLot.Models.ParkingLot;
import LLDQuestions.ParkingLot.Models.Vehicle;
import LLDQuestions.ParkingLot.Models.VehicleType;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Vehicle vehicle1 = new Vehicle(1, "MP04CL9035", VehicleType.FOUR_WHEELER);
        parkingLot.parkVehicle(vehicle1);


    }
}
