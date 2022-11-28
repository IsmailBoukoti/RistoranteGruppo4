package it.restaurant.food;

import java.util.List;

public class Wine extends MenuItem {
public double gradoAlcool;
    public Wine(String name, double price, List<MenuTypeEnum> type, boolean isRecommended, String stringOfIngredients,double gradoAlcool) {
        super(name, price, type, isRecommended, stringOfIngredients);
        this.gradoAlcool = gradoAlcool;
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}
