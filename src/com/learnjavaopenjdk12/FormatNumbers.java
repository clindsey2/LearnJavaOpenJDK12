package com.learnjavaopenjdk12;

import java.text.NumberFormat;

public class FormatNumbers {
    public FormatNumbers() {
        System.out.println("Using the FormatNumbers class");
        // formatting numbers as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultCur = currency.format(1234567.891);
        System.out.printf("print currency result as a sting = %s\n", resultCur);

        // formatting numbers as a percent
        /* NumberFormat numPercent = NumberFormat.getPercentInstance();
        String resultPercent = numPercent.format(0.14); */
        // instead we will use method chaining
        String resultPercent = NumberFormat.getPercentInstance().format(0.14);
        System.out.printf("print percent number as a string = %s\n", resultPercent);
    }
}
