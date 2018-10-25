package com.company.simpleCalculations;

import java.util.Scanner;

public class SC10RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double deg = Math.round((rad * 180) / Math.PI);
        int result = (int)deg;

        System.out.println(result);
    }
}
