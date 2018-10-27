package com.company.AdvancedLoops;

import java.util.Scanner;

public class AL06NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int n = Integer.parseInt(scanner.nextLine());

            if(n > 0 && n <= 100){
                System.out.printf("The number is %d", n);
                break;
            }else {
                System.out.println("Еnter a number in the range [1...100]:\n" +
                        "Invalid number!");
            }
        }
    }
}
