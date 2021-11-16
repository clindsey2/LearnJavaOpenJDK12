package com.learnjavaopenjdk12;

public class MathClass {
    public MathClass() {
        /* the Math Class */
        int resultI = Math.round(1.1F);
        int resultF = (int)Math.floor(1.1F);
        int resultC = (int)Math.ceil(1.1F);
        System.out.println("Using the MathClass class");
        System.out.printf("value=%d floor=%d and ceiling=%d\n",resultI, resultF, resultC);

        int resultMax = Math.max(1, 2);
        int resultMin = Math.min(12, 38);
        double randomNum = Math.random(); // random number between zero and one
        int randomIntLT100 = (int) Math.round(Math.random() * 100) ;

        System.out.printf("the max of 1, 2 is = %d\n", resultMax);
        System.out.printf("the min of 12, 38 is = %d\n", resultMin);
        System.out.printf("the next random number is %s(string) or  %f(float)\n", randomNum, randomNum);
        System.out.printf("the next random number less than 100 = %d\n", randomIntLT100);

    }
}
