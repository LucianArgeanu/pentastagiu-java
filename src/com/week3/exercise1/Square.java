package com.week3.exercise1;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }
}
