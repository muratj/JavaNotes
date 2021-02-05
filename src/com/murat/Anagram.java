package com.murat;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("1233", "3213"));
    }

    public static boolean anagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        for (int i=0; i<str1.length(); i++) {
            if(!str2.contains(""+str1.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
