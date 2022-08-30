package dice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FraudDice implements Dice {

    private Level level = Level.DEFAULT;

    public FraudDice() {
        System.out.println("사기 주사위 생성 완료!");
    }

    public int roll() {

        switch (level) {
            case EASY:
                return random.nextInt(4) + 1;   // 1-4
            case HARD:
                return random.nextInt(4) + 1 + 2;   // 3-6
            default:
                return random.nextInt(6) + 1;   // 1-6
        }
    }

    public enum Level {
        EASY, HARD, DEFAULT
    }
}
