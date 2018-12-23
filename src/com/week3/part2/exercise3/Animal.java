package com.week3.part2.exercise3;

public class Animal extends Character {
    public Animal(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        super(name, healthPoints, energyPoints, positionX, positionY);
    }

    public void getPosition(){
        System.out.println(getName() + "is at position X: " + getPositionX() + " and posiiton Y: " + getPositionY());
    }

}
