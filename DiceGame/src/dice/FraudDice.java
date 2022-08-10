package dice;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class FraudDice extends Dice {

    private Level level = Level.DEFAULT;

    public FraudDice() {
        System.out.println("사기 주사위 생성 완료!");
    }

    public int roll() {

        switch (level) {
            case EASY:
                return random.nextInt(4) + 1;
            case HARD:
                return random.nextInt(4) + 1 + 2;
            default:
                return random.nextInt(6) + 1;
        }
    }

    public enum Level {
        EASY, HARD, DEFAULT
    }
}
