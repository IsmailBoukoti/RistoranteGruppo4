package it.restaurant.customer;

import it.restaurant.food.FixedMenu;
import it.restaurant.food.MenuItem;
import it.restaurant.food.MenuTypeEnum;

/**
 * The class Customer.
 */
public class Customer {

    private CustomerCart cart;
    private MenuTypeEnum type;
    private String name;
    private String surname;
    private double fidelityPoints;

    /**
     * Instantiates a new Customer.
     *
     * @param name the name
     * @param type the type
     */
    public Customer(String name, MenuTypeEnum type){
        this.type = type;
        this.name = name;
    }

    /**
     * Instantiates a new Customer.
     *
     * @param name    the name
     * @param surname the surname
     * @param type    the type
     * @param cart    the cart
     */
    public Customer(String name, String surname, MenuTypeEnum type, CustomerCart cart){
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.cart = cart;
    }

    /**
     * Get type menu type enum.
     *
     * @return the menu type enum
     */
    public MenuTypeEnum getType(){
        return type;
    }

    /**
     * Set type.
     *
     * @param type the type
     */
    public void setType(MenuTypeEnum type){
        this.type = type;
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get surname string.
     *
     * @return the string
     */
    public String getSurname(){
        return surname;
    }

    /**
     * Set surname.
     *
     * @param surname the surname
     */
    public void setSurname(String surname){
        this.surname = surname;
    }

    /**
     * Gets cart.
     *
     * @return the cart
     */
    public CustomerCart getCart() {
        return cart;
    }

    /**
     * Sets cart.
     *
     * @param cart the cart
     */
    public void setCart(CustomerCart cart) {
        this.cart = cart;
    }

    /**
     * Gets fidelity points.
     *
     * @return the fidelity points
     */
    public double getFidelityPoints() {
        return fidelityPoints;
    }

    /**
     * Sets fidelity points.
     *
     * @param fidelityPoints the fidelity points
     */
    public void setFidelityPoints(double fidelityPoints) {
        this.fidelityPoints = fidelityPoints;
    }

    /**
     * Get details of the customer as string.
     *
     * @return the string
     */
    public String getDetails(){if(surname != null){return name +" "+ surname +" "+ " (" + type+ ")";}else{return name+" "+ "(" + type + ")";}}

    /**
     * Method that adds a dish to the order list.
     *
     * @param dish the dish
     */
    public void orderMenuItem(MenuItem dish){
        getCart().getOrderList().add(dish);
    }

    /**
     * Method that removes the specified dish from the order list.
     *
     * @param dish the dish
     */
    public void removeMenuItem(MenuItem dish) {
        getCart().getOrderList().remove(dish);
    }

    /**
     * Method that adds a fixed menu to the order list.
     *
     * @param fixedMenu the fixed menu
     */
    public void orderFixedMenu(FixedMenu fixedMenu) {
        getCart().getOrderList().addAll(fixedMenu.getFixedMenuItemList());

    }

    /**
     * Add fidelity points for testing purposes.
     *
     * @param integer the integer
     */
    public void addFidelityPoints(Integer integer) {
        this.fidelityPoints += integer;
    }

    /**
     * Method that checks the amount of fidelity points that the customer has .
     * If the customer has at least 50 points he receives a 20% discount
     * If the customer doesn't have enough points, a message shows how many points are left before being eligible for a discount
     */
    public void applyDiscount() {
        if (this.fidelityPoints >= 50) {
            getCart().setCartTotalPrice(getCart().getCartTotalPrice() - (getCart().getCartTotalPrice() / 100 * 20));
            this.fidelityPoints = fidelityPoints - 50;
            System.out.println("The 20% discount has been applied using 50 fidelity points");
        } else {
            System.out.println("You need " + (50 - fidelityPoints) + " more fidelity point to be eligible for a discount");
        }
    }

    /**
     * Method that gives points to the customer
     * The amount of earned points is half of the total price.
     * The total price has to be at least 10 euros.
     */
    public void earnFidelityPoints() {
        double earnedFidelityPoints = 0;
        if (getCart().getCartTotalPrice() >= 10) {
            earnedFidelityPoints += (getCart().getCartTotalPrice() / 2);
            this.fidelityPoints += earnedFidelityPoints;
        }
    }

    /**
     * Method that allows the customer to checkout.
     * It calculates the total price of the cart.
     * It calculates and adds the earned fidelity points to the customer.
     * It applies a 20% discount if the customer has at least 50 fidelity points.
     * Prints the total price of the cart.
     */
    public void checkout() {
        getCart().calculateTotalPrice(this);
        earnFidelityPoints();
        applyDiscount();
        System.out.printf("The total that you have to pay is : %.2f euros. \n ", this.getCart().getCartTotalPrice());
    }
}

