package CollectionFramework.CH03_Maps.CH03_03_Comparable;

import java.util.ArrayList;
import java.util.List;

//When we need to tell a class how you need to sort things
/*
Comparable is used to define the natural ordering of objects (implements compareTo() in the class itself).

Comparator is used for custom ordering (implements compare() in a separate class or using lambda).
 */
public class Main {

    public static void main(String[] args) {
        List<StudentClass> list = new ArrayList<>();

        list.add(new StudentClass("Alice", 3.6));
        list.add(new StudentClass("Bob", 3.2));
        list.add(new StudentClass("Charlie", 3.8));
        list.add(new StudentClass("Diana", 3.9));
        list.add(new StudentClass("Ethan", 2.7));
        list.add(new StudentClass("Fiona", 3.5));
        list.add(new StudentClass("George", 2.9));

        list.sort(null);
        System.out.println(list);
    }
}

