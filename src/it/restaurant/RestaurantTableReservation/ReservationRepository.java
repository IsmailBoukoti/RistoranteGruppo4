package it.restaurant.RestaurantTableReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReservationRepository {

    public void createTableCustomer() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ristorante_Team4", "developer", "Password!");
        Statement statement = con.createStatement();

        String reservationTable = ""
                + "CREATE TABLE IF NOT EXISTS `reservation` ( "
                + "  `reservation_id` int(4) NOT NULL AUTO_INCREMENT, "
                + "  `customer_name` varchar(30) DEFAULT NULL, "
                + "  `reservation_time` double(4,2) DEFAULT NULL, "
                + "  `required_seat` int(20) DEFAULT NULL, "
                + ")";

        statement.executeUpdate(reservationTable);

        con.close();
    }
}
