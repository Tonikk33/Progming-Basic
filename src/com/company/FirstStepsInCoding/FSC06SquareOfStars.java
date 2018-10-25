package com.company.FirstStepsInCoding;

import java.util.Scanner;

public class FSC06SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            }else if (i == num){
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 0; j <num ; j++) {
                    if(j == 0){
                        System.out.print("*");
                    }else if (j == num -1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
