package com.company.simpleLoops;

import java.util.Scanner;

public class SL08OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < x; i++) {
            if ( i %2 == 0){

                int odd = Integer.parseInt(scanner.nextLine());
                oddSum = oddSum +odd;
            }else if (i%2 != 0){

                int even = Integer.parseInt(scanner.nextLine());
                evenSum = evenSum + even;
            }

        }if (oddSum == evenSum){
            System.out.println("Yes sum = "+oddSum);
        }else{
            int l = Math.abs(oddSum -  evenSum);
            System.out.println("No diff = "+l);
        }


    }
}
