package com.learnjavaopenjdk12;

public class PrimitiveTypes {
    public PrimitiveTypes() {
        System.out.println("Using the PrimitiveTypes class");
        /* Primitive types */
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;    /*underscores make the number more readable & L indicates long*/
        float price = 10.99F;   /*the F tells java to store this as a float*/
        char letter = 'A';  /* wrap single character with single quote and multiple characters with double quotes*/
        boolean isEligible = false;   /*words in orange are reserved keywords*/
        System.out.println(myAge);
    }
}
