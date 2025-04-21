package CollectionFramework.CH03_Maps.CH03_07_ConcurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        //java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        //only the segment being written to or read from is locked
        //read: do not require locking unless there is a write ops happening on the same segments
        //write: lock

        //java 8 --> no segmentation
        //compare and swap approach --> no locking except resizing or collision
        //thread a last saw --> x = 42
        //thread a work --> x to 50
        //if x is still 42 then change to 50 and retry

        /*
ConcurrentSkipListMap<K,V> is a thread-safe, sorted map from the java.util.concurrent package.
It implements the ConcurrentNavigableMap interface and is based on a Skip List data structure.
✅ Key Features:
Thread-safe: Multiple threads can safely access and modify it without external synchronization.
Sorted: Entries are kept in ascending key order (just like TreeMap).
Non-blocking Reads: Thanks to the skip list under the hood, reads don’t block writes—performance win.
Scalable: Ideal for highly concurrent apps that need sorted maps.
🔧 Use Case:
When you want a concurrent version of TreeMap, use ConcurrentSkipListMap. It’s faster than synchronized SortedMap in multithreaded environments.
         */
    }
}
