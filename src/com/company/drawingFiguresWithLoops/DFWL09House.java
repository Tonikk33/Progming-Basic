package com.company.drawingFiguresWithLoops;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DFWL09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int stars = 1;

        if (n % 2 == 0) stars++;

        for (int i = 0; i < (n + 1) / 2; i++) {

            int padding = (n - stars) / 2;
            System.out.print(Collections.nCopies(padding, "-").stream().collect(Collectors.joining("")));
            System.out.print(Collections.nCopies(stars, "*").stream().collect(Collectors.joining("")));
            System.out.println(Collections.nCopies(padding, "-").stream().collect(Collectors.joining("")));

            stars = stars + 2;

        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <= n - 1; j++) {

                if (j == 0 || j == n - 1 ) {
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
