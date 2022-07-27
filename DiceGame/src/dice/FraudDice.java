package dice;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class FraudDice extends Dice {
    Random random = new Random();

    public FraudDice(){
        System.out.println("사기 주사위 생성 완료!");
    }

    public int rollEasy(){
        return random.nextInt(4) + 1; // 5, 6 을 제외한 1, 2, 3, 4 만 나오도록 주사위 난수를 조정한다.
    }

    public int rollHard(){
        return random.nextInt(4) + 1 + 2; // 1, 2 를 제외한 3, 4, 5, 6 만 나오도록 주사위 난수를 조정한다.
    }
}
