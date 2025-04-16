package CollectionFramework.CH02_List.CH02_06_CopyOnWrite;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        CopyOnWriteArrayList will create a new copy of the array when any modifications
        (like add, remove, set, etc.) are made, ensuring that readers always get a consistent
        view of the list.

        For write copy new copy of the list is create for every modification
        The reference to then updated so that subsequent reads use this new list
         */
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list .add("ram");
    }
}
