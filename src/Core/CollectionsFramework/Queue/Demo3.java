package Core.CollectionsFramework.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {

        Queue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("Max PriorityQueue : " + pq);

        System.out.println("peek() : " + pq.peek());

        System.out.println("poll() : " + pq.poll());
        System.out.println("poll() : " + pq.poll());
        System.out.println("poll() : " + pq.poll());
        System.out.println("poll() : " + pq.poll());
    }
}
