package CollectionFramework.CH03_Maps.CH03_02_LinkedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Order maintain hota ha
//There is a double LL in Linked HashMap
//Store the insertion order in LL
//that is why it is little slow as compare to other
//
public class Main {
    public static void main(String[] args) {
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(11,0.3f,true);
//        map.put(9,"Manav");
//        map.put(3,"Maanu");
//        map.put(5,"Sahan");
//        System.out.println(map);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice",55);
        hashMap.put("Bob", 44);
        hashMap.put("Charlie",68);

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Integer res = hashMap.getOrDefault("Bob",0);
        Integer res2 = hashMap.getOrDefault("Manav",99);
        System.out.println(res2);
        System.out.println(res);

        hashMap.putIfAbsent("Manav",99);
        for(Map.Entry<String, Integer> i:entries){
            System.out.println(i);
        }

    }
}
