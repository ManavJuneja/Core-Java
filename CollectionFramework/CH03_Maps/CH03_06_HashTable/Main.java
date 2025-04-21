package CollectionFramework.CH03_Maps.CH03_06_HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashtable.put(1,1);
        //same method because hashtable implements map
        /*
        Hashtable is synchronized
        no null key or value
        Legacy class, concurrentHashMap
        slower than hashmap due to syn overhead
        not key not value null
        but can be duplicate
        only linked-list is used in case of collision
        all method are syn

         */
    }
}
