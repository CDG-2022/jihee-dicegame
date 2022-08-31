package player;

import dice.Dice;
import dice.RegularDice;
import lombok.Getter;

@Getter

public class RegularPlayer extends Player {
    private Dice dice;

    public RegularPlayer(String name, Dice dice) {
        super(name);
        this.dice = dice;
    }
    @Override
    public int roll() {
        return this.dice.roll();
    }
}
