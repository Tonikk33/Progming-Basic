package com.company.FirstStepsInCoding;

import java.util.Scanner;

public class FSC05RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println(first * second);
    }
}
