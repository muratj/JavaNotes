package com.murat.String;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("New");
        str.append(1);
        str.deleteCharAt(2);
        str.insert(2, 3.4);
        System.out.println(str);
    }
}
