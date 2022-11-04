package it.restaurant.food;

import it.restaurant.food.MenuItem;

public class SecondiPiatti extends MenuItem{


    public SecondiPiatti(String name, double price, MenuTypeEnum type, boolean isRecommended, String stringOfIngredients){
        super(name, price, type, isRecommended, stringOfIngredients);
    }

    @Override
    public String toString() {
        return getType() + " Seconds = " + this.getName() +" ingredients:"+ this.getStringOfIngredients()+ ", price : "+ this.getPrice() +" euros";
    }

    public void printDetails(){
        System.out.println(getType() + ", " + this.getName() +", price : "+ this.getPrice() +" euros");
    }
}
