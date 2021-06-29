package genericTypes.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2};
        swap(integers, 0, 1);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        String[] strings = new String[]{"Paul", "John"};
        swap(strings, 0, 1);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static <T> void swap(T[] table, int idx1, int idx2) {
        T first = table[idx1];
        table[idx1] = table[idx2];
        table[idx2] = first;
    }
}
