package dice;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

interface Dice {
    Random random = new Random();

    public enum Level {
        EASY, HARD, DEFAULT
    }

    public abstract int roll();
}

@Getter
@Setter

public class RegularDice implements Dice {
    protected Random random = new Random();

    public RegularDice() {
        System.out.println("주사위 생성 완료!");
    }

    public int roll() {
        return random.nextInt(6) + 1;
    }
}




