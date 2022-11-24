package it.restaurant.RestaurantTableReservation;

import it.restaurant.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {

    private static Restaurant restaurant = new Restaurant();
    private Map<Table, Reservation> myRestaurant = new HashMap<>();

    private Restaurant() {
    }

    public static Restaurant getInstance() {
        return restaurant;
    }

    public Map<Table, Reservation> getMyRestaurant() {
        return myRestaurant;
    }

    public void setMyRestaurant(Map<Table, Reservation> myRestaurant) {
        this.myRestaurant = myRestaurant;
    }

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

    public Reservation cleanTable(Table table, Reservation reservation) {
        if (table.getTableState() == TableStateEnum.FREE) {
            System.out.println("Error : the requested table had already been freed and cleaned");
        }
        else { myRestaurant.remove(table, reservation);
            table.freeTable();
        }
        return reservation;
    }

    public void printRestaurantInfo() {
        restaurant.getMyRestaurant().forEach((table, reservation) -> System.out.println(table.getName() +
                " is " + table.getTableState().toString().toLowerCase() +
                " by reservation : " + reservation.getReservationInfo()));
    }
}
