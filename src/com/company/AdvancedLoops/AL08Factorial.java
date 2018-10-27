package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL08Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int x = 1;
        for (int i = 1; i <= n ; i++) {
            x = x * i;
        }
        System.out.println(x);
    }
}
