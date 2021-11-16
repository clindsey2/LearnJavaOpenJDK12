package com.learnjavaopenjdk12;

public class Strings {
    public Strings() {
        System.out.println("Using the Strings class");
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
    }
}
