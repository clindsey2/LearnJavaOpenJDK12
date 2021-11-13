package com.learnjavaopenjdk12;

import java.awt.*;
import java.util.Arrays;
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

        /* references characters  in strings */
        String escMessage = "Hello \"Christopher\"";
        System.out.println(escMessage);
        // c:\Windows\...
        String backslashMessage = "C:\\Windows\\...\\t...\\n...";
        System.out.println(backslashMessage);

        /* one dimensional arrays */
        int number = 1;
        int[] numberArray = new int[5];  /* array of integer */
        numberArray[0] = 1;
        numberArray[1] = 2;
        // another means to load an array
        int[] numbers = { 2, 7, 11, 5, 3, 9, 4};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numberArray));

        // multidimensional arrays
        int [][] twoDNumArray = new int[2][3];
        twoDNumArray[0][0] = 1;
        // with curly braces
        int[][] twoDCurlyNumArray = {{1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(twoDNumArray));
        System.out.println(Arrays.deepToString(twoDCurlyNumArray));


        int[][][] threeDNumArray = new int[2][3][5];
        // using curly braces
        int[][][] threeDCurlyNumArray = { { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} },
                {{22, 33, 222, 333 }, {44, 55, 444, 555}, {66, 77, 666, 777} } };
        System.out.println(Arrays.deepToString(threeDNumArray));
        System.out.println(Arrays.deepToString(threeDCurlyNumArray));


        /* constants */
        final float pi = 3.14F;  // represent as float with F -- final treats it as a constant

        /* arithmetic expressions  */
        int addResults = 10 + 3;
        int subResults = 10 - 3;
        int multResults = 10 * 3;
        double divResults = (double)10 / (double)3;
        int modResults = 10 % 3;
        System.out.println(addResults);
        System.out.println(subResults);
        System.out.println(multResults);
        System.out.println(divResults);
        System.out.println(modResults);
        int xae = 1;
        xae++;
        int yae = xae++;
        int zae = ++xae;
        System.out.println(xae);
        System.out.println(yae);
        System.out.println(zae);

        int xaug = 4;
        /* other augment operations: xaug -= 2; xaug *= 2; xaug /= 2; */
        xaug += 2;
        System.out.println(xaug);

        /* order of operators */
        int xops = 10 + 3 * 2;
        int yops = (10 + 3) * 2;
        System.out.println(xops);
        System.out.println(yops);



    }
}
