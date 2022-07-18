package main;

import dice.Dice;
import dice.FraudDice;
import judge.Judge;
import lombok.*;
import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.Scanner;

public class GameMain {
    @Getter
    @Setter

    public static final int five = 5;
    public static void main(String[] args){
        String playerName1, playerName2;

        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice();

        System.out.print("첫 번째 플레이어의 이름은 : ");
        playerName1 = scanner.nextLine();
        Player player = new Player(playerName1);

        //player.setDice(dice1);
        //System.out.println(player.getDice());
        
        FraudDice fraudDice = new FraudDice();

        System.out.print("두 번째 플레이어의 이름은 : ");
        playerName2 = scanner.nextLine();

        FraudPlayer fraudPlayer = new FraudPlayer(playerName2);

        Judge judge = new Judge();
        Recorder recorder = new Recorder();
    }
}
