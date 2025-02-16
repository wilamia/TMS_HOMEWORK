package duel_game;

import duel_game.armor.HardArmor;
import duel_game.armor.LightArmor;
import duel_game.armor.MediumArmor;
import duel_game.dice.Dice;
import duel_game.players.Archer;
import duel_game.players.Hero;
import duel_game.players.Paladin;
import duel_game.players.Robber;
import duel_game.weapon.Bow;
import duel_game.weapon.Dagger;
import duel_game.weapon.Sword;

import java.security.Key;
import java.util.Random;
import java.util.Scanner;

/*Задача 1: Игра дуэль
Напишите консольную игру, где игроки сражаются, по очереди бросая кубик. Всего в игре может быть 3 класса (паладин, разбойник и лучник). У каждого класса должно быть здоровье, броня и оружие. Оружие должно иметь собственный параметр атаки. Броня имеет защиту, которая блокирует урон, но ее прочность снижается после каждого блока. Игроки могут выбрать класс, за который они хотят играть. Проигрывает тот, у кого первым кончилось здоровье.
Паладин — много здоровья, слабая атака, тяжелая броня
Разбойник — сильная атака, среднее кол-во здоровья, средняя броня
Лучник — очень сильная атака, мало здоровья, легкая броня*/
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);
        Hero firstPlayer = chooseHero(random, scn);
        Hero secondPlayer = chooseHero(random, scn);
        Dice dice = new Dice(random);
        playGame(firstPlayer, secondPlayer, dice);
    }

    public static String enterNickname(Scanner scn) {
        System.out.println("Введите имя персонажа: ");
        return scn.next();
    }

    public static Hero chooseHero(Random random, Scanner scn) {
        String name = enterNickname(scn);
        System.out.println("Выберите героя для первого игрока.\n" +
                "Введите число от 1 до 3, где\n" +
                "1 - Паладин\n" +
                "2 - Разбойник\n" +
                "3 - Лучник");
        int heroNumber = scn.nextInt();
        switch (heroNumber) {
            case 1:
                return new Paladin(
                        name, random.nextInt(30, 40),
                        new HardArmor(random.nextInt(20, 30), random.nextInt(1, 10)),
                        new Sword(random.nextInt(5, 8), random));
            case 2:
                return new Robber(
                        name, random.nextInt(20, 30),
                        new MediumArmor(random.nextInt(10, 20), random.nextInt(1, 10)),
                        new Dagger(random.nextInt(8, 11), random));
            case 3:
                return new Archer(
                        name, random.nextInt(15, 20),
                        new LightArmor(random.nextInt(2, 10), random.nextInt(1, 10)),
                        new Bow(random.nextInt(15, 20), random));
            default:
                return null;
        }
    }

    public static void playGame(Hero firstPlayer, Hero secondPlayer, Dice dice) {
        System.out.println("Информация о первом игроке: ");
        firstPlayer.getStats();
        System.out.println("\nИнформация о втором игроке: ");
        secondPlayer.getStats();
        while (firstPlayer.isAlive() && secondPlayer.isAlive()) {
            takeTurn(firstPlayer, secondPlayer, dice.roll());
            if (!secondPlayer.isAlive()) break;
            takeTurn(secondPlayer, firstPlayer, dice.roll());
            if (!firstPlayer.isAlive()) break;
        }

        System.out.print("Игра окончена! ");
        if (firstPlayer.isAlive()) {
            System.out.println(firstPlayer.getName() + " победил!");
        } else {
            System.out.println(secondPlayer.getName() + " победил!");
        }

    }

    public static void takeTurn(Hero attacker, Hero defender, int diceResult) {
        int damage;
        Scanner scn = new Scanner(System.in);
        System.out.println("\nХод " + attacker.getName());
        System.out.println("Выберите действие, где:\n1 - Применить критическую атаку\nДругое - Применить обычную атаку");
        int task = scn.nextInt();
        if (task == 1) {
            if (attacker.getCountOfCriticalAttacks() < 2) {
                scn.nextLine();
                System.out.println("Нажмите Enter, чтобы бросить кубик");
                scn.nextLine();
                damage = attacker.causeCriticalDamage(diceResult);
                defender.getDamage(damage);
                attacker.changeCountOfCriticalAttacks();
                if (attacker.getCountOfDefaultAttacks() >= 3)
                    attacker.resetCountOfDefaultAttacks();
            } else {
                System.out.println("Нельзя наносить критический урон более 2 раз подряд!\n" +
                        "Применяется автоматическая обычная атака.");
                scn.nextLine();
                System.out.println("Нажмите Enter, чтобы бросить кубик");
                scn.nextLine();
                damage = attacker.causeDamage(diceResult);
                defender.getDamage(damage);
                attacker.changeCountOfDefaultAttacks();
                if (attacker.getCountOfDefaultAttacks() >= 3) {
                    attacker.resetCountOfCriticalAttacks();
                }
            }
        } else {
            scn.nextLine();
            System.out.println("Нажмите Enter, чтобы бросить кубик");
            scn.nextLine();
            damage = attacker.causeDamage(diceResult);
            defender.getDamage(damage);
            attacker.changeCountOfDefaultAttacks();
            attacker.resetCountOfCriticalAttacks();
        }
    }

}
