package judge;

import lombok.Getter;
import lombok.Setter;
import main.GameMain;
import player.FraudPlayer;
import player.RegularPlayer;
import recorder.Recorder;

@Getter
@Setter

public class Judge {

    private int round;

    public Judge() {
        System.out.println("저는 심판입니다. 게임을 시작하겠습니다.");
    }

    public void startGame(RegularPlayer player1, FraudPlayer player2, Recorder recorder) {
        this.round = 0;
        while (this.getRound() < GameMain.PLAY_COUNT) {
            System.out.println((this.getRound() + 1) + "라운드");

            player2.setLevel(player1.getTotal());

            play(player1, player2, recorder);
        }

        judge(player1, player2, recorder);
    }

    private void judge(RegularPlayer player1, FraudPlayer player2, Recorder recorder) {
        if (player1.getTotal() == player2.getTotal()) {
            recorder.recordDraw();
        } else if (player1.getTotal() > player2.getTotal()) {
            recorder.recordWinner(player1);
        } else {
            recorder.recordWinner(player2);
        }
    }

    private void play(RegularPlayer player, FraudPlayer player2, Recorder recorder) {
        recorder.recordToThrowDice(player);
        int diceNumber = player.getDice().roll();
        recorder.recordToDiceNumber(diceNumber);
        player.setTotal(player.getTotal() + diceNumber);
        recorder.recordToShowScore(player);

        System.out.println();

        recorder.recordToThrowDice(player2);
        diceNumber = player2.roll();
        recorder.recordToDiceNumber(diceNumber);
        player2.setTotal(player2.getTotal() + diceNumber);
        recorder.recordToShowScore(player2);

        System.out.println();

        this.setRound(this.getRound() + 1);
    }
}