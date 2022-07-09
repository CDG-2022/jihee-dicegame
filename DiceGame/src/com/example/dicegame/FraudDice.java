package com.example.dicegame;

import java.util.Random;

public class FraudDice {
    Random random = new Random();

    int roll(){
        int diceNumber;

        diceNumber = random.nextInt(6) + 1; // 0 ~ 5 에 1 을 더해 1 ~ 6 을 만든다.
        return diceNumber;
    }

    int rollEasy(){
        int diceNumber;

        diceNumber = random.nextInt(6) + 1;
        while(diceNumber >= 5) // 5 이상의 눈금이 나오면 다시 던지기
            diceNumber = random.nextInt(6) + 1;
        return diceNumber;
    }

    int rollHard(){
        int diceNumber;

        diceNumber = random.nextInt(6) + 1;
        while(diceNumber <= 2) // 2 이하의 눈금이 나오면 다시 던지기
            diceNumber = random.nextInt(6) + 1;
        return diceNumber;
    }
}
