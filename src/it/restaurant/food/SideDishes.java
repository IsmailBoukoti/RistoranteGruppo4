package it.restaurant.food;

import it.restaurant.food.MenuItem;

public class SideDishes extends MenuItem{

    public SideDishes(String name, double price, MenuTypeEnum type, boolean isRecommended, String stringOfIngredients){
        super(name, price, type, isRecommended, stringOfIngredients);
    }

    @Override
    public String toString() {
        return getType() + " Side dishes = " + this.getName() +" ingredients:"+ this.getStringOfIngredients()+ ", price : "+ this.getPrice() +" euros";
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }
}
