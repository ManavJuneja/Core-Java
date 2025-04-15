package CollectionFramework.CH02_List.CH02_02_Comparator;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "date", "mango");
        list.sort((a,b) -> a.length() - b.length());
        System.out.println(list);
        list.sort((a,b) -> b.length() - a.length());
        System.out.println(list);
    }
}
