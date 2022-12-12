package it.restaurant.food;

import java.util.List;

public class FixedMenu {

    private final List<MenuItem> fixedMenuItemList;

    public FixedMenu(List<MenuItem> fixedMenuItemList) {
        this.fixedMenuItemList = fixedMenuItemList;
    }

    public List<MenuItem> getFixedMenuItemList() {
        return fixedMenuItemList;
    }

    public void addListToFixedMenu(List<MenuItem> list){
        this.fixedMenuItemList.addAll(list);
    }
}
