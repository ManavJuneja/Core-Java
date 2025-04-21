package CollectionFramework.CH07Streams.CH07_01_Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //kuch lega par deganai
        Consumer<Integer> print= (x) ->System.out.println(x);
        print.accept(43);
        List<Integer> list = Arrays.asList(1,23,4,4,5);
        Consumer<List<Integer>> printList = x ->{
            for(int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);


    }
}
