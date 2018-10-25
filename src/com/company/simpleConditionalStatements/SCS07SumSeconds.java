package com.company.simpleConditionalStatements;

import java.util.Scanner;

public class SCS07SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int totalSeconds = a + b + c;
        int minutes = 0;

        while (true){
            if(totalSeconds >= 60){
                minutes += 1;
                totalSeconds -= 60;
            }
            else{
                break;
            }
        }
        if (totalSeconds<10){
            System.out.println(minutes + ":0" + totalSeconds);
        }else{
            System.out.println(minutes + ":" + totalSeconds);
        }
    }
}
