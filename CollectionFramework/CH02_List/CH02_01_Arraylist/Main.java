package CollectionFramework.CH02_List.CH02_01_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Default size = 0
//Default capacity = 10

        ArrayList<Integer> list2 = new ArrayList<Integer>();//Before Java 7
        ArrayList<Integer> list = new ArrayList<>();//From Java 7
        List<Integer> list3 = new ArrayList<>();//As list is parent so can write list

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int x : list){
            System.out.println(x);
        }
        System.out.println(list.contains(3));
        list.remove(2);
        list.add(1,50);

        list.set(0,20);

        //Can print directly as it use toString method inside
        System.out.println(list);
    }
}
