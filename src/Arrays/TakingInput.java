package Arrays;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF AN ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input
        System.out.println("ENTER ARRAY ELEMENTS : ");
        for(int i=0 ;i<n ;i++) {
            arr[i] = sc.nextInt();
        }
        // output
        for(int i=0 ;i<n ;i++) {
          //  System.out.print(arr[i]+" ");
            System.out.print(arr[i]*2+" ");
        }

    }
}
