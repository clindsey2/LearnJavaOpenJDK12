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

        // simplified if statements
        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000);
        System.out.printf("Has High Income:%s = income>100_000? %b\n", income, hasHighIncome2);

        // ternary operator
        String className = (income > 100_000) ? "First" : "Economy";
        System.out.println("Class of flight ticket = " + className);

        // switch-case statement with string
        String role = "admin";
        switch (role)  {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        // switch-case statement with int
        int iRole = 11;
        switch (iRole)  {
            case 1:
                System.out.println("You are an admin");
                break;
            case 11:
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }


    }
}
