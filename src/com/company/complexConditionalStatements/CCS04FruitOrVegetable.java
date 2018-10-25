package com.company.complexConditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class CCS04FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] vegi = {"tomato","cucumber","pepper","carrot"};

        String[] fruit = {"banana","apple","kiwi","cherry","lemon","grapes"};

        String input = scanner.nextLine();

        boolean containsVegi = Arrays.stream(vegi).anyMatch(input::equals);

        boolean containsFruit = Arrays.stream(fruit).anyMatch(input::equals);

        if(containsFruit){
            System.out.println("fruit");
        }else if (containsVegi){
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }

    }
}
