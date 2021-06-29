package concurrentAndParallelProgramming.exercise4;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Account {
    private float balance;

    synchronized void transfer(float amount) {
        balance += amount;
        notify();
        System.out.println("Transfer " + amount + ", balance " + balance);
    }

    synchronized void pay(float amount) throws InterruptedException {
        while (amount > balance) {
            System.out.println("Not enough money!");
            wait();
        }
        balance -= amount;
        System.out.println(String.format("Pay " + amount + ", balance" + balance));
    }
}
