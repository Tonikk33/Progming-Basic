package com.company.complexConditionalStatements;

import java.util.Scanner;

public class CCS08TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double commission = 0;

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());


        if(city.equalsIgnoreCase("sofia")) {
            if(sells >= 0 && sells <= 500) {
                commission = sells * 0.05;
            }else if(sells > 500 && sells <= 1000) {
                commission = sells * 0.07;
            }else if(sells > 1000 && sells <= 10000) {
                commission = sells * 0.08;
            }else{
                commission = sells * 0.12;
            }
            System.out.printf("%.2f", commission);
        }else if(city.equalsIgnoreCase("varna")) {
            if(sells >= 0 && sells <= 500) {
                commission = sells * 0.045;
            }else if(sells > 500 && sells <= 1000) {
                commission = sells * 0.075;
            }else if(sells > 1000 && sells <= 10000) {
                commission = sells * 0.10;
            }else if(sells > 10000) {
                commission = sells * 0.13;
            }
            System.out.printf("%.2f", commission);
        }else if(city.equalsIgnoreCase("plovdiv")) {
            if(sells >= 0 && sells <= 500) {
                commission = sells * 0.055;
            }else if(sells > 500 && sells <= 1000) {
                commission = sells * 0.08;
            }else if(sells > 1000 && sells <= 10000) {
                commission = sells * 0.12;
            }else if(sells > 10000) {
                commission = sells * 0.145;
            }else{
                System.out.println("error");
            }
            System.out.printf("%.2f", commission);

        }else{
            System.out.println("error");
        }


    }
}
