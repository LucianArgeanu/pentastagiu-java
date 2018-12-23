package com.week3.part2.exercise1;

public class VegetarianRestaurant extends Restaurant {

    public VegetarianRestaurant(int numberOfGuest, double priceForMenu) {
        super(numberOfGuest, priceForMenu);
    }

    public void getTaxes() {
        System.out.println("The vegetarian restaurant has a total income of " + getIncome() + " and has to pay " + ((getIncome() * 0.2) - (0.3* (getIncome() * 0.2))) + " to the local authorities");
    }
}
