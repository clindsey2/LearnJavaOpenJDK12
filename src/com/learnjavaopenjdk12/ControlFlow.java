package com.learnjavaopenjdk12;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

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

        // for loop - increment
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World --- i = " + i);

        // for loop - decrement
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World --- i = " + i);

        /*
        // while loop - increment - iterations with counter variable
        int i = 5;
        while (i > 0) {
            System.out.println("Hello World --- i = " + i);
            i--;
        }*/

        // do while loop -- it gets executed at least once
        // while loops are preferred
        /*
        String input2 = "";
        do {
            System.out.print("Input: ");
            input2 = scanner.next().toLowerCase();
            System.out.println(input2);
        } while (!input2.equals("quit"));
        */

        /*
        // while loop with input - end on quit
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        }
        */

        // while loop with break and continue statement - end on quit
        String input3 = "";
        Scanner scanner = new Scanner(System.in);
        //while (!input3.equals("quit")) {
        // since we have a break statement, we can use while true
        while (true) {
            System.out.print("Input: ");
            input3 = scanner.next().toLowerCase();
            if (input3.equals("pass"))
                continue;  // gives control to the beginning of the loop
            if (input3.equals("quit"))
                break;   // terminates the loop
            System.out.println(input3);
        }

        // foreach loops are - used to review arrays or collections
        String[] fruits = { "Apple", "Mango", "Orange"};

        // now using a for-each loop
        // for-each loops cannot reference the index and cannot be interated in decending order
        for (String fruit : fruits)
            System.out.printf("for-each loop: %s --", fruit);
        System.out.println();

        // for loop example - ascending order
        for (int i = 0; i <fruits.length; i++)
            System.out.printf("for loop: %s --",fruits[i]);
        System.out.println();

        // for loop example - descending order
        for (int j = fruits.length-1; j >=0; j--)
            System.out.printf("for loop: %s --",fruits[j]);
        System.out.println();

    }
}
