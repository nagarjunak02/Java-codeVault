package Core.CollectionsFramework.LinkedList.Student;

import java.util.LinkedList;

public class QueueMethods {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        String c1 = "Ramesh";
        String c2 = "Suresh";
        String c3 = "Mahesh";
        String c4 = "Ganesh";

        // offer() -> Adds an element at the rear (end) of the queue.
        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);
        queue.offer(c4);

        System.out.println("After offer(): " + queue);

        // peek() -> Returns the front element without removing it.
        System.out.println("peek(): " + queue.peek());
        System.out.println("After peek(): " + queue);

        // poll() -> Returns and removes the front element.
        System.out.println("poll(): " + queue.poll());
        System.out.println("After poll(): " + queue);

        // element() -> Returns the front element without removing it.
        // Throws NoSuchElementException if the queue is empty.
        System.out.println("element(): " + queue.element());
        System.out.println("After element(): " + queue);

        // remove() -> Returns and removes the front element.
        // Throws NoSuchElementException if the queue is empty.
        System.out.println("remove(): " + queue.remove());
        System.out.println("After remove(): " + queue);
    }
}