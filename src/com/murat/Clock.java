package com.murat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {

    public static void time() {

        while (true){
            LocalTime now = LocalTime.now();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r"+now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }
    }

}
