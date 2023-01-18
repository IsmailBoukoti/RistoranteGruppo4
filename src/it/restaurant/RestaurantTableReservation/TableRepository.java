package it.restaurant.RestaurantTableReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableRepository {

    public void createTableCustomer() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ristorante_Team4", "developer", "Password!");
        Statement statement = con.createStatement();

        String tableTable = ""
                + "CREATE TABLE IF NOT EXISTS `table` ( "
                + "  `table_id` int(20) NOT NULL AUTO_INCREMENT, "
                + "  `initial_seat` int(10) DEFAULT NULL, "
                + "  `available_seat` int(10) DEFAULT NULL, "
                + "  `table_status` string(10) DEFAULT NULL, "
                + ")";

        statement.executeUpdate(tableTable);

        con.close();
    }
}
