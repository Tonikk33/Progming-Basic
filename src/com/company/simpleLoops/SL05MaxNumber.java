package com.company.simpleLoops;

import java.util.Scanner;

public class SL05MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = Integer.parseInt(scanner.nextLine());

            if (max < sum){
                max = sum;
            }else if (sum < 0 && max == 0)
                max = sum;

        }
        System.out.println(max);
    }
}
