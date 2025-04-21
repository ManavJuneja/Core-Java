package CollectionFramework.CH07Streams.CH07_01_Java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //Predicate --> Function Interface (Boolean value function)
        //Only hold a condition its like we are holding a condition in a variable
        //and use it when we need to use
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(3));

        Predicate<String> isWordStartWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordStartWithT = x -> x.toLowerCase().startsWith("t");
        Predicate<String> and = isWordStartWithT.and(isWordStartWithA);
        System.out.println(isWordStartWithA.test("Hello"));
    }
}
