package recorder;

import lombok.Getter;
import lombok.Setter;
import player.Player;
import player.RegularPlayer;

@Getter
@Setter

public class Recorder {
    public Recorder() {
        System.out.println("기록은 제가 할게요!");
    }

    public void recordToThrowDice(Player player) {
        System.out.println("현재 누적 점수가 " + player.getTotal() + "점인 " + player.getName() + "이 주사위를 굴렸다!");
    }

    public void recordToDiceNumber(int diceNumber) {
        System.out.println("나온 눈금 수는 " + diceNumber);
    }

    public void recordToShowScore(Player player) {
        System.out.println(player.getName() + "의 점수가 " + player.getTotal() + "점이 되었다!");
    }

    public void recordWinner(Player player) {
        System.out.println(player.getName() + "의 승리입니다!");
    }

    public void recordDraw() {
        System.out.println("무승부입니다.");
    }
}