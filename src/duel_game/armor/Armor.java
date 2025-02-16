package duel_game.armor;

import duel_game.Main;

abstract public class Armor {
    private int armorRating;
    private int durability;

    Armor(int armorRating, int durability) {
        this.armorRating = armorRating;
        this.durability = durability;
    }

    public int reduceDamage(int damage) {
        if (durability <= 0) return damage;
        int finalDamage = Math.max((armorRating - damage), 0);
        durability--;
        return finalDamage;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public int getDurability() {
        return durability;
    }
}
