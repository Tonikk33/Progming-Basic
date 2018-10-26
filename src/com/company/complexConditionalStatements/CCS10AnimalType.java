package com.company.complexConditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class CCS10AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        String[] reptiles = {"crocodile", "tortoise", "snake"};

        boolean containsReptile = Arrays.stream(reptiles).anyMatch(animal::equals);


        if(animal.equalsIgnoreCase("dog")){
            System.out.println("mammal");
        }else if(containsReptile){
            System.out.println("reptile");
        }else {
            System.out.println("unknown");
        }

    }
}
