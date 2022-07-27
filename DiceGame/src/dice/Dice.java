package dice;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class Dice {
    private Random random = new Random();
    private int diceNum;

    public Dice(){
        diceNum = roll();
        System.out.println("주사위 생성 완료!");
    }
    public int roll(){
        return random.nextInt(6) + 1; // 0 ~ 5 에 1 을 더해 1 ~ 6 을 만든다.
    }
}
