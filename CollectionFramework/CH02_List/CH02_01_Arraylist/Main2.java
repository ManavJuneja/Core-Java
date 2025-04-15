package CollectionFramework.CH02_List.CH02_01_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Can't do add or remove on list2 as it is made of asList format but can replace
        List<String> list2 = Arrays.asList("Monday", "Tuesday", "Wednesday");

//        ArrayList<String> list3 = Arrays.asList("Hello");

        //in list3 even we can't replace
        List<Integer> list3 = List.of(1,2,3,4);

        //here is trick to make them modifiable
        List<Integer> list4 = new ArrayList<>(list3);
        list4.add(2);

        List<Integer> list5 = List.of(4, 4, 4, 5, 6, 77, 8);
        List<Integer> list6 = new ArrayList<>();
        list6.addAll(list5);
    }
}
