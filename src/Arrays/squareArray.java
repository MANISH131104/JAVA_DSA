package Arrays;
import java.util.Scanner;

public class squareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]*arr[i] +" ");
        }
    }
    }

