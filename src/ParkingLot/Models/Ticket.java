package ParkingLot.Models;

import java.time.OffsetDateTime;

public class Ticket {

    private OffsetDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public OffsetDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

}
