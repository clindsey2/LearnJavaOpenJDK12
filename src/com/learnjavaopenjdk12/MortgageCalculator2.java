package com.learnjavaopenjdk12;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator2 {

    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;

    public MortgageCalculator2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Using the MortgageCalculator2 class");
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        /*
        System.out.print("Principal ($1K - $1M): ");
        while (principal <1000 || principal >1000000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
        } */
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        /*
        System.out.print("Annual Interest Rate (0.1 - 30): ");
        float annualInterest = scanner.nextFloat();
        while (annualInterest <= 0 || annualInterest > 30)  {
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Annual Interest Rate (0.1 - 30): ");
            annualInterest = scanner.nextFloat();
        }*/
        while (true)  {
            System.out.print("Annual Interest Rate (0.1 - 30): ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        /*
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        while (years <= 0 || years > 30){
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
        }
        numberOfPayments = years * MONTHS_IN_YEAR;
        */
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >0 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
