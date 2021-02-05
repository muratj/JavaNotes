package com.murat;

import java.util.Random;

public class Dice {
    static int dice() {
        Random randomNumber = new Random();

        return randomNumber.nextInt(6)+1;
    }
}
