package CollectionFramework.CH07Streams.CH07_01_Java8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //use in db update
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());
    }
}
