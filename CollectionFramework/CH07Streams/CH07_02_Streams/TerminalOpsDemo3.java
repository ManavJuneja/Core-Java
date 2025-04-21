package CollectionFramework.CH07Streams.CH07_02_Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOpsDemo3 {
    public static void main(String[] args) {
        //Stream se result nikalwana ha

        List<Integer> list = Arrays.asList(1,2,3,4);

        //1.collect
        list.stream().skip(1).toList();
        list.stream().skip(1).collect(Collectors.toList());
//        list.stream().skip(1).collect(Collectors.toSet());
//        list.stream().skip(1).collect(Collectors.toMap());

        //2.forEach
        list.stream().forEach(x-> System.out.println(x));

        //3.reduce : combine element for single result
        //optional bhi ismine value ho bhi skti ha or nhi bhi ho skti
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        //4.count()

        //5. anyMatch, allMatch, noneMatch(Short Circuit Operations)->
        //ShortCircuitOps mean as soon as they find something they stop
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //6.findFirst, findAny(Short Circuit Operation)
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        //Examples Filtering and Collection Name
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        //Example Squaring and Sorting Number
        List<Integer> numbers = Arrays.asList(5,3,2,6,4);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        //Example Summing Values
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        System.out.println(number.stream().reduce(Integer::sum).get());


        //Example Counting Occurrences of Character
        String sentence = "Hello World";
//        IntStream chars = sentence.chars();
        System.out.println(sentence.chars().filter(x ->x == 'l').count());


        //State-full -> agar koi operation ha usko pata hoga baaki ke element ke baare mein Example distinct and sorting
        //State-less -> oposite kisi ke baare mein nhi pata like maps

        //toArray()

        //min / max
        Optional<Integer> max = Stream.of(2, 44, 94).max(Comparator.naturalOrder());
        System.out.println(max);

        Optional<Integer> min = Stream.of(2, 3, 4, 41, 1, 4).min(Comparator.naturalOrder());
        System.out.println(min);




    }
}
