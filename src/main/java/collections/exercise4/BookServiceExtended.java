package collections.exercise4;

import collections.exercise2.Author;
import collections.exercise2.Book;
import collections.exercise2.Genre;
import collections.exercise2.SortOrder;

import java.util.*;

public class BookServiceExtended {
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
            if (book.getAuthors().size() == NumberOfAuthors) {
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

    public Map<Genre, String> getMap() {
        Map<Genre, String> map = new HashMap<>();
        for (Book book : books) {
            Genre genre = book.getGenre();
            String title = book.getTitle();
            map.put(genre,title);
        }
        return map;
    }
}

