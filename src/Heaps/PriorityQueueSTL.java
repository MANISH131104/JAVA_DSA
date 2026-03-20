package Heaps;
import java.util.*;

public class PriorityQueueSTL {
    public static void main(String[] args) {
        // MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        System.out.println(pq);

        for(int ele: pq){
            System.out.print(ele+" ");
        }
    }
}
