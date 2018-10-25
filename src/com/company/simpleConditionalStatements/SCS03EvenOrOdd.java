package com.company.simpleConditionalStatements;

import java.util.Scanner;

public class SCS03EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        if(input % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
