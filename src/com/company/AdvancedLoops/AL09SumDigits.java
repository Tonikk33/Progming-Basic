package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL09SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String x[] = n.split("");
        int numbers[] = new int[x.length];

        int sum = 0;
        for (int i = 0; i < x.length ; i++) {
            numbers[i] = Integer.parseInt(x[i]);
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}
