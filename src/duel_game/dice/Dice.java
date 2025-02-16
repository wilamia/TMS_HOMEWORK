package duel_game.dice;

import java.util.Random;

public class Dice {
    private final Random rand;

    public Dice(Random rand) {
        this.rand = rand;
    }

    public int roll() {
        return rand.nextInt(1, 6);
    }
}
