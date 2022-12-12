package it.restaurant.food;

import java.util.List;

public class MenuItem{


    private String name;

    private double price;

    private List<MenuTypeEnum> type;
    private boolean isRecommended;
    private String stringOfIngredients;
    private boolean dishOfTheDay;

    public MenuItem(String name,double price,List<MenuTypeEnum> type,boolean isRecommended,String stringOfIngredients, boolean dishOfTheDay){
        this.name = name;
        this.price = price;
        this.type = type;
        this.isRecommended = isRecommended;
        this.stringOfIngredients = stringOfIngredients;
        this.dishOfTheDay = dishOfTheDay;
    }

    public boolean isDishOfTheDay(){return dishOfTheDay;}

    public void setDishOfTheDay(boolean dishOfTheDay) {
        this.dishOfTheDay = dishOfTheDay;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public List<MenuTypeEnum> getType(){
        return type;
    }

    public void setType(List<MenuTypeEnum> type){
        this.type = type;
    }

    public String getStringOfIngredients(){
        return stringOfIngredients;
    }

    public void setStringOfIngredients(String stringOfIngredients){
        this.stringOfIngredients = stringOfIngredients;
    }

    public boolean isRecommended(){
        return isRecommended;
    }

    public void setRecommended(boolean recommended){
        isRecommended = recommended;
    }

    public String getDetails(){
        return name+" price: "+price+" euro for: "+type+" Ingredients: "+stringOfIngredients;
    }
}

