package questionOnArray;

import java.util.Scanner;

public class linearSearch {
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
       int found = -1;    // -1 means target array me nahi hai
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i]==x){     // MIL GAYA
               found=i;
                break;
            }
        }
        if(found != -1) {
            System.out.println("THE ELEMENT IS  PRESENT AT INDEX "+found);
        }
        else {
            System.out.println("THE ELEMENT IS NOT PRESENT ");
        }
    }
}
