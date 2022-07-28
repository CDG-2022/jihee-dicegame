package judge;

import lombok.Getter;
import lombok.Setter;
import main.GameMain;
import player.FraudPlayer;
import player.Player;
import dice.Dice;
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
        while (this.getRound() < GameMain.PLAY_COUNT) {
            System.out.println((this.getRound() + 1) + "라운드");

            // player2.levelOfDice(player1, player2);

            recorder.recordToThrowDice(player1);
            player1.setTotal(player1.getTotal() + player1.getDice().roll());
            recorder.recordToShowScore(player1);

            recorder.recordToThrowDice(player2);
            player2.setTotal(player2.getTotal() + player2.getDice().roll());
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