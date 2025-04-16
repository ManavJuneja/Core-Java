package CollectionFramework.CH02_List.CH02_05_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(24);
        stack.push(99);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        System.out.println(stack.search(23));
        System.out.println(stack.search(Integer.valueOf(23)));

    }
}
