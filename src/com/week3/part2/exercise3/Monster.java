package com.week3.part2.exercise3;

public class Monster extends Character implements Attacker {
    public Monster(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        super(name, healthPoints, energyPoints, positionX, positionY);
    }

    private int attack = 15;

    @Override
    public void attack(Character character) {

            if(character.getHealthPoints() <= 50 && character.getHealthPoints() >= 1){
                if(getEnergyPoints() >= 5 && getEnergyPoints() <=20) {
                    character.setHealthPoints(character.getHealthPoints() - attack);
                    setHealthPoints(getHealthPoints() - 5);
                    System.out.println("The character " + character.getName() + " has been attacked by " + getName() + " and now has " + character.getHealthPoints()
                            + " health points");
                    if(character.getHealthPoints() < 1){
                        System.out.println("The character " + character.getName() + " has died.");
                    }
                }

            }


    }

    public void getPosition(){
        System.out.println(getName() + "is at position X: " + getPositionX() + " and posiiton Y: " + getPositionY());
    }
}
