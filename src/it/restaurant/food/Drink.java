package it.restaurant.food;

public class Drink extends MenuItem{



    public Drink(String name, double price, MenuTypeEnum type, boolean isRecommended, String stringOfIngredients){
        super(name, price, type, isRecommended, stringOfIngredients);
    }

    @Override
    public String toString() {
        return getType() + " Drinks = " + this.getName() + " ingredients:"+ this.getStringOfIngredients()+ ", price : "+ this.getPrice() +" euros";
    }
    public void printDetails(){
        System.out.println(getType() + ", " + this.getName() +", price : "+ this.getPrice() +" euros");
    }
}
