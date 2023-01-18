package it.restaurant.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MenuItemRepository {



    private final String db_url = "jdbc:mysql://localhost:3306/newdb";
    private final String user = "root";
    private final String password = "password";


    public void createTableMenuItem() throws SQLException {

        Connection con = DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String queryTable = ""
                + "CREATE TABLE IF NOT EXISTS menu_item ( "
                + "  menu_id int NOT NULL auto_increment primary KEY, "
                + "  name varchar(30) DEFAULT NULL, "
                + "  ingredients varchar(200) DEFAULT NULL, "
                + "  price double(5,2) DEFAULT NULL, "
                + "  is_recommended boolean DEFAULT NULL, "
                + "  dish_of_the_day boolean DEFAULT NULL "
                + "  );";

        statement.executeUpdate(queryTable);
        con.close();
    }

    public void insertMenuItem(MenuItem menuItem) throws SQLException {
        Connection con = DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String insert = ""
                + "INSERT INTO newdb.menu_item "
                + "(name, ingredients, price, is_recommended, dish_of_the_day) "
                + "VALUES('"+menuItem.getName()+"','"+menuItem.getStringOfIngredients()+"',"+menuItem.getPrice()+","+menuItem.isRecommended()+","+menuItem.isDishOfTheDay()+");";
        statement.executeUpdate(insert);
        con.close();
    }
}
