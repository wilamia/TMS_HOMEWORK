package lesson7.java_tasks;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
        // super.makeSound(); обращение к реализации класса родителя
    }
}
