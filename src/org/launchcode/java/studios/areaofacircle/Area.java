package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

        public static Double getArea(Double radius) {
            return Math.PI * radius * radius;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        Double radius = in.nextDouble();
        System.out.println(getArea(radius));


    }
}
