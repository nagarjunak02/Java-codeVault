package Core.CollectionsFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Demo4 {
        public static void main(String[] args) {

            System.out.println("________________ArrayDeque as Queue________________");
            Queue<Integer> q = new ArrayDeque<>();

            // Queue operations

            q.add(10);
            q.add(20);
            q.add(30);

            q.offer(40);

            System.out.println("Queue : " + q);

            // View front
            System.out.println("peek() : " + q.peek());
            System.out.println("element() : " + q.element());

            // Remove front
            System.out.println("poll() : " + q.poll());
            System.out.println("remove() : " + q.remove());

            System.out.println("Queue : " + q);

            System.out.println("size() : " + q.size());
            System.out.println("contains(30) : " + q.contains(30));
            System.out.println("isEmpty() : " + q.isEmpty());

            q.clear();

            System.out.println("After clear() : " + q);


            System.out.println("______________ArrayDeque as deqeue_____________");
            Deque<Integer> dq = new ArrayDeque<>();

            // ==============================
            // FRONT OPERATIONS
            // ==============================

            // addFirst() -> inserts at front
            dq.addFirst(20);
            dq.addFirst(10);

            // offerFirst() -> inserts at front
            dq.offerFirst(5);

            System.out.println("After front operations : " + dq);


            // ==============================
            // REAR OPERATIONS
            // ==============================

            // addLast() -> inserts at rear
            dq.addLast(30);

            // offerLast() -> inserts at rear
            dq.offerLast(40);

            System.out.println("After rear operations : " + dq);


            // ==============================
            // VIEW FRONT
            // ==============================

            // getFirst() -> returns front
            System.out.println("getFirst() : " + dq.getFirst());

            // peekFirst() -> returns front
            System.out.println("peekFirst() : " + dq.peekFirst());


            // ==============================
            // VIEW REAR
            // ==============================

            // getLast() -> returns rear
            System.out.println("getLast() : " + dq.getLast());

            // peekLast() -> returns rear
            System.out.println("peekLast() : " + dq.peekLast());


            // ==============================
            // REMOVE FRONT
            // ==============================

            // removeFirst() -> removes front
            System.out.println("removeFirst() : " + dq.removeFirst());

            // pollFirst() -> removes front
            System.out.println("pollFirst() : " + dq.pollFirst());


            // ==============================
            // REMOVE REAR
            // ==============================

            // removeLast() -> removes rear
            System.out.println("removeLast() : " + dq.removeLast());

            // pollLast() -> removes rear
            System.out.println("pollLast() : " + dq.pollLast());

            System.out.println("Final Deque : " + dq);
        }
}