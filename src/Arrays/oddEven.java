package Arrays;
import java.util.Scanner;

public class oddEven {
    public static void print(int[] arr) {
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if(arr[left] % 2==1 && arr[right]%2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
           if(arr[right]%2==1){
               right--;
           }
        }
        print(arr);

    }
}
