package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n ;
        while (true) {
            String number = scanner.nextLine();
            try {
                n = Integer.parseInt(number);

                if (n % 2 == 0) {
                    System.out.printf("Even number entered: %s", number);
                    break;
                } else if (n % 2 != 0) {
                    System.out.println("The number is not even.");

                }
            } catch (NumberFormatException exception) {
                System.out.println("Invalid number!");
            }
        }
    }
}
