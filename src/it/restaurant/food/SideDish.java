package it.restaurant.food;


public class SideDish extends MenuItem{

    public SideDish(String name, double price, MenuTypeEnum menuTypeEnum, boolean isRecommended, String stringOfIngredients){
        super(name,price,menuTypeEnum,isRecommended,stringOfIngredients);
    }

    @Override
    public String printDetails(){
        return super.printDetails();
    }
}
