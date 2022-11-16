package it.restaurant.customer;

import it.restaurant.food.Menu;
import it.restaurant.food.MenuItem;
import it.restaurant.food.MenuTypeEnum;

public class Customer {

    private CustomerTypeEnum type;
    private String name;
    private String surname;
    static int numberOfCustomers;

    public Customer(String name, CustomerTypeEnum type){
        this.type = type;
        this.name = name;
        numberOfCustomers += 1;
    }

    public Customer(String name, String surname, CustomerTypeEnum type){
        this.type = type;
        this.name = name;
        this.surname = surname;
        numberOfCustomers += 1;
    }


    public String printDetails(){
        return "Customer: " +
                "type " + type +
                ", name " + name  +
                ", surname " + surname ;
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
        Customer.numberOfCustomers = numberOfCustomers;
    }

    /**
     * print the number of customer for know for how many people will the table
     */

    //public static void printNumberOfCustomers(){
      //  System.out.println ("Ok then the table is for "+numberOfCustomers+" people" );}


    public static void printMenuTypeByCustomerType(Customer customer, Menu menu){//Ho ciclato appetizerList ma aspetto tutto il menù per ciclare tutto il menu
        System.out.println();
        System.out.println("Dear "+customer.getName() +" we have for you "+customer.getType()+" menu.");
        switch(customer.getType()){
            case VEGETARIAN:
                for ( MenuItem menu1:menu.itemList) {
                    if (menu1.getType()==MenuTypeEnum.MENU_VEGETARIAN) {
                        menu1.printDetails();}}
                break;
            case CHILD:
                for (  MenuItem menu1:menu.itemList) {
                    if (( menu1.getType() == MenuTypeEnum.MENU_CHILDREN )) {
                        menu1.printDetails();}}
                break;
            case CLASSIC:
                for ( MenuItem menu1:menu.itemList) {
                    menu1.printDetails();}
                break;
            default:
                System.out.println("you written wrong");
                break;
        }
    }
}
