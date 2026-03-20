package Heaps;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int KthLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();      // minHeap
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
