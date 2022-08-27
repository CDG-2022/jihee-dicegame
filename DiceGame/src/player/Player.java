package player;

import dice.RegularDice;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Player {
    protected String name;
    protected int total = 0;
    private RegularDice dice;

    public Player() {

    }

    public Player(String name, RegularDice dice) {
        this.name = name;
        System.out.println("플레이어 등장! 내 이름은 " + name);
        System.out.println("나는 일반 주사위를 가지고 있지!");
        this.dice = dice;
    }
}
