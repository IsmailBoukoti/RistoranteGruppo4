package it.restaurant.food;

import it.restaurant.customer.CustomerTypeEnum;

public abstract class MenuItem{


    private String name;

    private double price;

    private CustomerTypeEnum type1;
    private CustomerTypeEnum type2;
    private boolean isRecommended;
    private String stringOfIngredients;


    public MenuItem(String name,double price,CustomerTypeEnum type1,boolean isRecommended,String stringOfIngredients){
        this.name = name;
        this.price = price;
        this.type1 = type1;
        this.isRecommended = isRecommended;
        this.stringOfIngredients = stringOfIngredients;
    }

    public MenuItem(String name,double price,CustomerTypeEnum type1,CustomerTypeEnum type2,boolean isRecommended,String stringOfIngredients){
        this.name = name;
        this.price = price;
        this.type1 = type1;
        this.type2 = type2;
        this.isRecommended = isRecommended;
        this.stringOfIngredients = stringOfIngredients;
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

    public CustomerTypeEnum getType1(){
        return type1;
    }

    public void setType1(CustomerTypeEnum type1){
        this.type1 = type1;
    }

    public CustomerTypeEnum getType2(){
        return type2;
    }

    public void setType2(CustomerTypeEnum type2){
        this.type2 = type2;
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

    public String printDetails(){
        return name+" price: "+price+" euro for: "+type1+" Ingredients: "+stringOfIngredients;
    }
}

