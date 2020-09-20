package org.launchcode.java.exercises;


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle.");
        int rectangleLength = input.nextInt();
        System.out.println("Enter the width of the rectangle.");
        int rectangleWidth = input.nextInt();
        System.out.println("The area of the rectangle is " + (rectangleLength * rectangleWidth));

    }
}
