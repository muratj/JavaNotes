package com.murat;

public class Timer {
    public static void setTimer(int h, int m, int s) throws InterruptedException {
        int timer = h*60*60 + m*60 + s;

        while (timer > 0) {
            Thread.sleep(1000);
            timer -= 1;
            int th = timer/60/60;
            int tm = timer/60%60;
            int ts = timer%60;
            System.out.print("\r"+ twoDigit(th) + ":" + twoDigit(tm) + ":" + twoDigit(ts));
        }
    }

    // return 2 digit string ex: 1 --> 01; 1:5:2 --> 01:05:02
    public static String twoDigit(int t) {
        if (t<10) {
           return "0" + t;
        }
        return "" + t;
    }
}
