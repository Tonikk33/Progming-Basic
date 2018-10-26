package com.company.simpleLoops;

import java.util.Scanner;

public class SL07LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        for (int i = 0; i <n ; i++) {
            leftSum = leftSum + Integer.parseInt(scanner.nextLine());
        }
        int rightSum = 0;
        for (int i = 0; i <n ; i++) {
            rightSum = rightSum + Integer.parseInt(scanner.nextLine());
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else{
            System.out.printf("No,diff = %d",Math.abs(rightSum - leftSum));
        }
    }
}
