package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class HomeworkCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(ThreadLocalRandom.current().nextInt(1, 10 + 1));
        }

        System.out.println("The biggest area of circle in array is: " + getTheBiggestArea(circles));

    }

    static double getTheBiggestArea(Circle[] circles) {
        double result = 0;
        for (int i = 0; i < circles.length; i++) {
            double tempArea = circles[i].getArea();
            if (result < tempArea) {
                result = tempArea;
            }
        }
        return result;
    }
}
