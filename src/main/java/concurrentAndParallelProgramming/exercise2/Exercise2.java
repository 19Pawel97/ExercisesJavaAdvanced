package concurrentAndParallelProgramming.exercise2;

import static concurrentAndParallelProgramming.exercise2.Bridge.driveThrough;

public class Exercise2 {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "Suv");
        Car car1 = new Car("BWM", "hatchback");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                driveThrough(car);
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                driveThrough(car1);
            }
        });

        thread.start();
        thread1.start();
    }
}
