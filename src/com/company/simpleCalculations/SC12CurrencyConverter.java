package com.company.simpleCalculations;

import java.util.Scanner;

public class SC12CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;

        double sum = 0 ;
        double result = 0;

        double input = Double.parseDouble(scanner.nextLine());
        String in = scanner.nextLine();
        String out = scanner.nextLine();

        if(in.equalsIgnoreCase("bgn")){
            sum = input;
        }else if(in.equalsIgnoreCase("usd")){
            sum = input * usd;
        }else if(in.equalsIgnoreCase("gbp")){
            sum  = input * gbp;
        }else if(in.equalsIgnoreCase("eur")){
            sum = input * eur;
        }
        if(out.equalsIgnoreCase("bgn")){
            result = sum;
        }else if(out.equalsIgnoreCase("usd")){
            result = sum / usd;
        }else if(out.equalsIgnoreCase("gbp")){
            result = sum / gbp;
        }else if(out.equalsIgnoreCase("eur")){
            result = sum / eur;
        }

        System.out.printf("%.2f",result);

    }
}
