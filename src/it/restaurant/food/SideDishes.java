package it.restaurant.food;


public class SideDishes extends MenuItem{

    public SideDishes(String name, double price, MenuTypeEnum type, boolean isRecommended, String stringOfIngredients){
        super(name, price, type, isRecommended, stringOfIngredients);
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }
}
