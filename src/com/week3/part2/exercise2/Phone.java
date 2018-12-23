package com.week3.part2.exercise2;

public class Phone implements Connectable {
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress... " + getName());
    }
}
