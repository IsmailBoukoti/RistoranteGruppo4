package it.restaurant.food;


import it.restaurant.customer.Customer;

import java.util.List;

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
     * Iterates the menu and the customer and in base of customer type print the menu
     *
     * @param customer that will be iterated
     * @param menu     that will be iterated
     */
    public void printMenuTypeByCustomerType(Customer customer,Menu menu){
        System.out.println("------------Dear "+customer.getName()+" we have for you "+customer.getType()+" menu-----");
        for (MenuItem menuItem : menu.itemList){
            for (MenuTypeEnum menuTypeEnum : menuItem.getType()){
                if(customer.getType() == menuTypeEnum){
                    System.out.println(menuItem.getDetails());
                }
            }
        }
    }


    public void printRecommendedDishes(){
        for (MenuItem item : itemList){
            if(item.isRecommended()){
                System.out.println("Our recommended "+item.getType()+" dish is "+item.getName()+" "+item.getPrice()+" euros");
            }
        }
    }

    //TODO unire i metodi dish of the days e crearne uno solo che li stampa tutti
    public void printDishOfTheDay() {
        System.out.println("\n------------DISH OF THE DAY CLASSIC MENU------------");
        for (MenuItem dishClassic : itemList) {
            if (dishClassic.isDishOfTheDay()) {
                System.out.println("The dish of the day is: " + dishClassic.getName());
            }
        }
    }

    public void printDishOfTheDayVegetarian() {
        System.out.println("\n------------DISH OF THE DAY VEGETARIAN MENU------------");
        for (MenuItem dishVegetarian : itemList) {
            if (dishVegetarian.getType().contains(MenuTypeEnum.VEGETARIAN) && dishVegetarian.isDishOfTheDay()) {
                System.out.println("The all dishes of the day per types are: " + dishVegetarian.getName()+"\n");
                return; // mi dice di uscire dal metodo
            }
        }
    }

    public void printDishOfTheDayChild() {
        System.out.println("------------DISH OF THE DAY CHILD MENU------------");
        for (MenuItem dishChild : itemList) {
            if (dishChild.getType().contains(MenuTypeEnum.CHILD) && dishChild.isDishOfTheDay()) {
                System.out.println("The dish of the day is: " + dishChild.getName()+"\n");
                return; // mi dice di uscire dal metodo
            }
        }
    }
}
