package Arrays;
import java.util.Scanner;

public class lastIndices {
    public static int lastOccurance(int[] arr , int x){
       int last_index = -1;
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i] == x) {
               last_index = i ;
            }
        }
        return last_index;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER LAST OCCURANCE OF ELEMENT : ");
        int x = sc.nextInt();
        System.out.println("Last occurance "+ lastOccurance(arr,x));
    }
}
