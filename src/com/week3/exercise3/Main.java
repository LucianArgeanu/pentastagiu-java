package com.week3.exercise3;

import static com.week3.exercise3.Customer.membership.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alex", NONE);
        Product candy = new Candy(1, "Lolipop", 2.5, 2);
        Product book = new Book(1, "Game of Thrones", 5.5, "George R. Martin");

        Basket basket = new Basket(customer, 0);
        basket.addProduct(candy);
        basket.addProduct(book);
        basket.getTotalPrice();




//        basket.changeCustomerMembership(NONE);
        customer.setMembership(GOLD);
        System.out.println("Customer: " + customer.getMembership());
        basket.getTotalPrice();

    }
}
