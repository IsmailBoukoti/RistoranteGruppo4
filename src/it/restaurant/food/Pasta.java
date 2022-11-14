package it.restaurant.food;

public class Pasta extends MenuItem{

    public Pasta(String name, double price, MenuTypeEnum type, boolean isRecommended, String stringOfIngredients){
        super(name, price, type, isRecommended, stringOfIngredients);
    }



    @Override
    public void printDetails() {
        System.out.println(getType()+", "+this.getName()+", "+this.getPrice()+" euros");
    }
}
