package it.restaurant.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuItemSQL {

    private final String db_url = "jdbc:mysql://localhost:3306/Ristorante_Team4";
    private final String user = "developer";
    private final String password = "Password!";

    public void createTableMenuItem() throws SQLException {
        Connection con = DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String queryTable = ""
                + "CREATE TABLE IF NOT EXISTS `menu_item` ( "
                + "  `menu_id` int NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `ingredients` varchar(200) DEFAULT NULL, "
                + "  `price` double(5) DEFAULT NULL, "
                + "  `dish_type` varchar(30) DEFAULT NULL, "
                + "  `is_recommended` boolean DEFAULT NULL, "
                + "  `dish_of_the_day` boolean DEFAULT NULL, "
                + "  PRIMARY KEY (`menu_id`) "
                + ")";

        statement.executeUpdate(queryTable);

        con.close();
    }
}
