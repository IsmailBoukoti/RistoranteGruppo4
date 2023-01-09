package it.restaurant;

import it.restaurant.food.MenuItemRepository;
import it.restaurant.food.MenuTypeEnum;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    public static void main(String[] args) throws SQLException {

        //TODO Vedere come sistemare la lista di enum per inserirli nel db.
       /* List<MenuTypeEnum> menuForClassic = new ArrayList<>();
        menuForClassic.add(MenuTypeEnum.CLASSIC);*/

        MenuItemRepository menuItemRepository =
                new MenuItemRepository("Bistecca", 10, true,
                        "Beef meat, salt, pepper", true);

        menuItemRepository.createTableMenuItem();
        menuItemRepository.insertMenuItem();
    }
}
