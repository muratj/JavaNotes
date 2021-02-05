package com.murat.String;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // method                                                   // output
        str.charAt(4);                                              // o
        str.length();                                               // 13
        str.substring(7);                                           // World!
        str.substring(1,5);                                         // ello
        str.contains("lo");                                         // true
        str.equals("Hello");                                        // false
        str.isEmpty();                                              // false
        str.concat(" Hello!");                                      // Hello, World! Hello!
        str.replace('!', '.');                     // Hello, World.
        str.replace("Hello", "HELLO");            // HELLO, World!
        str.equalsIgnoreCase("hello, World!");          //true
        str.split(",");                                       // ["Hello", " World!"]
        str.indexOf('W');                                           // 7
        str.indexOf('o', 7);                           // 8
        str.indexOf("World");                                       // 7
        "hello hello".indexOf("llo", 5);               // 8
        str.toLowerCase();                                          // hello, world!
        str.toUpperCase();                                          // HELLO, WORLD!
        "  HELLO HELLO  ".trim();                                   // HELLO HELLO

    }
}
