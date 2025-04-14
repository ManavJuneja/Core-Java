package Multithreading.RunnableInterface;

public class test {
    public static void main(String[] args) {
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
        while(true){
            System.out.println("Hello");
        }
    }
}
