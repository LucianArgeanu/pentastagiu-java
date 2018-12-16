package com.week3.exercise3;

import static com.week3.exercise3.Customer.membership.*;

public class Basket {
    private Customer customer;
    private double totalPrice;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getInitialPrice() {
        return totalPrice;
    }

    public void getTotalPrice() {
        double total = totalPrice;
        if(customer.getMembership().toString().equals("SILVER")){
            total -= (getInitialPrice() * 0.1);
            System.out.println("The customer " + customer.getName() + " has SILVER membership and has to pay a total of : " + total);
        }else if(customer.getMembership().toString().equals("GOLD")){
            total -= (getInitialPrice() * 0.2);
            System.out.println("The customer " + customer.getName() + " has GOLD membership and has to pay a total of : " + total);
        }else if(customer.getMembership().toString().equals("NONE")){
            total = getInitialPrice();
            System.out.println("The customer " + customer.getName() + " has NO membership and has to pay a total of : " + total);
        }
    }

    public Basket(Customer customer, double totalPrice) {
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public void addProduct(Product product) {
        if (product instanceof Candy) {
            totalPrice += (product.getPrice() * ((Candy) product).getQuantity());
        } else {
            totalPrice += product.getPrice();
        }
    }

    public void changeCustomerMembership(Customer.membership membership) {
        customer.setMembership(membership);
    }


}
