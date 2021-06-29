package genericTypes.exercise4;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        Book book = new Book("Doctor No", "Ian Fleming");
        Book book1 = new Book("From Russia with Love", "Ian Fleming");

        Newspaper newspaper = new Newspaper("The Economist", "Zanny Minton Beddoes");
        Newspaper newspaper1 = new Newspaper("New York Post", "Stephen Lynch");

        Film film = new Film("Snatch", "Guy Ritchie");
        Film film1 = new Film("GoldenEye", "Martin Campbell");

        Library<Book> books = new Library<>(Arrays.asList(book, book1));
        Library<Newspaper> newspapers = new Library<>(Arrays.asList(newspaper, newspaper1));
        Library<Film> films = new Library<>(Arrays.asList(film, film1));

        for (Book element : books.getElements()) {
            System.out.println(element);
        }

        for (Newspaper element : newspapers.getElements()) {
            System.out.println(element);
        }

        for (Film element : films.getElements()) {
            System.out.println(element);
        }
    }
}
