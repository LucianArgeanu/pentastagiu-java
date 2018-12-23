package com.week3.part2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Car("Audi",300));
        list.add(new Phone("Iphone 7"));
        list.add(new SmartRefrigerators("Fridge"));
        list.add(new Student("Sandu",20));

       for(Object myList : list){
           if(myList instanceof Connectable){
              ((Connectable) myList).connectToBluetooth();
           }
       }
    }
}
