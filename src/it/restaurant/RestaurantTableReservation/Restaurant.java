package it.restaurant.RestaurantTableReservation;

import it.restaurant.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {

    private static Restaurant restaurant = new Restaurant();
    private Map<Table, Customer> myRestaurant = new HashMap<>();

    private Restaurant(){}
    public static Restaurant getInstance(){return restaurant;}

    public static Restaurant getRestaurant() {
        return restaurant;
    }

    public static void setRestaurant(Restaurant restaurant) {
        Restaurant.restaurant = restaurant;
    }

    public Map<Table, Customer> getMyRestaurant() {
        return myRestaurant;
    }

    public void setMyRestaurant(Map<Table, Customer> myRestaurant) {
        this.myRestaurant = myRestaurant;
    }

    public void reserveTable(Table table, Customer customers){
        if(table.getTableState() == TableStateEnum.OCCUPIED){
            System.out.println("Error : the requested table is already occupied by other customers");
        }else {
            myRestaurant.put(table, customers);
            table.setTableState(TableStateEnum.OCCUPIED);}
    }
    public Customer cleanTable(Table table, Customer customers){
        if(table.getTableState() == TableStateEnum.FREE){
            System.out.println("Error : the requested table had already been freed and cleaned");
        }else{ myRestaurant.remove(table,customers);
            table.setTableState(TableStateEnum.FREE);}
        return customers;
    }
}
