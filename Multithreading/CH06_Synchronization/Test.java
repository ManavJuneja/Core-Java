package Multithreading.CH06_Synchronization;

public class Test {
    public static void main(String[] args) {
        //When one object is shared btw more than one thread it may occur we get incorrect results

        //Then check in your program where the shared resources are accessed or modified known as critical section
        //Add synchronized keyword to it

        //when we are not using syn keyword that condition is known as race-condition

        //Mutual exclusion insures that multiple thread shouldn't access critical section
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
