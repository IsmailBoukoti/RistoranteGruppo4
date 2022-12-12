package it.restaurant.customer;

import it.restaurant.food.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The class Customer cart.
 */
public class CustomerCart {

    private String cartId;
    private double cartTotalPrice;

    private List<MenuItem> orderList = new ArrayList<>();

    /**
     * Instantiates a new Customer cart.
     *
     * @param orderList the order list
     * @param cartId    the cart id
     */
    public CustomerCart(List<MenuItem> orderList, String cartId) {
        this.orderList = orderList;
        this.cartId = cartId;
    }

    /**
     * Gets cart id.
     *
     * @return the cart id
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * Sets cart id.
     *
     * @param cartId the cart id
     */
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    /**
     * Gets order list.
     *
     * @return the order list
     */
    public List<MenuItem> getOrderList() {
        return orderList;
    }

    /**
     * Sets order list.
     *
     * @param orderList the order list
     */
    public void setOrderList(List<MenuItem> orderList) {
        this.orderList = orderList;
    }

    /**
     * Gets cart total price.
     *
     * @return the cart total price
     */
    public double getCartTotalPrice() {
        return cartTotalPrice;
    }

    /**
     * Sets cart total price.
     *
     * @param cartTotalPrice the cart total price
     */
    public void setCartTotalPrice(double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }


    /**
     * Get cart details as string.
     *
     * @return the string
     */
    public String getCartDetails(){
        return cartId + ": " + orderList.stream().map(menuItem -> menuItem.getDetails()).collect(Collectors.joining(", "));
    }

    /**
     * Method that prints all the details of the cart if there are any dishes inside the cart.
     * If the cart is empty, a message will notice the customer about it.
     */
    public void printCartDetails() {
        if (orderList.isEmpty()) {
            System.out.println("\nYour cart is empty, order something!");
        } else {
            System.out.println("\nDear customer, this is your cart n." + getCartDetails());
        }
    }

    /**
     * Method that calculates the total prices of the dishes inside the customer cart.
     * Sums the price of each individual dish.
     *
     * @param customer the customer
     */
    public void calculateTotalPrice(Customer customer) {
        double sum = 0;
        for (MenuItem menuitem : customer.getCart().getOrderList()) {
            sum += menuitem.getPrice();
            customer.getCart().setCartTotalPrice(sum);
        }
    }
}

