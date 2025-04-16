package CollectionFramework.CH03_Maps.CH03_01_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//creation of hashmap
        HashMap<Integer, String> student = new HashMap<>();

//To pur value
        student.put(1,"Manav");
        student.put(2,"Ram");
        student.put(3,"Sham");

//To store value at that key
        String s = student.get(3);
        System.out.println(s);
        String s1 = student.get(4);
        System.out.println(s1);


//TO check if map contain that key or value
        System.out.println(student.containsKey(2));
        System.out.println(student.containsKey(5));
        System.out.println(student.containsValue("Ram"));

//For Loop store keys in set as set always have unique element and keys are always unique so
        Set<Integer> keys = student.keySet();
        for(int i : keys){
            System.out.println(student.get(i));
        }

        for(int i : student.keySet()){
            System.out.println(student.get(i));
        }

// Entry set every entry have keys and values so if we want both we can use this
        Set<Map.Entry<Integer, String>> entries = student.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

        Set<Map.Entry<Integer, String>> entries1 = student.entrySet();
        for(Map.Entry<Integer,String> entry1 : entries1){
            System.out.println(entry1.getValue().toUpperCase());
        }

        student.remove(2);

        //below will not remove as value is different
        student.remove(3,"Kalu");

    }
}
