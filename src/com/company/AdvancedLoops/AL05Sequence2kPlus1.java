package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL05Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());

        int x = 1;
        while (n >= x){
            System.out.println(x);
            x = (x * 2) + 1;
        }
    }
}
