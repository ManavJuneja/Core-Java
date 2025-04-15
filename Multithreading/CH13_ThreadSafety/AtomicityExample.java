package Multithreading.CH13_ThreadSafety;

public class AtomicityExample {
    private int counter = 0;
    public void increment(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        Thread t1 = new Thread( () -> {
            for(int i = 0; i < 1000; i++){
//                volatileExample.increment();
            }
        });
    }
}
