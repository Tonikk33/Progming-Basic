package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL12Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; ++i) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println(n3);
        }
    }
}

