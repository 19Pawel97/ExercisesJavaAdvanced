package concurrentAndParallelProgramming.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 14300; i < 17800; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        });

        thread.start();
        thread1.start();
    }
}
