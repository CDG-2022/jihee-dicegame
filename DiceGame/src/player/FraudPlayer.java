package player;

import dice.Dice;
import dice.FraudDice;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FraudPlayer extends Player {
    private FraudDice dice;

    public FraudPlayer(String name, Dice dice) {
        super(name);
        this.dice = (FraudDice) dice;
    }

    public int roll() {
        return this.dice.roll();
    }

    public int setLevel(int playerTotal) {
        System.out.println("사기 플레이어가 머리를 굴립니다.");

        if (playerTotal > getTotal()) {
            System.out.println("사기 플레이어가 얍삽해집니다.");
            this.dice.setLevel(FraudDice.Level.HARD);
        } else if (getTotal() - playerTotal > 6) {
            System.out.println("사기 플레이어가 거만해집니다.");
            this.dice.setLevel(FraudDice.Level.EASY);
        } else {
            this.dice.setLevel(FraudDice.Level.DEFAULT);
        }
        return 0;
    }
}
