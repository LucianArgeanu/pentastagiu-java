package com.week3.part2.exercise2;

public class SmartRefrigerators implements Connectable {
    private String name;

    public SmartRefrigerators(String name) {
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
