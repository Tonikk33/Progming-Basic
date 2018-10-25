package com.company.simpleCalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SC13DaysAfterBirth1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String date = scanner.nextLine();

        LocalDate localDate = LocalDate.parse(date, formatter).plusDays(999);

        System.out.println(formatter.format(localDate));
    }
}
