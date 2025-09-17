package Two_D_Array;

public class sum_ofAllElement {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum = sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
