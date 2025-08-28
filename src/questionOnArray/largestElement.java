package questionOnArray;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of an array : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
      // int max = Integer.MIN_VALUE;
      //  for(int=0 ;i<n ;i++){
      //      if(arr[i]>max){
       //         max=arr[i];
       //     }
      //  }


        int max = arr[0];
        for(int i=0 ;i<n ;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest element of an array is : "+max);
    }
}
