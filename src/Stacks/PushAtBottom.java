package Stacks;
import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);    // bottom
        st.push(20);
        st.push(30);
        st.push(40);    // top
        int ele = 50;
        System.out.println(st);
        pushAtBottom(st,ele);
    }

    private static void pushAtBottom(Stack<Integer> st, int ele) {
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }

}
