package com.murat.StaticDemo;

public class StaticVariable {
    static int a = 5;

    public static void main(String[] args) {
//        StaticVariable s = new StaticVariable();
//        System.out.println(s.a);                  // get access to variable a without static keyword

        System.out.println(a);                      // get access to variable a with static keyword

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        System.out.println(Demo.str2);
        obj1.str1 = "Object1 string1";
        obj2.str1 = "Object2 string1";
        obj2.str2 = "Object2 string2";
        Demo.str2 = "Same for every object";            // we don't need object

        System.out.println(obj1.str2);
    }
}

class Demo {
    String str1;
    static String str2;

    // assigning default value of static variables
    static {
        str2 = "Default value";
    }
}
