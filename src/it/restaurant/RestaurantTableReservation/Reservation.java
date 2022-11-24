package it.restaurant.RestaurantTableReservation;

import it.restaurant.customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reservation {
    private final String reservationId;
    private final List<Customer> customerList;
    private int requiredSeats;

    public Reservation(String reservationId){
        this(reservationId,new ArrayList<>());
    }

    public Reservation(String reservationId, List<Customer> customerList) {
        this.reservationId = reservationId ;
        this.customerList = customerList;
    }

    public String getReservationId() {
        return reservationId;
    }

    public int getRequiredSeats() {
        return requiredSeats;
    }

    public void setRequiredSeats(int requiredSeats) {
        this.requiredSeats = requiredSeats;
    }

    public String getReservationInfo(){
        return  reservationId + " " + customerList.stream().map(customer -> customer.getDetails()).collect(Collectors.joining(", "));
    }
    public void addCustomerToReservation(Customer customer){
        customerList.add(customer);
    }
}
