package CollectionFramework.CH07Streams.CH07_01_Java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function kuch kam karegea work for us
        Function<Integer, Integer> doubleIT = x -> 2 * x;
        Function<Integer, Integer> tripleIT = x -> 3 * x;
        //and then mein pehel doubleIT and after tripleIT
        System.out.println(doubleIT.andThen(tripleIT).apply(20));
        //compose mein pehel tripleIt and after double it
        System.out.println(doubleIT.compose(tripleIT).apply(20));

    }
}
