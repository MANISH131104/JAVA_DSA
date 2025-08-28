package Arrays;
import java.util.Scanner;

public class secondMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF AN ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int maximum = Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length ;i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        int second_maximum = Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length ;i++) {
            if (arr[i] > second_maximum && arr[i]!= maximum) {
                second_maximum = arr[i];
            }
        }
        System.out.println("THE MAXIMUM IS : " +maximum);
        System.out.println("THE SECOND MAXIMUM IS : "+second_maximum);


    }
}
