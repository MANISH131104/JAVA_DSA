package questionOnArray;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.print("ENTER ELEMENTS : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER TARGET SUM : ");
        int target = sc.nextInt();
        for(int i=0 ;i<n ;i++){
           for(int j=i+1 ;j<n ;j++){
               if(arr[i]+arr[j]== target){
                   System.out.println("index's : " +i+" "+j);
               }
           }
        }
    }

}
