package Multithreading.CH07_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();
/*
It acts as count for lock
A Reentrant Lock (also called recursive lock) is a lock that
can be acquired multiple times by the same thread without
causing a deadlock.

It allows the same thread to enter a critical section repeatedly without blocking itself.
 */
    public void outerMethod(){
        lock.lock();//countOfLock = 1
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();//countOfLock = 0 Now new thread can enter
        }
    }

    public void innerMethod(){
        lock.lock();//countOfLocks = 2
        try{
            System.out.println("Inner method");
        }finally {
            lock.unlock();//countOfLocks = 1 go to line21
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
