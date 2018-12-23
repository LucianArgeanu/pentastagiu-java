package com.week3.part2.exercise2;

public class Car implements Connectable{
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress... " + getName());
    }
}
