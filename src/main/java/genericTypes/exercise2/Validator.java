package genericTypes.exercise2;

public interface Validator <T> {
    boolean validate(T valueToBeValidated);
}
