package CollectionFramework.CH04_Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        //Set is collection that cannot contains duplicate elements
        //faster ops
        //Map --> Hashmap, LinkedHashMap, TreeMap, EnumMap
        //Set --> Hashset, LinkedHashSet, TreeSet, EnumSet
        Set<Integer> set = new HashSet<>();
        set.add(12);
        System.out.println(set);
/*
❌ Collections.synchronizedSet(set)
Not safe for iteration
Needs manual synchronized blocks
Poor performance (coarse locking)
✅ Use ConcurrentHashMap.newKeySet()
Thread-safe
Safe iteration
Better concurrency performance
 */
        Set<Integer> integers = Collections.synchronizedSet(set);

        ConcurrentSkipListSet<Integer> set1 = new ConcurrentSkipListSet<>();



    }
}
