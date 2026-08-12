package Core.CollectionsFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2 {
        public static void main(String[] args) {

            Queue<Integer> pq = new PriorityQueue<>();

            // add() -> adds element according to heap
            pq.add(40);
            pq.add(10);
            pq.add(30);

            // offer() -> adds element according to heap
            pq.offer(20);

            System.out.println("PriorityQueue : " + pq);

            // peek() -> returns highest-priority element
            // Default PriorityQueue = Min-Heap
            System.out.println("peek() : " + pq.peek());

            // element() -> returns highest-priority element
            System.out.println("element() : " + pq.element());

            // poll() -> removes highest-priority element
            System.out.println("poll() : " + pq.poll());

            // remove() -> removes highest-priority element
            System.out.println("remove() : " + pq.remove());

            System.out.println("PriorityQueue : " + pq);

            System.out.println("size() : " + pq.size());
            System.out.println("contains(30) : " + pq.contains(30));
            System.out.println("isEmpty() : " + pq.isEmpty());

            pq.clear();

            System.out.println("After clear() : " + pq);
        }
    }
