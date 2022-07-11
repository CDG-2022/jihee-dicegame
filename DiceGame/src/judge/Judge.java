package judge;

import main.GameMain;
import player.FraudPlayer;
import player.Player;
import dice.Dice;

public class Judge {
    public Judge(){
        System.out.println("저는 심판입니다. 게임을 시작하겠습니다.");
    }

    void startGame(){
        int round = 0;
        int winner = 0;
        while (round < GameMain.five) {
            //player 와 fraudPlayer 가 각자 소유의 주사위를 굴린다.
            //recorder.record 로 진행 상황을 기록한다.
            round++;
        }
        // if (player.total == fraudPlayer.total)
        //System.out.println("무승부입니다.");

        // else winner = (player.total < fraudPlayer.total) ? 1 : 2;
        // if-else 를 쓰지 않고도 바로 승자를 출력하는 방법이 없을까?
    }
}