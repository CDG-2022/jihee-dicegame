package dice;

import java.util.Random;

public class Dice {
    Random random = new Random();

    public Dice(){
        System.out.println("주사위 생성 완료!");
    }
    public int roll(){
        int diceNumber;

        diceNumber = random.nextInt(6) + 1; // 0 ~ 5 에 1 을 더해 1 ~ 6 을 만든다.
        return diceNumber;
    }
    int diceNum = roll();
}
