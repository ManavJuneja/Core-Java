package CollectionFramework.CH03_Maps.CH03_04_SortedMap;

import java.util.*;
//It is an interface
public class Main {
    public static void main(String[] args) {
        SortedMap<String,Integer> sortedMap = new SortedMap<String, Integer>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedMap<String, Integer> subMap(String fromKey, String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, Integer> headMap(String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, Integer> tailMap(String fromKey) {
                return null;
            }

            @Override
            public String firstKey() {
                return "";
            }

            @Override
            public String lastKey() {
                return "";
            }

            @Override
            public Set<String> keySet() {
                return Set.of();
            }

            @Override
            public Collection<Integer> values() {
                return List.of();
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return Set.of();
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return 0;
            }

            @Override
            public Integer put(String key, Integer value) {
                return 0;
            }

            @Override
            public Integer remove(Object key) {
                return 0;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }
        };
    }
}
