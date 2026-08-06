package Core.CollectionsFramework.LinkedList.Student;

import java.util.LinkedList;

public class DequeMethods {
    public static void main(String[] args) {

        LinkedList<Integer> dq = new LinkedList<>();

        Integer n1 = 10;
        Integer n2 = 20;
        Integer n3 = 30;
        Integer n4 = 40;

        // addFirst() -> Adds an element at the beginning of the deque.
        dq.addFirst(n2);
        dq.addFirst(n1);

        // addLast() -> Adds an element at the end of the deque.
        dq.addLast(n3);
        dq.addLast(n4);

        System.out.println("After addFirst() & addLast() : " + dq);

        // getFirst() -> Returns the first element without removing it.
        System.out.println("getFirst() : " + dq.getFirst());

        // getLast() -> Returns the last element without removing it.
        System.out.println("getLast() : " + dq.getLast());

        // removeFirst() -> Removes and returns the first element.
        System.out.println("removeFirst() : " + dq.removeFirst());
        System.out.println("After removeFirst() : " + dq);

        // removeLast() -> Removes and returns the last element.
        System.out.println("removeLast() : " + dq.removeLast());
        System.out.println("After removeLast() : " + dq);

        // offerFirst() -> Adds an element at the beginning. Returns true if successful.
        dq.offerFirst(5);

        // offerLast() -> Adds an element at the end. Returns true if successful.
        dq.offerLast(50);

        System.out.println("After offerFirst() & offerLast() : " + dq);

        // peekFirst() -> Returns the first element without removing it. Returns null if empty.
        System.out.println("peekFirst() : " + dq.peekFirst());

        // peekLast() -> Returns the last element without removing it. Returns null if empty.
        System.out.println("peekLast() : " + dq.peekLast());

        // pollFirst() -> Removes and returns the first element. Returns null if empty.
        System.out.println("pollFirst() : " + dq.pollFirst());
        System.out.println("After pollFirst() : " + dq);

        // pollLast() -> Removes and returns the last element. Returns null if empty.
        System.out.println("pollLast() : " + dq.pollLast());
        System.out.println("After pollLast() : " + dq);

        // push() -> Pushes an element onto the front (Stack operation).
        dq.push(100);
        System.out.println("After push() : " + dq);

        // pop() -> Removes and returns the front element (Stack operation).
        System.out.println("pop() : " + dq.pop());
        System.out.println("After pop() : " + dq);
    }
}