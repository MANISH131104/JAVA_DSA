package Two_D_Array;

public class Transpose {
    private static void print(int[][] arr){
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7},{1,3,7,2},{9,9,4,5},{5,9,8,5}};
        print(arr);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
    }
}
