package com.week3.exercise3;

public class Customer {
    public enum membership {GOLD, SILVER, NONE}

    private int id;
    private String name;
    public membership membership;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer.membership getMembership() {
        return membership;
    }

    public void setMembership(Customer.membership membership) {
        this.membership = membership;
    }

    public Customer(int id, String name, Customer.membership membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }
}
