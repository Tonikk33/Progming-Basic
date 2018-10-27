package com.company.drawingFiguresWithLoops;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DFWL07ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {

            String stars = Collections.nCopies(i, "*").stream().collect(Collectors.joining(""));


                String spaces = Collections.nCopies(n - i, " ").stream().collect(Collectors.joining(""));


            System.out.print(spaces);

            System.out.print(stars);

            System.out.print(" | ");

            System.out.print(stars);

            System.out.println(spaces);
        }
    }
}
