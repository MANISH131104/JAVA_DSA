package questionOnArray;
import java.util.Scanner;

public class productOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of an array : ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int product=1;
        for(int i=0 ;i<n ;i++){
            product = arr[i]*product;
        }
        System.out.println("The product of the element is : "+product);
    }
}
