package linkedLists;

import java.util.LinkedList;

public class FlightReservation {
    private String name, seatNumber;
    private int flightNumber;
    private LinkedList<String> flightReservations = new LinkedList<>();


    public FlightReservation(String name, String seatNumber, int flightNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.flightNumber = flightNumber;
    }

    public void addReservation(String reservation) {
        flightReservations.add(reservation);
    }

    public void removeReservation() {

    }

    public void getReservationInfo() {

    }

    public void displayReservationHistory() {
        System.out.println(flightReservations);
    }
}