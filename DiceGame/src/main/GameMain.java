package main;

import judge.Judge;
import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.Scanner;

public class GameMain {
    public static final int five = 5;
    public static void main(){
        String playerName1, playerName2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 플레이어의 이름은 : ");
        playerName1 = scanner.nextLine();
        System.out.print("두 번째 플레이어의 이름은 : ");
        playerName2 = scanner.nextLine();

        Player player = new Player(playerName1);
        FraudPlayer fraudPlayer = new FraudPlayer(playerName2);
        Judge judge = new Judge();
        Recorder recorder = new Recorder();
    }
}
