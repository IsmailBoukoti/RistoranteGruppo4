package it.restaurant.food;

public class Pasta extends MenuItem{

    public Pasta(String name, double price, MenuTypeEnum type1, boolean isRecommended, String stringOfIngredients){
        super(name,price,type1,isRecommended,stringOfIngredients);
    }

    public Pasta(String name, double price, MenuTypeEnum type1, MenuTypeEnum type2, boolean isRecommended, String stringOfIngredients){
        super(name,price,type1,type2,isRecommended,stringOfIngredients);
    }

    @Override
    public String printDetails(){
        return super.printDetails();
    }
}
