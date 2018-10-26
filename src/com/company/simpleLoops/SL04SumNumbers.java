package com.company.simpleLoops;

import java.util.Scanner;

public class SL04SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;

        for (int i = 0; i < n ; i++) {
            int x = Integer.parseInt(scanner.nextLine());
            total += x;
        }
        System.out.println(total);
    }
}
