package duel_game.weapon;

import java.util.Random;

public class Bow extends Weapon {

    public Bow(int damage, Random rand) {
        super(damage, rand);
    }

    @Override
    public int getDamage() {
        int criticalDamage = getRandom().nextInt(0, 1);
        return super.getDamage() + criticalDamage;
    }
}
