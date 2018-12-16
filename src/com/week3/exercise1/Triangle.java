package com.week3.exercise1;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int largestSide;
    private int heignt;

    public Triangle(int firstSide, int secondSide, int largestSide, int heignt) {
        if(largestSide > firstSide && largestSide > secondSide) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.largestSide = largestSide;
            this.heignt = heignt;
        }
    }

    public double getPerimeter() {
        return (firstSide + secondSide + largestSide);
    }

    public double getArea(){
        return (largestSide * heignt) / 2;
    }
}
