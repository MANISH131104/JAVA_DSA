package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // maxHeap
        for(int ele: arr){      // nlogk
            pq.add(ele);   // logk
            if(pq.size()>k) pq.remove();    // logk
        }
        return pq.peek();
    }
}
