package it.restaurant.customers;

import it.restaurant.food.Menu;
import it.restaurant.food.MenuItem;
import it.restaurant.food.MenuTypeEnum;

public class Customers{

    private CustomerTypeEnum type;
    private String name;
    private String surname;
    static int numberOfCustomers;

    public Customers(String name, CustomerTypeEnum type){
        this.type = type;
        this.name = name;
        numberOfCustomers += 1;
    }

    public Customers(String name, String surname, CustomerTypeEnum type){
        this.type = type;
        this.name = name;
        this.surname = surname;
        numberOfCustomers += 1;
    }

    @Override
    public String toString(){
        return "Customers{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    public CustomerTypeEnum getType(){
        return type;
    }

    public void setType(CustomerTypeEnum type){
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public static int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public static void setNumberOfCustomers(int numberOfCustomers){
        Customers.numberOfCustomers = numberOfCustomers;
    }

    /**
     * print the number of customer for know for how many people will the table
     */

    public static void printNumberOfCustomers(){
        System.out.printf ("Ok then the table is for %d people %n", numberOfCustomers);

    }


    public static void printMenuTypeByCustomerType(Customers customer, Menu menu){//Ho ciclato appetizerList ma aspetto tutto il menù per ciclare tutto il menu
        System.out.println();
        System.out.printf("Dear %s we have for you %s menu %n",customer.getName(),customer.getType());
        switch(customer.getType()){
            case VEGETARIAN:
                for ( MenuItem menu1:menu.itemList) {
                    if (menu1.getType().equals(MenuTypeEnum.MENU_VEGETARIAN)) {
                        System.out.println(menu1);}}
                break;
            case CHILD:
                for (  MenuItem menu1:menu.itemList) {
                    if (( menu1.getType() == MenuTypeEnum.MENU_CHILDREN )) {
                        System.out.println(menu1);}}
                break;
            case NORMAL:
                for ( MenuItem menu1:menu.itemList) {
                    System.out.println(menu1);}
                break;
            default:
                System.out.println("you written wrong");
                break;
        }
    }
}
