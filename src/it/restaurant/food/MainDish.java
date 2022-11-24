package it.restaurant.food;

import java.util.ArrayList;

public class MainDish extends MenuItem{


    public MainDish(String name, double price, ArrayList<MenuTypeEnum> menuTypeEnum, boolean isRecommended, String stringOfIngredients) {
        super(name, price, menuTypeEnum, isRecommended, stringOfIngredients);
    }

    @Override
    public String printDetails(){
        return super.printDetails();
    }
}
