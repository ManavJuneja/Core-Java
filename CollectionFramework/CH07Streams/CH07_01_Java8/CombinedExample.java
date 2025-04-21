package CollectionFramework.CH07Streams.CH07_01_Java8;

import java.util.function.*;

public class CombinedExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
        //There are also BiFunction BiConsumer BiPredicate not BiProducer because produce toh ik hi cheez ho gi

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));
//        BiConsumer<>
    BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));
    }
}
