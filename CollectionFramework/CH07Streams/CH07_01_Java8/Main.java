package CollectionFramework.CH07Streams.CH07_01_Java8;

public class Main {
    public static void main(String[] args) {
        /*
        Streams

        java8-> minimal code, functional programming
        java8-> lambda exp, streams, date & time api


        lambda exp is an anonymous fun(no name, no return type, no access modifier)


         */
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });

        MathOps sum = ( a,  b) -> a + b;
        MathOps diff = (a, b) -> a - b;

    }
    interface MathOps{
        int operator(int a, int b);
    }
}
