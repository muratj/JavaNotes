package com.murat;

import static com.murat.Clock.time;
import static com.murat.Dice.dice;
import static com.murat.Pyramid.pyramid;
import static com.murat.Reverse.reverse;
import static com.murat.Timer.setTimer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    // reverse string
//        System.out.println(reverse("Hello"));

        // draw stars
//        pyramid(4);

        // random dice number
//        System.out.println(dice());

        // clock app
//        time();

        // timer
        setTimer(0, 30, 10);
    }


}
