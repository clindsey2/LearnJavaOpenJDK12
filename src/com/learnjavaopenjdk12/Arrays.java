package com.learnjavaopenjdk12;

public class Arrays {
    public Arrays() {
        System.out.println("Using the Arrays class");
        /* one dimensional arrays */
        int number = 1;
        int[] numberArray = new int[5];  /* array of integer */
        numberArray[0] = 1;
        numberArray[1] = 2;
        // another means to load an array
        int[] numbers = { 2, 7, 11, 5, 3, 9, 4};
        java.util.Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(java.util.Arrays.toString(numberArray));

        // multidimensional arrays
        int [][] twoDNumArray = new int[2][3];
        twoDNumArray[0][0] = 1;
        // with curly braces
        int[][] twoDCurlyNumArray = {{1, 2, 3}, {4, 5, 6} };
        System.out.println(java.util.Arrays.deepToString(twoDNumArray));
        System.out.println(java.util.Arrays.deepToString(twoDCurlyNumArray));


        int[][][] threeDNumArray = new int[2][3][5];
        // using curly braces
        int[][][] threeDCurlyNumArray = { { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} },
                {{22, 33, 222, 333 }, {44, 55, 444, 555}, {66, 77, 666, 777} } };
        System.out.println(java.util.Arrays.deepToString(threeDNumArray));
        System.out.println(java.util.Arrays.deepToString(threeDCurlyNumArray));

    }
}
