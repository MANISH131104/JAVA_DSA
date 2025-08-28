package questionOnArray;

public class multiplyAndAdd {
    public static void main(String[] args) {
        int[] arr = {2,9,8,4,3,6,5};
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0 ;i<arr.length ;i++) {
            if (i%2 != 0) {
                System.out.print((arr[i] * 10) + " ");
            }
            else{
                System.out.print((arr[i]+10)+" ");
            }
        }
    }
}
