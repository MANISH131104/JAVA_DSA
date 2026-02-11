package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversefirstKofaQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        Queue<Integer> queue = reverseFirstK(q,3);
        System.out.println(queue);
    }
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (k > q.size() || k == 0) {
            return q;
        }
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i=1; i<=k; i++){
            st.push(q.remove());
        }
        while(st.size()>0) q.add(st.pop());
        for(int i=1; i<=n-k; i++){
            q.add(q.remove());
        }
        return q;

    }
}
