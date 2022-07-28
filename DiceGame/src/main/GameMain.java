package main;

import dice.Dice;
import dice.FraudDice;
import judge.Judge;
import lombok.*;
import player.FraudPlayer;
import player.Player;
import recorder.Recorder;

import java.util.Scanner;


@Getter
@Setter
public class GameMain {
    static Scanner scanner = new Scanner(System.in);

    public static final int PLAY_COUNT = 5;

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        // Dice dice2 = new Dice();
        FraudDice fraudDice = new FraudDice();
        Judge judge = new Judge();
        Recorder recorder = new Recorder();

        System.out.print("첫 번째 플레이어의 이름은 : ");
        Player player1 = new Player(scanner.nextLine(), dice1);

        System.out.print("두 번째 플레이어의 이름은 : ");
        // Player player2 = new Player(scanner.nextLine(), dice2);
        FraudPlayer fraudPlayer = new FraudPlayer(scanner.nextLine(), fraudDice);

        System.out.println();

        // System.out.println("사기플레이어의 이름이 뭐라고? " + player2.getName());

        judge.startGame(player1, fraudPlayer, recorder);
    }
}
