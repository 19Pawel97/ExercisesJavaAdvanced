package classesInterfaces.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Paul", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setSurname("Freeman", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && input != null && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge("20", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return  Integer.valueOf(input) >= 0 && Integer.valueOf(input) <= 150;
            }
        });
        user.setLogin("login12345", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("password!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);
    }
}
