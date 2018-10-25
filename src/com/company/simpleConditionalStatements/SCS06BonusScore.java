package com.company.simpleConditionalStatements;

import java.util.Scanner;

public class SCS06BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if(num <= 100){
            bonus += 5;
        }else if (num > 100 && num <= 1000){
            bonus = num * 0.2;
        }else {
            bonus = num * 0.1;
        }

        if(num % 2 == 0){
            bonus += 1;
        }
        if(num % 10 == 5){
            bonus += 2;
        }
        double total = num +bonus;

        System.out.println(bonus);
        System.out.println(total);

    }
}
