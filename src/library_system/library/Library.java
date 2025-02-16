package library_system.library;

import library_system.books.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void displayBooks() {
        if (!bookList.isEmpty()) {
            System.out.println("Книг в библиотеке: " + bookList.size());
            for (Book book : bookList) {
                book.displayInfo();
                System.out.println();
            }
        } else {
            System.out.println("В библиотеке нет книг");
        }
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

}
