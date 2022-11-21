package it.restaurant.food;

import it.restaurant.customer.Customer;


import java.util.List;

import static it.restaurant.customer.CustomerTypeEnum.*;

public class Menu{
    private final List<MenuItem> itemList;

    public Menu(List<MenuItem> itemList){
        this.itemList = itemList;
    }

    public List<MenuItem> getItemList(){
        return itemList;
    }


    /**
     * This method appends a list of menuitems at the end of the menu itemlist
     *
     * @param list the list of menuitems we want to append
     */
    public void addListToMenu(List<MenuItem> list){
        this.itemList.addAll(list);
    }

    /**
     * iterates the menu to give you only the dishes of type Vegetarian
     *
     * @param menu that will be iterated
     */
    public void printVegetarianMenu(Menu menu){
        for (MenuItem menu1 : menu.itemList){
            if(menu1.getType1() == VEGETARIAN){
                System.out.println(menu1.printDetails());
            }
        }
    }

    /**
     * iterates the menu to give you only the dishes of type Child
     *
     * @param menu that will be iterated
     */
    public void printChildMenu(Menu menu){
        for (MenuItem menu1 : menu.itemList){
            if(menu1.getType1() == CHILD || menu1.getType2() == CHILD){
                System.out.println(menu1.printDetails());
            }
        }
    }

    /**
     * iterates the menu to give you all the dishes
     *
     * @param menu that will be iterated
     */
    public void printAllMenu(Menu menu){
        for (MenuItem menu1 : menu.itemList){
            System.out.println(menu1.printDetails());
        }
    }

    /**
     * Iterates the menu and the customer and in base of customer type print the menu
     *
     * @param customer that will be iterated
     * @param menu     that will be iterated
     */
    public void printMenuTypeByCustomerType(Customer customer,Menu menu){

        System.out.println("------------Dear "+customer.getName()+" we have for you "+customer.getType()+" menu-----");
        switch(customer.getType()){
            case VEGETARIAN:
                menu.printVegetarianMenu(menu);
                break;
            case CHILD:
                menu.printChildMenu(menu);
                break;
            case CLASSIC:
                menu.printAllMenu(menu);
                break;
            default:
                System.out.println("you written wrong");
                break;
        }
    }

    public void printRecommendedDishes(){
        for (MenuItem item : itemList){
            if(item.isRecommended()){
                System.out.println("Our recommended "+item.getType1()+" dish is "+item.getName()+" "+item.getPrice()+" euros");
            }
        }
    }
}
