package com.company.complexConditionalStatements;

import java.util.Scanner;

public class CCS05InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 201 && number > 99 || number == 0){

        }else {
            System.out.println("invalid");
        }
    }
}
