package player;

import dice.Dice;
import lombok.Getter;
import lombok.Setter;

public class Player {

    public String name;
    int total;
    Dice dice;

    public Player(String name){
        this.name = name;
        System.out.println("플레이어 등장! 내 이름은 " + name);
        System.out.println("나는 일반 주사위를 가지고 있지!");
        this.dice = null;
        //this.total += dice.roll();
    }
}
