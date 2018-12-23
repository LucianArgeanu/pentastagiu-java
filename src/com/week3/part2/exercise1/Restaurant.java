package com.week3.part2.exercise1;

public class Restaurant {
    private int numberOfGuest;
    private double priceForMenu;
    private double income;

    public Restaurant(int numberOfGuest, double priceForMenu) {
        this.numberOfGuest = numberOfGuest;
        this.priceForMenu = priceForMenu;
    }

    public double getIncome() {
        return numberOfGuest * priceForMenu;
    }


    public void addNewGuest(int addGuests){
        this.numberOfGuest += addGuests;
        System.out.println(addGuests + " new guests have joined the restaurant.");
    }
}
