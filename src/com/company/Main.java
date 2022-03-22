package com.company;


public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println("The perimeter of circle is: " + circle.getPerimeter());
        System.out.println("The area of circle is: " + circle.getArea());

        Rectangle rectangle = new Rectangle(5, 2);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(3, 3);

        Rectangle[] arrayOfRect = {rectangle, rectangle1, rectangle2};

        for (int i = 0; i < arrayOfRect.length; i++) {
            System.out.println("The area of rectangle is: " + arrayOfRect[i].getArea());
        }

        System.out.println("The perimeter of rectangle is: " + rectangle.getPerimeter());
        System.out.println("The area of rectangle is: " + rectangle.getArea());


    }
}
