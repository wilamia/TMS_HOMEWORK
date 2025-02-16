package library_system.books;

abstract public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void displayInfo() {
        System.out.printf("Название книги: %s\n" +
                "Автор: %s\n" +
                "Год публикации: %d\n", title, author, yearOfPublication);
    }
}
