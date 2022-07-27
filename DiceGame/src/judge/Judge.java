package judge;

import lombok.Getter;
import lombok.Setter;
import main.GameMain;
import player.FraudPlayer;
import player.Player;
import dice.Dice;

@Getter
@Setter

public class Judge {

    private int round = 0;
    public Judge(){
        System.out.println("저는 심판입니다. 게임을 시작하겠습니다.");
    }

    public void startGame(){
        this.round = 0;
        int winner = 0;
        while (round < GameMain.five) {
            System.out.println((round+1) + "라운드");
            //player 와 fraudPlayer 가 각자 소유의 주사위를 굴린다.
            //recorder.record 로 진행 상황을 기록한다.
            round++;
        }
    }
}