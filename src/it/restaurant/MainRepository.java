package it.restaurant;

import it.restaurant.RestaurantTableReservation.ReservationRepository;
import it.restaurant.RestaurantTableReservation.RestaurantRepository;
import it.restaurant.RestaurantTableReservation.TableRepository;
import it.restaurant.customer.Customer;
import it.restaurant.customer.CustomerRepository;
import it.restaurant.food.FixedMenuRepository;
import it.restaurant.food.MenuItem;
import it.restaurant.food.MenuItemRepository;
import it.restaurant.food.MenuTypeEnum;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    public static void main(String[] args) throws SQLException {
        MenuItemRepository menuItemRepository = new MenuItemRepository();

        CustomerRepository customer = new CustomerRepository();
        FixedMenuRepository fixedMenu = new FixedMenuRepository();
        ReservationRepository reservation = new ReservationRepository();
        RestaurantRepository restaurant = new RestaurantRepository();
        TableRepository table = new TableRepository();
        //TODO Vedere come sistemare la lista di enum per inserirli nel db.
       /* List<MenuTypeEnum> menuForClassic = new ArrayList<>();
        menuForClassic.add(MenuTypeEnum.CLASSIC);*/


        menuItemRepository.createTableMenuItem();
        menuItemRepository.insertMenuItem(new MenuItem("Bistecca",10,MenuTypeEnum.CLASSIC,true,"Beef, salt, pepper",true));

        customer.createTableCustomer();
        fixedMenu.createTableFixedMenu();
        reservation.createTableReservation();
        restaurant.createTableRestaurant();
        table.createTableTable();
    }
}
