package classesInterfaces.exercise1;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static final Pattern REGEX
            = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

    public String[] validateEmails(String theEmail, String theAlternativeEmail) {
        @Getter
        class Email {
            private String email;
            private String alternativeEmail;

            public Email(String... emails) {
                if (theEmail.equals("") || theEmail == null || !validate(theEmail)) {
                    email = "unknown";
                } else {
                    email = theEmail;
                }
                if (theAlternativeEmail.equals("") || theAlternativeEmail == null || !validate(theAlternativeEmail)) {
                    alternativeEmail = "unknown";
                } else {
                    alternativeEmail = theAlternativeEmail;
                }
            }
        }
        Email email = new Email(theEmail);
        Email alternativeEmail = new Email(theAlternativeEmail);
        return new String[]{email.getEmail(), email.getAlternativeEmail()};
    }

    public static boolean validate(String email) {
        Matcher matcher = REGEX.matcher(email);
        return matcher.matches();
    }
}
