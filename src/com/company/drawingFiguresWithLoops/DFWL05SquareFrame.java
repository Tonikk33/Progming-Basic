package com.company.drawingFiguresWithLoops;

import java.util.Scanner;

public class DFWL05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= n; column++) {
                if((row == 1 && column == 1)
                        || (row == n && column == n
                        ||(row == 1 && column == n
                        ||(row == n && column == 1)))){
                    System.out.print("+ ");
                }else if(column == 1 || column == n){
                    System.out.print("| ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();

        }
    }
}
