package com.company.complexConditionalStatements;

import java.util.Scanner;

public class CCS11Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double prize = 0;

        if (type.equalsIgnoreCase("Premiere")) {
            prize = 12.00 * r * c;

        } else if (type.equalsIgnoreCase("Normal")) {
            prize = 7.50 * r * c;
        } else if (type.equalsIgnoreCase("Discount")) {
            prize = 5.00 * r * c;
        }
        System.out.printf("%.2f leva", prize);
    }
}
