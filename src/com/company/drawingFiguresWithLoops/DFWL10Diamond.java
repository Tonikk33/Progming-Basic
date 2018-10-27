package com.company.drawingFiguresWithLoops;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DFWL10Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftRight = (n - 1) / 2;

        for (int i = 1; i <= (n - 1) / 2; i++) {

            System.out.print(Collections.nCopies(leftRight, "-").stream().collect(Collectors.joining("")));

            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print(Collections.nCopies(mid, "-").stream().collect(Collectors.joining("")));
                System.out.print("*");
            }
            System.out.println(Collections.nCopies(leftRight, "-").stream().collect(Collectors.joining("")));
            leftRight--;
        }

        for (int i = 0; i <= (n - 1) / 2; i++) {

            System.out.print(Collections.nCopies(leftRight, "-").stream().collect(Collectors.joining("")));

            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print(Collections.nCopies(mid, "-").stream().collect(Collectors.joining("")));
                System.out.print("*");
            }
            System.out.println(Collections.nCopies(leftRight, "-").stream().collect(Collectors.joining("")));
            leftRight++;
        }
    }
}
