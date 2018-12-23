package com.week3.part2.exercise3;

public class Character {
    private String name;
    private int healthPoints;
    private int energyPoints;
    private int positionX;
    private int positionY;

    public Character() {
    }

    public Character(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getDistance(){
        return getPositionX() + getPositionY();
    }

}
