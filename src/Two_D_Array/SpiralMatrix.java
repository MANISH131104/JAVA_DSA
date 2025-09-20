package Two_D_Array;
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        ArrayList<Integer> result = spirallyTraverse(arr);
        System.out.println(result);
    }
    public static ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m=arr.length,n=arr[0].length;
        int first_Row=0;
        int last_Row= m-1;
        int first_cols=0;
        int last_cols=n-1;
        while(first_Row<=last_Row && first_cols<=last_cols){
            // Right
            for(int j=first_cols;j<last_cols;j++)
               ans.add(arr[first_Row][j]);
            first_Row++;
            if(first_Row>last_Row || first_cols>last_cols) break;
            // Down
            for(int i=first_Row;i<last_Row;i++)
                ans.add(arr[i][last_cols]);
            last_cols--;
            if(first_Row>last_Row || first_cols>last_cols) break;
            // Left
            for(int j=last_cols;j>=first_cols;j--)
                ans.add(arr[last_Row][j]);
            last_Row--;
            if(first_Row>last_Row || first_cols>last_cols) break;
            // UP
            for(int i=last_Row;i>=first_Row;i--)
                ans.add(arr[i][first_cols]);
            first_cols++;
        }
        return ans;
    }
}
