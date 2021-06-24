package classesInterfaces.exercise4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class User {
    private String name, surname, age, login, password;

    public void setSurname(String surname, Validator<String> validator) {
        if (validator.validate(surname)) {
            this.surname = surname;
        }
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public void setAge(String age, Validator<String> validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }
}
