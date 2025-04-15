package Revision;

public class Main extends Thread{
    public Main(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is running...");
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(Thread.currentThread().getName() + "Pr" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        Main l = new Main("Low");
        Main m = new Main("Normal");
        Main h = new Main("High");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
