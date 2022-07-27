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
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        // FraudDice fraudDice = new FraudDice();
        Judge judge = new Judge();
        Recorder recorder = new Recorder();

        System.out.print("첫 번째 플레이어의 이름은 : ");
        Player player1 = new Player(scanner.nextLine(), dice1);

        System.out.print("두 번째 플레이어의 이름은 : ");
        Player player2 = new Player(scanner.nextLine(), dice2);
        // FraudPlayer fraudPlayer = new FraudPlayer(scanner.nextLine(), fraudDice);

        System.out.println();

        // judge.startGame();
        while (judge.getRound() < GameMain.five) {
            System.out.println((judge.getRound()+1) + "라운드");

            System.out.println("현재 누적 점수가 " + player1.getTotal() + "점인 " + player1.getName() + "이 주사위를 굴렸다!");
            player1.setTotal(player1.getTotal() + dice1.roll());
            System.out.println(player1.getName()+ "의 점수가 " + player1.getTotal() + "점이 되었다!");

            System.out.println("현재 누적 점수가 " + player2.getTotal() + "점인 " + player2.getName() + "이 주사위를 굴렸다!");
            player2.setTotal(player2.getTotal() + dice2.roll());
            System.out.println(player2.getName()+ "의 점수가 " + player2.getTotal() + "점이 되었다!");

            judge.setRound(judge.getRound() + 1);
            System.out.println();
        }
        if (player1.getTotal() == player2.getTotal()) {
            System.out.println("무승부입니다.");
        }
        else if (player1.getTotal() > player2.getTotal()){
            System.out.println(player1.getName() + "의 승리입니다!");
        }
        else {
            System.out.println(player2.getName() + "의 승리입니다!");
        }
    }
}
