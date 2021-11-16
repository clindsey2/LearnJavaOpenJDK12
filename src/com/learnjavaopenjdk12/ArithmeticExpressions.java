package com.learnjavaopenjdk12;

public class ArithmeticExpressions {
    public ArithmeticExpressions() {
        System.out.println("Using the ArithmeticExpressions class");
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
