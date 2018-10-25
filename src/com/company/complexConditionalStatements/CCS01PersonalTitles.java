package com.company.complexConditionalStatements;

import java.util.Scanner;

public class CCS01PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if(age >= 16 && gender.equalsIgnoreCase("m")){
            System.out.println("Mr.");
        }else if(age < 16 && gender.equalsIgnoreCase("m")){
            System.out.println("Master");
        }else if(age >= 16 && gender.equalsIgnoreCase("f")){
            System.out.printf("Ms.");
        }else if(age < 16 && gender.equalsIgnoreCase("f")){
            System.out.println("Miss");
        }
    }

}
