package Multithreading.MethodsOfThreads.DaemonMethod;

public class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Hello World!");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();//User Thread -> Doing use-full work like business logics
        //Daemons Thread -> Background mein chalteh ha
        //JVM don't wait for daemon threads
        t1.setDaemon(true);//t1 ko daemon thread bana dia
        t1.start();//Daemon ko runnable state mein daal dia
        // main end it don't care for daemon thread
//        t1.join();
        System.out.println("Main Done");
    }
}
