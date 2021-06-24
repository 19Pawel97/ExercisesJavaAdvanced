package classesInterfaces.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] validatedEmails = userValidator.validateEmails("paul.k.pl", "pawel@gmail.com");
        for (String validatedEmail : validatedEmails) {
            System.out.println(validatedEmail);
        }

    }
}
