package Arrays;
import java.util.Scanner;

public class sortZeroAndOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                count++ ;

            }
        }

        for (int i = 0; i < n ; i++) {
           if(i < count){
               arr[i] = 0;
               System.out.print(arr[i]+" ");
           }
           else {
               arr[i] = 1;
               System.out.print(arr[i]+" ");
           }
        }


    }
}
