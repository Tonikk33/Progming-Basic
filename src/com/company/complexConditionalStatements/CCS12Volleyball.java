package com.company.complexConditionalStatements;

import java.util.Scanner;

public class CCS12Volleyball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double weekendsAtSofia = 48 - h;
        double total;
        double holidays = p * 2.0 / 3;
        double playDays = weekendsAtSofia * 3.0 / 4;
        double all;
        double fix = 0;


        if (year.equalsIgnoreCase("leap")) {
            total = (playDays + holidays + h) * 0.15;
            all = (playDays + holidays + h + total);
            fix = Math.floor(all);


        } else if (year.equalsIgnoreCase("normal")) {
            total = (playDays + holidays + h);
            fix = Math.floor(total);

        }
        System.out.println(fix);
    }
}
