package Arrays;
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER x : ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0 ;i<arr.length ;i++) {
            if(arr[i]>x) {
                count++ ;
            }
        }
        System.out.println(count);
    }
}
