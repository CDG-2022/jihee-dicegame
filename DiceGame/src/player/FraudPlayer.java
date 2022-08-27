package player;

import dice.FraudDice;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FraudPlayer extends Player {

    private FraudDice fraudDice;

    public FraudPlayer(String name, FraudDice fraudDice) {
        this.name = name;
        System.out.println("사기꾼 등장! 내 이름은 " + name);
        System.out.println("나는 사기 주사위를 가지고 있지!");
        this.fraudDice = fraudDice;
    }

    public int setLevel(int playerTotal) {
        System.out.println("사기 플레이어가 머리를 굴립니다.");

        if (playerTotal > getTotal()) {
            System.out.println("사기 플레이어가 얍삽해집니다.");
            fraudDice.setLevel(FraudDice.Level.HARD);
        } else if (getTotal() - playerTotal > 6) {
            System.out.println("사기 플레이어가 거만해집니다.");
            fraudDice.setLevel(FraudDice.Level.EASY);
        } else {
            fraudDice.setLevel(FraudDice.Level.DEFAULT);
        }
        return 0;
    }
}
