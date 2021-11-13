package com.learnjavaopenjdk12;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        /* Primitive types */
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;    /*underscores make the number more readable & L indicates long*/
        float price = 10.99F;   /*the F tells java to store this as a float*/
        char letter = 'A';  /* wrap single character with single quote and multiple characters with double quotes*/
        boolean isEligible = false;   /*words in orange are reserved keywords*/
        System.out.println(myAge);


        /* Reference types*/
        Date now = new Date();
        System.out.println(now);

        /* reference types */
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1; /* point2 points to the memory location of point1 */
                               /* referencing to the same object */
        point1.x = 2;
        System.out.println(point2);

        /* Strings */
        /* Since strings are a reference type, you would expect to use this to define the variable message
        String message = new String("Hello World");
          However, there is a shorter way to initialize string variables, see below  */
        String message = "Hello World";
        String longerMessage = "Hello World" + "!!";
        longerMessage.endsWith("!!");
        /* System.out.println(longerMessage); */
        System.out.println(longerMessage.startsWith("!!"));
        System.out.println(longerMessage.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(longerMessage.length());
        System.out.println(longerMessage.indexOf("sky"));
        System.out.println(longerMessage.replace("!","*"));
        /* However, this does not change the original string longerMessage */
        /* since in Java Strings are immutable, we cannot change/mutate them */
        System.out.println(longerMessage);
        System.out.println(message.toLowerCase());
        /* and again, the original String message is not changed */
        System.out.println(message);
        /* there is also a trim method to get rid of spaces at the beginning or ending of a string  */
        String spaceyMessage = "   Hello Again       ";
        System.out.println(spaceyMessage.trim());
        System.out.println(spaceyMessage);



    }
}
