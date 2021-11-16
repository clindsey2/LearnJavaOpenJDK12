package com.learnjavaopenjdk12;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;

    public MortgageCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Using the MortgageCalculator class");
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
