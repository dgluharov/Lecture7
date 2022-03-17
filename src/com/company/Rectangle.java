package com.company;

public class Rectangle {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int calculatePerimeter(){
        return (this.sideA + this.sideB) * 2;
    }

    public int calculateArea(){
        return this.sideA * this.sideB;
    }
}
