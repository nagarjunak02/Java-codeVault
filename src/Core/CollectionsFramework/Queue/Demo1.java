package Core.CollectionsFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // add() -> adds element at rear
        q.add(10);
        q.add(20);
        q.add(30);

        // offer() -> adds element at rear
        q.offer(40);

        System.out.println("Queue : " + q);

        // peek() -> returns front element without removing
        System.out.println("peek() : " + q.peek());

        // element() -> returns front element without removing
        System.out.println("element() : " + q.element());

        // poll() -> removes and returns front element
        System.out.println("poll() : " + q.poll());

        // remove() -> removes and returns front element
        System.out.println("remove() : " + q.remove());

        // size() -> number of elements
        System.out.println("size() : " + q.size());

        // contains() -> checks whether element exists
        System.out.println("contains(30) : " + q.contains(30));

        // isEmpty() -> checks whether queue is empty
        System.out.println("isEmpty() : " + q.isEmpty());

        // clear() -> removes all elements
        q.clear();

        System.out.println("After clear() : " + q);
    }
}