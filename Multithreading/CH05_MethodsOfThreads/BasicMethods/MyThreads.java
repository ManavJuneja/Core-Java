package Multithreading.MethodsOfThreads.BasicMethods;

public class MyThreads extends Thread{
    @Override
    public void run(){//contain code that a thread will execute when it runs
            try {
                System.out.println("Thread is running");
                Thread.sleep(5000);//Current thread ki execution ko suspend kar dia jae ga specified period ke lia
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }//But to actually start a thread, we need to call start(), not run()

    public static void main(String[] args) throws InterruptedException {
        MyThreads t1 = new MyThreads();
        t1.start();//JVM call run method of the Thread class

        t1.join();//The main method wait for t1 thread to be complete after that main move further

        System.out.println("Hello");//"Hello" will print after 5 second main method waited for t1 to completed



    }
}
