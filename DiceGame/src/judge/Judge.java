package judge;

import lombok.Getter;
import lombok.Setter;
import main.GameMain;
import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

@Getter
@Setter

public class Judge {

    private int round = 0;

    public Judge() {
        System.out.println("저는 심판입니다. 게임을 시작하겠습니다.");
    }

    public void startGame(Player player1, FraudPlayer player2, Recorder recorder) {
        this.round = 0;
        int diceNumber;
        while (this.getRound() < GameMain.PLAY_COUNT) {
            System.out.println((this.getRound() + 1) + "라운드");

            player2.setLevel(player1.getTotal());

            recorder.recordToThrowDice(player1);
            diceNumber = player1.getDice().roll();
            recorder.recordToDiceNumber(diceNumber);
            player1.setTotal(player1.getTotal() + diceNumber);
            recorder.recordToShowScore(player1);

            System.out.println();

            recorder.recordToThrowDice(player2);
            diceNumber = player2.getDice().roll();
            recorder.recordToDiceNumber(diceNumber);
            player2.setTotal(player2.getTotal() + diceNumber);
            recorder.recordToShowScore(player2);

            this.setRound(this.getRound() + 1);
            System.out.println();
        }

        if (player1.getTotal() == player2.getTotal()) {
            recorder.recordDraw();
        } else if (player1.getTotal() > player2.getTotal()) {
            recorder.recordWinner(player1);
        } else {
            recorder.recordWinner(player2);
        }
    }
}