package collections.exercise5;

import collections.exercise2.Author;
import collections.exercise2.Book;
import collections.exercise2.Gender;
import collections.exercise2.Genre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Doctor No",
                55.5,
                1958,
                new ArrayList<Author>(
                        Collections.singleton(new Author("Ian", "Fleming", Gender.MALE))),
                Genre.ACTION
        );

        Book book2 = new Book(
                "Why Nations Fail",
                30,
                2012,
                new ArrayList<Author>(
                        List.of((new Author("Daron", "Acemoğlu", Gender.MALE)), new Author("James", "Robinson", Gender.MALE))),
                Genre.SCIENTIFIC_PAPER
        );

        Book book3 = new Book(
                "I heard You Paint Houses",
                20,
                2004,
                new ArrayList<Author>(
                        Collections.singleton(new Author("Charles", "Brandt", Gender.MALE))),
                Genre.BIOGRAPHY
        );

        BookService5 bookService5 = new BookService5();
        bookService5.addBook(book1);
        bookService5.addBook(book2);
        bookService5.addBook(book3);
        for (Book book : bookService5.createStack()) {
            System.out.println(book);
        }

    }
}
