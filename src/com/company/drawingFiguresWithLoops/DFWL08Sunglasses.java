package com.company.drawingFiguresWithLoops;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DFWL08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.print(Collections.nCopies(2 * n, "*").stream().collect(Collectors.joining("")));

        System.out.print(Collections.nCopies(n , " ").stream().collect(Collectors.joining("")));

        System.out.println(Collections.nCopies(2 * n, "*").stream().collect(Collectors.joining("")));

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n * 2; j++) {
                if(j == 0 || j == n * 2 - 1){
                    System.out.print("*");
                }else {
                    System.out.print("/");
                }
            }
            if (i == (n - 1) / 2 - 1) {

                System.out.print(Collections.nCopies(n, "|").stream().collect(Collectors.joining("")));

            } else {

                System.out.print(Collections.nCopies(n, " ").stream().collect(Collectors.joining("")));

            }
            for (int j = 0; j < n * 2; j++) {
                if(j == 0 || j == n * 2 - 1){
                    System.out.print("*");
                }else {
                    System.out.print("/");
                }
            }

            System.out.println();
        }
        System.out.print(Collections.nCopies(2 * n, "*").stream().collect(Collectors.joining("")));

        System.out.print(Collections.nCopies(n , " ").stream().collect(Collectors.joining("")));

        System.out.println(Collections.nCopies(2 * n, "*").stream().collect(Collectors.joining("")));

    }
}
