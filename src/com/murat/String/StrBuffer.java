package com.murat.String;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.append(", Java");
        str.insert(4, "lloo");
        str.replace(11, 15, "JAVA Java");
        str.delete(15, 20);
        System.out.println(str.compareTo(new StringBuffer("Hellllooo, JAVA")));
        str.reverse();
        System.out.println(str);

    }
}
