package questionOnArray;
import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of an array : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0 ;i<n ;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest element in an array is : "+min);
    }
}
