package com.learnjavaopenjdk12;

import java.awt.*;
import java.util.Date;

public class ReferenceTypes {
    public ReferenceTypes() {
        System.out.println("Using the ReferenceTypes class");
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
