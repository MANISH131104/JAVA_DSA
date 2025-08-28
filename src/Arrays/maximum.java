package Arrays;
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF AN ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int maximum = arr[0];
        for(int i=0 ;i<arr.length ;i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("THE MAXIMUM IS : " +maximum);


    }
}
