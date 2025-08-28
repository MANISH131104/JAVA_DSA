package Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS : ");
        for(int i=0 ;i<n ;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0 ;i<arr.length ;i++) {
            sum = sum+arr[i] ;
        }
        System.out.println("THE SUM OF THE ELEMENTS IS : "+sum);
    }
}
