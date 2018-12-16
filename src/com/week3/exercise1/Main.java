package com.week3.exercise1;

public class Main {
    public static void main(String args[]) {
        Circle circle = new Circle(7.5);
        System.out.println("Perimeter of the Circle is : " + circle.getPerimeter());
        System.out.println("Area of the Circle is : " + circle.getArea());

        Square square = new Square(4);
        System.out.println("Perimeter of the Square is : " + square.getPerimeter());
        System.out.println("Area of the Square is : " + square.getArea());

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Perimeter of the Rectangle is : " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle is : " + rectangle.getArea());

        Triangle triangle = new Triangle(3,2,6,6);
        System.out.println("Perimeter of the Triangle is : " + triangle.getPerimeter());
        System.out.println("Area of the Triangle is : " + triangle.getArea());
    }


}
