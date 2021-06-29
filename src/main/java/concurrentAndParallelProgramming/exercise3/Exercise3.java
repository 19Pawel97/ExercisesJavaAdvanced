package concurrentAndParallelProgramming.exercise3;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10000];
        int[] array1 = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50000);
            array1[i] = array[i];
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Arrays.stream(array).sorted();
                System.out.println("Finished sorting array");
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Arrays.stream(array1).sorted();
                System.out.println("Finished sorting array1");
            }
        });

        thread.start();
        thread1.start();
    }
}
