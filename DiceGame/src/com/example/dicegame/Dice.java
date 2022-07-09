package com.example.dicegame;

import java.util.Random;

public class Dice {
    Random random = new Random();

    int roll(){
        int diceNumber;

        diceNumber = random.nextInt(6) + 1; // 0 ~ 5 에 1 을 더해 1 ~ 6 을 만든다.
        return diceNumber;
    }
}
