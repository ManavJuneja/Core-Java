package Multithreading.CH02_RunnableInterface;

public class World implements Runnable{
    @Override
    public void run(){
        while(true) {
            System.out.println("World");
        }
    }
}
