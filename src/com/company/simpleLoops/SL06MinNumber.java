package com.company.simpleLoops;

import java.util.Scanner;

public class SL06MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (min > a){
                min = a;
            }else if (min == 0 && a != 0 ){
                min = a;
            }



        }System.out.println(min);
    }
}
