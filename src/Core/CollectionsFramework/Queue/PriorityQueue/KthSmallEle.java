package Core.CollectionsFramework.Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallEle {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,100,89};
        int big = kthsmall(arr,2);
        System.out.println(big);
    }

    private static int kthsmall(int[] arr, int i) {
        Comparator<Integer> ic = (i1,i2)->-(i1.compareTo(i2));
        PriorityQueue<Integer> pq = new PriorityQueue<>(ic);
        for (int ele: arr){
            pq.add(ele);
            if(pq.size()>i){
                pq.poll();
            }
        }
        return pq.peek();

    }
}
