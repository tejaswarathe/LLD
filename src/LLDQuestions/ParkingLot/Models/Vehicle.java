package LLDQuestions.ParkingLot.Models;

public class Vehicle {

    private int id;
    private String licensePlate;
    VehicleType vehicleType;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle(int id, String licensePlate, VehicleType vehicleType) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }
}
