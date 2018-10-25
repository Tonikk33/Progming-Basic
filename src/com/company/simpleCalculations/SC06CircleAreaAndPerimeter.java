package com.company.simpleCalculations;

import java.util.Scanner;

public class SC06CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input =  Double.parseDouble(scanner.nextLine());

        double area = Math.PI * input * input;
        double perimeter = 2 * Math.PI * input;

        System.out.printf("Area = %f",area);
        System.out.println();
        System.out.printf("Perimeter = %f", perimeter);

    }
}
