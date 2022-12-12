package it.restaurant.food;

import java.util.List;

public class Wine extends MenuItem{
    private double alcoholConcentration;
    public Wine(String name, double price, List<MenuTypeEnum> type, boolean isRecommended, String stringOfIngredients, double alcoholConcentration, boolean dishOfTheDay) {
        super(name, price, type, isRecommended, stringOfIngredients,dishOfTheDay);
        this.alcoholConcentration = alcoholConcentration;
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}
