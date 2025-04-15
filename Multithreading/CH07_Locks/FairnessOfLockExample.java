package Multithreading.CH07_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Kisko pehle lock milega usko kehteh ha fairness

public class FairnessOfLockExample {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try{
            System.out.println(System.currentTimeMillis() + " | " +
                    Thread.currentThread().getName() + " trying to acquire lock");

            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+ " released the lock.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FairnessOfLockExample example = new FairnessOfLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");
        t1.start();
        Thread.sleep(50);
        t2.start();
        Thread.sleep(50);
        t3.start();
    }
}
