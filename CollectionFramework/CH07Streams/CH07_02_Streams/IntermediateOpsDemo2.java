package CollectionFramework.CH07Streams.CH07_02_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOpsDemo2 {
    public static void main(String[] args) {
        //Intermediate ops transform a stream into another stream
        //They are lazy, meaning they don't execute until a terminal ops is invoked

        List<String> list = Arrays.asList("Aana", "Chana", "Bana", "Aahu","Aana");

        //1.filter
        Stream<String> filterStream = list.stream().filter(x -> x.startsWith("A"));
        //No filtering at this point
        long res = filterStream.count();
        System.out.println(res);


        //2.map
        Stream<String> stream = list.stream().map(String::toUpperCase);
        //didn't execute till now

        //3.sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sorted1 = list.stream().sorted((a, b) -> a.length() - b.length());

        //4.distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        //5.limit
        System.out.println(Stream.iterate(1, x->x+1).limit(100).count());

        //6.skip
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());

        //7.peek
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println);

        //8. flatMap
        //handle stream of collections, lists, or arrays share each element is itself a collection


    }
}
