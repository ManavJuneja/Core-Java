package CollectionFramework.CH02_List.CH02_02_Comparator;
/*
Comparable is used to define the natural ordering of objects (implements compareTo() in the class itself).

Comparator is used for custom ordering (implements compare() in a separate class or using lambda).
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}
// s1  s2
// "ok"  "Bye"
// 2 3 -> 2 -3 = -1 //ascending
// 3 2 -> 3 - 2 = 1 // descending


class MyInteger implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2){
        return i2 - i1;
    }
}
// 3 5
//5 - 3 = 2 ascending order
//3 - 5 = -2 descending order
public class Main {
    public static void main(String[] args) {

        List<Integer>nums = Arrays.asList(1,2,3,4,5,6);
        nums.sort(new MyInteger());
        System.out.println(nums);


        List<String> list = Arrays.asList("banana", "apple", "date", "mango");
        list.sort(new StringLengthComparator());
        System.out.println(list);

    }
}
