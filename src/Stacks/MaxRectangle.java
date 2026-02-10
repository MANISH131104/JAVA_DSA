package Stacks;
import java.util.Stack;

public class MaxRectangle {
    public static int getMaxArea(int arr[]) {
        int n = arr.length;
        int[] nse = new int[n];
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        while(st.size()>0) st.pop();

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i=1;i<=n-1;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area = arr[i] * (nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }

    static int maxArea(int mat[][]) {
        int m = mat.length, n = mat[0].length;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1) mat[i][j]+= mat[i-1][j];
            }
        }
        int max = 0;
        for(int[] row : mat){
            int area = getMaxArea(row);
            max = Math.max(max,area);
        }
        return max;
    }
}
