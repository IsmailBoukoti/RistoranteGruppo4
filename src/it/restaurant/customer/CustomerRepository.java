package it.restaurant.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerRepository {

    public void createTableCustomer() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ristorante_Team4", "developer", "Password!");
        Statement statement = con.createStatement();

        String customerTable = ""
                + "CREATE TABLE IF NOT EXISTS `customer` ( "
                + "  `name` varchar(20) DEFAULT NULL, "
                + "  `surname` varchar(30) DEFAULT NULL, "
                + "  `fidelity_points` double(10,2) DEFAULT NULL, "
                + "  `food_preference` varchar(20) DEFAULT NULL, "
                + ")";

        statement.executeUpdate(customerTable);

        con.close();
    }
}
