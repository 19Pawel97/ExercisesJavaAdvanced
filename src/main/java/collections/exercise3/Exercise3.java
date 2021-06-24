package collections.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(50));
        }

        Set<Integer> set = integers.stream().collect(Collectors.toSet());
        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println();

        List<Integer> repeatedElements = new ArrayList<>();
        for (Integer integer : integers) {
            if (set.contains(integer)) {
                repeatedElements.add(integer);
            }
        }
        for (Integer repeatedElement : repeatedElements) {
            System.out.println(repeatedElement);
        }

    }
}
