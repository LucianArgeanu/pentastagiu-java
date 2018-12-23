package com.week3.part2.exercise3;

public class Main {
    public static void main(String[] args) {
       Character human = new Human("Human",50,20,3,7);
       Character monster = new Monster("Monster",50,20,3,5);
       ((Monster) monster).attack(human);
       ((Monster) monster).attack(human);
        ((Monster) monster).attack(human);
        ((Monster) monster).attack(human);
    }
}
