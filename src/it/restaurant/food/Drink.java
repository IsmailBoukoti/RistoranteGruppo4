package it.restaurant.food;


import java.util.List;

public class Drink extends MenuItem{


    public Drink(String name,double price,List<MenuTypeEnum> type,boolean isRecommended,String stringOfIngredients){
        super(name,price,type,isRecommended,stringOfIngredients);
    }

    @Override
    public String getDetails(){
        return super.getDetails();
    }
}
