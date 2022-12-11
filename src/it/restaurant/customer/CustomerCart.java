package it.restaurant.customer;

import it.restaurant.food.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerCart {

    private String cartId;
    private double cartTotalPrice;

    private List<MenuItem> orderList = new ArrayList<>();

    public CustomerCart(List<MenuItem> orderList, String cartId) {
        this.orderList = orderList;
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public List<MenuItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<MenuItem> orderList) {
        this.orderList = orderList;
    }
    public double getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }


    public String getCartDetails(){
        return cartId + ": " + orderList.stream().map(menuItem -> menuItem.getDetails()).collect(Collectors.joining(", "));
    }

    public void printCartDetails() {
        if (orderList.isEmpty()) {
            System.out.println("\nYour cart is empty, order something!");
        } else {
            System.out.println("\nDear customer, this is your cart n." + getCartDetails());
        }
    }

    public void calculateTotalPrice(Customer customer) {
        double sum = 0;
        for (MenuItem menuitem : customer.getCart().getOrderList()) {
            sum += menuitem.getPrice();
            customer.getCart().setCartTotalPrice(sum);
        }
    }
}

