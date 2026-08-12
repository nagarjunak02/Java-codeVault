package Core.CollectionsFramework.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class KthBigEle {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,100,89};
        int big = kthbig(arr,2);
        System.out.println(big);
    }

    private static int kthbig(int[] arr, int i) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele:arr){
            pq.add(ele);
            if(pq.size()>i){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
