package com.week3.part2.exercise1;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------- FAST FOOD RESTAURANT -----------------");
        Restaurant fastFood = new FastFoodRestaurant(5,30);
        ((FastFoodRestaurant) fastFood).getTaxes();
        fastFood.addNewGuest(5);
        ((FastFoodRestaurant) fastFood).getTaxes();
        System.out.println("-------------------- VEGETARIAN RESTAURANT -----------------");
        Restaurant vegetarian = new VegetarianRestaurant(5,30);
        ((VegetarianRestaurant) vegetarian).getTaxes();
        vegetarian.addNewGuest(5);
        ((VegetarianRestaurant) vegetarian).getTaxes();
    }
}
