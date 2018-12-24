package com.week3.part2.exercise3;

public class Human extends Character implements Attacker {
    private int attack = 10;
    public Human(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        super(name, healthPoints, energyPoints, positionX, positionY);
    }

    @Override
    public void attack(Character character) {

        if(((character.getPositionX() - getPositionX() <=5 && character.getPositionX() - getPositionX() >= 0) ||
                (getPositionX() - character.getPositionX() <=5 && getPositionX() - character.getPositionX() >= 0)) &&
                ((character.getPositionY() - getPositionY() <=5 && character.getPositionY() - getPositionY() >= 0) ||
                        (getPositionY() - character.getPositionY() <=5 && getPositionY() - character.getPositionY() >= 0))) {

            if (character.getHealthPoints() <= 50 && character.getHealthPoints() >= 1 && getEnergyPoints() >= 3) {
                if (getEnergyPoints() >= 3 && getEnergyPoints() <= 20) {
                    character.setHealthPoints(character.getHealthPoints() - attack);
                    setEnergyPoints(getEnergyPoints() - 5);

                    System.out.println("The character " + character.getName() + " has been attacked by " + getName() + " and now has " + character.getHealthPoints()
                            + " health points");
                    if (character.getHealthPoints() < 1) {
                        System.out.println("The character " + character.getName() + " has died.");
                    }
                }

            } else {
                System.out.println(getName() + " doesn't have enough energy points(" + getEnergyPoints() + ") to attack " + character.getName());
            }
        }else{
            System.out.println(getName() + " is to far from " + character.getName() + " to attack.");
        }

    }

    public void getPosition(){
        System.out.println(getName() + " is at position X:" + getPositionX() + " and posiiton Y:" + getPositionY());
    }

    public void getArtifact(Artifact artifact){
        if(artifact instanceof EnergyArtifact){
            setEnergyPoints(getEnergyPoints() + 10);
            System.out.println(getName() + " used energy artifact and now has " + getEnergyPoints() + " energy points");
        }else{
            setHealthPoints(getHealthPoints() + 10);
            System.out.println(getName() + " used health artifact and now has " + getHealthPoints() + " health points");
        }
    }
}
