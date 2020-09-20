package org.launchcode.java.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double numberOfMilesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gallonsOfGas = input.nextDouble();
        System.out.println("The miles driven per gallon is " + (numberOfMilesDriven/gallonsOfGas));

    }
}
