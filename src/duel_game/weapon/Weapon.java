package duel_game.weapon;

import java.util.Random;

public abstract class Weapon {
    private final int damage;
    private final Random rand;

    Weapon(int damage, Random rand) {
        this.damage = damage;
        this.rand = rand;
    }

    public int getDamage() {
        return rand.nextInt(1, damage);
    }

    public int getWeaponDamage() {
        return damage;
    }

    public Random getRandom() {
        return rand;
    }

}
