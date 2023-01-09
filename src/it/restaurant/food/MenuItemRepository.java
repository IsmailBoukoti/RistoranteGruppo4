package it.restaurant.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MenuItemRepository {



    private final String db_url = "jdbc:mysql://localhost:3306/newdb";
    private final String user = "root";
    private final String password = "Passworld@0";


    private String name;
    private Integer price;
    //private List<MenuTypeEnum> type;
    private boolean isRecommended;
    private String stringOfIngredients;
    private boolean dishOfTheDay;

    public MenuItemRepository(String name,Integer price,boolean isRecommended,String stringOfIngredients, boolean dishOfTheDay){
        this.name = name;
        this.price = price;
        this.isRecommended = isRecommended;
        this.stringOfIngredients = stringOfIngredients;
        this.dishOfTheDay = dishOfTheDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public boolean isRecommended() {
        return isRecommended;
    }

    public void setRecommended(boolean recommended) {
        isRecommended = recommended;
    }

    public String getStringOfIngredients() {
        return stringOfIngredients;
    }

    public void setStringOfIngredients(String stringOfIngredients) {
        this.stringOfIngredients = stringOfIngredients;
    }

    public boolean isDishOfTheDay() {
        return dishOfTheDay;
    }

    public void setDishOfTheDay(boolean dishOfTheDay) {
        this.dishOfTheDay = dishOfTheDay;
    }

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

    public void insertMenuItem() throws SQLException {
        Connection con = DriverManager.getConnection(db_url, user, password);
        Statement statement = con.createStatement();

        String insert = ""
                + "INSERT INTO newdb.menu_item "
                + "(name, ingredients, price, is_recommended, dish_of_the_day) "
                + "VALUES('"+name+"','"+stringOfIngredients+"',"+price+","+isRecommended+","+dishOfTheDay+");";
        statement.executeUpdate(insert);
        con.close();
    }
}
