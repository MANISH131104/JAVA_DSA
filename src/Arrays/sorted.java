package Arrays;
import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENTS : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;   // i.e array is  sorted
        for (int i = 1; i < n; i++) {
            /*
            i = 0
            arr[0]<arr[-1]
             */
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("ARRAY IS  SORTED ");
        } else {
            System.out.println("ARRAY IS not  SORTED ");
        }

    }
}
