package lesson7;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
        // super.makeSound(); обращение к реализации класса родителя
    }
}
