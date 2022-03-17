package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);

        System.out.println("The perimeter of rectangle is: " + rectangle.calculatePerimeter());
        System.out.println("The area of rectangle is: " + rectangle.calculateArea());

    }
}
