package com.company.complexConditionalStatements;

import java.util.Scanner;

public class CCS02SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double prize = 0;


        if(city.equalsIgnoreCase("Sofia")){
            if(product.equalsIgnoreCase("coffee")){
                prize = 0.5;

            }else if(product.equalsIgnoreCase("water")){
                prize = 0.8;

            }else if(product.equalsIgnoreCase("beer")){
                prize = 1.2;

            }else if(product.equalsIgnoreCase("sweets")){
                prize = 1.45;

            }else if(product.equalsIgnoreCase("peanuts")){
                prize = 1.6;
            }

        }else if(city.equalsIgnoreCase("Plovdiv")){
            if(product.equalsIgnoreCase("coffee")){
                prize = 0.4;

            }else if(product.equalsIgnoreCase("water")){
                prize = 0.7;

            }else if(product.equalsIgnoreCase("beer")){
                prize = 1.15;

            }else if(product.equalsIgnoreCase("sweets")){
                prize = 1.30;

            }else if(product.equalsIgnoreCase("peanuts")){
                prize = 1.5;
            }

        }else if(city.equalsIgnoreCase("Varna")){

            if(product.equalsIgnoreCase("coffee")){
                prize = 0.45;

            }else if(product.equalsIgnoreCase("water")){
                prize = 0.7;

            }else if(product.equalsIgnoreCase("beer")){
                prize = 1.1;

            }else if(product.equalsIgnoreCase("sweets")){
                prize = 1.35;

            }else if(product.equalsIgnoreCase("peanuts")){
                prize = 1.55;
            }
        }
        System.out.println(prize * quantity);

    }
}
