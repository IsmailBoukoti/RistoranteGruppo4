package it.restaurant.food;

import it.restaurant.food.MenuItem;

public class Pasta extends MenuItem{

    public Pasta(String name, double price, MenuTypeEnum type, boolean isRecommended, String stringOfIngredients){
        super(name, price, type, isRecommended, stringOfIngredients);
    }

    @Override
    public String toString() {
        return getType()+ " First = " + this.getName() +" ingredients:"+ this.getStringOfIngredients()+ ", price : "+ this.getPrice() +" euros";
    }

    @Override
    public void printDetails() {
        System.out.println(getType()+", "+this.getName()+", "+this.getPrice()+" euros");
    }
}
