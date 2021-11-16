package com.learnjavaopenjdk12;

import javax.swing.*;

public class ControlFlow {
    public ControlFlow() {
        System.out.println("Using the ControlFlow class");
        // Comparison Operators
        int x = 1;
        int y = 1;
        System.out.printf("Is x:%s equal to y:%s ? %b\n", x, y,  x == y);
        // other comparison operators : !=, >, <. >=, and <=

        // logical operators
        // logical AND --> &&
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.printf("Is the temperature:%s in Celsius warm? %b\n", temperature, isWarm);

        // logical OR --> ||
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && ! hasCriminalRecord;
        System.out.printf("Does the person hasHighIncome:%s or hasGoodCredit:%s and NOT hasCriminalRecord:%s ? %b\n",
                hasHighIncome, hasGoodCredit, hasCriminalRecord, isEligible);

        // if statements
        int temp = 18;
        if (temp > 30) {
            System.out.printf("IF temp:%s > 30; THEN: %b, It is a hot day\n", temp, temp > 30);
            System.out.println("Be sure to drink water");
        }
        else if (temp >20)
            System.out.printf("IF temp:%s >20 AND temp:%s <30; THEN %b, It is a beautiful day\n",
                    temp, temp, temp>20 && temp<30);
        else
            System.out.println("It is a cold day");
    }
}
