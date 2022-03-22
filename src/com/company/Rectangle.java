package com.company;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        setSideA(sideA);
        setSideB(sideB);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0) {
            System.out.println("Wrong input!");
        } else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            System.out.println("Wrong input!");
        } else {
            this.sideB = sideB;
        }
    }



    public int getPerimeter() {
        return (this.sideA + this.sideB) * 2;
    }

    public int getArea() {
        return this.sideA * this.sideB;
    }
}
