package dice;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class Dice {
    protected Random random = new Random();

    public Dice() {
        System.out.println("주사위 생성 완료!");
    }

    public int roll() {
        return random.nextInt(6) + 1;
    }
}
