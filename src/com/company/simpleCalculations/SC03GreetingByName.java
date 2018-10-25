package com.company.simpleCalculations;

import java.util.Scanner;

public class SC03GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, "+ name +"!");
    }
}
