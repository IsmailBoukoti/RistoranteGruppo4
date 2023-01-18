package it.restaurant.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FixedMenuRepository {

    public void createTableFixedMenu() throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ristorante_Team4", "developer", "Password!");
        Statement statement = con.createStatement();

        String fixedMenuTable = ""
                + "CREATE TABLE IF NOT EXISTS `fixed_menu` ( "
                + "  `dish_id` int(4) NOT NULL AUTO_INCREMENT, "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `ingredients` varchar(100) DEFAULT NULL, "
                + "  `dish_type` varchar(20) DEFAULT NULL, "
                + "  `price` double(5,2) DEFAULT NULL, "
                + ")";

        statement.executeUpdate(fixedMenuTable);

        con.close();

        System.out.println("Table fixed_menu created");
    }
}
