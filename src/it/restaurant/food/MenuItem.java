package it.restaurant.food;

public abstract class MenuItem{


    private String name;

    private double price;

    private final MenuTypeEnum type;

    private String stringOfIngredients;
    
    private boolean isRecommended;



    protected MenuItem(String name, double price, MenuTypeEnum type,boolean isRecommended, String stringOfIngredients){
        this.name =name;
        this.price =price;
        this.type = type;
        this.isRecommended = isRecommended;
        this.stringOfIngredients = stringOfIngredients;

    }

    public double getPrice (){
        return price;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public MenuTypeEnum getType (){
        return type;
    }

    public String getStringOfIngredients (){
        return stringOfIngredients;
    }

    public void setStringOfIngredients (String stringOfIngredients){
        this.stringOfIngredients = stringOfIngredients;
    }
    public void printDetails(){}

    public boolean isRecommended() {
        return isRecommended;
    }

    public void setRecommended(boolean recommended) {
        isRecommended = recommended;
    }
}

