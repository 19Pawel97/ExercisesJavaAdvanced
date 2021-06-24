package collections.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBooksByGenre(Genre genre) {
        List<Book> theBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                theBooks.add(book);
            }
        }
        return theBooks;
    }

    public List<Book> getBooksBefore(int releaseDate) {
        List<Book> theBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getReleaseDate() < releaseDate) {
                theBooks.add(book);
            }
        }
        return theBooks;
    }

    public Book getTheMostExpensiveBook() {
        Book theBook = null;
        for (Book book : books) {
            if (theBook == null || theBook.getPrice() < book.getPrice()) {
                theBook = book;
            }
        }
        return theBook;
    }

    public Book getTheCheapestBook() {
        Book theBook = null;
        for (Book book : books) {
            if (theBook == null || theBook.getPrice() > book.getPrice()) {
                theBook = book;
            }
        }
        return theBook;
    }

    public List<Book> getBookNumberOfAuthors(int NumberOfAuthors) {
        List<Book> theBooks = new ArrayList<>();
        for (Book book : books) {
            if(book.getAuthors().size() == NumberOfAuthors) {
                theBooks.add(book);
            }
        }
        return theBooks;
    }

    public List<Book> getBooksSorted(SortOrder sortOrder) {
            Collections.reverse(books);
            return books;
    }

    public boolean isBook(Book book) {
        return books.contains(book);
    }

    public List<Book> findBooksBy(Author author) {
        List<Book> theBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                theBooks.add(book);
            }
        }
        return theBooks;
    }
}
