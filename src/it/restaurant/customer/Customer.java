package it.restaurant.customer;


public class Customer {

    private CustomerTypeEnum type;
    private String name;
    private String surname;

    public Customer(String name, CustomerTypeEnum type){
        this.type = type;
        this.name = name;
    }

    public Customer(String name, String surname, CustomerTypeEnum type){
        this.type = type;
        this.name = name;
        this.surname = surname;
    }

public String getDetails(){if(surname != null){return name +" "+ surname +" "+ " (" + type+ ")";}else{return name+" "+ "(" + type + ")";}}



    public CustomerTypeEnum getType(){
        return type;
    }

    public void setType(CustomerTypeEnum type){
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

}
