package concurrentAndParallelProgramming.exercise2;

public class Bridge {
    public static void driveThrough(Car car) {
        System.out.println("Starting driving.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished!");
    }
}
