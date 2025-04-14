package Multithreading.ThreadLifecycle;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();//NEW State
        System.out.println(t1.getState());
        t1.start();//RUNNABLE State
        System.out.println(t1.getState());
        //NO Running state because Runnable state states that
        //Either thread is running or ready to run
        System.out.println(Thread.currentThread().getState());//In start of program the main thread is started
        //whole program is running by main thread but when we get its state
        //it will be runnable as discussed above

        Thread.sleep(1000);
        System.out.println(t1.getState());
/*
In short:
join() makes the current thread wait until another thread finishes.
Example:
If thread A calls B.join(), then A will pause until B is done running.
Think of it like:
"Hey B, finish your work first. I'll wait." ✅
 */
        t1.join();
        System.out.println(t1.getState());
    }
}
