package lesson7;

import java.util.Scanner;

public class Main {
// Static, методы принадлежат не экземплярам класса, а самому классу.
// Нужен конкретный метод, а не экземпляр
    public static void main(String[] args) {
        Person person = new Person("Kseniya", 18);
        int age = person.getAge();

   /*   String hello = "hello";
        String a = "hello";
        если объявлять через кавычки, два разных объекта не создаются, а ссылаются
        на одну строку в пуле, а в классах создаются разные объекты в разных ячейках памяти*/

        Cat lari = new Cat();
        lari.makeSound();
        enterDayOfWeek();
    }

    public static void enterDayOfWeek() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toUpperCase();
        System.out.println(DayOfWeek.MONDAY.name());
        if (input.equals(DayOfWeek.MONDAY.name()) || input.toLowerCase().equals(DayOfWeek.MONDAY.value)) {
            System.out.println("It is Monday");
        } else {
            System.out.println("It's not Monday");
        }
    }

}
