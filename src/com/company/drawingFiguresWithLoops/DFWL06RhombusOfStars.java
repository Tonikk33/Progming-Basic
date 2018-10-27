package com.company.drawingFiguresWithLoops;

import java.util.Scanner;

public class DFWL06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++)
        {
            for (int col = 1; col < n-row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row = n - 2 ; row >= 0 ; row--) {

            for (int col = 1; col < n-row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < row; col++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
