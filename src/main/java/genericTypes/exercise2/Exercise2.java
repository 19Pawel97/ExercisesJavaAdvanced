package genericTypes.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;
        int i = countIf(integers, new Validator<Integer>() {
            @Override
            public boolean validate(Integer valueToBeValidated) {
                return valueToBeValidated < 5 && valueToBeValidated > 2;
            }
        });
        System.out.println(i);
    }

    private static <T> int countIf(T[] table, Validator<T> validator) {
        int counter;
        counter = 0;
        for (T t : table) {
            if (validator.validate(t)) {
                counter++;
            }
        }
        return counter;
    }
}
