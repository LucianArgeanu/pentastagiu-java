package com.week3.part2.exercise1;

public class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant(int numberOfGuest, double priceForMenu) {
        super(numberOfGuest, priceForMenu);
    }

    public void getTaxes() {
        System.out.println("The fast food restaurant has a total income of " + getIncome() + " and has to pay " + (getIncome() * 0.2) + " to the local authorities");
    }
}
