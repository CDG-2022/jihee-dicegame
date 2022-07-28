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
    private FraudDice fraudDice;

    public FraudPlayer(String name, FraudDice fraudDice) {
        this.name = name;
        System.out.println("사기꾼 등장! 내 이름은 " + name);
        System.out.println("나는 사기 주사위를 가지고 있지!");
        this.fraudDice = fraudDice;
    }

    public int levelOfDice(Player player1, FraudPlayer player2) {
        if (player1.getTotal() > player2.getTotal()) {
            System.out.println("사기 플레이어가 얍삽해집니다.");
            player2.fraudDice.setLevel(FraudDice.Level.HARD);
        } else if (player2.getTotal() - player1.getTotal() > 6) {
            System.out.println("사기 플레이어가 거만해집니다.");
            player2.fraudDice.setLevel(FraudDice.Level.EASY);
        } else {
            player2.fraudDice.setLevel(FraudDice.Level.DEFAULT);
        }
        return 0;
    }
}
