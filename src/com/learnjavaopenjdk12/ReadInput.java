package com.learnjavaopenjdk12;

import java.util.Scanner;

public class ReadInput {
    public ReadInput() {
        // reading input of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Using the ReadInput class");
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are: " + age + "\n");

        // reading input of a string
        System.out.print("First Name: ");

        String name = scanner.next();
        //String name = scanner.nextLine();

        // Including the trim method to remove white spaces
        //String name2 = scanner.nextLine().trim();
        System.out.println("Your name is: " + name);
    }
}
