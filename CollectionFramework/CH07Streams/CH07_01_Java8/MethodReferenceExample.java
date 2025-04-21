package CollectionFramework.CH07Streams.CH07_01_Java8;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshayam");
        list.forEach(System.out::println);//double colon is method reference

        List<String> names = Arrays.asList("A", "B", "C");


    }
}
