package player;

import dice.Dice;

public class Player {
    String name;
    int total;

    public Player(String name){
        this.name = name;
        System.out.println("플레이어 등장! 내 이름은 " + name);
        System.out.println("나는 일반 주사위를 가지고 있지!");
        Dice dice = new Dice();
    }
}
