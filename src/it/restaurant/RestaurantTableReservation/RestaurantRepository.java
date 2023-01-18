package it.restaurant.RestaurantTableReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RestaurantRepository {

    public void createTableCustomer() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ristorante_Team4", "developer", "Password!");
        Statement statement = con.createStatement();

        String restaurantTable = ""
                + "CREATE TABLE IF NOT EXISTS `restaurant` ( "
                + "  `name` varchar(30) DEFAULT NULL, "
                + "  `number_of_tables` int(20) DEFAULT NULL, "
                + "  `number_of_seats` int(20) DEFAULT NULL, "
                + ")";

        statement.executeUpdate(restaurantTable);

        con.close();
    }
}
