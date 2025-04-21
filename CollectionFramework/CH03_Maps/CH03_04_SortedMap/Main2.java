package CollectionFramework.CH03_Maps.CH03_04_SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;
//Treemap is implementation of sortedmap
public class Main2 {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Ram",21);
        map.put("Sham",94);
        map.put("Harry",9);
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(String.valueOf(21)));




    }
}
