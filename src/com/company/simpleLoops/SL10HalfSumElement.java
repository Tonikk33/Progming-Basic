package com.company.simpleLoops;

import java.util.Scanner;

public class SL10HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int del = 0;
        int min = 0;
        int diff;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if(num > del){
                del = num;
            }sum = sum +num;

        }if (sum == (del * 2)){
            System.out.println("Yes Sum = "+ del);
        }else if (sum != (del * 2)){
            min = Math.abs(sum - del);
            diff = Math.abs(min - del);

            System.out.println("No Diff = "+ diff);
        }

    }
}
