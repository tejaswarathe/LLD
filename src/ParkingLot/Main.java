package ParkingLot;

import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.Vehicle;
import ParkingLot.Models.VehicleType;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Vehicle vehicle1 = new Vehicle(1, "MP04CL9035", VehicleType.FOUR_WHEELER);
        parkingLot.parkVehicle(vehicle1);


    }
}
