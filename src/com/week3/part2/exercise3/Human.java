package com.week3.part2.exercise3;

public class Human extends Character implements Attacker {
    public Human(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        super(name, healthPoints, energyPoints, positionX, positionY);
    }

    @Override
    public void attack(Character character) {

    }

    public void getPosition(){
        System.out.println(getName() + "is at position X: " + getPositionX() + " and posiiton Y: " + getPositionY());
    }
}
