package com.company.simpleCalculations;

import java.util.Scanner;

public class SC01SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());

        System.out.println(a * a);
    }
}
