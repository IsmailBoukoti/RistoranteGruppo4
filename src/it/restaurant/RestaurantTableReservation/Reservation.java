package it.restaurant.RestaurantTableReservation;

import it.restaurant.customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The class Reservation.
 */
public class Reservation {
    private final String reservationId;
    private List<Customer> customerList = new ArrayList<>();
    private int requiredSeats = customerList.size();


    /**
     * Instantiates a new Reservation with an already created customer list
     *
     * @param reservationId the reservation id
     * @param customerList  the customer list
     */
    public Reservation(String reservationId, List<Customer> customerList) {
        this.reservationId = reservationId;
        this.customerList = customerList;
    }

    /**
     * Gets reservation id.
     *
     * @return the reservation id
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Gets required seats.
     *
     * @return the required seats
     */
    public int getRequiredSeats() {
        return requiredSeats;
    }

    /**
     * Sets required seats.
     *
     * @param requiredSeats the required seats
     */
    public void setRequiredSeats(int requiredSeats) {
        this.requiredSeats = requiredSeats;
    }

    /**
     * Get reservation info by collecting the elements of the list and concatenates them with a string .
     *
     * @return the string
     */
    public String getReservationInfo(){
        return  reservationId + " " + customerList.stream().map(customer -> customer.getDetails()).collect(Collectors.joining(", "));
    }

    /**
     * Add customer to the customer list.
     *
     * @param customer the customer
     */
    public void addCustomerToReservation(Customer customer){
        customerList.add(customer);
    }
}
