package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL03PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int x = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(x);
            x *= 2;
        }

    }
}
