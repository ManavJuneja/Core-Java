package Multithreading.CH07_Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 150;

    private final Lock lock = new ReentrantLock();//lock interface ka implementation ha
    public  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing withdrawal");
                        Thread.sleep(3000);//Simulate time taken
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Withdraw of " + amount + " is completed" + " and remaining balance " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                    balance -= amount;
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "could not acquire the lock try again later.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();//Good practice
        }
    }
}
