package Two_D_Array;

public class minEleOutOfMaxEleOfEachRow {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,5},{1,3,7,2,8},{9,3,4,5,2}};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            if(min>max){
                min = max;
            }
        }
        System.out.println(min);
    }
}
