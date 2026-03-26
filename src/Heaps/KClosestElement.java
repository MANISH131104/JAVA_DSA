package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;

class pair implements Comparable<pair>{
    int diff;
    int num;
    pair(int diff,int num){
        this.diff = diff;
        this.num = num;
    }
    public int compareTo(pair p) {
        if(this.diff == p.diff)
            return p.num - this.num;
        return this.diff - p.diff;
    }
}

public class KClosestElement {
    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int idx=0;
        int diff = x-arr[idx++];
        int num = arr[idx++];
        pq.add(new pair(diff,num));
        if(pq.size()>k) pq.remove();

        int ans[] = new int[k];
        for(int i = k - 1; i >= 0; i--){
            ans[i] = pq.remove().num;
        }
        return ans;
    }
}
