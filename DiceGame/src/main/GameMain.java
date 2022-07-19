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

    public static final int five = 5;


    public static void main(String[] args){
        FraudDice fraudDice = new FraudDice();
        Dice dice = new Dice();
        Judge judge = new Judge();
        Recorder recorder = new Recorder();

        System.out.print("첫 번째 플레이어의 이름은 : ");
        Player player1 = new Player(scanner.nextLine(), dice);

        System.out.print("첫 번째 플레이어의 이름은 : ");
        Player player2 = new Player(scanner.nextLine(), dice);

        System.out.print("두 번째 플레이어의 이름은 : ");
        FraudPlayer fraudPlayer = new FraudPlayer(scanner.nextLine(), fraudDice);

    }
}
