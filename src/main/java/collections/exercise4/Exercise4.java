package collections.exercise4;

import collections.exercise2.Author;
import collections.exercise2.Book;
import collections.exercise2.Gender;
import collections.exercise2.Genre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Exercise4 {
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

        BookServiceExtended bookServiceExtended = new BookServiceExtended();
        bookServiceExtended.addBook(book1);
        bookServiceExtended.addBook(book2);
        bookServiceExtended.addBook(book3);
        Map<Genre, String> map = bookServiceExtended.getMap();
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
