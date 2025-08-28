package TwoDArray.java;

public class initialization {
    public static void main(String[] args) {
        //int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;


        int[][] arr2 = {{1,5,6},
                        {7,9,11},
                        {8,1,1}};
        for(int i=0 ;i< arr2.length ;i++){
            for(int j=0 ;j<arr2[i].length ;j++){
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }
    }
}
