package it.restaurant.food;

import it.restaurant.customer.Customer;


import java.util.List;

public class Menu{
    private final List<MenuItem> itemList;
    
    private MenuTypeEnum menuTypeEnum;

    public Menu(List<MenuItem> itemList, MenuTypeEnum menuTypeEnum){
        this.itemList = itemList;
        this.menuTypeEnum = menuTypeEnum;
    }

    public List<MenuItem> getItemList(){
        return itemList;
    }

    public MenuTypeEnum getMenuTypeEnum() {
        return menuTypeEnum;
    }

    public void setMenuTypeEnum(MenuTypeEnum menuTypeEnum) {
        this.menuTypeEnum = menuTypeEnum;
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
     * iterates the menu to give you all the dishes
     *
     * @param menu that will be iterated
     */
    public void printAllMenu(Menu menu){
        for (MenuItem menu1 : menu.itemList){
            menu1.printDetails();
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
        menu.printAllMenu(menu);
    }

    public void printRecommendedDishes(){
        for (MenuItem item : itemList){
            if(item.isRecommended()){
                System.out.println("Our recommended "+item.getType1()+" dish is "+item.getName()+" "+item.getPrice()+" euros");
            }
        }
    }
}
