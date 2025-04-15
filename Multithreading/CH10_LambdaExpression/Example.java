package Multithreading.CH10_LambdaExpression;

public class Example {
    public static void main(String[] args) {
        //Anonymous inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();

        //Function Interface those have single abstract method
        //Ik functional interface ke samne anonymous fun likha hoa ha
        //Lambda expression can assign to functional interface reference
        Runnable runnable1 = () -> System.out.println("Hello2");
        Thread t2 = new Thread(runnable1);
        t2.start();
    }
}
