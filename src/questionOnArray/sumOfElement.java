package questionOnArray;
import java.util.Scanner;

public class sumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of an array : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0 ;i<n ;i++){
            sum = arr[i]+sum;
        }
        System.out.println("The sum of elements of an array : " +sum);
    }
}
