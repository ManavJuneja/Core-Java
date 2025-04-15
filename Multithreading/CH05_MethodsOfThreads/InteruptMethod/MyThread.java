package Multithreading.CH05_MethodsOfThreads.InteruptMethod;

public class MyThread extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        }catch (InterruptedException e){
            System.out.println("Thread interrupted: "+e);
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();//this method ask thread to stop what it's doing
        /*
        ⚠️ Important:It doesn’t forcefully stop the thread.
            It's a cooperative mechanism, not a kill switch.
         */
    }
}
