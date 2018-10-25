package com.company.simpleConditionalStatements;

import java.util.Scanner;

public class SCS14Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine())+ 15;

        if (min >= 60){
            hours += 1;
            min -= 60;
        }
        if (hours == 24) {
            if (min >= 10){
                System.out.println("0:" + min);}
            else if (min < 10){
                System.out.println("0:0" + min);}

        }else {
            if (min >= 10){
                System.out.println(hours + ":" + min);}
            else if (min < 10){
                System.out.println(hours + ":0" + min);}
        }

    }
}
