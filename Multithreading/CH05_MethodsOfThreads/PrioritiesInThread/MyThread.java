package Multithreading.CH05_MethodsOfThreads.PrioritiesInThread;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " - count : " + i);
            try{
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
    public MyThread(String name){
        super(name);
    }
//Priority are not strict rule these are just hints to JVM

    public static void main(String[] args) {
        MyThread t1 = new MyThread("High Priority Thread");
        MyThread t2 = new MyThread("Mid Priority Thread");
        MyThread t3 = new MyThread("Low Priority Thread");
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
