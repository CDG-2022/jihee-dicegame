package player;

import dice.FraudDice;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

@Getter
@Setter

public class FraudPlayer extends Player {
    private String name;
    private int total = 0;

    public FraudPlayer(String name, FraudDice fraudDice) {
        this.name = name;
        System.out.println("사기꾼 등장! 내 이름은 " + name);
        System.out.println("나는 사기 주사위를 가지고 있지!");
        super.dice = fraudDice;
    }

    public int setLevel(int playerTotal, FraudPlayer player2) {
        System.out.println("사기 플레이어가 머리를 굴립니다.");
        if (playerTotal > player2.getTotal()) {
            System.out.println("사기 플레이어가 얍삽해집니다.");
            player2.fraudDice.setLevel(FraudDice.Level.HARD);
        } else if (player2.getTotal() - playerTotal > 6) {
            System.out.println("사기 플레이어가 거만해집니다.");
            player2.fraudDice.setLevel(FraudDice.Level.EASY);
        } else {
            player2.fraudDice.setLevel(FraudDice.Level.DEFAULT);
        }
        return 0;
    }
}
