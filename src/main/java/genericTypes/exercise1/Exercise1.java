package genericTypes.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        Pair<Integer, String> pair1 = new Pair<>(2, "two");

        System.out.println(pair);
        System.out.println(pair1);
    }
}
