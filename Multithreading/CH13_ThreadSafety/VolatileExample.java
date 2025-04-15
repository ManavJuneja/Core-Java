package Multithreading.CH13_ThreadSafety;
//Every thread have local copy of variable ki apne cache mein
class SharedObj{
    private volatile boolean flag = false;
    //volatile keyword indicate that variable may be changed by different thread
    //Insures the visibility of changes to variable across threads
    //No caching by CPU cores or thread local storage allowed
    public void setFlagTrue(){
        flag = true;
    }
    public void printIfFlagTrue(){
        while (!flag){
            //do nothing
        }
        System.out.println("Flag is true");
    }

}
public class VolatileExample {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();
        Thread writeThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedObj.setFlagTrue();
        });
        Thread readerThread = new Thread(()-> {
            sharedObj.printIfFlagTrue();
        });

        writeThread.start();
        readerThread.start();
    }
}
