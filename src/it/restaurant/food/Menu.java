package it.restaurant.food;

import java.util.List;
public class Menu{
    String name = "Antichi Sapori ";
    String menuType = "Menu di carne";

    public final List<MenuItem> itemList;
    public Menu(List<MenuItem> itemList) {
        this.itemList = itemList;
    }
    /**
     * This method appends a list of menuitems at the end of the menu itemlist
     * @param list the list of menuitems we want to append
     */
    public void addListToMenu(List<MenuItem> list){
         this.itemList.addAll(list);
    }



    public String toString() {

        return  "name='" + name + '\'' +
                ", menuType='" + menuType + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
