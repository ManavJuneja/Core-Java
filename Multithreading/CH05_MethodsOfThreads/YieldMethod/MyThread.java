package Multithreading.MethodsOfThreads.YieldMethod;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() +" is running");
            Thread.yield();//gives hint that baaki threads ko bhi mauka do
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        t1.start();
        t2.start();

    }
}
