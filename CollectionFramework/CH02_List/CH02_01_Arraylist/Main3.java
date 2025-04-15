package CollectionFramework.CH02_List.CH02_01_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);
        list.remove(Integer.valueOf(1));

        Collections.sort(list);

        list.sort(null);

    }
}
