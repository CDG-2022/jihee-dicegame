package dice;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class RegularDice implements Dice{
    public RegularDice() {
        System.out.println("주사위 생성 완료!");
    }

    public int roll() {
        return random.nextInt(6) + 1;
    }
}



