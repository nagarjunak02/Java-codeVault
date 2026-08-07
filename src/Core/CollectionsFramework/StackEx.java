package Core.CollectionsFramework;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack : " + stack);

        // peek()
        System.out.println("Top Element : " + stack.peek());

        // pop()
        System.out.println("Removed : " + stack.pop());
        System.out.println("After Pop : " + stack);

        // search()
        System.out.println("Position of 20 : " + stack.search(20));

        // empty()
        System.out.println("Is Stack Empty? : " + stack.empty());

    }
}