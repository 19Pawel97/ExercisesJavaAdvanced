package Exceptions.exercise2;

public class NoBookFoundException extends Exception {
    public NoBookFoundException(String notFound) {
        super(notFound + " not found!");
    }
}
