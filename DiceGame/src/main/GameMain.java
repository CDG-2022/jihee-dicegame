package main;

import dice.RegularDice;
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
        System.out.print("첫 번째 플레이어의 이름은 : ");
        Player player1 = new Player(scanner.nextLine(), new RegularDice());
        System.out.println();

        System.out.print("두 번째 플레이어의 이름은 : ");
        // Player player2 = new Player(scanner.nextLine(), dice2);
        FraudPlayer fraudPlayer = new FraudPlayer(scanner.nextLine(), new FraudDice());

        System.out.println();

        Judge judge = new Judge();
        judge.startGame(player1, fraudPlayer, new Recorder());
    }
}
