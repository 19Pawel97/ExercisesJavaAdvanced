package Exceptions.exercise2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        Book book = new Book("12345","The Wealth of Nations","Adam Smith", Date.valueOf(LocalDate.of(1776,03,9)));
        Book book1 = new Book("54321","I Heard You Paint Houses","Charles Brandt", Date.valueOf(LocalDate.of(2004,01,1)));
        Book book2 = new Book("23456","Why Nations Fail","Daron Acemoğlu", Date.valueOf(LocalDate.of(2012,03,20)));
        Book book3 = new Book("65432","Who's Afraid of Virginia Woolf?","Edward Albee", Date.valueOf(LocalDate.of(1966,06,21)));
        Book book4 = new Book("09876","Doctor No","Ian Fleming", Date.valueOf(LocalDate.of(1958,03,31)));

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book);
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        for (Book bookRepositoryBook : bookRepository.getBooks()) {
            System.out.println(bookRepositoryBook);
        }
        System.out.println();


        try {
            bookRepository.deleteBook("Who's Afraid of Virginia Woolf?");
        } catch (NoBookFoundException nbfe) {
            nbfe.printStackTrace();
        }

        try {
            bookRepository.deleteBook("Why Nations Fail");
        } catch (NoBookFoundException nbfe) {
            nbfe.printStackTrace();
        }
        for (Book bookRepositoryBook : bookRepository.getBooks()) {
            System.out.println(bookRepositoryBook);
        }
        System.out.println();

        try {
            bookRepository.findBookTitle("Doctor No");
        } catch (NoBookFoundException nbfe) {
            nbfe.printStackTrace();
        }

        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);

        for (Book bookRepositoryBook : bookRepository.getBooks()) {
            System.out.println(bookRepositoryBook);
        }
        System.out.println();

        try {
            List<Book> doctor_no = bookRepository.findBookTitle("Doctor No");
            for (Book theBook : doctor_no) {
                System.out.println(theBook.getTitle());
            }

        } catch (NoBookFoundException nbfe) {
            nbfe.printStackTrace();
        }
        System.out.println();

        try {
            Book bookISBN = bookRepository.findBookISBN("23456");
            System.out.println(bookISBN.getTitle());
        } catch (NoBookFoundException nbfe) {
            nbfe.printStackTrace();
        }
        System.out.println();

        try {
            bookRepository.deleteBookISBN("23456");
        } catch (NoBookFoundException nbfe) {
            nbfe.printStackTrace();
        }

        for (Book bookRepositoryBook : bookRepository.getBooks()) {
            System.out.println(bookRepositoryBook.getAuthor() + "'s " + bookRepositoryBook.getTitle());
        }

    }
}
