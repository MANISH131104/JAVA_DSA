package Two_D_Array;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,5},{1,3,7,2,8},{9,3,4,5,2}};
        for(int i=0;i<arr.length;i++){
            for(int ele:arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
