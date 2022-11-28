package it.restaurant.food;

import java.util.List;

public class Wine extends MenuItem{
    private double gradoVino;
    public Wine(String name, double price, List<MenuTypeEnum> type, boolean isRecommended, String stringOfIngredients,double gradoVino) {
        super(name, price, type, isRecommended, stringOfIngredients);
        this.gradoVino = gradoVino;
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}
