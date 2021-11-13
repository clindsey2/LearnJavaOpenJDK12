package com.learnjavaopenjdk12;

import java.awt.*;
import java.util.Date;

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

    }
}
