package lesson7;

public class Animal {
/* protected - второй после private, имеет доступ класс наследник,
либо классы в этом же пакете */
    protected Double weight;
    public int age;

    public void makeSound() {
        System.out.println("Any sound");
    }
}
