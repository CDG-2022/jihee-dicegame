package player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Player {
    protected String name;
    protected int total;

    public Player(String name) {
        System.out.println(name + " 등장!");
        this.name = name;
        this.total = 0;
    }

    public void addScore(int score) {
        this.total += score;
    }

    public abstract int roll();
}
