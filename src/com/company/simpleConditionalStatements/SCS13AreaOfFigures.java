package com.company.simpleConditionalStatements;

import java.util.Scanner;

public class SCS13AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double a = Double.parseDouble(scanner.nextLine());

        if(figure.equalsIgnoreCase("square")){
            System.out.println(a * a);
        }else if (figure.equalsIgnoreCase("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b);
        }else if (figure.equalsIgnoreCase("circle")) {
            System.out.println(Math.PI * a * a);
        }else if (figure.equalsIgnoreCase("triangle")){
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println((a * b) / 2);}
    }
}
