package Multithreading.CH01_ThreadClass;

public class World extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("World");
        }
    }
}
