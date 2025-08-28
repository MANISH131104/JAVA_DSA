package Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.print("ENTER ELEMENTS : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER ELEMENT TO BE SEARCH : ");
        int x = sc.nextInt();
        boolean flag = false;    // nahi mila
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i]==x){     // MIL GAYA
                flag = true;
                break;
            }
        }
        if(flag==false) {
            System.out.println("THE ELEMENT IS NOT PRESENT ");
        }
        else {
            System.out.println("THE ELEMENT IS PRESENT ");
        }
    }
}
