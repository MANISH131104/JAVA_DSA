package Heaps;
import java.util.PriorityQueue;

public class MinCostOfRopes {
    public static int minCost(int[] arr) {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: arr){
            pq.add(ele);
        }
        while(pq.size()>1) {
            int top1 = pq.remove();
            int top2 = pq.remove();
            int sum = top1 + top2;
            cost+= sum;
            pq.add(sum);
        }
        return cost;
    }
}
