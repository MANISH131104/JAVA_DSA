package questionOnArray;

public class printNegativeValue {
    public static void main(String[] args) {
        int[] arr = {2, -5, 6, -9, -5, 8, -4};
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
