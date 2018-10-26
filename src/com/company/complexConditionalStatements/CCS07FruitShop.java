package com.company.complexConditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class CCS07FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekEnd = {"Saturday", "Sunday"};
        String[] allFruit = {"banana", "apple", "orange", "grapefruit", "kiwi", "pineapple", "grapes"};

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double prize = 0;

        boolean containsWeekDay = Arrays.stream(weekDay).anyMatch(day::equals);
        boolean containsWeekEnd = Arrays.stream(weekEnd).anyMatch(day::equals);

        boolean containsFruit = Arrays.stream(allFruit).anyMatch(fruit::equals);

        if ((containsWeekDay || containsWeekEnd) && containsFruit) {
            if (containsWeekDay) {
                switch (fruit) {
                    case "banana":
                        prize = quantity * 2.5;
                        break;
                    case "apple":
                        prize = quantity * 1.2;
                        break;
                    case "orange":
                        prize = quantity * 0.85;
                        break;
                    case "grapefruit":
                        prize = quantity * 1.45;
                        break;
                    case "kiwi":
                        prize = quantity * 2.7;
                        break;
                    case "pineapple":
                        prize = quantity * 5.5;
                        break;
                    case "grapes":
                        prize = quantity * 3.85;
                        break;
                }
            } else if (containsWeekEnd) {
                switch (fruit) {
                    case "banana":
                        prize = quantity * 2.7;
                        break;
                    case "apple":
                        prize = quantity * 1.25;
                        break;
                    case "orange":
                        prize = quantity * 0.9;
                        break;
                    case "grapefruit":
                        prize = quantity * 1.6;
                        break;
                    case "kiwi":
                        prize = quantity * 3;
                        break;
                    case "pineapple":
                        prize = quantity * 5.6;
                        break;
                    case "grapes":
                        prize = quantity * 4.2;
                        break;

                }

            }
            System.out.printf("%.2f", prize);
        } else {
            System.out.println("error");
        }



    }
}
