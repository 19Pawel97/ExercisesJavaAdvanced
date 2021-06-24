package collections.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Exercise2 {
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

        BookService bookService = new BookService();
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.remove(book2);
        List<Book> books = bookService.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }

        bookService.addBook(book2);
        bookService.addBook(book3);
        List<Book> booksByGenre = bookService.getBooksByGenre(Genre.ACTION);
        for (Book book : booksByGenre) {
            System.out.println(book.getTitle());
        }

        for (Book book : bookService.getBooksBefore(1900)) {
            System.out.println(book.getTitle());
        }

        Book theMostExpensiveBook = bookService.getTheMostExpensiveBook();
        System.out.println(theMostExpensiveBook.getTitle());

        Book theCheapestBook = bookService.getTheCheapestBook();
        System.out.println(theCheapestBook.getTitle());

        for (Book bookNumberOfAuthor : bookService.getBookNumberOfAuthors(2)) {
            List<Author> authors = bookNumberOfAuthor.getAuthors();
            for (Author author : authors) {
                System.out.println(author.getName() + " " + author.getSurname());
            }
        }

        for (Book book : bookService.getBooksSorted(SortOrder.DEC)) {
            System.out.println(book.getTitle());
        }

        bookService.remove(book3);
        boolean isBook = bookService.isBook(book3);
        String isBookInRepo = (isBook) ? "There is." : "No book in repo";
        System.out.println(isBookInRepo);

        Author author = new Author("Ian", "Fleming", Gender.MALE);
        for (Book book : bookService.findBooksBy(author)) {
            System.out.println(book.getTitle());
        }

    }
}
