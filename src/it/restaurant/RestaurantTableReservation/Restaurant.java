package it.restaurant.RestaurantTableReservation;

import it.restaurant.customer.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * The class Restaurant.
 */
public class Restaurant {

    private static Restaurant restaurant = new Restaurant();
    private Map<Table, Reservation> myRestaurant = new HashMap<>();

    private Restaurant() {
    }

    /**
     * Gets instance of the restaurant singleton.
     *
     * @return the instance
     */
    public static Restaurant getInstance() {
        return restaurant;
    }

    /**
     * Gets my restaurant map.
     *
     * @return the restaurant
     */
    public Map<Table, Reservation> getMyRestaurant() {
        return myRestaurant;
    }

    /**
     * A method to reserve tables that checks the table state and the table available seats
     * adds table and reservation to the restaurant map
     * modifies the table state and available seats
     *
     * @param table       the table
     * @param reservation the reservation
     */
    public void reserveTable(Table table, Reservation reservation) {
        if (table.getTableState() == TableStateEnum.OCCUPIED) {
            System.out.println("Error : the requested table is already occupied by other customers");
            return;
        }
        if ((table.getSeats() >= reservation.getRequiredSeats())) {
            myRestaurant.put(table, reservation);
            table.reserveTable(reservation.getRequiredSeats());
            return;
        }
        System.out.println("There aren't enough available seats for this reservation");
    }

    /**
     * A method to clean tables that checks the table state
     * removes table and reservation from the restaurant map
     * modifies the table state
     * @param table       the table
     * @param reservation the reservation
     * @return the reservation
     */
    public Reservation cleanTable(Table table, Reservation reservation) {
        if (table.getTableState() == TableStateEnum.FREE) {
            System.out.println("Error : the requested table had already been freed and cleaned");
        }
        else { myRestaurant.remove(table, reservation);
            table.freeTable();
        }
        return reservation;
    }

    /**
     * Iterates through the restaurant map and prints the details of the table, reservation and customers.
     */
    public void printRestaurantInfo() {
        restaurant.getMyRestaurant().forEach((table, reservation) -> System.out.println(table.getName() +
                " is " + table.getTableState().toString().toLowerCase() +
                " by reservation : " + reservation.getReservationInfo()));
    }
}
