package com.company.simpleConditionalStatements;

import java.util.Scanner;

public class SCS08MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = 1;
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;

        double result = 0;

        double input = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if(first.equalsIgnoreCase("mm")){
            result = input / mm;
        }else if (first.equalsIgnoreCase("cm")){
            result = input / cm;
        }else if (first.equalsIgnoreCase("mi")){
            result = input / mi;
        }else if (first.equalsIgnoreCase("in")){
            result = input / in;
        }else if (first.equalsIgnoreCase("km")){
            result = input / km;
        }else if (first.equalsIgnoreCase("ft")){
            result = input / ft;
        }else if (first.equalsIgnoreCase("yd")){
            result = input / yd;
        }else if (first.equalsIgnoreCase("m")){
            result = input / m;
        }

        if(second.equalsIgnoreCase("mm")){
            result *= mm;
        }else if (second.equalsIgnoreCase("cm")){
            result *= cm;
        }else if (second.equalsIgnoreCase("mi")){
            result *= mi;
        }else if (second.equalsIgnoreCase("in")){
            result *= in;
        }else if (second.equalsIgnoreCase("km")){
            result *= km;
        }else if (second.equalsIgnoreCase("ft")){
            result *= ft;
        }else if (second.equalsIgnoreCase("yd")){
            result *= yd;
        }else if (second.equalsIgnoreCase("m")){
            result *= m;
        }


        System.out.println(result + " " + second);


    }
}
