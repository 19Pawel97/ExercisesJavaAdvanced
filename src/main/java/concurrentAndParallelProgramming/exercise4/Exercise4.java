package concurrentAndParallelProgramming.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        Account account = new Account(10000);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    account.pay(20000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                account.transfer(4000);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                account.transfer(3000f);
            }
        });

        thread.start();
        thread1.start();
        thread2.start();
    }
}
