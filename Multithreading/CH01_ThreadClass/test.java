package Multithreading.ThreadClass;

public class test {
    public static void main(String[] args) {
        World world = new World();
        world.start();
        while (true){
            System.out.println("Hello");
        }
    }
}
