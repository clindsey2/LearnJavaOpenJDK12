package com.learnjavaopenjdk12;

import java.util.Scanner;

public class FizzBuzz {
    public FizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Using the FizzBuzz class");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        // extensive if-else-if statement
        if (number %5 == 0 && number %3 == 0)
            System.out.println("FizzBuzz");
        else if (number %5 == 0)
            System.out.println("Fizz");
        // using a nested-if
        //if (number %5 == 0)  {
        //    if (number %3 == 0)
        //        System.out.println("FizzBuzz");
        //    else
        //        System.out.println("Fizz");
        //}
        else if (number %3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
