package CollectionFramework.CH07Streams.CH07_02_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Feature introduced  in java8
        //process collections of data in a functional and declarative manner
        //simplify data processing
        //embrace functional programming
        //improve readability and maintainability
        //enable easy parallelism

        //What is stream?
        //Sequence of element support functional and declarative programming

        //How to use stream?
        //source, intermediate operation & terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//        Stream<Integer> stream = numbers.stream();
        int count = 0;
        for(int i :numbers){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        //Via streams
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        //Source -> numbers
        //Convert to stream(so we can play with them)
        //Intermediate Operation -> filter() (stream me convert karke karna kya ha)
        //Terminal Ops -> count() (end goal kya ha)



        //Creating Stream

        //1. From Collections
        List<Integer> student = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = student.stream();

        //2. From Arrays
        String[] array = {"a", "b", "c"};
        Arrays.stream(array);

        //3. Using Stream.of()
        Stream<String> stream1 = Stream.of("a","b", "c");

        //4. Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        Stream.iterate(1, x-> x + 1);

    }
}
