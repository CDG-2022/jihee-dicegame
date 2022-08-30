package dice;

import java.util.Random;

public interface Dice {

    Random random = new Random();
    int roll();
}
