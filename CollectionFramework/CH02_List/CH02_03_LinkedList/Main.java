package CollectionFramework.CH02_List.CH02_03_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

class Node{
    public int value;
    public Node next;//reference to next node
    Node(int data){
        this.value = data;
        this.next = null;
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);

        ll.addFirst(0);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        System.out.println(ll.get(3));

        ll.removeFirst();
        System.out.println(ll);

        ll.removeIf(x -> x%2 == 0);
        System.out.println(ll);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Cat", "Dog", "Element"));
        System.out.println(ll);


    }
}
