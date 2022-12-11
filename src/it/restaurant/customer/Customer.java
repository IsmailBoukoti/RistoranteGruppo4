package it.restaurant.customer;

import it.restaurant.food.FixedMenu;
import it.restaurant.food.MenuItem;
import it.restaurant.food.MenuTypeEnum;

public class Customer {

    private CustomerCart cart;
    private MenuTypeEnum type;
    private String name;
    private String surname;
    private double fidelityPoints;

    public Customer(String name, MenuTypeEnum type){
        this.type = type;
        this.name = name;
    }

    public Customer(String name, String surname, MenuTypeEnum type, CustomerCart cart){
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.cart = cart;
    }

    public MenuTypeEnum getType(){
        return type;
    }

    public void setType(MenuTypeEnum type){
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

    public CustomerCart getCart() {
        return cart;
    }

    public void setCart(CustomerCart cart) {
        this.cart = cart;
    }

    public double getFidelityPoints() {
        return fidelityPoints;
    }

    public void setFidelityPoints(double fidelityPoints) {
        this.fidelityPoints = fidelityPoints;
    }

    public String getDetails(){if(surname != null){return name +" "+ surname +" "+ " (" + type+ ")";}else{return name+" "+ "(" + type + ")";}}

    public void orderMenuItem(MenuItem dish){
        getCart().getOrderList().add(dish);
    }

    public void removeMenuItem(MenuItem dish) {
        getCart().getOrderList().remove(dish);
    }

    public void orderFixedMenu(FixedMenu fixedMenu) {
        getCart().getOrderList().addAll(fixedMenu.getFixedMenuItemList());

    }

    public void addFidelityPoints(Integer integer) {
        this.fidelityPoints += integer;
    }

    public void applyDiscount() {
        if (this.fidelityPoints >= 50) {
            getCart().setCartTotalPrice(getCart().getCartTotalPrice() - (getCart().getCartTotalPrice() / 100 * 20));
            this.fidelityPoints = fidelityPoints - 50;
            System.out.println("The 20% discount has been applied using 50 fidelity points");
        } else {
            System.out.println("You need " + (50 - fidelityPoints) + " more fidelity point to be eligible for a discount");
        }
    }

    public void earnFidelityPoints() {
        double earnedFidelityPoints = 0;
        if (getCart().getCartTotalPrice() >= 10) {
            earnedFidelityPoints += (getCart().getCartTotalPrice() / 2);
            this.fidelityPoints += earnedFidelityPoints;
        }
    }

    public void printBill() {
        getCart().calculateTotalPrice(this);
        earnFidelityPoints();
        applyDiscount();
        System.out.printf("The total that you have to pay is : %.2f euros. \n ", this.getCart().getCartTotalPrice());
    }
}

