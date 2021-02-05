package com.murat.StaticDemo;

public class StaticMethod {
    String helloPublic = "Hello to everyone";
    static String helloStatic = "Hello to static members";

    public void notStaticMethod() {
        System.out.println(helloPublic);
        System.out.println(helloStatic);
        staticMethod();
    }
    static void staticMethod() {
//        System.out.println(helloPublic);        // Error
//        notStaticMethod();                      // Error
        System.out.println(helloStatic);        // only static vars and methods
    }

    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.notStaticMethod();                  // get access to non static method

        staticMethod();                         // get access to static method

    }
}
