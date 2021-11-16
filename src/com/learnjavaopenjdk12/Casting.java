package com.learnjavaopenjdk12;

public class Casting {
    public Casting() {
        System.out.println("Using the Casting class");
        /* casting */
        short xs = 1;
        int yi = xs + 2;  // implicit casting / automatic conversion of short xs into an int
        // order of implicit casting permitted:  byte > short > int > long
        //                                             with data loss: ^^^ > float > double
        System.out.println(yi);

        double xd = 1.1;
        double yd = xd + 2; // casts 2 into 2.0 and then adds it to xd
        System.out.println(yd);

        /* explicit casting */
        int ydi = (int)xd + 2;  // explicitly cast double xd into an integer value then add 2
        System.out.println(ydi);

        /* wrapper classes */
        String xstrI = "1";
        String xstrD = "1.1";
        int yfromI = Integer.parseInt(xstrI) + 11;  // wrapper type for the integer type from a string
        Short.parseShort(xstrI);  // wrapper type for the short type from a string
        Float.parseFloat(xstrD);  // wrapper type for the float type from a string
        double zfromD = Double.parseDouble(xstrD) + 7.987;  // wrapper type for the double type from a string
        System.out.println(yfromI);
        System.out.println(zfromD);

    }
}
