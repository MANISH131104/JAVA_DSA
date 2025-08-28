package Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENT : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER TARGET : ");
        int target = sc.nextInt();


        int pair = 0;
        for (int i = 0; i <n; i++) {   // first number pick hua
            for (int j = i + 1; j <n; j++) {  //second number
                if (arr[i] + arr[j] == target) {
                    pair++;
                }
            }
        }
        System.out.println(pair);

    }
}