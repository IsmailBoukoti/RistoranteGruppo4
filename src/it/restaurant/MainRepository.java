package it.restaurant;

import it.restaurant.food.MenuItem;
import it.restaurant.food.MenuItemRepository;
import it.restaurant.food.MenuTypeEnum;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    public static void main(String[] args) throws SQLException {
        MenuItemRepository menuItemRepository = new MenuItemRepository();
        //TODO Vedere come sistemare la lista di enum per inserirli nel db.
       /* List<MenuTypeEnum> menuForClassic = new ArrayList<>();
        menuForClassic.add(MenuTypeEnum.CLASSIC);*/


        menuItemRepository.createTableMenuItem();
        menuItemRepository.insertMenuItem(new MenuItem("Bistecca",10,MenuTypeEnum.CLASSIC,true,"Beef, salt, pepper",true));
    }
}
