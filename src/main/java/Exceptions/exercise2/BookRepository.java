package Exceptions.exercise2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(String title) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException(title);
    }

    public List<Book> findBookTitle(String title) throws NoBookFoundException {
        List<Book> booksByTitle = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        if (booksByTitle.isEmpty()) {
            throw new NoBookFoundException(title);
        }
        return booksByTitle;
    }

    public Book findBookISBN(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException(isbn);
    }

    public void deleteBookISBN(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }

    }
}
