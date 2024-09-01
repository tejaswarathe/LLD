package LLDQuestions.ParkingLot.Models;

import java.time.OffsetDateTime;

public class ExitGate {

    public void processExit(Ticket ticket) {
        int cost = calculateCost(ticket);
        ticket.getParkingSpot().unParkVehicle();
    }

    public int calculateCost(Ticket ticket) {
        return (OffsetDateTime.now().getHour()- ticket.getEntryTime().getHour()) * ticket.getParkingSpot().getCostPerHour();
    }
}
