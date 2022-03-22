package com.company;

public class Circle {
    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Enter positive value");
        }
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
