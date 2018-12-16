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

    public void getTotalPrice() {

        if (customer.getMembership().toString().equals("GOLD")) {
            totalPrice -= (totalPrice * 0.2);
            System.out.println(customer.getName() + " has " + customer.getMembership().toString()
                    + " membership and he has to pay :" + totalPrice);

        } else if (customer.getMembership().toString().equals("SILVER")) {
            totalPrice -= (totalPrice * 0.1);
            System.out.println(customer.getName() + " has " + customer.getMembership().toString()
                    + " membership and he has to pay :" + totalPrice);

        } else {
            if ((customer.getMembership().toString().equals("NONE"))) {
                System.out.println(customer.getName() + " has " + customer.getMembership().toString()
                        + " membership and he has to pay :" + totalPrice);
            }

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
