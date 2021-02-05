package com.murat;

public class TypeCasting {
    public static void main(String[] args) {

        // widening casting       byte => short => char => int => long => float => double
        byte    b = 1;      // 1
        short   s = b;      // 1
        int     i = s;      // 1
        long    l = i;      // 1
        float   f = l;      // 1.0
        double  d = f;      // 1.0

        // narrow casting        double => float => long => int => char => short => byte
        double  cd = 1.0;               // 1.0
        float   cf = (float) cd;        // 1.0
        long    cl = (long) cf;         // 1
        int     ci = (int) cl;          // 1
        short   cs = (short) ci;        // 1
        byte    cb = (byte) cs;         // 1

        char cOfA = 'A';
        int cToI = cOfA;                // 65
        
        int iOfA = 65;
        char iToC = (char) iOfA;        // A
        
    }
}
