package tasks_java;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printInfo() {
        System.out.println(STR."""
Название: \{this.title}
Автор: \{this.author.getName()}
Год: \{this.year}""");
        System.out.println("-------------------------------------");
    }

    /* Создайте класс Author, который будет содержать имя автора и его год рождения.
    Используйте класс Book из задачи 1 и добавьте в него ссылку на объект типа Author.
    Переопределите метод equals для сравнения двух объектов типа Book, где два объекта
    считаются одинаковыми, если у них одинаковые название и автор.*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        return this.title.equals(((Book) obj).title) && this.author.equals(((Book) obj).author);
    }


    @Override
    public int hashCode() {
        return title.hashCode() + year + author.hashCode();
    }
}
