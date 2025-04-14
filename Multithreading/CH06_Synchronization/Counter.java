package Multithreading.Synchonizationss;

public class Counter {
    private int count = 0;

    public synchronized void increment(){//Only need to add synchronized keyword so get then in correct order
        count++;
    }

    //If we want to synchronize a block of code then we write like below
    public void increment2(){
        synchronized (this){
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}
