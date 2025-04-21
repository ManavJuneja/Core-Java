package CollectionFramework.CH03_Maps.CH03_02_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 79);
        studentMap.put("Steven", 89);
        studentMap.put("Gary", 29);
        studentMap.put("Bary", 95);
        studentMap.get("Bob");
        System.out.println(studentMap);


    }
}
