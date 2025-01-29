package lesson7;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public можно в любом файле вызывать, а private только в классе
    public int getAge() {
        return age;
    }
}
